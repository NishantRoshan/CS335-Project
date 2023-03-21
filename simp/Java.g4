grammar Java;

compilationUnit : classDeclaration EOF;

classDeclaration : 'public' 'class' Identifier '{' methodDeclaration '}' ;

methodDeclaration : 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement+ '}' ;

statement : variableDeclaration ';' | assignmentStatement ';' | printStatement ';' ;

variableDeclaration : type Identifier '=' expression ;

type : 'int' ;

assignmentStatement : Identifier '=' expression ;

printStatement : 'System.out.println' '(' expression ')' ;

expression : Identifier | IntegerLiteral | expression op expression ;

op : '+' | '-' ;

Identifier : [a-zA-Z]+ ;

IntegerLiteral : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
