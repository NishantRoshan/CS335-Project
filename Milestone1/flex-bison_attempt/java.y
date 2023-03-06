%{
    #include <iostream>
    #include <vector>
    #include <string>
    #include <unordered_map>
    #include <utility> 

    using namespace std;

    extern FILE* yyin;
    extern int yylex();
    extern int yyparse();
    void yyerror(const char* s);
    //{} == 0 or more
    //[] == 0 or 1

%}

%union{
    int val;
    char* str;
}
%token IDENTIFIER LITERAL
%token DOT COMM QUES SEMI_COL DOT_DOT_DOT
%token SQ_SPACE
%token BLOCK_S BLOCK_E ARRAY_S ARRAY_E PAREN_S PAREN_E
%token LOG_AND LOG_OR LOG_NOT
%token BIT_AND BIT_OR BIT_XOR UNSG_RIGHT LEFT_SHIFT RIGHT_SHIFT
%token EQ_TO NOT_EQ GEQ LEQ GT LT 
%token ASSN ADD_ASS SUB_ASS MULT_ASS DIV_ASS AND_ASS
%token UNN_ICR UNN_DCR ADD SUB MULTI DIV MOD
%token ABSTRACT ASSERT AT_RATE BOOL BREAK BYTE CASE CATCH CHAR CLASS COLON CONTINUE RETURN DEFAULT DO DOUBLE ELSE ENUM EXPORTS EXTENDS F CONST DOUBLE_COL FINALLY FLOAT FOR GOTO IF IMPLEMENTS IMPORT INSTANCEOF INTERFACE INT LONG MEM_OP MODULE NATIVE NEW N NON_SEALED OPEN OPENS PACKAGE PERMITS PRIVATE PROTECTED PROVIDES PUBLIC CONT RECORD REQUIRES SEALED SHORT STATIC STRICTFP SUPER SWITCH SYNCHRONIZED THIS THROW THROWS TO TRANSIENT TRANSITIVE T TRY USES VAR VOID VOLATILE WHILE WITH YIELD

/* %type <str> IDENTIFIER */

%start compilation_unit
%error-verbose

%%





/* finally check the number of '{' and '[' in both the codes */


/* --------------------------Lexical Structure--------------------------- */
done 54
type_identifier:
                IDENTIFIER
;
unqualified_method_identifier:
                            IDENTIFIER
;
/* ----------------------------Types, values and variables-------------------------- */
type:
    primitive_type
    | reference_type
;
done 72
primitive_type:
            annotation_multi numeric_type
            | annotation_multi BOOL
;
numeric_type:
            integral_type
            | floating_point_type
;
integral_type:
            BYTE
            | SHORT
            | INT
            | LONG
            | CHAR
;
floating_point_type:
                     FLOAT
                    |  DOUBLE
;
reference_type:
            class_or_interface_type
            | type_variable
            | array_type
;
done 32
class_or_interface_type:
                        class_type
                        | interface_type
;
done 69
class_type:
            annotation_multi type_identifier type_arguments_binary
            | package_name DOT annotation_multi type_identifier type_arguments_binary
            | class_or_interface_type DOT annotation_multi type_identifier type_arguments_binary
            ;
interface_type:
              class_type
;
type_variable:
              annotation_multi type_identifier
;
array_type:
            primitive_type dims
            | class_or_interface_type dims
            | type_variable dims
;
dims:
    annotation_multi SQ_SPACE annotation_sq_multi
;
annotation_sq_multi:
                    /*epsilon*/
                    | annotation_sq annotation_sq_multi
;
annotation_sq:
              annotation_multi SQ_SPACE
;
done 10
type_parameter:
               type_parameter_modifier_multi type_identifier type_bound_binary
;
type_parameter_modifier_multi:
                              /*epsilon*/
                              | type_parameter_modifier type_parameter_modifier_multi
;
type_bound_binary:
                 /*epsilon*/
                 | type_bound
;
type_parameter_modifier:
                        annotation
;
done 11
type_bound:
           EXTENDS type_variable
           | EXTENDS class_or_interface_type additional_bound_multi
;
additional_bound:
                BIT_AND interface_type
;
done 73
type_arguments:
               LT type_argument_list GT
;
type_argument_list:
                  type_argument com_type_argument_multi
;
com_type_argument_multi:
                        /*epsilon*/
                        | com_type_argument com_type_argument_multi
;
com_type_argument:
                  COMM type_argument
;
done 33
type_argument:
            reference_type
            | wildcard
;
done 71
wildcard:
        annotation_multi QUES wildcard_bounds_binary
;
wildcard_bounds_binary:
                      /*epsilon*/
                      | wildcard_bounds
;
wildcard_bounds:
                EXTENDS reference_type
                | SUPER reference_type
;
/* ---------------------------------Names------------------------------- */
module_name:
            IDENTIFIER
            | module_name DOT IDENTIFIER
;
package_name:
            IDENTIFIER
            | package_name DOT IDENTIFIER
