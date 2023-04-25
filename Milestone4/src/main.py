from antlr4 import *
from antlr4.tree.Tree import ParseTreeWalker

from JavaLexer import JavaLexer
from JavaParser import JavaParser
from JavaParserVisitor import JavaParserVisitor

import argparse

parser = argparse.ArgumentParser()

parser.add_argument("-i","-input","--input",help="Input File")
parser.add_argument("-o","-output","--output",help="Output File")
parser.add_argument("-v","-verbose","--verbose",action="store_true",help="verbose")
args = parser.parse_args()

if args.input != None:
    in_file = args.input
else:
    in_file = "tests/test_1.java"

if args.output != None:
    out_file = args.output
else:
    out_file = "3ac.txt"

verbose = args.verbose

# decl = ['out', 'System', 'length', 'println']
# def checkdec(st):
#     for i in decl:
#         if st[:len(i)] == i:
#             return False
#     return True

class SymbolTable:
    def __init__(self, parent=None, name="global"):
        self.symbols = {}
        self.name = name
        self.parent = parent
        self.offset = 0

    def add_symbol(self, name, symbol_type, lineno, size=0):
        self.symbols[name] = {
            'type': symbol_type,
            'lines': [lineno],
            'size': size,
            'offset': self.offset
        }
        self.offset += size

    def get_symbol(self, name):
        if name in self.symbols:
            return self.symbols[name]
        elif self.parent:
            return self.parent.get_symbol(name)
        else:
            return None
        

