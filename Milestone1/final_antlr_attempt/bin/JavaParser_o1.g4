
parser grammar JavaParser;

options { tokenVocab=JavaLexer; }
//-------------------------------Lexical structure---------------------------
identifier:
         IDENTIFIER
        | MODULE
        | OPEN
        | REQUIRES
        | EXPORTS
        | OPENS
        | TO
        | USES
        | PROVIDES
        | WITH
        | TRANSITIVE
        | YIELD
        | SEALED
        | PERMITS
        | RECORD
        | VAR
;
typeIdentifier:
             IDENTIFIER
            | MODULE
            | OPEN
            | REQUIRES
            | EXPORTS
            | OPENS
            | TO
            | USES
            | PROVIDES
            | WITH
            | TRANSITIVE
            | SEALED
            | PERMITS
            | RECORD
;

//------------------------------Types values and variables---------------------
nonWildcardTypeArgumentsOrDiamond:
                                 '<' '>'
                                | nonWildcardTypeArguments
;
nonWildcardTypeArguments:
                         '<' typeList '>'
;
typeList:
         typeType (',' typeType)*
;
typeType:
         annotation* (classOrInterfaceType | primitiveType) (annotation* '[' ']')*
;
primitiveType:
             BOOLEAN
            | CHAR
            | BYTE
            | SHORT
            | INT
            | LONG
            | FLOAT
            | DOUBLE
;
typeParameter:
             annotation* identifier (EXTENDS annotation* typeBound)?
;
typeBound:
         typeType ('&' typeType)*
;
typeArgument:
             typeType
            | annotation* '?' ((EXTENDS | SUPER) typeType)?
;
typeArguments:
             '<' typeArgument (',' typeArgument)* '>'
;
superSuffix:
             arguments
            | '.' typeArguments? identifier arguments?
;
explicitGenericInvocationSuffix:
                                 SUPER superSuffix
                                | identifier arguments
;
arguments:
         '(' expressionList? ')'
;
classOrInterfaceType:
                     (identifier typeArguments? '.')* typeIdentifier typeArguments?
;
classType:
         (classOrInterfaceType '.')? annotation* identifier typeArguments?
;

// ----------------------------------Packages & modules------------------------
compilationUnit:
                packageDeclaration? importDeclaration* typeDeclaration*
                | moduleDeclaration EOF
;

packageDeclaration:
                  annotation* PACKAGE qualifiedName ';'
;

importDeclaration:
                 IMPORT STATIC? qualifiedName ('.' '*')? ';'
;
moduleDeclaration:
                 OPEN? MODULE qualifiedName moduleBody
;
typeDeclaration:
                classOrInterfaceModifier*
                (classDeclaration | enumDeclaration | interfaceDeclaration | annotationTypeDeclaration | recordDeclaration)
                | ';'
;
moduleBody:
           '{' moduleDirective* '}'
;
moduleDirective:
                 REQUIRES requiresModifier* qualifiedName ';'
                | EXPORTS qualifiedName (TO qualifiedName)? ';'
                | OPENS qualifiedName (TO qualifiedName)? ';'
                | USES qualifiedName ';'
                | PROVIDES qualifiedName WITH qualifiedName ';'
;
modifier:
         classOrInterfaceModifier
        | NATIVE
        | SYNCHRONIZED
        | TRANSIENT
        | VOLATILE
;
requiresModifier:
                 TRANSITIVE
                | STATIC
;
classOrInterfaceModifier:
                         annotation
                        | PUBLIC
                        | PROTECTED
                        | PRIVATE
                        | STATIC
                        | ABSTRACT
                        | FINAL    // FINAL for class only -- does not apply to interfaces
                        | STRICTFP
                        | SEALED 
                        | NON_SEALED 
;

// -----------------------Classes--------------------------------
classDeclaration:
                CLASS identifier typeParameters?
                (EXTENDS typeType)?
                (IMPLEMENTS typeList)?
                (PERMITS typeList)?
                classBody
;
typeParameters:
              '<' typeParameter (',' typeParameter)* '>'