;
type_name:
        type_identifier
        | package_or_type_name DOT type_identifier
;
expression_name:
                IDENTIFIER
                | ambiguous_name DOT IDENTIFIER
;
method_name:
            unqualified_method_identifier
;
package_or_type_name:
                    IDENTIFIER
                    | package_or_type_name DOT IDENTIFIER
;
ambiguous_name:
                IDENTIFIER
                | ambiguous_name DOT IDENTIFIER
;


/* ----------------------Packages & modules------------------------ */
compilation_unit:        done1
                ordinary_compilation_unit 
            |   modular_compilation_unit

ordinary_compilation_unit:
                         package_declaration_binary import_declaration_multi top_level_class_or_interface_declaration_multi
;
package_declaration_binary:
                          /*epsilon*/
                          | package_declaration
;                        
import_declaration_multi:
                         /*epsilon*/
                         | import_declaration import_declaration_multi
;
top_level_class_or_interface_declaration_multi:
                                              /*epsilon*/
                                              | top_level_class_or_interface_declaration top_level_class_or_interface_declaration_multi
;
modular_compilation_unit:
                        import_declaration_multi module_declaration
;
package_declaration:        done2
                   package_modifier_multi PACKAGE IDENTIFIER dot_iden_multi SEMI_COL
;
package_modifier_multi:
                      /*epsilon*/
                      | package_modifier package_modifier_multi
;
dot_iden_multi:
             /*epsilon*/
             | dot_iden dot_iden_multi
;
dot_iden:
         DOT IDENTIFIER
;         
package_modifier:
                annotation
;
import_declaration:        done3
                single_type_import_declaration
                | type_import_on_demand_declaration
                | single_static_import_declaration
                | static_import_on_demand_declaration
;
single_type_import_declaration:
                             IMPORT type_name  SEMI_COL
;
type_import_on_demand_declaration:
                             IMPORT package_or_type_name DOT MULTI SEMI_COL
;
single_static_import_declaration:
                             IMPORT STATIC type_name DOT IDENTIFIER SEMI_COL
;
static_import_on_demand_declaration:
                             IMPORT STATIC type_name DOT MULTI SEMI_COL
;
top_level_class_or_interface_declaration:
                                        class_declaration
                                        | interface_declaration
                                        | SEMI_COL
;
     type declaration done4

done 44
module_declaration:
                annotation_multi open_binary MODULE IDENTIFIER dot_iden_multi BLOCK_S module_directive_multi BLOCK_E
;
annotation_multi:
                /*epsilon*/
                | annotation annotation_multi
;
open_binary:
           /*epsilon*/
           | OPEN
;
module_directive_multi:
                      /*epsilon*/
                    |  module_directive module_directive_multi
;
done 45
module_directive:
                REQUIRES requires_modifier_multi module_name SEMI_COL
                | EXPORTS package_name to_module_names_binary SEMI_COL
                | OPENS package_name to_module_names_binary SEMI_COL
                | USES type_name SEMI_COL
                | PROVIDES type_name WITH type_name com_type_name_multi SEMI_COL
;
requires_modifier_multi:
                       /*epsilon*/
                       | requires_modifier requires_modifier_multi
;
to_module_names_binary:
                       /*epsilon*/
                       | to_module_names
;
to_module_names:
               TO module_name com_module_name_multi
;
com_module_name_multi:
                     /*epsilon*/
                    | com_module_name com_module_name_multi
;
com_module_name:
               COMM module_name
;
com_type_name_multi:
                   /*epsilon*/
                    | com_type_name com_module_name_multi
;
com_type_name:
              COMM type_name
;
done 46
requires_modifier:
                 TRANSITIVE
                 | STATIC
;


/* ------------------------------Classes------------------------- */
done 6
class_declaration:
                  normal_class_declaration
                  | enum_declaration
                  | record_declaration
;
normal_class_declaration:
                         class_modifier_multi CLASS type_identifier
                         type_parameters_binary class_extends_binary
                         class_implements_binary class_permits_binary class_body
;
class_modifier_multi:
                    /*epsilon*/
                    | class_modifier class_modifier_multi
;
type_parameters_binary:
                      /*epsilon*/
                    | type_parameters
;
class_extends_binary:
                    /*epsilon*/
                    | class_extends
;
class_implements_binary:
                    /*epsilon*/
                    | class_implements
;
class_permits_binary:
                    /*epsilon*/
                    | class_permits
;
class_modifier:
              annotation
              | PUBLIC
              | PROTECTED
              | PRIVATE
              | ABSTRACT
              | STATIC
              | CONST
              | SEALED
              | NON_SEALED
              | STRICTFP
;
done 7
type_parameters:
              LT type_parameter_list GT
;
type_parameter_list:
                   type_parameter com_type_parameter_multi
;
com_type_parameter_multi:
                    /*epsilon*/
                    | com_type_parameter com_type_parameter_multi
;
com_type_parameter:
                  COMM type_parameter