class ThreeAddressCodeGenerator(JavaParserVisitor):
    def __init__(self):
        self.current_scope = SymbolTable()
        self.scopes = [self.current_scope]
        self.scope_ind = 0
        self.three_address_code = []
        self.temp_counter = 0
        self.label_counter = 0
        self.global_class = ""
        self.local_vars = {}
        self.loop_stack = []

    def generate_temp(self):
        temp = f"t{self.temp_counter}"
        self.temp_counter += 1
        return temp

    def generate_label(self):
        label = f"L{self.label_counter}"
        self.label_counter += 1
        return label

    def visitClass_declaration(self, ctx: JavaParser.Class_declarationContext):
        class_name = ctx.identifier().getText()
        self.global_class = class_name
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(class_name, 'class', lineno)
        # self.three_address_code.append(f"{class_name}:")
        self.current_scope = SymbolTable(parent=self.current_scope, name=class_name)
        self.scopes.append(self.current_scope)
        self.scope_ind += 1
        self.visitChildren(ctx)
        self.scope_ind -= 1
        self.current_scope = self.scopes[self.scope_ind]
        return

    def visitMethod_declaration(self, ctx: JavaParser.Member_declarationContext):
        method_name = f'{self.global_class}.{ctx.identifier().getText()}:'
        self.three_address_code.append(method_name)
        return_type = self.current_scope.get_symbol(ctx.type_type_or_void())
        if return_type is None:
            return_type = ctx.type_type_or_void().getText()
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(method_name, 'method', lineno)
        self.current_scope = SymbolTable(parent=self.current_scope, name=method_name)
        self.scopes.append(self.current_scope)
        self.scope_ind += 1
        # self.three_address_code.append(f"FUNCTION {method_name}\n")
        self.visitChildren(ctx)
        self.scope_ind -= 1
        self.current_scope = self.scopes[self.scope_ind]
        # self.three_address_code.append("END FUNCTION\n")
        return

    def visitExpression(self, ctx: JavaParser.ExpressionContext):
        if ctx.getText()[:18] == "System.out.println":
            self.three_address_code.append(f"print,{ctx.getText()[19:-1]}")
            return

        if ctx.primary():
            if ctx.primary().literal():
                # Load a literal onto the stack
                literal = ctx.primary().literal().getText()
                temp = self.generate_temp()
                self.three_address_code.append(f"load_int,{literal},{temp}")
                ctx.code = temp
            elif ctx.primary().identifier():
                # Load a variable onto the stack
                var_name = ctx.primary().identifier().getText()
                var_offset = self.current_scope.symbols[var_name]['offset']  # Assume all vars are at offset 0
                temp = self.generate_temp()
                self.three_address_code.append(f"load,{var_name},{var_offset},{temp}")
                ctx.code = temp

        if ctx.getChildCount() == 2:
            if ctx.getChild(1).getText() == '++':
                self.visit(ctx.getChild(0))
                one_temp = self.generate_temp()
                self.three_address_code.append(f"load_int,1,{one_temp}")
                self.three_address_code.append(f"+,{ctx.getChild(0).code},{one_temp},t{self.temp_counter-1}")
                var_offset = self.current_scope.symbols[ctx.getChild(0).getText()]['offset']
                self.three_address_code.append(f"assign,{ctx.getChild(0).getText()},t{self.temp_counter-1},{var_offset}")
                return
            
            elif ctx.getChild(0).getText() == '++':
                self.visit(ctx.getChild(1))
                one_temp = self.generate_temp()
                self.three_address_code.append(f"load_int,1,{one_temp}")
                self.three_address_code.append(f"+,{ctx.getChild(0).code},{one_temp},t{self.temp_counter-1}")
                var_offset = self.current_scope.symbols[ctx.getChild(0).getText()]['offset']
                self.three_address_code.append(f"assign,{ctx.getChild(0).getText()},t{self.temp_counter-1},{var_offset}")
                return
            
            elif ctx.getChild(1).getText() == '--':
                self.visit(ctx.getChild(0))
                one_temp = self.generate_temp()
                self.three_address_code.append(f"load_int,1,{one_temp}")
                self.three_address_code.append(f"-,{ctx.getChild(0).code},{one_temp},t{self.temp_counter-1}")
                var_offset = self.current_scope.symbols[ctx.getChild(0).getText()]['offset']
                self.three_address_code.append(f"assign,{ctx.getChild(0).getText()},t{self.temp_counter-1},{var_offset}")
                return
            
            elif ctx.getChild(0).getText() == '--':
                self.visit(ctx.getChild(1))
                one_temp = self.generate_temp()
                self.three_address_code.append(f"load_int,1,{one_temp}")
                self.three_address_code.append(f"-,{ctx.getChild(0).code},{one_temp},t{self.temp_counter-1}")
                var_offset = self.current_scope.symbols[ctx.getChild(0).getText()]['offset']
                self.three_address_code.append(f"assign,{ctx.getChild(0).getText()},t{self.temp_counter-1},{var_offset}")
                return
        
        if ctx.getChildCount() == 3:
            if ctx.getChild(1).getText() == '=':
                lhs = ctx.getChild(0).getText()
                rhs = ctx.getChild(2)
                self.visitExpression(rhs)
                # temp = self.generate_temp()
                temp = f't{self.temp_counter-1}'
                var_offset = self.current_scope.symbols[lhs]['offset']
                self.three_address_code.append(f"assign,{lhs},{temp},{var_offset}")
                # self.three_address_code.append(f"store {temp}, {lhs}, 0")
                return
            
            elif ctx.getChild(1).getText() == '+=':
                lhs = ctx.getChild(0).getText()
                rhs = ctx.getChild(2)
                var_offset = self.current_scope.symbols[lhs]['offset'] 
                self.visitExpression(rhs)
                temp = self.generate_temp()
                self.three_address_code.append(f"load,{lhs},{var_offset},{temp}")
                self.three_address_code.append(f"+,{temp},{rhs.code},{temp}")
                # temp = f't{self.temp_counter-1}'
                var_offset = self.current_scope.symbols[lhs]['offset']
                self.three_address_code.append(f"assign,{lhs},{temp},{var_offset}")
                return

            elif ctx.getChild(1).getText() == '-=':
                lhs = ctx.getChild(0).getText()
                rhs = ctx.getChild(2)
                var_offset = self.current_scope.symbols[lhs]['offset'] 
                self.visitExpression(rhs)
                temp = self.generate_temp()
                self.three_address_code.append(f"load,{lhs},{var_offset},{temp}")
                self.three_address_code.append(f"-,{temp},{rhs.code},{temp}")
                # temp = f't{self.temp_counter-1}'
                var_offset = self.current_scope.symbols[lhs]['offset']
                self.three_address_code.append(f"assign,{lhs},{temp},{var_offset}")
                return

            elif ctx.getChild(1).getText() == '*=':
                lhs = ctx.getChild(0).getText()
                rhs = ctx.getChild(2)
                var_offset = self.current_scope.symbols[lhs]['offset'] 
                self.visitExpression(rhs)
                temp = self.generate_temp()
                self.three_address_code.append(f"load,{lhs},{var_offset},{temp}")
                self.three_address_code.append(f"*,{temp},{rhs.code},{temp}")
                # temp = f't{self.temp_counter-1}'
                var_offset = self.current_scope.symbols[lhs]['offset']
                self.three_address_code.append(f"assign,{lhs},{temp},{var_offset}")
                return

            elif ctx.getChild(1).getText() == '/=':
                lhs = ctx.getChild(0).getText()
                rhs = ctx.getChild(2)
                var_offset = self.current_scope.symbols[lhs]['offset'] 
                self.visitExpression(rhs)
                temp = self.generate_temp()
                self.three_address_code.append(f"load,{lhs},{var_offset},{temp}")
                self.three_address_code.append(f"/,{temp},{rhs.code},{temp}")
                # temp = f't{self.temp_counter-1}'
                var_offset = self.current_scope.symbols[lhs]['offset']
                self.three_address_code.append(f"assign,{lhs},{temp},{var_offset}")
                return

            else:
                left_temp = ctx.expression(0)
                right_temp = ctx.expression(1)
                op = ctx.getChild(1).getText()
                if left_temp and right_temp:
                    self.visit(left_temp)
                    lhs = left_temp.code

                    self.visit(right_temp)
                    rhs = right_temp.code
                    result_temp = self.generate_temp()
                    # print(f'rhs: {right_temp.getText()}')
                    self.three_address_code.append(f"{op},{lhs},{rhs},{result_temp}")
                    ctx.code = result_temp

                return
        return self.visitChildren(ctx)         
    
    def visitVariable_declarator(self, ctx: JavaParser.Variable_declaratorContext):
        var_type = ctx.parentCtx.parentCtx.type_type().getText()
        var_name = ctx.getChild(0).getText()
        if ctx.getChild(0).getText() == 'final':
            var_size = 0
        elif var_type == 'int':
            var_size = 4
        elif var_type == 'boolean':
            var_size = 1
        elif var_type == 'char':
            var_size = 2
        elif var_type == 'byte':
            var_size = 1
        elif var_type == 'short':
            var_size = 2
        elif var_type == 'long':
            var_size = 8
        elif var_type == 'float':
            var_size = 4
        elif var_type == 'double':
            var_size = 8
        else:
            var_size = 0
        lineno = str(ctx.start)[:-1].split(",")[-1]
        # self.generate_temp()
        self.current_scope.add_symbol(var_name, var_type, lineno, var_size)
        self.local_vars[var_name] = {'type': var_type, 'size': var_size}
        self.three_address_code.append(f"allocate,{var_name},{var_size}")
        self.visitChildren(ctx)
        if ctx.getChildCount() >1 and ctx.getChild(1).getText() == '=':
            self.three_address_code.append(f'assign,{var_name},t{self.temp_counter-1}')

    def visitMethod_call(self, ctx):
        method_name = ctx.getChild(0).getText()
        # print(f'--------{method_name}---------')
        num_args = (ctx.getChildCount() - 2) // 2
        # print(f'nargs: {num_args}')
        # print(ctx.getChildCount())
        # Allocate space for actual parameters
        params_size = num_args * 4  # Assume all params are ints
        params_temp = self.generate_temp()
        self.three_address_code.append(f"allocate_params,{params_size},{params_temp}")
        # Save return address and old stack pointer
        return_address_temp = self.generate_temp()
        self.three_address_code.append(f"save_return_address,{return_address_temp}")
        old_sp_temp = self.generate_temp()
        self.three_address_code.append(f"save_old_sp,{old_sp_temp}")
        # Save any necessary registers
        saved_regs_temp = self.generate_temp()
        self.three_address_code.append(f"save_registers,{saved_regs_temp}")
        # Evaluate the arguments and store them in the appropriate positions
        for i in range(num_args):
            arg = ctx.getChild(i*2+2)
            arg_temp = self.generate_temp()
            # self.visit(arg)
            self.three_address_code.append(f"assign,{arg.getText()},{arg_temp}")
            arg_offset = (i+1) * -4  # Parameters are stored at negative offsets
            self.three_address_code.append(f"store,{arg_temp},SP,{arg_offset}")
        # Jump to the function
        self.three_address_code.append(f"jump,{method_name}")
        # Pop the activation record and store the return value
        result_temp = self.generate_temp()
        self.three_address_code.append(f"pop_activation_record,{result_temp}")
        # Deallocate space for the actual parameters
        self.three_address_code.append(f"deallocate_params,{params_size}")
        # Store the result in the destination variable, if one exists
        if ctx.parentCtx.getChild(0).getText() != method_name:
            dest_var_name = ctx.parentCtx.getChild(0).getText()
        dest_var_offset = ctx.parentCtx.getChild(0).getText()
        self.three_address_code.append(f"store,{result_temp},SP,{dest_var_offset}")
        # Restore any necessary registers
        self.three_address_code.append(f"restore_registers,{saved_regs_temp}")
        # Restore the old stack pointer and return address
        self.three_address_code.append(f"restore_old_sp,{old_sp_temp}")
        self.three_address_code.append(f"restore_return_address,{return_address_temp}")
        return self.visitChildren(ctx)


    def visitStatement(self, ctx):
        if ctx.getChild(0).getText() == 'return':
            if ctx.expression() is not None:
                self.visitExpression(ctx.expression(0))
                # result_temp = self.generate_temp()
                result_temp = f't{self.temp_counter-1}'
                # self.three_address_code.append(f"assign {ctx.expression(0).getText()}, {result_temp}")
                self.three_address_code.append(f"return,{result_temp}")
            else:
                self.three_address_code.append("return")
            return
        
        elif ctx.getChild(0).getText() == 'if':
            cond = ctx.getChild(1)
            true_label = self.generate_label()
            false_label = self.generate_label()
            end_label = self.generate_label()
            if cond is not None:
                self.visit(cond)
            self.three_address_code.append(f"goto_false,t{self.temp_counter-1},{false_label}")
            self.three_address_code.append(f"goto,{true_label}")
            self.three_address_code.append(f"label,{false_label}:")
            if ctx.statement(1) is not None:
                self.visitStatement(ctx.statement(1))
            self.three_address_code.append(f"goto,{end_label}")
            self.three_address_code.append(f"label,{true_label}:")
            self.visitStatement(ctx.statement(0))
            self.three_address_code.append(f"label,{end_label}:")
            return
    
        elif ctx.getChild(0).getText() == 'while':
            cond = ctx.par_expression()
            body = ctx.statement(0)
            loop_label = self.generate_label()
            exit_label = self.generate_label()
            self.loop_stack.append(exit_label)
            self.three_address_code.append(f"label,{loop_label}:")
            self.visit(cond)
            self.three_address_code.append(f"goto_false,t{self.temp_counter-1},{exit_label}")
            self.visit(body)
            self.three_address_code.append(f"goto,{loop_label}")
            self.three_address_code.append(f"label,{exit_label}:")
            self.loop_stack.pop()
            return
        
        elif ctx.getChild(0).getText() == 'for':
            init = ctx.for_control().for_init()
            cond = ctx.for_control().expression()
            update = ctx.for_control().forUpdate
            body = ctx.statement(0)
            loop_label = self.generate_label()
            exit_label = self.generate_label()
            self.loop_stack.append(exit_label)
            if init is not None:
                self.visit(init)
            self.three_address_code.append(f"label,{loop_label}:")
            if cond is not None:
                self.visit(cond)
                self.three_address_code.append(f"goto_false,t{self.temp_counter-1},{exit_label}")
            self.visit(body)
            if update is not None:
                self.visit(update)
            self.three_address_code.append(f"goto,{loop_label}")
            self.three_address_code.append(f"label,{exit_label}:")
            self.loop_stack.pop()
            return 
        return self.visitChildren(ctx)


    def print_three_address_code(self):
        for code in self.three_address_code:
            print(code)

    def dump_tac(self):
        with open(out_file, 'w') as f:
            for lin in self.three_address_code:
                f.write(f'{lin}\n')

    def dump_SymTab(self):
        for scope in self.scopes:
            out_f = scope.name + "_symtab.csv"
            with open(out_f, 'w') as f:
                f.write('name,type,size,offset,lines\n')
                for symbol,info in scope.symbols.items():
                    f.write(f'{symbol},{info["type"]},{info["size"]},{info["offset"]},{set(info["lines"])}\n')


