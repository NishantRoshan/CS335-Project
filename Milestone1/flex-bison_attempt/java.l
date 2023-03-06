%{
    #include <iostream>
    #include <string>
    #include <vector>
    #include <unordered_map>
    #include <utility> 
    using namespace std;
    
    #include "java.tab.h"
    #define YY_DECL int yylex()

%}


%option noyywrap
%option yylineno



Identifier         {JavaLetter}{JavaLetterOrDigit}*


JavaLetterOrDigit  [A-Z]|[a-z]|"$"|"_"|[0-9]


JavaLetter         [A-Z]|[a-z]|"$"|"_"


Whitespace         "\n"|"\t"|"\f"|"\r"|" "


Comment            {MultilineComment}|{EndOfLineComment}


EndOfLineComment   "//".*
MultilineComment   [/][*][^*]*[*]+([^*/][^*]*[*]+)*[/]


Keyword            "abstract"|"assert"|"boolean"|"break"|"byte"|"case"|"catch"|"char"|"class"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"extends"|"final"|"finally"|"float"|"for"|"if"|"goto"|"implements"|"import"|"instanceof"|"int"|"interface"|"long"|"native"|"new"|"package"|"private"|"protected"|"public"|"   return"|"short"|"static"|"strictfp"|"super"|"switch"|"synchronized"|"this"|"throw"|"throws"|"transient"|"try"|"void"|"volatile"|"while"


Operator           "="|">"|"<"|"!"|"~"|"?"|":"|"->"|"=="|">="|"<="|"!="|"&&"|"||"|"++"|"--"|"+"|"-"|"*"|"/"|"&"|"|"|"^"|"%"|"<<"|">>"|">>>"|"+="|"-="|"*="|"/="|"&="|"|="|"^="|"%="|"<<="|">>="|">>>="


Separator          "("|")"|"{"|"}"|"["|"]"|";"|","|"."|"..."|"@"|"::"


Literal            {IntegerLiteral}|{FloatingPointLiteral}|{BooleanLiteral}|{CharacterLiteral}|{StringLiteral}|{TextBlock}|{NullLiteral}


IntegerLiteral       {DecimalIntegerLiteral}|{HexIntegerLiteral}|{OctalIntegerLiteral}|{BinaryIntegerLiteral}


DecimalIntegerLiteral    {DecimalNumeral}{IntegerTypeSuffix}?
HexIntegerLiteral        {HexNumeral}{IntegerTypeSuffix}?
OctalIntegerLiteral      {OctalNumeral}{IntegerTypeSuffix}?
BinaryIntegerLiteral     {BinaryNumeral}{IntegerTypeSuffix}?
IntegerTypeSuffix        l|L


DecimalNumeral           0|{NonZeroDigit}{Digits}?|{NonZeroDigit}{Underscores}{Digits}
NonZeroDigit             [1-9]
Digits                   {Digit}|{Digit}{DigitsAndUnderscores}?{Digit}
Digit                    0|{NonZeroDigit}
DigitsAndUnderscores     {DigitOrUnderscore}{DigitOrUnderscore}*
DigitOrUnderscore        {Digit}|_
Underscores              _[_]*


HexNumeral               0x{HexDigits}|0X{HexDigits}
HexDigits                {HexDigit}|{HexDigit}{HexDigitsAndUnderscores}?{HexDigit}
HexDigit                 [0-9]|[a-f]|[A-F]
HexDigitsAndUnderscores  {HexDigitOrUnderscore}{HexDigitOrUnderscore}*
HexDigitOrUnderscore     {HexDigit}|_


OctalNumeral             0{OctalDigits}|0{Underscores}{OctalDigits}
OctalDigits              {OctalDigit}|{OctalDigit}{OctalDigitsAndUnderscores}?{OctalDigit}
OctalDigit               [0-7]
OctalDigitsAndUnderscores {OctalDigitOrUnderscore}{OctalDigitOrUnderscore}*
OctalDigitOrUnderscore   {OctalDigit}|_


BinaryNumeral            0b{BinaryDigits}|0B{BinaryDigits}
BinaryDigits             {BinaryDigit}|{BinaryDigit}{BinaryDigitsAndUnderscores}?{BinaryDigit}
BinaryDigit              0|1
BinaryDigitsAndUnderscores {BinaryDigitOrUnderscore}{BinaryDigitOrUnderscore}*
BinaryDigitOrUnderscore  {BinaryDigit}|_


FloatingPointLiteral     {DecimalFloatingPointLiteral}|{HexadecimalFloatingPointLiteral}
DecimalFloatingPointLiteral   {Digits}"."{Digits}?{ExponentPart}?{FloatTypeSuffix}?|"."{Digits}{ExponentPart}?{FloatTypeSuffix}?|{Digits}{ExponentPart}{FloatTypeSuffix}?|{Digits}{ExponentPart}?{FloatTypeSuffix}
ExponentPart             {ExponentIndicator}{SignedInteger}
ExponentIndicator        e|E
SignedInteger            {Sign}?{Digits}
Sign                     "+"|"-"
FloatTypeSuffix          f|F|d|D