;
class_extends:
             EXTENDS class_type
;
class_implements:
                IMPLEMENTS interface_type_list
;
interface_type_list:
                    interface_type com_interface_type_multi
;
com_interface_type_multi:
                    /*epsilon*/
                    |  com_interface_type com_interface_type_multi
;
com_interface_type:
                   COMM interface_type   
;
class_permits:
             PERMITS type_name com_type_name_multi
;
done 16
class_body:
          BLOCK_S class_body_declaration_multi BLOCK_E
;
class_body_declaration_multi:
                    /*epsilon*/
                    | class_body_declaration class_body_declaration_multi
;

class_body_declaration:
                       class_member_declaration
                       | instance_initializer
                       | static_initializer
                       | constructor_declaration
;
done 18 
class_member_declaration:
                        field_declaration
                        | method_declaration
                        | class_declaration
                        | interface_declaration
;
done 23
field_declaration:
                 field_modifier_multi unann_type variable_declarator_list SEMI_COL
;
field_modifier_multi:
                    /*epsilon*/
                    | field_modifier field_modifier_multi
;
field_modifier:
              annotation
              | PUBLIC
              | PROTECTED
              | PRIVATE
              | STATIC
              | CONST
              | TRANSIENT
              | VOLATILE
;
variable_declarator_list:
                        variable_declarator com_variable_declarator_multi
;
com_variable_declarator_multi:
                             /*epsilon*/
                            | com_variable_declarator com_variable_declarator_multi
;
com_variable_declarator:
                       COMM variable_declarator
;
done 28
variable_declarator:
                   variable_declarator_id equal_variable_initializer_binary
;
equal_variable_initializer_binary:
                                equal_variable_initializer equal_variable_initializer_binary
;
equal_variable_initializer:
                           ASSN variable_initializer
;
done 29
variable_declarator_id:
                      IDENTIFIER dims_binary
;
dims_binary:
                    /*epsilon*/
                    | dims
;
done 30
variable_initializer:
                    expression
                    | array_initializer
;
unann_type:
          unann_primitive_type
        | unann_reference_type
;
unann_primitive_type:
                    numeric_type
                    | BOOL
;
unann_reference_type:
                    unann_class_or_interface_type
                    | unann_type_variable
                    | unann_array_type
;
unann_class_or_interface_type:
                            unann_class_type
                            | unann_interface_type
;
unann_class_type:
                type_identifier type_arguments_binary
                | package_name DOT annotation_multi type_identifier type_arguments_binary
                | unann_class_or_interface_type DOT annotation_multi type_identifier type_arguments_binary
;
type_arguments_binary:
                    /*epsilon*/
                    | type_arguments
;
unann_interface_type:
                    unann_class_type
;
unann_type_variable:
                    type_identifier
;
unann_array_type:
                unann_primitive_type dims
                | unann_class_or_interface_type dims
                | unann_type_variable dims
;
done 19
method_declaration:
                method_modifier_multi method_header method_body
;
method_modifier_multi:
                    /*epsilon*/
                    | method_modifier method_modifier_multi
;
method_modifier:
                annotation
                | PUBLIC
                | PROTECTED
                | PRIVATE
                | ABSTRACT
                | STATIC
                | CONST
                | SYNCHRONIZED
                | NATIVE
                | STRICTFP
;
method_header:
            result method_declarator throws_binary
            | type_parameters annotation_multi result method_declarator throws_binary
;
throws_binary:
             /*epsilon*/
             | throws
;
result:
        unann_type
        | VOID
;
method_declarator:
                  IDENTIFIER PAREN_S receiver_parameter_com_binary formal_parameter_list_binary PAREN_E dims_binary
;
receiver_parameter_com_binary:
                             /*epsilon*/
                             receiver_parameter_com
;
receiver_parameter_com:
                      receiver_parameter COMM
;
formal_parameter_list_binary:
                            /*epsilon*/
                            | formal_parameter_list
;
done 35
receiver_parameter:
                   annotation_multi unann_type identifier_dot_binary THIS
;
identifier_dot_binary:
                      /*epsilon*/
                      | identifier_dot
;
identifier_dot:
              IDENTIFIER DOT
;
done 36
formal_parameter_list:
                     formal_parameter com_formal_parameter_multi
;
com_formal_parameter_multi:
                            /*epsilon*/
                            | com_formal_parameter com_formal_parameter_multi
;
com_formal_parameter:
                    COMM formal_parameter
;
done 37
formal_parameter:
                variable_modifier_multi unann_type variable_declarator_id
                | variable_arity_parameter
;
variable_modifier_multi:
                       /*epsilon*/
                       | variable_modifier variable_modifier_multi
;
variable_arity_parameter:
                        variable_modifier_multi unann_type annotation_multi DOT_DOT_DOT IDENTIFIER
;
done 5
variable_modifier:
                annotation
                | CONST
;
throws:
      THROWS exception_type_list
