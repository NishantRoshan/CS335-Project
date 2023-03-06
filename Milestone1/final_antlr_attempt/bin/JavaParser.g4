
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
type_identifier:
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
non_wild_card_type_arguments_or_diamond:
                                 '<' '>'
                                | non_wildcard_type_arguments
;
non_wildcard_type_arguments:
                         '<' type_list '>'
;
type_list:
         type_type (',' type_type)*
;
type_type:
         annotation* (class_or_interface_type | primitive_type) (annotation* '[' ']')*
;
primitive_type:
             BOOLEAN
            | CHAR
            | BYTE
            | SHORT
            | INT
            | LONG
            | FLOAT
            | DOUBLE
;
type_parameter:
             annotation* identifier (EXTENDS annotation* type_bound)?
;
type_bound:
         type_type ('&' type_type)*
;
type_argument:
             type_type
            | annotation* '?' ((EXTENDS | SUPER) type_type)?
;
type_arguments:
             '<' type_argument (',' type_argument)* '>'
;
super_suffix:
             arguments
            | '.' type_arguments? identifier arguments?
;
explicit_generic_invocation_suffix:
                                 SUPER super_suffix
                                | identifier arguments
;
arguments:
         '(' expression_list? ')'
;
class_or_interface_type:
                     (identifier type_arguments? '.')* type_identifier type_arguments?
;
class_type:
         (class_or_interface_type '.')? annotation* identifier type_arguments?
;

// ----------------------------------Packages & modules------------------------
compilation_unit:
                package_declaration? import_declaration* type_declaration*
                | module_declaration EOF
;

package_declaration:
                  annotation* PACKAGE qualified_name ';'
;

import_declaration:
                 IMPORT STATIC? qualified_name ('.' '*')? ';'
;
module_declaration:
                 OPEN? MODULE qualified_name module_body
;
type_declaration:
                class_or_interface_modifier*
                (class_declaration | enum_declaration | interface_declaration | annotation_type_declaration | record_declaration)
                | ';'
;
module_body:
           '{' module_directive* '}'
;
module_directive:
                 REQUIRES requires_modifier* qualified_name ';'
                | EXPORTS qualified_name (TO qualified_name)? ';'
                | OPENS qualified_name (TO qualified_name)? ';'
                | USES qualified_name ';'
                | PROVIDES qualified_name WITH qualified_name ';'
;
modifier:
         class_or_interface_modifier
        | NATIVE
        | SYNCHRONIZED
        | TRANSIENT
        | VOLATILE
;
requires_modifier:
                 TRANSITIVE
                | STATIC
;
class_or_interface_modifier:
                         annotation
                        | PUBLIC
                        | PROTECTED
                        | PRIVATE
                        | STATIC
                        | ABSTRACT
                        | FINAL    
                        | STRICTFP
                        | SEALED 
                        | NON_SEALED 
;

// -----------------------Classes--------------------------------
class_declaration:
                CLASS identifier type_parameters?
                (EXTENDS type_type)?
                (IMPLEMENTS type_list)?
                (PERMITS type_list)?
                class_body
;
type_parameters:
              '<' type_parameter (',' type_parameter)* '>'
;
class_body:
         '{' class_body_declaration* '}'
;
class_body_declaration:
                    ';'
                    | STATIC? block
                    | modifier* member_declaration
;
member_declaration:
                record_declaration 
                | method_declaration
                | generic_method_declaration
                | field_declaration
                | constructor_declaration
                | generic_constructor_declaration
                | interface_declaration
                | annotation_type_declaration
                | class_declaration
                | enum_declaration
;
field_declaration:
                 type_type variable_declarators ';'
;
variable_declarators:
                    variable_declarator (',' variable_declarator)*
;

variable_declarator:
                   variable_declarator_id ('=' variable_initializer)?
;

variable_declarator_id:
                     identifier ('[' ']')*
;

variable_initializer:
                     array_initializer
                    | expression
;
method_declaration:
                type_type_or_void identifier formal_parameters ('[' ']')*
                (THROWS qualified_name_list)?
                method_body
;
receiver_parameter:
                 type_type (identifier '.')* THIS
;

formal_parameter_list:
                     formal_parameter (',' formal_parameter)* (',' last_formal_parameter)?
                    | last_formal_parameter
;
formal_parameters:
                 '(' ( receiver_parameter?
                    | receiver_parameter (',' formal_parameter_list)?
                    | formal_parameter_list?
                    ) ')'
;
formal_parameter:
               variable_modifier* type_type variable_declarator_id
;
variable_modifier:
                FINAL
                | annotation
;
method_body:
            block
            | ';'
;
generic_constructor_declaration:
                             type_parameters constructor_declaration
;

