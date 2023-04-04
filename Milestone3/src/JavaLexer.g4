lexer grammar JavaLexer;

// ---------------------------Keywords--------------------------

ABSTRACT:           'abstract';
ASSERT:             'assert';
BOOLEAN:            'boolean';
BREAK:              'break';
BYTE:               'byte';
CASE:               'case';
CATCH:              'catch';
CHAR:               'char';
CLASS:              'class';
CONST:              'const';
CONTINUE:           'continue';
DEFAULT:            'default';
DO:                 'do';
DOUBLE:             'double';
ELSE:               'else';
ENUM:               'enum';
EXTENDS:            'extends';
FINAL:              'final';
FINALLY:            'finally';
FLOAT:              'float';
FOR:                'for';
IF:                 'if';
GOTO:               'goto';
IMPLEMENTS:         'implements';
IMPORT:             'import';
INSTANCEOF:         'instanceof';
INT:                'int';
INTERFACE:          'interface';
LONG:               'long';
NATIVE:             'native';
NEW:                'new';
PACKAGE:            'package';
PRIVATE:            'private';
PROTECTED:          'protected';
PUBLIC:             'public';
RETURN:             'return';
SHORT:              'short';
STATIC:             'static';
STRICTFP:           'strictfp';
SUPER:              'super';
SWITCH:             'switch';
SYNCHRONIZED:       'synchronized';
THIS:               'this';
THROW:              'throw';
THROWS:             'throws';
TRANSIENT:          'transient';
TRY:                'try';
VOID:               'void';
VOLATILE:           'volatile';
WHILE:              'while';

//-----------Module related keywords--------------
MODULE:             'module';
OPEN:               'open';
REQUIRES:           'requires';
EXPORTS:            'exports';
OPENS:              'opens';
TO:                 'to';
USES:               'uses';
PROVIDES:           'provides';
WITH:               'with';
TRANSITIVE:         'transitive';

//---------Local Variable Type Inference--------------
VAR:                'var'; 

//-----------------Switch Expressions--------------------
YIELD:              'yield';  

//----------------------Records--------------------
RECORD:             'record';

//--------------------------Sealed Classes-----------------------
SEALED:             'sealed';
PERMITS:            'permits';
NON_SEALED:         'non-sealed';

//------------------------------Separators----------------------------

SEMI:               ';';
COMMA:              ',';
DOT:                '.';
PAREN_S:             '(';
PAREN_E:             ')';
BLOCK_S:             '{';
BLOCK_E:             '}';
ARRAY_S:             '[';
ARRAY_E:             ']';


//-------------------------Literals------------------------

DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
HEX_LITERAL:        '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;
OCT_LITERAL:        '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?;
BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;

FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
             |       Digits (ExponentPart [fFdD]? | [fFdD])
;

HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits '.'? | HexDigits? '.' HexDigits) [pP] [+-]? Digits [fFdD]?;

BOOL_LITERAL:       'true'
            |       'false'
;

CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';

TEXT_BLOCK:         '"""' [ \t]* [\r\n] (. | EscapeSequence)*? '"""';

NULL_LITERAL:       'null';

//---------------------------Whitespace and comments--------------------

WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

//-------------------------Operators------------------------

ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
LOG_NOT:            '!';
TILDE:              '~';
QUESTION:           '?';
COLON:              ':';
EQUAL:              '==';
LE:                 '<=';
GE:                 '>=';
NOTEQUAL:           '!=';
LOG_AND:            '&&';
LOG_OR:             '||';
UNN_INC:            '++';
UNN_DEC:            '--';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
BITAND:             '&';
BITOR:              '|';
CARET:              '^';
MOD:                '%';

ADD_ASS:         '+=';
SUB_ASS:         '-=';
MUL_ASS:         '*=';
DIV_ASS:         '/=';
AND_ASS:         '&=';
OR_ASS:          '|=';
XOR_ASS:         '^=';
MOD_ASS:         '%=';
LSHIFT_ASS:      '<<=';
RSHIFT_ASS:      '>>=';
URSHIFT_ASS:     '>>>=';

ARROW:              '->';
COLONCOLON:         '::';

AT:                 '@';
ELLIPSIS:           '...';

//---------------------Identifiers----------------------

IDENTIFIER:         Letter LetterOrDigit*;

//---------------------------Fragment rules----------------------------

fragment ExponentPart:
                     [eE] [+-]? Digits
;

fragment EscapeSequence:
                         '\\' [btnfr"'\\]
                        | '\\' ([0-3]? [0-7])? [0-7]
                        | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
;

fragment HexDigits:
                 HexDigit ((HexDigit | '_')* HexDigit)?
;

fragment HexDigit:
                 [0-9a-fA-F]
;

fragment Digits:
                 [0-9] ([0-9_]* [0-9])?
;

fragment LetterOrDigit:
                     Letter
                    | [0-9]
;

fragment Letter:
             [a-zA-Z$_] 
            | ~[\u0000-\u007F\uD800-\uDBFF] 
            | [\uD800-\uDBFF] [\uDC00-\uDFFF] 
;