;
exception_type_list:
                    exception_type com_exception_type_multi
;
com_exception_type_multi:
                        /*epsilon*/
                        | com_exception_type com_exception_type_multi
;
com_exception_type:
                  COMM exception_type
;
exception_type:
                class_type
                | type_variable
;
done 20
method_body:
            block
            | SEMI_COL
;
instance_initializer:
                    block
;
static_initializer:
                    STATIC block
;
done 21
constructor_declaration:
                        constructor_modifier_multi constructor_declarator throws_binary constructor_body
;
constructor_modifier_multi:
                           /*epsilon*/
                           | constructor_modifier constructor_modifier_multi
;
constructor_modifier:
                    annotation
                    | PUBLIC
                    | PROTECTED
                    | PRIVATE
;
constructor_declarator:
                      type_parameters_binary simple_type_name PAREN_S receiver_parameter_com_binary formal_parameter_list_binary PAREN_E
;
simple_type_name:
                type_identifier
;
constructor_body:
                BLOCK_S explicit_constructor_invocation_binary block_statements_binary BLOCK_E
;
explicit_constructor_invocation_binary:
                                      /*epsilon*/
                                      | explicit_constructor_invocation
;
explicit_constructor_invocation:
                                type_arguments_binary THIS PAREN_S argument_list_binary PAREN_E SEMI_COL
                                | type_arguments_binary SUPER PAREN_S argument_list_binary PAREN_E SEMI_COL
                                | expression_name DOT type_arguments_binary SUPER PAREN_S argument_list_binary PAREN_E SEMI_COL
                                | primary DOT type_arguments_binary SUPER PAREN_S argument_list_binary PAREN_E SEMI_COL
;
argument_list_binary:
                     /*epsilon*/
                     | argument_list
;
done 12
enum_declaration:
                class_modifier_multi ENUM type_identifier class_implements_binary enum_body
;
enum_body:
         BLOCK_S enum_constant_list_binary com_binary enum_body_declarations_binary BLOCK_E
;
enum_constant_list_binary:
                         /*epsilon*/
                         | enum_constant_list
;
com_binary:
           /*epsilon*/
           | COMM
;
enum_body_declarations_binary:
                            /*epsilon*/
                            | enum_body_declarations
;
enum_constant_list:
                   enum_constant com_enum_constant_multi
;
com_enum_constant_multi:
                        /*epsilon*/
                        | com_enum_constant com_enum_constant_multi
;
com_enum_constant:
                  COMM enum_constant
;
done 13
enum_constant:
              enum_constant_modifier_multi IDENTIFIER ARRAY_S PAREN_S argument_list_binary PAREN_E ARRAY_E class_body_binary
;
enum_constant_modifier_multi:
                            /*epsilon*/
                            | enum_constant_modifier enum_constant_modifier_multi
;
class_body_binary:
                    /*epsilon*/
                    | class_body
;
enum_constant_modifier:
                        annotation
;
done 14
enum_body_declarations:
                       SEMI_COL class_body_declaration_multi
;
done 47
record_declaration:
                   class_modifier_multi RECORD type_identifier type_parameters_binary record_header class_implements_binary record_body
;
record_header:
                PAREN_S record_component_list_binary PAREN_E
;
record_component_list_binary:
                            /*epsilon*/
                            | record_component_list
;
done 48
record_component_list:
                      record_component com_record_component_multi
;
com_record_component_multi:
                            /*epsilon*/
                            | com_record_component com_record_component_multi
;
com_record_component:
                    COMM record_component
;
done 49
record_component:
                record_component_modifier_multi unann_type IDENTIFIER
                variable_arity_record_component
;
record_component_modifier_multi:
                               /*epsilon*/
                               | record_component_modifier record_component_modifier_multi
variable_arity_record_component:
                                record_component_modifier_multi unann_type annotation_multi DOT_DOT_DOT IDENTIFIER
;
record_component_modifier:
                          annotation
;
done 50
record_body:
            BLOCK_S record_body_declaration_multi BLOCK_E
;
record_body_declaration_multi:
                                /*epsilon*/
                                | record_body_declaration
;
record_body_declaration:
                        class_body_declaration
                        | compact_constructor_declaration
;
done 22
compact_constructor_declaration:
                                constructor_modifier_multi simple_type_name constructor_body
;


/* --------------------------------Interfaces------------------------------- */
done 15
interface_declaration:
                    normal_interface_declaration
                    | annotation_interface_declaration
;
normal_interface_declaration:
                            interface_modifier_multi INTERFACE type_identifier type_parameters_binary interface_extends_binary interface_permits_binary interface_body
;
interface_modifier_multi:
                        /*epsilon*/
                        | interface_modifier interface_modifier_multi
;
interface_extends_binary:
                        /*epsilon*/ 
                        | interface_extends
;
interface_permits_binary:
                        /*epsilon*/
                        | interface_permits