HexadecimalFloatingPointLiteral    {HexSignificand}{BinaryExponent}{FloatTypeSuffix}?
HexSignificand           {HexNumeral}[.]?|0x{HexDigits}?[.]{HexDigits}|0X{HexDigits}?[.]{HexDigits}
BinaryExponent           {BinaryExponentIndicator}{SignedInteger}
BinaryExponentIndicator  p|P


BooleanLiteral           true|false


CharacterLiteral         \'[^\r\n\']\'


StringLiteral            \"[^\r\n\"]*\"


TextBlock                \"\"\"[ \t\f]*{LineTerminator}{Everything}*\"\"\"
LineTerminator           \n|\r|"\r\n"
Everything               ["]{0,2}[^"]+


NullLiteral              null


%%
"abstract"       return ABSTRACT;
"assert"         return ASSERT;
"boolean"        return BOOL;
"break"          return BREAK;
"byte"           return BYTE;
"case"           return CASE;
"catch"          return CATCH;
"char"           return CHAR;
"class"          return CLASS;
"continue"       return CONTINUE;
"const"          return RETURN;
"default"        return DEFAULT;
"do"             return DO;
"double"         return DOUBLE;
"else"           return ELSE;
"enum"           return ENUM;
"exports"        return EXPORTS;
"extends"        return EXTENDS;
"false"		     return F;
"final"          return CONST;
"finally"        return FINALLY;
"float"          return FLOAT;
"for"            return FOR;
"goto"           return GOTO;
"if"             return IF;
"implements"     return IMPLEMENTS;
"import"         return IMPORT;
"instanceof"     return INSTANCEOF;
"interface"      return INTERFACE;
"int"            return INT;
"long"           return LONG;
"module"         return MODULE;
"native"         return NATIVE;
"new"            return NEW;
"non-sealed"     return NON_SEALED;
"null"		     return N;
"open"           return OPEN;
"opens"          return OPENS;
"package"        return PACKAGE;
"permits"        return PERMITS;
"private"        return PRIVATE;
"provides"       return PROVIDES;
"protected"      return PROTECTED;
"public"         return PUBLIC;
"record"         return RECORD;
"requires"       return REQUIRES;
"return"         return CONT;
"sealed"         return SEALED;
"short"          return SHORT;
"static"         return STATIC;
"strictfp"       return STRICTFP;
"super"          return SUPER;
"switch"         return SWITCH;
"synchronized"   return SYNCHRONIZED;
"this"           return THIS;
"throw"          return THROW;
"throws"         return THROWS;
"to"             return TO;
"transient"      return TRANSIENT;
"transitive"     return TRANSITIVE;
"true"		     return T;
"try"            return TRY;
"uses"           return USES;
"var"            return VAR;
"void"           return VOID;
"volatile"       return VOLATILE;
"while"          return WHILE;
"with"           return WITH;
"yield"          return YIELD;

"..."             return DOT_DOT_DOT;
"@"               return AT_RATE;
"::"              return DOUBLE_COL;

"."              return DOT;
"[ ]"            return SQ_SPACE;
","              return COMM;
"?"              return QUES;
";"              return SEMI_COL;

"{"			return BLOCK_S;
"}"			return BLOCK_E;
"["		   return ARRAY_S;
"]"			return ARRAY_E;
"("			return PAREN_S;
")"			return PAREN_E;


"&&"        return LOG_AND;
"||"        return LOG_OR;
"!"         return LOG_NOT;

"&"         return BIT_AND;
"|"         return BIT_OR;
"^"         return BIT_XOR;
">>>"       return UNSG_RIGHT;
"<<"        return LEFT_SHIFT;
">>"        return RIGHT_SHIFT;


"=="        return EQ_TO;
"!="        return NOT_EQ;
">="        return GEQ;
"<="        return LEQ;
">"         return GT;
"<"         return LT;

"="         return ASSN;
"+="        return ADD_ASS;
"-="        return SUB_ASS;
"*="        return MULT_ASS;
"/="        return DIV_ASS;
"&="        return AND_ASS;


"++"        return UNN_ICR;
"--"        return UNN_DCR;
"+"         return ADD;
"-"         return SUB;
"*"         return MULTI;
"/"         return DIV;
"%"         return MOD;


":"         return COLON;
"->"        return MEM_OP;


{Identifier}           return IDENTIFIER;
{Literal}              return LITERAL;
{Comment}                                         /* This is to eat up comments and    return nothing */


{Whitespace}                                      /* This is to eat up blanks,whitespace and line terminators */


.                                                {printf("Error: Illegal character %s, in line number %d\n",yytext,yylineno);
                                                    return 0;
                                                 }
%%






