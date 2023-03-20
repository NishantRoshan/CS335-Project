from antlr4 import *
from antlr4.tree.Tree import ParseTreeWalker

from JavaLexer import JavaLexer
from JavaParser import JavaParser
from JavaParserListener import JavaParserListener

class SymbolTable:
    def __init__(self, parent=None):
        self.symbols = {}
        self.lines = {}
        self.parent = parent

    def add_symbol(self, name, symbol_type, lineno):
        self.symbols[name] = symbol_type
        if name in self.lines:
            self.lines[name].append(lineno)
        else:
            self.lines[name] = [lineno]

    def get_symbol(self, name):
        if name in self.symbols:
            return self.symbols[name], self.lines[name]
        elif self.parent:
            return self.parent.get_symbol(name)
        else:
            return None

class SymbolTableListener(JavaParserListener):
    def __init__(self):
        self.current_scope = SymbolTable()
        self.scopes = [self.current_scope]
        self.scope_ind = 0

    def enterClass_declaration(self, ctx):
        class_name = ctx.identifier().getText()
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(class_name, 'class', lineno)
        self.current_scope = SymbolTable(parent=self.current_scope)
        self.scopes.append(self.current_scope)
        self.scope_ind += 1

    def exitClass_declaration(self, ctx):
        # self.scopes.pop()
        self.scope_ind -= 1
        self.current_scope = self.scopes[self.scope_ind]

    def enterMethod_declaration(self, ctx):
        method_name = ctx.identifier().getText()
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(method_name, 'method', lineno)
        self.current_scope = SymbolTable(parent=self.current_scope)
        self.scopes.append(self.current_scope)
        self.scope_ind += 1

    def exitMethod_declaration(self, ctx):
        self.scope_ind -= 1
        self.current_scope = self.scopes[self.scope_ind]

    def enterVariable_declarator_id(self, ctx):
        var_name = ctx.getText()
        # print(f'{self.current_scope} {var_name}')
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(var_name, 'variable', lineno)

    def enterLiteral(self, ctx):
        var_name = ctx.getText()
        # print(f'{self.current_scope} {var_name}')
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(var_name, 'literal', lineno)

    def enterFormal_parameter(self, ctx):
        var_name = ctx.getText()
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(var_name, 'parameter', lineno)

if __name__ == '__main__':
    # Load the Java code file
    with open('tests/h.java') as f:
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

    # Print the symbol table
    for scope in listener.scopes:
        # print(scope)
        for symbol, symbol_type in scope.symbols.items():
            print(f'{symbol} ({symbol_type}) ({scope.lines[symbol]})')
        # for symbol, symbol_type in scope.lines.items():
        #     print(f'{symbol} ({symbol_type}) ')