;
interface_modifier:
                annotation
                | PUBLIC
                | PROTECTED
                | PRIVATE
                | ABSTRACT
                | STATIC
                | SEALED
                | NON_SEALED
                | STRICTFP
;
interface_extends:
                EXTENDS interface_type_list
;
interface_permits:
                PERMITS type_name com_type_name_multi
;
done 17
interface_body:
                BLOCK_S interface_member_declaration_multi BLOCK_E
;
interface_member_declaration_multi:
                                  /*epsilon*/
                                  | interface_member_declaration interface_member_declaration_multi
;
done 24 
interface_member_declaration:
                        constant_declaration
                        | interface_method_declaration
                        | class_declaration
                        | interface_declaration
                        | SEMI_COL
;
done 25
constant_declaration:
                     constant_modifier_multi unann_type variable_declarator_list SEMI_COL
;
constant_modifier_multi:
                        /*epsilon*/
                        | constant_modifier constant_modifier_multi
;
constant_modifier:
                annotation
                | PUBLIC
                | STATIC
                | CONST
;
done 26
interface_method_declaration:
                             interface_method_modifier_multi method_header method_body
;
interface_method_modifier_multi:
                                /*epsilon*/
                                | interface_method_modifier interface_method_modifier_multi
;
done 27
interface_method_modifier:
                        annotation
                        | PUBLIC
                        | PRIVATE
                        | ABSTRACT
                        | DEFAULT
                        | STATIC
                        | STRICTFP
;
annotation_interface_declaration:
                                interface_modifier_multi AT_RATE INTERFACE type_identifier annotation_interface_body
;
annotation_interface_body:
                        BLOCK_S annotation_interface_member_declaration_multi BLOCK_E
;
annotation_interface_member_declaration_multi:
                                              /*epsilon*/
                                              | annotation_interface_member_declaration annotation_interface_member_declaration_multi
;
annotation_interface_member_declaration:
                                        annotation_interface_element_declaration
                                        | constant_declaration
                                        | class_declaration
                                        | interface_declaration
                                        | SEMI_COL
;
annotation_interface_element_declaration:
                                        annotation_interface_element_modifier_multi unann_type IDENTIFIER PAREN_S PAREN_E dims_binary default_value_binary SEMI_COL
;
annotation_interface_element_modifier_multi:
                                            /*epsilon*/
                                            | annotation_interface_element_modifier annotation_interface_element_modifier_multi
;
default_value_binary:
                    /*epsilon*/
                    | default_value
;
annotation_interface_element_modifier:
                                        annotation
                                        | PUBLIC
                                        | ABSTRACT
;
done 43
default_value:
                DEFAULT element_value
;
done 39
annotation:
        normal_annotation
        | marker_annotation
        | single_element_annotation
;
normal_annotation:
  AT_RATE type_name PAREN_S element_value_pair_list_binary PAREN_E
;
element_value_pair_list_binary:
                               /*epsilon*/
                               | element_value_pair_list
;
element_value_pair_list:
                        element_value_pair com_element_value_pair_multi
;
com_element_value_pair_multi:
                             /*epsilon*/
                             | com_element_value_pair com_element_value_pair_multi
;
com_element_value_pair:
                        COMM element_value_pair
;
done 40
element_value_pair:
                IDENTIFIER ASSN element_value
;
done 41
element_value:
        conditional_expression
        | element_value_array_initializer
        | annotation
;
done 42
element_value_array_initializer:
                                BLOCK_S element_value_list_binary com_binary BLOCK_E
;
element_value_list_binary:
                          /*epsilon*/
                          | element_value_list
;
element_value_list:
                   element_value com_element_value_multi
;
com_element_value_multi:
                        /*epsilon*/
                        | com_element_value com_element_value_multi
;
com_element_value:
                  COMM element_value
;
marker_annotation:
                  AT_RATE type_name
;
single_element_annotation:
                         AT_RATE type_name PAREN_S element_value PAREN_E
;
/* ------------------------------------------Arrays--------------------------------------- */
done 31
array_initializer:
                  BLOCK_S variable_initializer_list_binary com_binary BLOCK_E
;
variable_initializer_list_binary:
                                 /*epsilon*/
                                 | variable_initializer_list
;
variable_initializer_list:
                          variable_initializer com_variable_initializer_multi
;
com_variable_initializer_multi:
                              /*epsilon*/
                              | com_variable_initializer com_variable_initializer_multi
;
com_variable_initializer:
                         COMM variable_initializer
;

/* ----------------------------------Blocks,statements and patterns-------------------------- */
done 51
block:
  BLOCK_S block_statements_binary BLOCK_E
;
block_statements_binary:
                        /*epsilon*/
                        | block_statements
;
block_statements:
                block_statement block_statement_multi
;
block_statement_multi:
                     /*epsilon*/
                     | block_statement block_statement_multi
;
done 52
block_statement:
                local_class_or_interface_declaration
                | local_variable_declaration_statement
                | statement
;
local_class_or_interface_declaration:
                                    class_declaration
                                    | normal_interface_declaration