;
classBody:
         '{' classBodyDeclaration* '}'
;
classBodyDeclaration:
                    ';'
                    | STATIC? block
                    | modifier* memberDeclaration
;
memberDeclaration:
                recordDeclaration 
                | methodDeclaration
                | genericMethodDeclaration
                | fieldDeclaration
                | constructorDeclaration
                | genericConstructorDeclaration
                | interfaceDeclaration
                | annotationTypeDeclaration
                | classDeclaration
                | enumDeclaration
;
fieldDeclaration:
                 typeType variableDeclarators ';'
;
variableDeclarators:
                    variableDeclarator (',' variableDeclarator)*
;

variableDeclarator:
                   variableDeclaratorId ('=' variableInitializer)?
;

variableDeclaratorId:
                     identifier ('[' ']')*
;

variableInitializer:
                     arrayInitializer
                    | expression
;
methodDeclaration:
                typeTypeOrVoid identifier formalParameters ('[' ']')*
                (THROWS qualifiedNameList)?
                methodBody
;
receiverParameter:
                 typeType (identifier '.')* THIS
;

formalParameterList:
                     formalParameter (',' formalParameter)* (',' lastFormalParameter)?
                    | lastFormalParameter
;
formalParameters:
                 '(' ( receiverParameter?
                    | receiverParameter (',' formalParameterList)?
                    | formalParameterList?
                    ) ')'
;
formalParameter:
               variableModifier* typeType variableDeclaratorId
;
variableModifier:
                FINAL
                | annotation
;
methodBody:
            block
            | ';'
;
genericConstructorDeclaration:
                             typeParameters constructorDeclaration
;

constructorDeclaration:
                      identifier formalParameters (THROWS qualifiedNameList)? constructorBody=block
;
enumDeclaration:
                ENUM identifier (IMPLEMENTS typeList)? '{' enumConstants? ','? enumBodyDeclarations? '}'
;

enumConstants:
             enumConstant (',' enumConstant)*
;

enumConstant:
            annotation* identifier arguments? classBody?
;

enumBodyDeclarations:
                    ';' classBodyDeclaration*
;
recordDeclaration:
                 RECORD identifier typeParameters? recordHeader
                (IMPLEMENTS typeList)?
                recordBody
;
recordHeader:
             '(' recordComponentList? ')'
;

recordComponentList:
                     recordComponent (',' recordComponent)*
;

recordComponent:
                 typeType identifier
;

recordBody:
          '{' (classBodyDeclaration | compactConstructorDeclaration)*  '}'
;
compactConstructorDeclaration:
                             modifier* identifier constructorBody=block
;



// ------------------------------Interfaces------------------------------
interfaceDeclaration:
                    INTERFACE identifier typeParameters? (EXTENDS typeList)? (PERMITS typeList)? interfaceBody
;
interfaceBody:
             '{' interfaceBodyDeclaration* '}'
;
// --------not found-------
typeTypeOrVoid:
             typeType
            | VOID
;
// -----------not found----------
genericMethodDeclaration:
                         typeParameters methodDeclaration
;
//-------------not found-----------
interfaceBodyDeclaration:
                         modifier* interfaceMemberDeclaration
                        | ';'
;

interfaceMemberDeclaration:
                         constDeclaration
                        | interfaceMethodDeclaration
                        | genericInterfaceMethodDeclaration
                        | interfaceDeclaration
                        | annotationTypeDeclaration
                        | classDeclaration
                        | enumDeclaration
                        | recordDeclaration 
;
// ------not found------
constDeclaration:
                 typeType constantDeclarator (',' constantDeclarator)* ';'
;

constantDeclarator:
                  identifier ('[' ']')* '=' variableInitializer
;

interfaceMethodDeclaration:
                           interfaceMethodModifier* interfaceCommonBodyDeclaration
;

interfaceMethodModifier:
                         annotation
                        | PUBLIC
                        | ABSTRACT
                        | DEFAULT
                        | STATIC
                        | STRICTFP
