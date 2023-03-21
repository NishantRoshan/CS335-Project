# Generated from Java.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JavaParser import JavaParser
else:
    from JavaParser import JavaParser

# This class defines a complete generic visitor for a parse tree produced by JavaParser.

class JavaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by JavaParser#compilationUnit.
    def visitCompilationUnit(self, ctx:JavaParser.CompilationUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#classDeclaration.
    def visitClassDeclaration(self, ctx:JavaParser.ClassDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#methodDeclaration.
    def visitMethodDeclaration(self, ctx:JavaParser.MethodDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#statement.
    def visitStatement(self, ctx:JavaParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#variableDeclaration.
    def visitVariableDeclaration(self, ctx:JavaParser.VariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type.
    def visitType(self, ctx:JavaParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#assignmentStatement.
    def visitAssignmentStatement(self, ctx:JavaParser.AssignmentStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#printStatement.
    def visitPrintStatement(self, ctx:JavaParser.PrintStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#expression.
    def visitExpression(self, ctx:JavaParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#op.
    def visitOp(self, ctx:JavaParser.OpContext):
        return self.visitChildren(ctx)



del JavaParser