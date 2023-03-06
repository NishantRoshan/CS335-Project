from antlr4 import *
from JavaLexer import JavaLexer
from JavaParser import JavaParser
import argparse

parser = argparse.ArgumentParser()

parser.add_argument("-i","-input","--input",help="Input File")
parser.add_argument("-o","-output","--output",help="Output File")
parser.add_argument("-v","-verbose","--verbose",action="store_true",help="verbose")
args = parser.parse_args()

if args.input != None:
    in_file = args.input
else:
    in_file = "test.java"

if args.output != None:
    out_file = args.output
else:
    out_file = "out.dot"

verbose = args.verbose

    
LineNum = []
Type = []
Content = []

def readFile():
    code = """"""
    with open(in_file, 'r') as f:
        for line in f:
            code = code + line
    return code

def generateAST(ctx, verbose, indentation):
    toBeIgnored = not verbose and ctx.getChildCount() == 1 and isinstance(ctx.getChild(0), (ParserRuleContext, ))
    if not toBeIgnored:
        LineNum.append(int(indentation))
        Type.append(JavaParser.ruleNames[ctx.getRuleIndex()])
        cont = ctx.getText().split('"')
        cont = '\\"'.join(cont)
        if ctx.getChildCount() == 1:
            Content.append(cont + "\",shape=\"box")
        else:
            Content.append(cont[:10] + "...")
    i = 0
    while i < ctx.getChildCount():
        element = ctx.getChild(i)
        if isinstance(element, (RuleContext, )):
            generateAST(element, verbose, indentation + (0 if toBeIgnored else 1))
        i += 1

def main():
    """ generated source for method main """
    inputString = readFile()
    input = InputStream(inputString)
    lexer = JavaLexer(input)
    tokens = CommonTokenStream(lexer)
    parser = JavaParser(tokens)
    ctx = parser.compilation_unit()
    generateAST(ctx, verbose, 0)
    with open(out_file,"w") as f:
        f.write("digraph G {\n")
    printDOT()
    with open(out_file,"a+") as f:
        f.write("}")

def printDOT():
    printLabel()
    pos = 0
    with open(out_file,"a+") as f:
        for i in range(1,len(LineNum)):
            pos = getPos(int(LineNum[i]) - 1, i)
            f.write('\t' + str((int(LineNum[i])) - 1) + str(pos) + " -> " + str(LineNum[i]) + str(i) + '\n')
            i += 1

def printLabel():
    with open(out_file,"a+") as f:
        for i in range(len(LineNum)):
            f.write('\t' + str(LineNum[i]) + str(i) + ' [label=\"' + Type[i] + "\\n " + Content[i] + " \"]\n")

def getPos(n, limit):
    pos = 0
    for i in range(limit):
        if int(LineNum[i]) == n:
            pos = i
    return pos

main()