;
//not found
genericInterfaceMethodDeclaration:
                                  interfaceMethodModifier* typeParameters interfaceCommonBodyDeclaration
;
//not found
interfaceCommonBodyDeclaration:
                              annotation* typeTypeOrVoid identifier formalParameters ('[' ']')* (THROWS qualifiedNameList)? methodBody
;
defaultValue:
             DEFAULT elementValue
;
altAnnotationQualifiedName:
                          (identifier DOT)* '@' identifier
;

annotation:
          ('@' qualifiedName | altAnnotationQualifiedName) ('(' ( elementValuePairs | elementValue )? ')')?
;

elementValuePairs:
                 elementValuePair (',' elementValuePair)*
;

elementValuePair:
                 identifier '=' elementValue
;

elementValue:
             expression
            | annotation
            | elementValueArrayInitializer
;

elementValueArrayInitializer:
                             '{' (elementValue (',' elementValue)*)? (',')? '}'
;

annotationTypeDeclaration:
                         '@' INTERFACE identifier annotationTypeBody
;

annotationTypeBody:
                  '{' (annotationTypeElementDeclaration)* '}'
;
// not found
annotationTypeElementDeclaration:
                                 modifier* annotationTypeElementRest
                                | ';' // this is not allowed by the grammar, but apparently allowed by the actual compiler
;
// not found
annotationTypeElementRest:
                         typeType annotationMethodOrConstantRest ';'
                        | classDeclaration ';'?
                        | interfaceDeclaration ';'?
                        | enumDeclaration ';'?
                        | annotationTypeDeclaration ';'?
                        | recordDeclaration ';'? 
;
//not found
annotationMethodOrConstantRest:
                                 annotationMethodRest
                                | annotationConstantRest
;
//not found
annotationMethodRest:
                     identifier '(' ')' defaultValue?
;
// not found
annotationConstantRest:
                      variableDeclarators
;
// ---------------------------------Arrays-------------------------------
arrayInitializer:
                 '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
;

// --------------------------Blocks,statements and pattern--------------------
block:
     '{' blockStatement* '}'
;

blockStatement:
                 localVariableDeclaration ';'
                | localTypeDeclaration
                | statement
;

localVariableDeclaration:
                         variableModifier* (VAR identifier '=' expression | typeType variableDeclarators)
;

statement:
         blockLabel=block
        | ASSERT expression (':' expression)? ';'
        | IF parExpression statement (ELSE statement)?
        | FOR '(' forControl ')' statement
        | WHILE parExpression statement
        | DO statement WHILE parExpression ';'
        | TRY block (catchClause+ finallyBlock? | finallyBlock)
        | TRY resourceSpecification block catchClause* finallyBlock?
        | SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
        | SYNCHRONIZED parExpression block
        | RETURN expression? ';'
        | THROW expression ';'
        | BREAK identifier? ';'
        | CONTINUE identifier? ';'
        | YIELD expression ';' 
        | SEMI
        | statementExpression=expression ';'
        | switchExpression ';'? 
        | identifierLabel=identifier ':' statement
;
switchRuleOutcome:
                 block
                | blockStatement*
;

switchBlockStatementGroup:
                         switchLabel+ blockStatement+
;

switchLabel:
             CASE (constantExpression=expression | enumConstantName=IDENTIFIER | typeType varName=identifier) ':'
            | DEFAULT ':'
;
forInit:
         localVariableDeclaration
        | expressionList
;
forControl:
             enhancedForControl
            | forInit? ';' expression? ';' forUpdate=expressionList?
;

enhancedForControl:
                   variableModifier* (typeType | VAR) variableDeclaratorId ':' expression
;
catchClause:
            CATCH '(' variableModifier* catchType identifier ')' block
;

catchType:
          qualifiedName ('|' qualifiedName)*
;

finallyBlock:
             FINALLY block
;

resourceSpecification:
                     '(' resources ';'? ')'
;

resources:
         resource (';' resource)*
;

resource:
         variableModifier* ( classOrInterfaceType variableDeclaratorId | VAR identifier ) '=' expression
        | identifier