constructor_declaration:
                      identifier formal_parameters (THROWS qualified_name_list)? constructorBody=block
;
enum_declaration:
                ENUM identifier (IMPLEMENTS type_list)? '{' enum_constants? ','? enum_body_declarations? '}'
;

enum_constants:
             enum_constant (',' enum_constant)*
;

enum_constant:
            annotation* identifier arguments? class_body?
;

enum_body_declarations:
                    ';' class_body_declaration*
;
record_declaration:
                 RECORD identifier type_parameters? record_header
                (IMPLEMENTS type_list)?
                record_body
;
record_header:
             '(' record_component_list? ')'
;

record_component_list:
                     record_component (',' record_component)*
;

record_component:
                 type_type identifier
;

record_body:
          '{' (class_body_declaration | compact_constructor_declaration)*  '}'
;
compact_constructor_declaration:
                             modifier* identifier constructorBody=block
;



// ------------------------------Interfaces------------------------------
interface_declaration:
                    INTERFACE identifier type_parameters? (EXTENDS type_list)? (PERMITS type_list)? interface_body
;
interface_body:
             '{' interface_body_declaration* '}'
;

type_type_or_void:
             type_type
            | VOID
;

generic_method_declaration:
                         type_parameters method_declaration
;

interface_body_declaration:
                         modifier* interface_member_declaration
                        | ';'
;

interface_member_declaration:
                         const_declaration
                        | interface_method_declaration
                        | generic_interface_method_declaration
                        | interface_declaration
                        | annotation_type_declaration
                        | class_declaration
                        | enum_declaration
                        | record_declaration 
;

const_declaration:
                 type_type constant_declarator (',' constant_declarator)* ';'
;

constant_declarator:
                  identifier ('[' ']')* '=' variable_initializer
;

interface_method_declaration:
                           interface_method_modifier* interface_common_body_declaration
;

interface_method_modifier:
                         annotation
                        | PUBLIC
                        | ABSTRACT
                        | DEFAULT
                        | STATIC
                        | STRICTFP
;

generic_interface_method_declaration:
                                  interface_method_modifier* type_parameters interface_common_body_declaration
;

interface_common_body_declaration:
                              annotation* type_type_or_void identifier formal_parameters ('[' ']')* (THROWS qualified_name_list)? method_body
;
default_value:
             DEFAULT element_value
;
alt_annotation_qualified_name:
                          (identifier DOT)* '@' identifier
;

annotation:
          ('@' qualified_name | alt_annotation_qualified_name) ('(' ( element_value_pairs | element_value )? ')')?
;

element_value_pairs:
                 element_value_pair (',' element_value_pair)*
;

element_value_pair:
                 identifier '=' element_value
;

element_value:
             expression
            | annotation
            | element_value_array_initializer
;

element_value_array_initializer:
                             '{' (element_value (',' element_value)*)? (',')? '}'
;

annotation_type_declaration:
                         '@' INTERFACE identifier annotation_type_body
;

annotation_type_body:
                  '{' (annotation_type_element_declaration)* '}'
;

annotation_type_element_declaration:
                                 modifier* annotation_type_element_rest
                                | ';' 
;

annotation_type_element_rest:
                         type_type annotation_method_or_constant_rest ';'
                        | class_declaration ';'?
                        | interface_declaration ';'?
                        | enum_declaration ';'?
                        | annotation_type_declaration ';'?
                        | record_declaration ';'? 
;

annotation_method_or_constant_rest:
                                 annotation_method_rest
                                | annotation_constant_rest
;

annotation_method_rest:
                     identifier '(' ')' default_value?
;

annotation_constant_rest:
                      variable_declarators
;
// ---------------------------------Arrays-------------------------------
array_initializer:
                 '{' (variable_initializer (',' variable_initializer)* (',')? )? '}'
;

// --------------------------Blocks,statements and pattern--------------------
block:
     '{' block_statement* '}'
;

block_statement:
                 local_variable_declaration ';'
                | local_type_declaration
                | statement
;

local_variable_declaration:
                         variable_modifier* (VAR identifier '=' expression | type_type variable_declarators)
;

statement:
         blockLabel=block
        | ASSERT expression (':' expression)? ';'
        | IF par_expression statement (ELSE statement)?
        | FOR '(' for_control ')' statement
        | WHILE par_expression statement
        | DO statement WHILE par_expression ';'
        | TRY block (catch_clause+ finally_block? | finally_block)
        | TRY resource_specification block catch_clause* finally_block?
        | SWITCH par_expression '{' switch_block_statement_group* switch_label* '}'
        | SYNCHRONIZED par_expression block
        | RETURN expression? ';'
        | THROW expression ';'
        | BREAK identifier? ';'
        | CONTINUE identifier? ';'
        | YIELD expression ';' 
        | SEMI
        | statementExpression=expression ';'
        | switch_expression ';'? 
        | identifierLabel=identifier ':' statement
