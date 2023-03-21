from antlr4 import *
from JavaLexer import JavaLexer
from JavaParser import JavaParser
from JavaVisitor import JavaVisitor


class ThreeACVisitor(JavaVisitor):
    def __init__(self):
        self.temp_counter = 0
        self.label_counter = 0

    def new_temp(self):
        temp = f"t{self.temp_counter}"
        self.temp_counter += 1
        return temp

    def new_label(self):
        label = f"L{self.label_counter}"
        self.label_counter += 1
        return label

    def visitMethodDeclaration(self, ctx: JavaParser.MethodDeclarationContext):
        print("FUNCTION main")
        self.visitChildren(ctx)
        print("END FUNCTION")

    def visitVariableDeclaration(self, ctx: JavaParser.VariableDeclarationContext):
        var_name = ctx.Identifier().getText()
        var_type = ctx.type().getText()
        var_value = self.visit(ctx.expression())
        print(f"[{var_name}] = {var_value}")

    def visitAssignmentStatement(self, ctx: JavaParser.AssignmentStatementContext):
        var_name = ctx.Identifier().getText()
        var_value = self.visit(ctx.expression())
        print(f"[{var_name}] = {var_value}")

    def visitPrintStatement(self, ctx: JavaParser.PrintStatementContext):
        var_value = self.visit(ctx.expression())
        print(f"System.out.println({var_value})")

    def visitIdentifier(self, ctx):
        return f"[{ctx.getText()}]"

    def visitIntegerLiteral(self, ctx):
        return ctx.getText()

    def visitExpression(self, ctx: JavaParser.ExpressionContext):
        if ctx.getChildCount() == 1:
            return self.visitChildren(ctx)
        else:
            left = self.visit(ctx.expression(0))
            right = self.visit(ctx.expression(1))
            temp = self.new_temp()
            if ctx.op == '+':
                print(f"[{temp}] = {left} + {right}")
            else:
                print(f"[{temp}] = {left} - {right}")
            return f"[{temp}]"


input_stream = FileStream('SimpleProgram.java')
lexer = JavaLexer(input_stream)
stream = CommonTokenStream(lexer)
parser = JavaParser(stream)
tree = parser.compilationUnit()

if __name__ == '__main__':
    visitor = ThreeACVisitor()
    visitor.visit(tree)
