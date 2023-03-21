# Generated from Java.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27")
        buf.write("^\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2\3\2\3\2\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3")
        buf.write("\4\3\4\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\3\5\3\5\3\5\3\5")
        buf.write("\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\7")
        buf.write("\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5")
        buf.write("\nQ\n\n\3\n\3\n\3\n\3\n\7\nW\n\n\f\n\16\nZ\13\n\3\13\3")
        buf.write("\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\23\24")
        buf.write("\2X\2\26\3\2\2\2\4\31\3\2\2\2\6 \3\2\2\2\b;\3\2\2\2\n")
        buf.write("=\3\2\2\2\fB\3\2\2\2\16D\3\2\2\2\20H\3\2\2\2\22P\3\2\2")
        buf.write("\2\24[\3\2\2\2\26\27\5\4\3\2\27\30\7\2\2\3\30\3\3\2\2")
        buf.write("\2\31\32\7\3\2\2\32\33\7\4\2\2\33\34\7\25\2\2\34\35\7")
        buf.write("\5\2\2\35\36\5\6\4\2\36\37\7\6\2\2\37\5\3\2\2\2 !\7\3")
        buf.write("\2\2!\"\7\7\2\2\"#\7\b\2\2#$\7\t\2\2$%\7\n\2\2%&\7\13")
        buf.write("\2\2&\'\7\f\2\2\'(\7\r\2\2()\7\25\2\2)*\7\16\2\2*,\7\5")
        buf.write("\2\2+-\5\b\5\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2")
        buf.write("/\60\3\2\2\2\60\61\7\6\2\2\61\7\3\2\2\2\62\63\5\n\6\2")
        buf.write("\63\64\7\17\2\2\64<\3\2\2\2\65\66\5\16\b\2\66\67\7\17")
        buf.write("\2\2\67<\3\2\2\289\5\20\t\29:\7\17\2\2:<\3\2\2\2;\62\3")
        buf.write("\2\2\2;\65\3\2\2\2;8\3\2\2\2<\t\3\2\2\2=>\5\f\7\2>?\7")
        buf.write("\25\2\2?@\7\20\2\2@A\5\22\n\2A\13\3\2\2\2BC\7\21\2\2C")
        buf.write("\r\3\2\2\2DE\7\25\2\2EF\7\20\2\2FG\5\22\n\2G\17\3\2\2")
        buf.write("\2HI\7\22\2\2IJ\7\n\2\2JK\5\22\n\2KL\7\16\2\2L\21\3\2")
        buf.write("\2\2MN\b\n\1\2NQ\7\25\2\2OQ\7\26\2\2PM\3\2\2\2PO\3\2\2")
        buf.write("\2QX\3\2\2\2RS\f\3\2\2ST\5\24\13\2TU\5\22\n\4UW\3\2\2")
        buf.write("\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\23\3\2\2\2")
        buf.write("ZX\3\2\2\2[\\\t\2\2\2\\\25\3\2\2\2\6.;PX")
        return buf.getvalue()