;
local_variable_declaration_statement:
                                    local_variable_declaration SEMI_COL
;
done 53
local_variable_declaration:
                            variable_modifier_multi local_variable_type variable_declarator_list
;
local_variable_type:
                    unann_type
                    | VAR
;
done 55
statement:
        statement_without_trailing_substatement
        | labeled_statement
        | if_then_statement
        | if_then_else_statement
        | while_statement
        | for_statement
;
statement_no_short_if:
                    statement_without_trailing_substatement
                    | labeled_statement_no_short_if
                    | if_then_else_statement_no_short_if
                    | while_statement_no_short_if
                    | for_statement_no_short_if
;
statement_without_trailing_substatement:
                                        block
                                        | empty_statement
                                        | expression_statement
                                        | assert_statement
                                        | switch_statement
                                        | do_statement
                                        | break_statement
                                        | continue_statement
                                        | return_statement
                                        | synchronized_statement
                                        | throw_statement
                                        | try_statement
                                        | yield_statement
;
empty_statement:
                SEMI_COL
;
labeled_statement:
                IDENTIFIER COLON statement
;
labeled_statement_no_short_if:
                            IDENTIFIER COLON statement_no_short_if
;
expression_statement:
                    statement_expression SEMI_COL
;
statement_expression:
                    assignment
                    | pre_increment_expression
                    | pre_decrement_expression
                    | post_increment_expression
                    | post_decrement_expression
                    | method_invocation
                    | class_instance_creation_expression
;
if_then_statement:
                  IF PAREN_S expression PAREN_E statement
;
if_then_else_statement:
                    IF PAREN_S expression BLOCK_E statement_no_short_if ELSE statement
;
if_then_else_statement_no_short_if:
                                    IF PAREN_S expression PAREN_E statement_no_short_if ELSE statement_no_short_if
;
assert_statement:
                ASSERT expression SEMI_COL
                | ASSERT expression COLON expression SEMI_COL
;
switch_statement:
                SWITCH PAREN_S expression PAREN_E switch_block
;
switch_block:
            BLOCK_S switch_rule switch_rule_multi BLOCK_E
            | BLOCK_S switch_block_statement_group_multi switch_label_colon_multi BLOCK_E
;
switch_rule_multi:
                 /*epsilon*/
                 | switch_rule switch_rule_multi
;
switch_block_statement_group_multi:
                                   /*epsilon*/
                                   | switch_block_statement_group switch_block_statement_group_multi
;
switch_label_colon_multi:
                       /*epsilon*/
                       | switch_label_colon switch_label_colon_multi
;
switch_label_colon:
                    switch_label COLON
done 68
switch_rule:
            switch_label MEM_OP expression SEMI_COL
            | switch_label MEM_OP block
            | switch_label MEM_OP throw_statement
;
done 60
switch_block_statement_group:
                            switch_label COLON switch_label_colon_multi block_statements
;
done 61
switch_label:
            CASE case_constant com_case_constant_multi
            | DEFAULT
;
com_case_constant_multi:
                        /*epsilon*/
                        | com_case_constant com_case_constant_multi
;
com_case_constant:
                  COMM case_constant
;
case_constant:
              conditional_expression
;
while_statement:
                WHILE PAREN_S expression PAREN_E statement
;
while_statement_no_short_if:
                            WHILE PAREN_S expression PAREN_E statement_no_short_if
;
do_statement:
            DO statement WHILE PAREN_S expression PAREN_E SEMI_COL
;
for_statement:
            basic_for_statement
            | enhanced_for_statement
;
for_statement_no_short_if:
                        basic_for_statement_no_short_if
                        | enhanced_for_statement_no_short_if
;
basic_for_statement:
                    FOR PAREN_S for_init_binary SEMI_COL expression_binary SEMI_COL for_update_binary PAREN_E statement
;
for_init_binary:
                /*epsilon*/
                | for_init
;
expression_binary:
                  /*epsilon*/
                  | expression
;
for_update_binary:
                  /*epsilon*/
                  | for_update
;
basic_for_statement_no_short_if:
                                FOR PAREN_S for_init_binary SEMI_COL expression_binary SEMI_COL for_update_binary PAREN_E statement_no_short_if
;
done 62
for_init:
        statement_expression_list
        local_variable_declaration
;
for_update:
          statement_expression_list
;
statement_expression_list:
                          statement_expression com_statement_expression_multi
;
com_statement_expression_multi:
                              /*epsilon*/
                            |  com_statement_expression com_statement_expression_multi
;
com_statement_expression:
                        COMM statement_expression
;
done 63
enhanced_for_statement:
                        FOR PAREN_S local_variable_declaration COLON expression PAREN_E statement
;
enhanced_for_statement_no_short_if:
                                   FOR PAREN_S local_variable_declaration COLON expression PAREN_E statement_no_short_if
;
break_statement:
                BREAK identifier_binary SEMI_COL
