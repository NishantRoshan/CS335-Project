from antlr4 import *
from antlr4.tree.Tree import ParseTreeWalker

from JavaLexer import JavaLexer
from JavaParser import JavaParser
from JavaParserListener import JavaParserListener

class SymbolTable:
    def __init__(self, parent=None):
        self.symbols = {}
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
        # return_type = ctx.typeType().getText()
        return_type = ctx.type_type_or_void()
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(method_name, 'method', lineno)
        self.current_scope = SymbolTable(parent=self.current_scope)
        self.current_scope.add_symbol('return', return_type, lineno)
        self.scopes.append(self.current_scope)
        self.scope_ind += 1

    def exitMethod_declaration(self, ctx):
        # self.scopes.pop()
        self.scope_ind -= 1
        self.current_scope = self.scopes[self.scope_ind]

    def enterVariable_declarator_id(self, ctx):
        var_name = ctx.identifier().getText()
        var_type = self.current_scope.get_symbol(ctx.parentCtx.parentCtx.type_type())
        # var_type = self.current_scope.get_symbol(ctx.parentCtx.parentCtx.parentCtx.parentCtx.parentCtx.type_type())
        if var_type is None:
            var_type = ctx.parentCtx.type_type().getText()
        if ctx.parentCtx.getChild(0).getText() == 'final':
            var_size = 0
        elif var_type == 'int':
            var_size = 4
        elif var_type == 'boolean':
            var_size = 1
        else:
            var_size = 0
        lineno = str(ctx.start)[:-1].split(",")[-1]
        self.current_scope.add_symbol(var_name, 'variable', lineno, var_size)


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
    with open('tests/a.java') as f:
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
    for scope in listener.scopes:
        print('---- Scope ----')
        for symbol in scope.symbols.items():
            info = scope.symbols[symbol]
            if info['type'] == 'class':
                print(f'{symbol} (class)')
            elif info['type'] == 'method':
                print(f'{symbol} (method)')
            elif info['type'] == 'parameter':
                print(f'{symbol} (parameter) - size: {info["size"]}, offset: {info["offset"]}')
            elif info['type'] == 'variable':
                print(f'{symbol} (variable) - size: {info["size"]}, offset: {info["offset"]}')
        print()