class JavaParser ( Parser ):

    grammarFileName = "Java.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'public'", "'class'", "'{'", "'}'", "'static'", 
                     "'void'", "'main'", "'('", "'String'", "'['", "']'", 
                     "')'", "';'", "'='", "'int'", "'System.out.println'", 
                     "'+'", "'-'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "Identifier", 
                      "IntegerLiteral", "WS" ]

    RULE_compilationUnit = 0
    RULE_classDeclaration = 1
    RULE_methodDeclaration = 2
    RULE_statement = 3
    RULE_variableDeclaration = 4
    RULE_type = 5
    RULE_assignmentStatement = 6
    RULE_printStatement = 7
    RULE_expression = 8
    RULE_op = 9

    ruleNames =  [ "compilationUnit", "classDeclaration", "methodDeclaration", 
                   "statement", "variableDeclaration", "type", "assignmentStatement", 
                   "printStatement", "expression", "op" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    Identifier=19
    IntegerLiteral=20
    WS=21

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class CompilationUnitContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def classDeclaration(self):
            return self.getTypedRuleContext(JavaParser.ClassDeclarationContext,0)


        def EOF(self):
            return self.getToken(JavaParser.EOF, 0)

        def getRuleIndex(self):
            return JavaParser.RULE_compilationUnit

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCompilationUnit" ):
                listener.enterCompilationUnit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCompilationUnit" ):
                listener.exitCompilationUnit(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCompilationUnit" ):
                return visitor.visitCompilationUnit(self)
            else:
                return visitor.visitChildren(self)




    def compilationUnit(self):

        localctx = JavaParser.CompilationUnitContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_compilationUnit)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 20
            self.classDeclaration()
            self.state = 21
            self.match(JavaParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ClassDeclarationContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Identifier(self):
            return self.getToken(JavaParser.Identifier, 0)

        def methodDeclaration(self):
            return self.getTypedRuleContext(JavaParser.MethodDeclarationContext,0)


        def getRuleIndex(self):
            return JavaParser.RULE_classDeclaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClassDeclaration" ):
                listener.enterClassDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClassDeclaration" ):
                listener.exitClassDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClassDeclaration" ):
                return visitor.visitClassDeclaration(self)
            else:
                return visitor.visitChildren(self)




    def classDeclaration(self):

        localctx = JavaParser.ClassDeclarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_classDeclaration)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23
            self.match(JavaParser.T__0)
            self.state = 24
            self.match(JavaParser.T__1)
            self.state = 25
            self.match(JavaParser.Identifier)
            self.state = 26
            self.match(JavaParser.T__2)
            self.state = 27
            self.methodDeclaration()
            self.state = 28
            self.match(JavaParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class MethodDeclarationContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Identifier(self):
            return self.getToken(JavaParser.Identifier, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JavaParser.StatementContext)
            else:
                return self.getTypedRuleContext(JavaParser.StatementContext,i)


        def getRuleIndex(self):
            return JavaParser.RULE_methodDeclaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodDeclaration" ):
                listener.enterMethodDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodDeclaration" ):
                listener.exitMethodDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodDeclaration" ):
                return visitor.visitMethodDeclaration(self)
            else:
                return visitor.visitChildren(self)




    def methodDeclaration(self):

        localctx = JavaParser.MethodDeclarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_methodDeclaration)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 30
            self.match(JavaParser.T__0)
            self.state = 31
            self.match(JavaParser.T__4)
            self.state = 32
            self.match(JavaParser.T__5)
            self.state = 33
            self.match(JavaParser.T__6)
            self.state = 34
            self.match(JavaParser.T__7)
            self.state = 35
            self.match(JavaParser.T__8)
            self.state = 36
            self.match(JavaParser.T__9)
            self.state = 37
            self.match(JavaParser.T__10)
            self.state = 38
            self.match(JavaParser.Identifier)
            self.state = 39
            self.match(JavaParser.T__11)
            self.state = 40
            self.match(JavaParser.T__2)
            self.state = 42 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 41
                self.statement()
                self.state = 44 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JavaParser.T__14) | (1 << JavaParser.T__15) | (1 << JavaParser.Identifier))) != 0)):
                    break

            self.state = 46
            self.match(JavaParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class StatementContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variableDeclaration(self):
            return self.getTypedRuleContext(JavaParser.VariableDeclarationContext,0)


        def assignmentStatement(self):
            return self.getTypedRuleContext(JavaParser.AssignmentStatementContext,0)


        def printStatement(self):
            return self.getTypedRuleContext(JavaParser.PrintStatementContext,0)


        def getRuleIndex(self):
            return JavaParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = JavaParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_statement)
        try:
            self.state = 57
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [JavaParser.T__14]:
                self.enterOuterAlt(localctx, 1)
                self.state = 48
                self.variableDeclaration()
                self.state = 49
                self.match(JavaParser.T__12)
                pass
            elif token in [JavaParser.Identifier]:
                self.enterOuterAlt(localctx, 2)
                self.state = 51
                self.assignmentStatement()
                self.state = 52
                self.match(JavaParser.T__12)
                pass
            elif token in [JavaParser.T__15]:
                self.enterOuterAlt(localctx, 3)
                self.state = 54
                self.printStatement()
                self.state = 55
                self.match(JavaParser.T__12)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class VariableDeclarationContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type(self):
            return self.getTypedRuleContext(JavaParser.TypeContext,0)


        def Identifier(self):
            return self.getToken(JavaParser.Identifier, 0)

        def expression(self):
            return self.getTypedRuleContext(JavaParser.ExpressionContext,0)


        def getRuleIndex(self):
            return JavaParser.RULE_variableDeclaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariableDeclaration" ):
                listener.enterVariableDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariableDeclaration" ):
                listener.exitVariableDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariableDeclaration" ):
                return visitor.visitVariableDeclaration(self)
            else:
                return visitor.visitChildren(self)




    def variableDeclaration(self):

        localctx = JavaParser.VariableDeclarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_variableDeclaration)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 59
            self.type()
            self.state = 60
            self.match(JavaParser.Identifier)
            self.state = 61
            self.match(JavaParser.T__13)
            self.state = 62
            self.expression(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class TypeContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return JavaParser.RULE_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType" ):
                listener.enterType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType" ):
                listener.exitType(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitType" ):
                return visitor.visitType(self)
            else:
                return visitor.visitChildren(self)




    def type(self):

        localctx = JavaParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_type)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(JavaParser.T__14)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class AssignmentStatementContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Identifier(self):
            return self.getToken(JavaParser.Identifier, 0)

        def expression(self):
            return self.getTypedRuleContext(JavaParser.ExpressionContext,0)


        def getRuleIndex(self):
            return JavaParser.RULE_assignmentStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignmentStatement" ):
                listener.enterAssignmentStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignmentStatement" ):
                listener.exitAssignmentStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignmentStatement" ):
                return visitor.visitAssignmentStatement(self)
            else:
                return visitor.visitChildren(self)




    def assignmentStatement(self):

        localctx = JavaParser.AssignmentStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_assignmentStatement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(JavaParser.Identifier)
            self.state = 67
            self.match(JavaParser.T__13)
            self.state = 68
            self.expression(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class PrintStatementContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(JavaParser.ExpressionContext,0)


        def getRuleIndex(self):
            return JavaParser.RULE_printStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrintStatement" ):
                listener.enterPrintStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrintStatement" ):
                listener.exitPrintStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrintStatement" ):
                return visitor.visitPrintStatement(self)
            else:
                return visitor.visitChildren(self)




    def printStatement(self):

        localctx = JavaParser.PrintStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_printStatement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.match(JavaParser.T__15)
            self.state = 71
            self.match(JavaParser.T__7)
            self.state = 72
            self.expression(0)
            self.state = 73
            self.match(JavaParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ExpressionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Identifier(self):
            return self.getToken(JavaParser.Identifier, 0)

        def IntegerLiteral(self):
            return self.getToken(JavaParser.IntegerLiteral, 0)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JavaParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(JavaParser.ExpressionContext,i)


        def op(self):
            return self.getTypedRuleContext(JavaParser.OpContext,0)


        def getRuleIndex(self):
            return JavaParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpression" ):
                return visitor.visitExpression(self)
            else:
                return visitor.visitChildren(self)



    def expression(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = JavaParser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 16
        self.enterRecursionRule(localctx, 16, self.RULE_expression, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [JavaParser.Identifier]:
                self.state = 76
                self.match(JavaParser.Identifier)
                pass
            elif token in [JavaParser.IntegerLiteral]:
                self.state = 77
                self.match(JavaParser.IntegerLiteral)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 86
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = JavaParser.ExpressionContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                    self.state = 80
                    if not self.precpred(self._ctx, 1):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 1)")
                    self.state = 81
                    self.op()
                    self.state = 82
                    self.expression(2) 
                self.state = 88
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx

    class OpContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return JavaParser.RULE_op

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOp" ):
                listener.enterOp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOp" ):
                listener.exitOp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOp" ):
                return visitor.visitOp(self)
            else:
                return visitor.visitChildren(self)




    def op(self):

        localctx = JavaParser.OpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_op)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 89
            _la = self._input.LA(1)
            if not(_la==JavaParser.T__16 or _la==JavaParser.T__17):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[8] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expression_sempred(self, localctx:ExpressionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 1)
         