if __name__ == '__main__':
    input_stream = FileStream(in_file)
    lexer = JavaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = JavaParser(stream)
    tree = parser.compilation_unit()
    three_address_code_generator = ThreeAddressCodeGenerator()
    # walker = ParseTreeWalker()
    three_address_code_generator.visitCompilation_unit(tree)
    # walker.visitCompilation_unit(three_address_code_generator, tree)
    # three_address_code_generator.print_three_address_code()

    # Print the symbol table with sizes and offsets
    if verbose:
        for scope in three_address_code_generator.scopes:
            print(f'---- Scope {scope.name} ----')
            for symbol,info in scope.symbols.items():
                print(f'{symbol} - type: {info["type"]}, size: {info["size"]}, offset: {info["offset"]}, lines: {set(info["lines"])}')

            print()
            three_address_code_generator.print_three_address_code()

    three_address_code_generator.dump_tac()
    three_address_code_generator.dump_SymTab()

x86_64 = []
x86_lc = ['.section .rodata']
lc_cnt = 0
fun_end = ""
t_mapping = {}

t_var = {}

t_size = {}

var_size = {}

var_offset = {}

var_mapping = {}

offset = 0

with open(out_file, 'r') as f:
    ctr = 0
    for line in f:
        line  = line.strip().split(',')

        if len(line) == 1:
            if line[0][-5:-1] == "main":
                x86_lc.append(f'.LC{lc_cnt}:')
                x86_lc.append('.string "%ld\\n"')
                x86_lc.append('.text')
                x86_lc.append('.globl main')
                x86_64.append("main:")
                x86_64.append('pushq %rbp\nmovq %rsp, %rbp\nsubq $32, %rsp')
                lc_cnt+=1
                fun_end = "leave\nret"
            else:
                x86_lc.append(f'.LC{lc_cnt}:')
                x86_lc.append('.string "%ld\\n"')
                x86_lc.append('.text')
                x86_lc.append(f'.globl {line[0].split(".")[1][:-1]}')
                x86_64.append(f"{line[0].split('.')[1]}")
                x86_64.append('pushq %rbp\nmovq %rsp, %rbp')
                lc_cnt += 1
                fun_end = "popq %rbp\nret"

        elif line[0] == "return":
            if line[1] not in t_var.keys():
                x86_64.append(f'movq ${t_mapping[line[1]]}, %rax')
            else:
                x86_64.append(f'movq {t_var[line[1]]}, %rax')           
            x86_64.append(fun_end)            

        elif line[0] == "load_int":
            x86_64.append(f'movq ${line[1]}, %rax')
            t_mapping[line[2]] = line[1]

        elif line[0] == "load":
            if line[1] in var_mapping.keys():
                t_mapping[line[3]] = var_mapping[line[1]]
            else:
                t_mapping[line[3]] = 0  #garbage
            
            if line[1] in var_mapping.keys():
                t_mapping[line[3]] = var_mapping[line[1]]

            if line[3] not in t_var.keys():
            # x86_64.append(f'movq ${t_mapping[line[2]]}, %rcx')
                t_var[line[3]] = f"-{var_offset[line[1]]}(%rbp)"

                x86_64.append(f'movq -{var_offset[line[1]]}(%rbp), %rax')

            t_size[line[3]] = var_size[line[1]]

        elif line[0] == "allocate":
            var_size[line[1]] = line[2]

        elif line[0] == "print":
            if line[1] in var_offset.keys():
                x86_64.append(f"movq -{var_offset[line[1]]}(%rbp), %rax")
                x86_64.extend(["movq	%rax, %rsi",f"leaq	.LC{lc_cnt-1}(%rip), %rax","movq	%rax, %rdi","movl	$0, %eax","call	printf@PLT","movl	$0, %eax"])
        
        elif line[0] == "jump":
            x86_64.append(f"movl $0, %eax")
            x86_64.append(f"call {line[1]}")

        # elif line[0] == "store":
        #     x86_64.append(f"movq %")

        elif line[0] == '*':
            if line[1] not in t_var.keys():
                x86_64.append(f'movq ${t_mapping[line[1]]}, %rax')
            else:
                x86_64.append(f'movq {t_var[line[1]]}, %rax')           
            if line[2] not in t_var.keys():
                x86_64.append(f'movq ${t_mapping[line[2]]}, %rcx')
            else:
                x86_64.append(f'movq {t_var[line[2]]}, %rcx') 
            # x86_64.append(f'movq ${t_mapping[line[2]]}, %rcx')
            
            x86_64.append(f"imulq %rcx, %rax")
            t_mapping[line[3]] = int(t_mapping[line[1]])*int(t_mapping[line[2]])

        elif line[0] == '+':
            if line[1] not in t_var.keys():
                x86_64.append(f'movq ${t_mapping[line[1]]}, %rax')
            else:
                x86_64.append(f'movq {t_var[line[1]]}, %rax')            

            if line[2] not in t_var.keys():
                x86_64.append(f'movq ${t_mapping[line[2]]}, %rcx')
            else:
                x86_64.append(f'movq {t_var[line[2]]}, %rcx') 
            # x86_64.append(f'movq ${t_mapping[line[2]]}, %rcx')
            
            x86_64.append(f"addq %rcx, %rax")
            t_mapping[line[3]] = int(t_mapping[line[1]])+int(t_mapping[line[2]])

        elif line[0] == '-':
            if line[1] not in t_var.keys():
                x86_64.append(f'movq ${t_mapping[line[1]]}, %rax')
            else:
                x86_64.append(f'movq {t_var[line[1]]}, %rax')
            if line[2] not in t_var.keys():
                x86_64.append(f'movq ${t_mapping[line[2]]}, %rcx')
            else:
                x86_64.append(f'movq {t_var[line[2]]}, %rcx') 
            # x86_64.append(f'movq ${t_mapping[line[2]]}, %rcx')
            x86_64.append(f"subq %rcx, %rax")
            t_mapping[line[3]] = int(t_mapping[line[1]])-int(t_mapping[line[2]])

        elif line[0] == '/':
            if line[1] not in t_var.keys():
                x86_64.append(f'movq ${t_mapping[line[1]]}, %rax')
            else:
                x86_64.append(f'movq {t_var[line[1]]}, %rax')            
            x86_64.append('cqto')
            x86_64.append(f"idivq %rcx")
            t_mapping[line[3]] = int(t_mapping[line[1]])//int(t_mapping[line[2]])

        elif line[0] == "assign":
            if line[1] not in var_offset.keys():
                offset += 2*int(var_size[line[1]])
                var_offset[line[1]] = offset
            x86_64.append(f'movq %rax, -{var_offset[line[1]]}(%rbp)')
            if line[1] not in var_mapping.keys() and line[2] in t_mapping:
                var_mapping[line[1]] = t_mapping[line[2]]

        elif line[0] == 'label':
            x86_64.append(f".{line[1]}")

        elif line[0] == 'goto':
            x86_64.append(f"jmp .{line[1]}")

        elif line[0] == "<":
            if line[1] in t_var.keys():
                x86_64.append(f"cmpq ${int(t_mapping[line[2]])-1}, {t_var[line[1]]}")

        elif line[0] == "goto_false":
            x86_64.append(f"jg .{line[2]}")

# x86_64.extend(["movq	%rax, %rsi","leaq	.LC0(%rip), %rax","movq	%rax, %rdi","movl	$0, %eax","call	printf@PLT","movl	$0, %eax","leave","ret"])

with open('out.s','w') as f:
    for i in x86_lc:
        f.write(f'{i}\n')
    for i in x86_64:
        f.write(f'{i}\n')