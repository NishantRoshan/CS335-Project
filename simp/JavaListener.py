# Generated from Java.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JavaParser import JavaParser
else:
    from JavaParser import JavaParser

# This class defines a complete listener for a parse tree produced by JavaParser.
class JavaListener(ParseTreeListener):

    # Enter a parse tree produced by JavaParser#compilationUnit.
    def enterCompilationUnit(self, ctx:JavaParser.CompilationUnitContext):
        pass

    # Exit a parse tree produced by JavaParser#compilationUnit.
    def exitCompilationUnit(self, ctx:JavaParser.CompilationUnitContext):
        pass


    # Enter a parse tree produced by JavaParser#classDeclaration.
    def enterClassDeclaration(self, ctx:JavaParser.ClassDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#classDeclaration.
    def exitClassDeclaration(self, ctx:JavaParser.ClassDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#methodDeclaration.
    def enterMethodDeclaration(self, ctx:JavaParser.MethodDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#methodDeclaration.
    def exitMethodDeclaration(self, ctx:JavaParser.MethodDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#statement.
    def enterStatement(self, ctx:JavaParser.StatementContext):
        pass

    # Exit a parse tree produced by JavaParser#statement.
    def exitStatement(self, ctx:JavaParser.StatementContext):
        pass


    # Enter a parse tree produced by JavaParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:JavaParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by JavaParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:JavaParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by JavaParser#type.
    def enterType(self, ctx:JavaParser.TypeContext):
        pass

    # Exit a parse tree produced by JavaParser#type.
    def exitType(self, ctx:JavaParser.TypeContext):
        pass


    # Enter a parse tree produced by JavaParser#assignmentStatement.
    def enterAssignmentStatement(self, ctx:JavaParser.AssignmentStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#assignmentStatement.
    def exitAssignmentStatement(self, ctx:JavaParser.AssignmentStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#printStatement.
    def enterPrintStatement(self, ctx:JavaParser.PrintStatementContext):
        pass

    # Exit a parse tree produced by JavaParser#printStatement.
    def exitPrintStatement(self, ctx:JavaParser.PrintStatementContext):
        pass


    # Enter a parse tree produced by JavaParser#expression.
    def enterExpression(self, ctx:JavaParser.ExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#expression.
    def exitExpression(self, ctx:JavaParser.ExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#op.
    def enterOp(self, ctx:JavaParser.OpContext):
        pass

    # Exit a parse tree produced by JavaParser#op.
    def exitOp(self, ctx:JavaParser.OpContext):
        pass


