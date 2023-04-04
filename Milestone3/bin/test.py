from antlr4 import *
from JavaParser import JavaParser
from JavaParserListener import JavaParserListener
from JavaLexer import JavaLexer

class ThreeAddressCodeGenerator(JavaParserListener):
    def __init__(self):
        self.current_temp = 0
        self.current_label = 0
        self.local_vars = {}
        self.three_address_code = []

    def generate_temp(self):
        temp = f"t{self.current_temp}"
        self.current_temp += 1
        return temp

    def generate_label(self):
        label = f"L{self.current_label}"
        self.current_label += 1
        return label

    def enterLocal_variable_declaration(self, ctx):
        var_type = ctx.typeType().getText()
        var_name = ctx.variableDeclarators().variableDeclarator()[0].ID().getText()
        var_size = 4  # Assume all local vars are ints
        self.local_vars[var_name] = {'type': var_type, 'size': var_size}
        self.three_address_code.append(f"allocate {var_name}, {var_size}")

    def enterExpression(self, ctx: JavaParser.ExpressionContext):
        if ctx.primary():
            if ctx.primary().literal():
                # Load a literal onto the stack
                literal = ctx.primary().literal().getText()
                temp = self.generate_temp()
                self.three_address_code.append(f"load_int {literal}, {temp}")
                ctx.code = temp
            elif ctx.primary().identifier():
                # Load a variable onto the stack
                var_name = ctx.primary().identifier().getText()
                var_offset = 0  # Assume all vars are at offset 0
                temp = self.generate_temp()
                self.three_address_code.append(f"load {var_name}, {var_offset}, {temp}")
                ctx.code = temp

    # def exitAdditiveExpression(self, ctx: JavaParser.AdditiveExpressionContext):
    #     left_temp = ctx.left.code
    #     right_temp = ctx.right.code
    #     op = ctx.getChild(1).getText()
    #     result_temp = self.generate_temp()
    #     self.three_address_code.append(f"{op} {left_temp}, {right_temp}, {result_temp}")
    #     ctx.code = result_temp

    def enterMethod_call(self, ctx):
        method_name = ctx.identifier().getText()
        num_args = len(ctx.expression_list().expression())
        for expr_ctx in ctx.expression_list().expression():
            self.three_address_code.append(expr_ctx.getText())
        # self.three_address_code
    # Allocate space for actual parameters
        params_size = num_args * 4  # Assume all params are ints
        params_temp = self.generate_temp()
        self.three_address_code.append(f"allocate_params {params_size}, {params_temp}")
        # Save return address and old stack pointer
        return_address_temp = self.generate_temp()
        self.three_address_code.append(f"save_return_address {return_address_temp}")
        old_sp_temp = self.generate_temp()
        self.three_address_code.append(f"save_old_sp {old_sp_temp}")
        # Save any necessary registers
        saved_regs_temp = self.generate_temp()
        self.three_address_code.append(f"save_registers {saved_regs_temp}")
        # Jump to the function
        self.three_address_code.append(f"jump {method_name}")
        # Pop the activation record and store the return value
        result_temp = self.generate_temp()
        self.three_address_code.append(f"pop_activation_record {result_temp}")
        # Deallocate space for the actual parameters
        self.three_address_code.append(f"deallocate_params {params_size}")
        # Store the result in the destination variable
        dest_var_name = ctx.parentCtx.getChild(0).getText()
        dest_var_offset = 0  # Assume all vars are at offset 0
        self.three_address_code.append(f"store {result_temp}, {dest_var_name}, {dest_var_offset}")

    def print_three_address_code(self):
        for code in self.three_address_code:
            print(code)

if __name__ == '__main__':
    input_stream = FileStream('test.java')
    lexer = JavaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = JavaParser(stream)
    tree = parser.compilation_unit()
    three_address_code_generator = ThreeAddressCodeGenerator()
    walker = ParseTreeWalker()
    walker.walk(three_address_code_generator, tree)
    three_address_code_generator.print_three_address_code()