;
switch_rule_outcome:
                 block
                | block_statement*
;

switch_block_statement_group:
                         switch_label+ block_statement+
;

switch_label:
             CASE (constantExpression=expression | enumConstantName=IDENTIFIER | type_type varName=identifier) ':'
            | DEFAULT ':'
;
for_init:
         local_variable_declaration
        | expression_list
;
for_control:
             enhanced_for_control
            | for_init? ';' expression? ';' forUpdate=expression_list?
;

enhanced_for_control:
                   variable_modifier* (type_type | VAR) variable_declarator_id ':' expression
;
catch_clause:
            CATCH '(' variable_modifier* catch_type identifier ')' block
;

catch_type:
          qualified_name ('|' qualified_name)*
;

finally_block:
             FINALLY block
;

resource_specification:
                     '(' resources ';'? ')'
;

resources:
         resource (';' resource)*
;

resource:
         variable_modifier* ( class_or_interface_type variable_declarator_id | VAR identifier ) '=' expression
        | identifier
;
pattern:
         variable_modifier* type_type annotation* identifier
;

// ----------------------------------Expressions-----------------------------
primary:
         '(' expression ')'
        | THIS
        | SUPER
        | literal
        | identifier
        | type_type_or_void '.' CLASS
        | non_wildcard_type_arguments (explicit_generic_invocation_suffix | THIS arguments)
;
literal:
         integer_literal
        | float_literal
        | CHAR_LITERAL
        | STRING_LITERAL
        | BOOL_LITERAL
        | NULL_LITERAL
        | TEXT_BLOCK 
;

integer_literal:
             DECIMAL_LITERAL
            | HEX_LITERAL
            | OCT_LITERAL
            | BINARY_LITERAL
;

float_literal:
             FLOAT_LITERAL
            | HEX_FLOAT_LITERAL
;
type_arguments_or_diamond:
                         '<' '>'
                        | type_arguments
;
expression:
         primary
        | expression bop='.'
        (
            identifier
        | method_call
        | THIS
        | NEW non_wildcard_type_arguments? inner_creator
        | SUPER super_suffix
        | explicit_generic_invocation
        )
        | expression '[' expression ']'
        | method_call
        | NEW creator
        | '(' annotation* type_type ('&' type_type)* ')' expression
        | expression postfix=('++' | '--')
        | prefix=('+'|'-'|'++'|'--') expression
        | prefix=('~'|'!') expression
        | expression bop=('*'|'/'|'%') expression
        | expression bop=('+'|'-') expression
        | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
        | expression bop=('<=' | '>=' | '>' | '<') expression
        | expression bop=INSTANCEOF (type_type | pattern)
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
        | switch_expression 

        | expression '::' type_arguments? identifier
        | type_type '::' (type_arguments? identifier | NEW)
        | class_type '::' type_arguments? NEW
;
switch_expression:
                 SWITCH par_expression '{' switch_labeled_rule* '}'
;

switch_labeled_rule:
                 CASE (expression_list | NULL_LITERAL | guarded_pattern) (ARROW | COLON) switch_rule_outcome
                | DEFAULT (ARROW | COLON) switch_rule_outcome
;
qualified_name_list:
                 qualified_name (',' qualified_name)*
;
last_formal_parameter
    : variable_modifier* type_type annotation* '...' variable_declarator_id
    ;

qualified_name:
             identifier ('.' identifier)*
;

local_type_declaration:
                     class_or_interface_modifier*
                    (class_declaration | interface_declaration | record_declaration)
;

par_expression:
             '(' expression ')'
;

expression_list:
              expression (',' expression)*
;

method_call:
             identifier '(' expression_list? ')'
            | THIS '(' expression_list? ')'
            | SUPER '(' expression_list? ')'
;
guarded_pattern:
             '(' guarded_pattern ')'
            | variable_modifier* type_type annotation* identifier ('&&' expression)*
            | guarded_pattern '&&' expression
;

creator:
         non_wildcard_type_arguments created_name class_creator_rest
        | created_name (array_creator_rest | class_creator_rest)
;
created_name:
             identifier type_arguments_or_diamond? ('.' identifier type_arguments_or_diamond?)*
            | primitive_type
;
inner_creator:
             identifier non_wild_card_type_arguments_or_diamond? class_creator_rest
;

array_creator_rest:
                 '[' (']' ('[' ']')* array_initializer | expression ']' ('[' expression ']')* ('[' ']')*)
;

class_creator_rest:
                 arguments class_body?
;

explicit_generic_invocation:
                         non_wildcard_type_arguments explicit_generic_invocation_suffix
;

