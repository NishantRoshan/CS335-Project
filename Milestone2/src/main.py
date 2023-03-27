from antlr4 import *
from antlr4.tree.Tree import ParseTreeWalker

from JavaLexer import JavaLexer
from JavaParser import JavaParser
from JavaParserListener import JavaParserListener

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
    out_file = "tac.txt"

verbose = args.verbose

decl = ['out', 'System', 'length', 'println']
def checkdec(st):
    for i in decl:
        if st[:len(i)] == i:
            return False
    return True

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
        


class SymbolTableListener(JavaParserListener):
    def __init__(self):
        self.current_scope = SymbolTable()
        self.scopes = [self.current_scope]
        self.scope_ind = 0
        self.temp_counter = 0
        self.label_counter = 0
        self.tac = ''''''

    def new_temp(self):
        temp = f"t{self.temp_counter}"
        self.temp_counter += 1
        return temp

    def new_label(self):
        label = f"L{self.label_counter}"
        self.label_counter += 1
        return label
    
    def dump_tac(self):
        with open(out_file, 'w') as f:
            f.write(self.tac)

    def dump_SymTab(self):
        for scope in self.scopes:
            out_f = scope.name + "_symtab.csv"
            with open(out_f, 'w') as f:
                f.write('name,type,size,offset,lines\n')
                for symbol,info in scope.symbols.items():
                    f.write(f'{symbol},{info["type"]},{info["size"]},{info["offset"]},{set(info["lines"])}\n')

    def enterClass_declaration(self, ctx):
        class_name = ctx.identifier().getText()
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(class_name, 'class', lineno)
        self.current_scope = SymbolTable(parent=self.current_scope, name=class_name)
        self.scopes.append(self.current_scope)
        self.scope_ind += 1

    def exitClass_declaration(self, ctx):
        self.scope_ind -= 1
        self.current_scope = self.scopes[self.scope_ind]

    def enterMethod_declaration(self, ctx):
        method_name = ctx.identifier().getText()
        return_type = self.current_scope.get_symbol(ctx.type_type_or_void())
        if return_type is None:
            return_type = ctx.type_type_or_void().getText()
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(method_name, 'method', lineno)
        self.current_scope = SymbolTable(parent=self.current_scope, name=method_name)
        self.current_scope.add_symbol('return', return_type, lineno)
        self.scopes.append(self.current_scope)
        self.scope_ind += 1
        if verbose:
            print(f"FUNCTION {method_name}")
        self.tac += f"FUNCTION {method_name}\n"

    def exitMethod_declaration(self, ctx):
        self.scope_ind -= 1
        self.current_scope = self.scopes[self.scope_ind]
        if verbose:
            print("END FUNCTION")
        self.tac += "END FUNCTION\n"

    def exitVariable_declarator(self, ctx: JavaParser.Variable_declaratorContext):
        if ctx.getChildCount() == 3:
            if ctx.getChild(2).getText() in self.current_scope.symbols.keys() and self.current_scope.symbols[ctx.getChild(0).getText()]['type'] != self.current_scope.symbols[ctx.getChild(2).getText()]['type']:
                print(f"Error can't initalize variable of type {self.current_scope.symbols[ctx.getChild(0).getText()]['type']} with {self.current_scope.symbols[ctx.getChild(2).getText()]['type']}")


    def enterVariable_declarator_id(self, ctx):
        var_name = ctx.identifier().getText()
        try:
            var_type = self.current_scope.get_symbol(ctx.parentCtx.type_type())
        except:
            var_type = self.current_scope.get_symbol(ctx.parentCtx.parentCtx.parentCtx.type_type())
        if var_type is None:
            try:
                var_type = ctx.parentCtx.type_type().getText()
            except:
                var_type = ctx.parentCtx.parentCtx.parentCtx.type_type().getText()
        if ctx.parentCtx.getChild(0).getText() == 'final':
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
        self.current_scope.add_symbol(var_name, var_type, lineno, var_size)
        self.new_temp()
        if verbose:
            print(f'[t{self.temp_counter}] = {var_name}')
        self.tac += f'[t{self.temp_counter}] = {var_name}\n'

    def enterInteger_literal(self, ctx):
        var_name = ctx.getText()
        lineno = str(ctx.start)[:-1].split(",")[-1]
        var_size = 4
        self.current_scope.add_symbol(var_name, 'int', lineno, var_size)

    def enterFloating_point_literal(self, ctx):
        var_name = ctx.getText()
        lineno = str(ctx.start)[:-1].split(",")[-1]
        var_size = 4
        self.current_scope.add_symbol(var_name, 'float', lineno, var_size)

    def exitLiteral(self, ctx: JavaParser.LiteralContext):
        if ctx.getChild(0).getChildCount() == 0:
            var_name = ctx.getText()
            lineno = str(ctx.start)[:-1].split(',')[-1]
            if var_name == "true" or var_name == "false":
                self.current_scope.add_symbol(var_name, 'boolean', lineno, 1)
            elif var_name[0] == "'":
                self.current_scope.add_symbol(var_name, 'char', lineno, 2)
            elif var_name[0] == '"':
                self.current_scope.add_symbol(var_name, 'String', lineno, 2*(len(var_name)-2))

    def exitMethod_call(self, ctx: JavaParser.Method_callContext):
        self.new_temp()
        if verbose:
            print(f'[t{self.temp_counter}] = t{self.temp_counter-1} {ctx.parentCtx.getChild(1).getText()} {ctx.getText()}')
        self.tac += f'[t{self.temp_counter}] = t{self.temp_counter-1} {ctx.parentCtx.getChild(1).getText()} {ctx.getText()}\n'


    def exitExpression(self, ctx):
        if ctx.getChildCount() == 3:
            if ctx.getChild(0).getChild(0).getChildCount() <= 1 and ctx.getChild(2).getChild(0).getChildCount() <= 1 and ctx.getChild(0).getChildCount() == 1 and ctx.getChild(2).getChildCount() == 1:
                type_l = ""
                type_r = ""
                self.new_temp()
                
                lineno = str(ctx.getChild(0).start)[:-1].split(",")[-1]
                if ctx.getChild(0).getText() in self.current_scope.symbols.keys():
                    self.current_scope.symbols[ctx.getChild(0).getText()]['lines'].append(lineno)
                    type_l = self.current_scope.symbols[ctx.getChild(0).getText()]['type']
                elif checkdec(ctx.getChild(0).getText()):
                    print(f'Error at {lineno}: {ctx.getChild(0).getText()} not declared')
                
                lineno = str(ctx.getChild(2).start)[:-1].split(",")[-1]
                if ctx.getChild(2).getText() in self.current_scope.symbols.keys():
                    self.current_scope.symbols[ctx.getChild(0).getText()]['lines'].append(lineno)
                    type_r = self.current_scope.symbols[ctx.getChild(2).getText()]['type']
                elif checkdec(ctx.getChild(2).getText()):
                    print(f'Error at {lineno}: {ctx.getChild(2).getText()} not declared')
                    

                if ctx.getChild(1).getText() == '=':
                    if type_l == type_r:
                        if verbose:
                            print(f'{ctx.getChild(0).getText()} = {ctx.getChild(2).getText()}')
                        self.tac += f'{ctx.getChild(0).getText()} = {ctx.getChild(2).getText()}\n'

                    elif type_l == "" or type_r == "":
                        pass
                    
                    elif type_l == 'int' and type_r == 'float':
                        if verbose:
                            print(f'{ctx.getChild(0).getText()} ={type_l} {ctx.getChild(2).getText()}')
                        self.tac += f'{ctx.getChild(0).getText()} ={type_l} {ctx.getChild(2).getText()}\n'
                    
                    elif type_r == 'int' and type_l == 'float':
                        if verbose:
                            print(f'{ctx.getChild(0).getText()} ={type_l} {ctx.getChild(2).getText()}')
                        self.tac += f'{ctx.getChild(0).getText()} ={type_l} {ctx.getChild(2).getText()}\n'
                    
                    else:
                        print(f'Type mismatch at {lineno}. Unsupported operation {ctx.getChild(1).getText()} for types {type_l} and {type_r}')
                    # if verbose:
                    #     print(f'{ctx.getChild(0).getText()} = {ctx.getChild(2).getText()}')
                    # self.tac += f'{ctx.getChild(0).getText()} = {ctx.getChild(2).getText()}\n'
                else:
                    if type_l == type_r:
                        if verbose:
                            print(f'[t{self.temp_counter}] = {ctx.getChild(0).getText()} {ctx.getChild(1).getText()}{type_l} {ctx.getChild(2).getText()}')
                        self.tac += f'[t{self.temp_counter}] = {ctx.getChild(0).getText()} {ctx.getChild(1).getText()}{type_l} {ctx.getChild(2).getText()}\n'

                    elif type_l == "" or type_r == "":
                        pass
                    
                    elif type_l == 'int' and type_r == 'float':
                        if verbose:
                            print(f'[t{self.temp_counter}] = cast_to_float {ctx.getChild(0).getText()}')
                            print(f'[t{self.temp_counter+1}] = t{self.temp_counter} {ctx.getChild(1).getText()}{type_r} {ctx.getChild(2).getText()}')
                        self.tac += f'[t{self.temp_counter}] = cast_to_float {ctx.getChild(0).getText()}\n'
                        self.tac += f'[{self.new_temp()}] = t{self.temp_counter-1} {ctx.getChild(1).getText()}{type_r} {ctx.getChild(2).getText()}\n'
                        # print(f'[t{self.temp_counter}] = {ctx.getChild(0).getText()} {ctx.getChild(1).getText()} {ctx.getChild(2).getText()}')
                    
                    elif type_r == 'int' and type_l == 'float':
                        if verbose:
                            print(f'[t{self.temp_counter}] = cast_to_float {ctx.getChild(2).getText()}')
                            print(f't{self.temp_counter+1} = t{self.temp_counter} {ctx.getChild(1).getText()}{type_l} {ctx.getChild(0).getText()}')
                        self.tac += f'[t{self.temp_counter}] = cast_to_float {ctx.getChild(0).getText()}\n'
                        self.tac += f'[{self.new_temp()}] = {self.temp_counter-1} {ctx.getChild(1).getText()}{type_l} {ctx.getChild(0).getText()}\n'
                    
                    else:
                        print(f'Type mismatch at {lineno}. Unsupported operation {ctx.getChild(1).getText()} for types {type_l} and {type_r}')
                    # self.tac += f'[t{self.temp_counter}] = {ctx.getChild(0).getText()} {ctx.getChild(1).getText()} {ctx.getChild(0).getText()}\n'
            elif ctx.getChild(2).getChildCount() == 1:
                lineno = str(ctx.getChild(2).start)[:-1].split(",")[-1]            
                if ctx.getChild(2).getText() in self.current_scope.symbols.keys():
                    self.current_scope.symbols[ctx.getChild(2).getText()]['lines'].append(lineno)
                elif checkdec(ctx.getChild(2).getText()):
                    print(f'Error at {lineno}: {ctx.getChild(2).getText()} not declared')
                
                if ctx.getChild(1).getText() == '=':
                    if verbose:
                        print(f'{ctx.getChild(2).getText()} = t{self.temp_counter}')
                    self.tac += f'{ctx.getChild(2).getText()} = t{self.temp_counter}\n'
                else:
                    self.new_temp()
                    if verbose:
                        print(f'[t{self.temp_counter}] = t{self.temp_counter-1} {ctx.getChild(1).getText()} {ctx.getChild(2).getText()}')
                    self.tac += f'[t{self.temp_counter}] = t{self.temp_counter-1} {ctx.getChild(1).getText()} {ctx.getChild(2).getText()}\n'
            elif ctx.getChild(0).getChildCount() == 1:
                lineno = str(ctx.getChild(0).start)[:-1].split(",")[-1]
                if ctx.getChild(0).getText() in self.current_scope.symbols.keys():
                    self.current_scope.symbols[ctx.getChild(0).getText()]['lines'].append(lineno)
                elif checkdec(ctx.getChild(0).getText()):
                    print(f'Error at {lineno}: {ctx.getChild(0).getText()} not declared')

                if ctx.getChild(1).getText() == '=':
                    if verbose:
                        print(f'{ctx.getChild(0).getText()} = t{self.temp_counter}')
                    self.tac += f'{ctx.getChild(0).getText()} = t{self.temp_counter}\n'
                else:
                    self.new_temp()
                    if verbose:
                        print(f'[t{self.temp_counter}] = {ctx.getChild(0).getText()} {ctx.getChild(1).getText()} t{self.temp_counter-1}')
                    self.tac += f'[t{self.temp_counter}] = {ctx.getChild(0).getText()} {ctx.getChild(1).getText()} t{self.temp_counter-1}\n'
                    

    def enterFormal_parameter(self, ctx):
        var_name = ctx.variable_declarator_id().identifier().getText()
        var_type = self.current_scope.get_symbol(ctx.type_type())
        if var_type is None:
            var_type = ctx.type_type().getText()
        var_size = 4 if var_type == 'int' else 0
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(var_name, 'parameter', lineno, var_size)


if __name__ == '__main__':
    # Load the Java code file
    with open(in_file) as f:
        code = f.read()

    # Parse the Java code with ANTLR
    lexer = JavaLexer(InputStream(code))
    stream = CommonTokenStream(lexer)
    parser = JavaParser(stream)
    tree = parser.compilation_unit()

    # Build the symbol table with the SymbolTableListener
    listener = SymbolTableListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

    # Print the symbol table with sizes and offsets
    if verbose:
        for scope in listener.scopes:
            print(f'---- Scope {scope.name} ----')
            for symbol,info in scope.symbols.items():
                print(f'{symbol} - type: {info["type"]}, size: {info["size"]}, offset: {info["offset"]}, lines: {set(info["lines"])}')

            print()

    listener.dump_tac()
    listener.dump_SymTab()