;
identifier_binary:
                  /*epsilon*/
                  | IDENTIFIER
;
yield_statement:
                YIELD expression SEMI_COL
;
continue_statement:
                   CONTINUE identifier_binary SEMI_COL
;
return_statement:
                CONT expression_binary
;
throw_statement:
                THROW expression
;
synchronized_statement:
                        SYNCHRONIZED PAREN_S expression PAREN_E block
;
try_statement:
            TRY block catches
            TRY block catches_binary finally
            try_with_resources_statement
;
catches_binary:
              /*epsilon*/
              | catches
;
catches:
        catch_clause catch_clause_multi
;
catch_clause_multi:
                   /*epsilon*/
                   | catch_clause catch_clause_multi
;
done 56
catch_clause:
            CATCH PAREN_S catch_formal_parameter PAREN_E block
;
catch_formal_parameter:
                        variable_modifier_multi catch_type variable_declarator_id
;
done 57
catch_type:
           unann_class_type bitor_class_type_multi
;
bitor_class_type_multi:
                        /*epsilon*/
                        | bitor_class_type bitor_class_type_multi
;
bitor_class_type:
                BIT_OR class_type
;
done 58
finally:
        FINALLY block
;
try_with_resources_statement:
                            TRY resource_specification block catches_binary finally_binary
;
finally_binary:
                /*epsilon*/
                | finally
;
done 59
resource_specification:
                        PAREN_S resource_list semi_col_binary PAREN_E
;
semi_col_binary:
                /*epsilon*/
                | SEMI_COL
;
resource_list:
             resource semi_col_resource_multi
;
semi_col_resource_multi:
                        /*epsilon*/
                        | semi_col_resource semi_col_resource_multi
;
semi_col_resource:
                  SEMI_COL resource
;
resource:
        local_variable_declaration
        | variable_access
;
variable_access:
                expression_name
                | field_access
;
done 65
pattern:
        type_pattern
;
type_pattern:
            local_variable_declaration
;
/* ---------------------------------------expressions----------------------------- */
done 66
primary:
        primary_no_new_array
        | array_creation_expression
;
primary_no_new_array:
                    LITERAL
                    | class_literal
                    | THIS
                    | type_name DOT THIS
                    | PAREN_S expression PAREN_E
                    | class_instance_creation_expression
                    | field_access
                    | array_access
                    | method_invocation
                    | method_reference
;
done 38
class_literal:
              type_name ws_sq_brackets_multi DOT CLASS
              | numeric_type ws_sq_brackets_multi DOT CLASS
              | BOOL ws_sq_brackets_multi DOT CLASS
              | VOID DOT CLASS
;
ws_sq_brackets_multi:
                    /*epsilon*/
                    | ws_sq_brackets ws_sq_brackets_multi
;
ws_sq_brackets:
                SQ_SPACE
class_instance_creation_expression:
                                    unqualified_class_instance_creation_expression
                                    | expression_name DOT unqualified_class_instance_creation_expression
                                    | primary DOT unqualified_class_instance_creation_expression
;
unqualified_class_instance_creation_expression:
                                                NEW type_arguments_binary class_or_interface_type_to_instantiate PAREN_S argument_list_binary PAREN_E class_body_binary
;
class_or_interface_type_to_instantiate:
                                        annotation_multi IDENTIFIER dot_annotation_multi_identifier_multi type_arguments_or_diamond_binary
;
dot_annotation_multi_identifier_multi:
                                    /*epsilon*/
                                    | dot_annotation_multi_identifier dot_annotation_multi_identifier_multi
;
dot_annotation_multi_identifier:
                                DOT annotation_multi IDENTIFIER
;
type_arguments_or_diamond_binary:
                                /*epsilon*/
                                | type_arguments_or_diamond
;
done 70
type_arguments_or_diamond:
                        type_arguments
                        
;
field_access:
            primary DOT IDENTIFIER
            | SUPER DOT IDENTIFIER
            | type_name DOT SUPER DOT IDENTIFIER
;
array_access:
            expression_name ARRAY_S expression ARRAY_E
            | primary_no_new_array ARRAY_S expression ARRAY_E
;
method_invocation:
                method_name PAREN_S argument_list_binary PAREN_E
                | type_name DOT type_arguments_binary IDENTIFIER PAREN_S argument_list_binary PAREN_E
                | expression_name DOT type_arguments_binary IDENTIFIER PAREN_S argument_list_binary PAREN_E
                | primary DOT type_arguments_binary IDENTIFIER PAREN_S argument_list_binary PAREN_E
                | SUPER DOT type_arguments_binary IDENTIFIER PAREN_S argument_list_binary PAREN_E
                | type_name DOT SUPER DOT type_arguments_binary IDENTIFIER PAREN_S argument_list_binary PAREN_E
;
argument_list:
            expression com_expression_multi
;
com_expression_multi:
                    /*epsilon*/
                    com_expression com_expression_multi
;
com_expression:
                COMM expression