;
pattern:
         variableModifier* typeType annotation* identifier
;

// ----------------------------------Expressions-----------------------------
primary:
         '(' expression ')'
        | THIS
        | SUPER
        | literal
        | identifier
        | typeTypeOrVoid '.' CLASS
        | nonWildcardTypeArguments (explicitGenericInvocationSuffix | THIS arguments)
;
literal:
         integerLiteral
        | floatLiteral
        | CHAR_LITERAL
        | STRING_LITERAL
        | BOOL_LITERAL
        | NULL_LITERAL
        | TEXT_BLOCK 
;

integerLiteral:
             DECIMAL_LITERAL
            | HEX_LITERAL
            | OCT_LITERAL
            | BINARY_LITERAL
;

floatLiteral:
             FLOAT_LITERAL
            | HEX_FLOAT_LITERAL
;
typeArgumentsOrDiamond:
                         '<' '>'
                        | typeArguments
;
expression:
         primary
        | expression bop='.'
        (
            identifier
        | methodCall
        | THIS
        | NEW nonWildcardTypeArguments? innerCreator
        | SUPER superSuffix
        | explicitGenericInvocation
        )
        | expression '[' expression ']'
        | methodCall
        | NEW creator
        | '(' annotation* typeType ('&' typeType)* ')' expression
        | expression postfix=('++' | '--')
        | prefix=('+'|'-'|'++'|'--') expression
        | prefix=('~'|'!') expression
        | expression bop=('*'|'/'|'%') expression
        | expression bop=('+'|'-') expression
        | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
        | expression bop=('<=' | '>=' | '>' | '<') expression
        | expression bop=INSTANCEOF (typeType | pattern)
        | expression bop=('==' | '!=') expression
        | expression bop='&' expression
        | expression bop='^' expression
        | expression bop='|' expression
        | expression bop='&&' expression
        | expression bop='||' expression
        | <assoc=right> expression bop='?' expression ':' expression
        | <assoc=right> expression
        bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
        expression
        | switchExpression 

        | expression '::' typeArguments? identifier
        | typeType '::' (typeArguments? identifier | NEW)
        | classType '::' typeArguments? NEW
;
switchExpression:
                 SWITCH parExpression '{' switchLabeledRule* '}'
;

switchLabeledRule:
                 CASE (expressionList | NULL_LITERAL | guardedPattern) (ARROW | COLON) switchRuleOutcome
                | DEFAULT (ARROW | COLON) switchRuleOutcome
;
qualifiedNameList:
                 qualifiedName (',' qualifiedName)*
;
lastFormalParameter
    : variableModifier* typeType annotation* '...' variableDeclaratorId
    ;

qualifiedName:
             identifier ('.' identifier)*
;

localTypeDeclaration:
                     classOrInterfaceModifier*
                    (classDeclaration | interfaceDeclaration | recordDeclaration)
;

parExpression:
             '(' expression ')'
;

expressionList:
              expression (',' expression)*
;

methodCall:
             identifier '(' expressionList? ')'
            | THIS '(' expressionList? ')'
            | SUPER '(' expressionList? ')'
;
guardedPattern:
             '(' guardedPattern ')'
            | variableModifier* typeType annotation* identifier ('&&' expression)*
            | guardedPattern '&&' expression
;

creator:
         nonWildcardTypeArguments createdName classCreatorRest
        | createdName (arrayCreatorRest | classCreatorRest)
;
createdName:
             identifier typeArgumentsOrDiamond? ('.' identifier typeArgumentsOrDiamond?)*
            | primitiveType
;
innerCreator:
             identifier nonWildcardTypeArgumentsOrDiamond? classCreatorRest
;

arrayCreatorRest:
                 '[' (']' ('[' ']')* arrayInitializer | expression ']' ('[' expression ']')* ('[' ']')*)
;

classCreatorRest:
                 arguments classBody?
;

explicitGenericInvocation:
                         nonWildcardTypeArguments explicitGenericInvocationSuffix
;

