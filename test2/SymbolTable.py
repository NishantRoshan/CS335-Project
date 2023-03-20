import antlr4
from antlr4 import *
from antlr4.tree.Tree import ParseTreeWalker

from JavaLexer import JavaLexer
from JavaParser import JavaParser
from JavaParserListener import JavaParserListener

class SymbolTable:
    def __init__(self):
        self.symbols = {}

    def add_symbol(self, name, symbol_type):
        self.symbols[name] = symbol_type

    def get_symbol(self, name):
        return self.symbols.get(name, None)

class SymbolTableListener(JavaParserListener):
    def __init__(self):
        self.current_scope = SymbolTable()
        self.scopes = [self.current_scope]

    def enterClassDeclaration(self, ctx):
        class_name = ctx.Identifier().getText()
        self.current_scope.add_symbol(class_name, 'class')
        self.current_scope = SymbolTable()
        self.scopes.append(self.current_scope)

    def exitClassDeclaration(self, ctx):
        self.scopes.pop()
        self.current_scope = self.scopes[-1]

    def enterMethodDeclaration(self, ctx):
        method_name = ctx.Identifier().getText()
        self.current_scope.add_symbol(method_name, 'method')
        self.current_scope = SymbolTable()
        self.scopes.append(self.current_scope)

    def exitMethodDeclaration(self, ctx):
        self.scopes.pop()
        self.current_scope = self.scopes[-1]

    def enterVariableDeclaratorId(self, ctx):
        var_name = ctx.Identifier().getText()
        self.current_scope.add_symbol(var_name, 'variable')

    def enterFormalParameter(self, ctx):
        var_name = ctx.variableDeclaratorId().Identifier().getText()
        self.current_scope.add_symbol(var_name, 'parameter')

if __name__ == '__main__':
    # Load the Java code file
    with open('test.java') as f:
        code = f.read()

    # Parse the Java code with ANTLR
    lexer = JavaLexer(InputStream(code))
    stream = CommonTokenStream(lexer)
    parser = JavaParser(stream)
    tree = parser.compilationUnit()

    # Build the symbol table with the SymbolTableListener
    listener = SymbolTableListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

    # Print the symbol table
    for scope in listener.scopes:
        for symbol, symbol_type in scope.symbols.items():
            print(f'{symbol} ({symbol_type})')