;
method_reference:
                expression_name DOUBLE_COL type_arguments_binary IDENTIFIER
                | primary DOUBLE_COL type_arguments_binary IDENTIFIER
                | reference_type DOUBLE_COL type_arguments_binary IDENTIFIER
                | SUPER DOUBLE_COL type_arguments_binary IDENTIFIER
                | type_name DOT SUPER DOUBLE_COL type_arguments_binary IDENTIFIER
                | class_type DOUBLE_COL type_arguments_binary NEW
                | array_type DOUBLE_COL NEW
;
array_creation_expression:
                        NEW primitive_type dim_exprs dims_binary
                        | NEW class_or_interface_type dim_exprs dims_binary
                        | NEW primitive_type dims array_initializer
                        | NEW class_or_interface_type dims array_initializer
;
dim_exprs:
        dim_expr dim_expr_multi
;
dim_expr_multi:
              /*epsilon*/
              | dim_expr dim_expr_multi
;
dim_expr:
        annotation_multi ARRAY_S expression ARRAY_E
;
done 64
expression: assignment_expression
;
assignment_expression:
                      conditional_expression
                      | assignment
;
assignment:
           left_hand_side assignment_operator expression
;
left_hand_side:
              expression_name
              | field_access
              | array_access
;
assignment_operator:
                     ASSN
                    | MULT_ASS
                    | DIV_ASS
                    | ADD_ASS
                    | SUB_ASS
                    | AND_ASS
;
conditional_expression:
                    conditional_or_expression
                    | conditional_or_expression QUES expression COLON conditional_expression
;
conditional_or_expression:
                        conditional_and_expression
                        | conditional_or_expression LOG_OR conditional_and_expression
;
conditional_and_expression:
                        inclusive_or_expression
                        | conditional_and_expression LOG_AND inclusive_or_expression
;
inclusive_or_expression:
                        exclusive_or_expression
                        | inclusive_or_expression BIT_OR exclusive_or_expression
;
exclusive_or_expression:
                        and_expression
                        | exclusive_or_expression BIT_XOR and_expression
;
and_expression:
                equality_expression
                | and_expression BIT_AND equality_expression
;
equality_expression:
                    relational_expression
                    | equality_expression EQ_TO relational_expression
                    | equality_expression NOT_EQ relational_expression
;
relational_expression:
                    shift_expression
                    | relational_expression LT shift_expression
                    | relational_expression GT shift_expression
                    | relational_expression LEQ shift_expression
                    | relational_expression GEQ shift_expression
                    | instance_of_expression
;
instance_of_expression:
                    relational_expression INSTANCEOF reference_type
                    | relational_expression INSTANCEOF pattern
;
shift_expression:
                additive_expression
                | shift_expression LEFT_SHIFT additive_expression
                | shift_expression RIGHT_SHIFT additive_expression
                | shift_expression UNSG_RIGHT additive_expression
;
additive_expression:
                    multiplicative_expression
                    | additive_expression ADD multiplicative_expression
                    | additive_expression SUB multiplicative_expression
;
multiplicative_expression:
                        unary_expression
                        | multiplicative_expression MULTI unary_expression
                        | multiplicative_expression DIV unary_expression
                        | multiplicative_expression MOD unary_expression
;
unary_expression:
                pre_increment_expression
                | pre_decrement_expression
                | ADD unary_expression
                | SUB unary_expression
                | unary_expression_not_plus_minus
;
pre_increment_expression:
                        UNN_ICR unary_expression
;
pre_decrement_expression:
                        UNN_DCR unary_expression
;
unary_expression_not_plus_minus:
                                postfix_expression
                                | LOG_NOT unary_expression
                                | cast_expression
                                | switch_expression
;
postfix_expression:
                    primary
                    | expression_name
                    | post_increment_expression
                    | post_decrement_expression
;
post_increment_expression:
                        postfix_expression UNN_ICR
;
post_decrement_expression:
                        postfix_expression UNN_DCR
;
cast_expression:
                PAREN_S primitive_type PAREN_E unary_expression
                | PAREN_S reference_type additional_bound_multi PAREN_E unary_expression_not_plus_minus
;
additional_bound_multi:
                        /*epsilon*/
                        | additional_bound additional_bound_multi
;
done 67
switch_expression:
                SWITCH PAREN_S expression PAREN_E switch_block
;
constant_expression:
                    expression
;

%%

int main(int argc, char** argv){
    ++argv, --argc;      /* Skip over the program name */
    if(argc > 0){
        FILE * pt = fopen(argv[0], "r" );
        if(!pt){
            cout << "Bad Input . No existant file" << endl;
            return 0;
        }
        yyin = pt;
        do
        {
           yyparse();
        }while (!feof(yyin));
        fclose(yyin);
    }else{
        cout<< "Provide filename as argument\n";
    }
    return 0;
}

void yyerror(const char* s) {
	fprintf(stderr, "Parse error: %s\n", s);
	exit(1);
}