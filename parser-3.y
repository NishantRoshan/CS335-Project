%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>
#include <ctype.h>
#include <bits/stdc++.h>
using namespace std;
extern int yylex();
extern int yyparse();
extern FILE *yyin;
FILE *out;
FILE *digraph;

vector<pair<string,vector<int>>> nodes;
int startNode;

void yyerror(char const *);
int createNode(string);
void addChild(int, int);

void yyerror(const char *s);
int maxsize = 1000000;
%}

%locations

%union{
	int ival;
	char *sval;
	float fval;
}
%define parse.error verbose
%start input

%token CLASS INSTANCEOF NEW SUPER THIS
%token BOOL BYTE CHAR T FLOAT INT F N VOID
%token BREAK CASE DEFAULT ELSE IF SWITCH
%token CONT DO FOR WHILE
%token RETURN
%token CONST
%token <sval>CID ID
%token SEP TRM COLON
%token ARRAY_S ARRAY_E BLOCK_S BLOCK_E PAREN_S PAREN_E
%token OP_ASS OP_ADD_ASS OP_SUB_ASS OP_DIV_ASS OP_MUL_ASS OP_MOD_ASS OP_LSH_ASS OP_RSH_ASS OP_AND_ASS OP_OR_ASS OP_XOR_ASS OP_ZRSH_ASS
%token OP_CON_Q OP_CON_AND OP_CON_OR
%token OP_OR OP_XOR OP_AND OP_EQ OP_NEQ OP_GRE OP_LES OP_GEQ OP_LEQ
%token OP_RSH OP_LSH OP_ADD OP_SUB OP_MUL OP_DIV OP_MOD OP_INC OP_DEC OP_DOT OP_ZRSH
%token <ival>INT_LIT_D INT_LIT_O INT_LIT_H
%token <fval>FLOAT_LIT
%token <sval>CHAR_LIT STR_LIT
%token ERROR
%token PRINT SCAN OP_NEG STRING
%token EXTENDS

/*%type*/

%%
input:
  ws compilation_unit ws
;
ws:
  ws ' '
| ws '\n'
| ws '\t'
| /*empty*/
;
wsc:
  ws ' '
| ws '\n'
| ws '\t'
space.opt.multiopt:
  space.opt.multiopt space.opt
| /*empty*/
;
space.opt:
  ' '
| /*empty*/
;
dot_ind.multiopt:
  dot_ind.multiopt '.' ID
| /*empty*/
;
type_ID:
  ID
;
unqualified_method_ID:
  ID
;
	/* Types, Values and Variables */
type:
  primitive_type
| reference_type
;
primitive_type:
  annotation.multiopt numeric_type
| annotation.multiopt "boolean" wsc
;
numeric_type:
  integral_type
| floating_point_type
;
integral_type:
  ws "byte" wsc
| ws "short" wsc
| ws "int" wsc
| ws "long" wsc
| ws "char" wsc
;
floating_point_type:
  ws "float" wsc
| ws "double" wsc
;
reference_type:
  class_or_interface_type
| type_variable
| array_type
;
class_or_interface_type:
  class_type
| interface_type
;
class_type:
  annotation.multiopt type_ID type_arguments.opt
| package_name '.' annotation.multiopt type_ID type_arguments.opt
| class_or_interface_type '.' annotation.multiopt type_ID type_arguments.opt
;
interface_type:
  class_type
;
type_variable:
  annotation.multiopt type_ID
;
array_type:
  primitive_type dims
| class_or_interface_type dims
| type_variable dims
;
dims:
  annotation.multiopt ' ' an_sp.multiopt
;
an_sp.multiopt:
  an_sp.multiopt annotation.multiopt space.opt
| /*empty*/
type_parameter:
  type_parameter_modifier.multiopt type_ID type_bound.opt
;
type_parameter_modifier.multiopt:
  type_parameter_modifier
| type_parameter_modifier.multiopt type_parameter_modifier
| /* empty */
type_parameter_modifier:
  annotation
;
type_bound.opt:
  type_bound
| /* empty */
;
type_bound:
  ws "extends" wsc type_variable
| ws "extends" wsc class_or_interface_type additional_bound.multiopt
;
additional_bound:
  '&' interface_type
;
type_arguments:
  '<' type_argument_list '>'
;
type_argument_list:
  type_argument type_argument.multiopt
;
type_argument.multiopt:
  ',' type_argument
| type_argument.multiopt ',' type_argument
| /* empty */
type_argument:
  reference_type
| wildcard
;
wildcard:
  annotation.multiopt '?' wildcard_bounds.opt
;
wildcard_bounds.opt:
  wildcard_bounds
| /* empty */
;
wildcard_bounds:
  ws "extends" ws reference_type
| ws "super" ws reference_type


  /* Names */
module_name:
  ID
| module_name '.' ID
;
package_name:
  ID
| package_name '.' ID
;
type_name:
  type_ID
| package_or_type_name '.' type_ID
;
expression_name:
  ID
| ambiguous_name '.' ID
;
method_name:
  unqualified_method_ID
;
package_or_type_name:
  ID
| package_or_type_name '.' ID
;
ambiguous_name:
  ID
| ambiguous_name '.' ID
;


  /* Packages and Modules */
compilation_unit:
  ordinary_compilation_unit
| modular_compilation_unit
;
ordinary_compilation_unit:
  package_declaration.opt import_declaration.multiopt top_level_class_or_interface_declaration.multiopt
;
modular_compilation_unit:
  import_declaration.multiopt module_declaration
;
package_declaration.opt:
  package_declaration
| /* empty */
;
package_declaration:
  package_modifier.multiopt ws "package" ws ID dot_ind.multiopt ';'
;
package_modifier.multiopt:
  package_modifier.multiopt package_modifier
| /* empty */
;
package_modifier:
  annotation
;
import_declaration.multiopt:
  import_declaration.multiopt import_declaration
| /* empty */
;
import_declaration:
  single_type_import_declaration
| type_import_on_demand_declaration
| single_static_import_declaration
| static_import_on_demand_declaration
;
single_type_import_declaration:
  ws "import" ws type_name  ';'
;
type_import_on_demand_declaration:
  ws "import" ws package_or_type_name '.' '*' ';'
;
single_static_import_declaration:
  ws "import" ws "static" type_name '.' ID ';'
;
static_import_on_demand_declaration:
  ws "import" ws "static" type_name '.' '*' ';'
;
top_level_class_or_interface_declaration.multiopt:
  top_level_class_or_interface_declaration
| top_level_class_or_interface_declaration.multiopt top_level_class_or_interface_declaration
| /* empty */
;
top_level_class_or_interface_declaration:
  class_declaration
| interface_declaration
| ';'
;
module_declaration:
  annotation.multiopt open.opt ws "module" ws ID dot_ind.multiopt '{' module_directive.multiopt '}'
;
open.opt:
  "open"
| /*empty*/
;
module_directive.multiopt:
  module_directive
| module_directive.multiopt module_directive
| /* empty */
;
module_directive:
  "requires" requires_modifier.multiopt module_name ;
| "exports" package_name to_module_names.opt ';'
| "opens" package_name to_module_names.opt ';'
| "uses" type_name ';'
| "provides" type_name "with" type_name com_type_name.multiopt ';'
;
com_type_name.multiopt:
  com_type_name.multiopt ',' type_name
| /*empty*/
;
to_module_names.opt:
  "to" module_name com_module_name.multiopt
| to_module_names.opt "to" module_name com_module_name.multiopt
| /* empty */
com_module_name.multiopt:
  com_module_name.multiopt ',' module_name
| /*empty*/
;
requires_modifier.multiopt:
  requires_modifier
| requires_modifier.multiopt requires_modifier
| /* empty */
requires_modifier:
  "transitive"
| "static"
;

  /* Classes */
class_declaration:
  normal_class_declaration
| enum_declaration
| record_declaration
;
normal_class_declaration:
  class_modifier.multiopt ws "class" wsc type_ID ws type_parameters.opt class_extends.opt class_implements.opt class_permits.opt class_body
;
class_modifier.multiopt:
  class_modifier.multiopt class_modifier
| /*empty*/
;
type_parameters.opt:
  type_parameters
| /*empty*/
;
class_extends.opt:
  class_extends
| /*empty*/
;
class_implements.opt:
  class_implements
| /*empty*/
;
class_permits.opt:
  class_permits
| /*empty*/
;
class_modifier:
  annotation
| ws "public" wsc
| ws "protected" wsc
| ws "private" wsc
| ws "abstract" wsc
| ws "static" wsc
| ws "final" wsc
| ws "sealed" wsc
| ws "non-sealed" wsc
| ws "strictfp" wsc
;
type_parameters:
  '<' type_parameter_list '>'
;
type_parameter_list:
  type_parameter com_type_parameter.multiopt
;
com_type_parameter.multiopt:
  com_type_parameter.multiopt ',' type_parameter
| /*empty*/
;
class_extends:
  "extends" class_type
;
class_implements:
  "implements" interface_type_list
;
interface_type_list:
  interface_type com_interface_type.multiopt
;
com_interface_type.multiopt:
  com_interface_type.multiopt ',' interface_type
| /*empty*/
;
class_permits:
  "permits" type_name com_type_name.multiopt
;
class_body:
  ws '{' ws class_body_declaration.multiopt ws '}' ws
;
class_body_declaration.multiopt:
  class_body_declaration.multiopt class_body_declaration
| /*empty*/
;
class_body_declaration:
  class_member_declaration
| instance_initializer
| static_initializer
| constructor_declaration
;
class_member_declaration:
  field_declaration
| method_declaration
| class_declaration
| interface_declaration
;
field_declaration:
  field_modifier.multiopt unann_type variable_declarator_list ';'
;
field_modifier.multiopt:
  field_modifier.multiopt field_modifier
| /*empty*/
;
field_modifier:
  annotation
| "public"
| "protected"
| "private"
| "static"
| "final"
| "transient"
| "volatile"
;
variable_declarator_list:
  variable_declarator com_variable_declarator.multiopt
;
com_variable_declarator.multiopt:
  com_variable_declarator.multiopt ',' variable_declarator
| /*empty*/
;
variable_declarator:
  variable_declarator_id eq_variable_initializer.opt
;
eq_variable_initializer.opt:
  '=' variable_initializer
| /*empty*/
;
variable_declarator_id:
  ID dims.opt
;
dims.opt:
  dims
| /*empty*/
;
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
| "boolean"
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
  type_ID type_arguments.opt
| package_name '.' annotation.multiopt type_ID type_arguments.opt
| unann_class_or_interface_type '.' annotation.multiopt type_ID type_arguments.opt
;
type_arguments.opt:
  type_arguments
| /*empty*/
;
unann_interface_type:
  unann_class_type
;
unann_type_variable:
  type_ID
;
unann_array_type:
  unann_primitive_type dims
| unann_class_or_interface_type dims
| unann_type_variable dims
;
method_declaration:
  method_modifier.multiopt method_header method_body
;
method_modifier.multiopt:
  method_modifier.multiopt method_modifier
| /*empty*/
;
method_modifier:
  annotation
| "public"
| "protected"
| "private"
|"abstract"
| "static"
| "final"
| "synchronized"
| "native"
| "strictfp"
;
method_header:
  result method_declarator throws.opt
| type_parameters annotation.multiopt result method_declarator throws.opt
;
throws.opt:
  throws
| /*empty*/
;
result:
  unann_type
| "void"
;
method_declarator:
  ID '(' receiver_parameter_com.opt formal_parameter_list.opt ')' dims.opt
;
receiver_parameter_com.opt:
  receiver_parameter ','
| /*empty*/
;
formal_parameter_list.opt:
  formal_parameter_list
| /*empty*/
;
receiver_parameter:
  annotation.multiopt unann_type ID_dot.opt "this"
;
ID_dot.opt:
  ID '.'
| /*empty*/
;
formal_parameter_list:
  formal_parameter com_formal_parameter.multiopt
;
com_formal_parameter.multiopt:
  com_formal_parameter.multiopt ',' formal_parameter
| /*empty*/
;
formal_parameter:
  variable_modifier.multiopt unann_type variable_declarator_id
| variable_arity_parameter
;
variable_modifier.multiopt:
  variable_modifier.multiopt variable_modifier
| /*empty*/
;
variable_arity_parameter:
  variable_modifier.multiopt unann_type annotation.multiopt "..." ID
;
variable_modifier:
  annotation
| "final"
;
throws:
  "throws" exception_type_list
;
exception_type_list:
  exception_type com_exception_type.multiopt
;
com_exception_type.multiopt:
  com_exception_type.multiopt ',' exception_type
| /*empty*/
;
exception_type:
  class_type
| type_variable
;
method_body:
  block
| ';'
;
instance_initializer:
  block
;
static_initializer:
  "static" block
;
constructor_declaration:
  constructor_modifier.multiopt constructor_declarator throws.opt constructor_body
;
constructor_modifier.multiopt:
  constructor_modifier.multiopt constructor_modifier
| /*empty*/
;
constructor_modifier:
  annotation
| "public"
| "protected"
| "private"
;
constructor_declarator:
  type_parameters.opt simple_type_name '(' receiver_parameter_com.opt formal_parameter_list.opt ')'
;
simple_type_name:
  type_ID
;
constructor_body:
  '{' explicit_constructor_invocation.opt block_statements.opt '}'
;
explicit_constructor_invocation.opt:
  explicit_constructor_invocation
| /*empty*/
;
block_statements.opt:
  block_statements
| /*empty*/
;
explicit_constructor_invocation:
  type_arguments.opt "this" '(' argument_list.opt ')' ';'
| type_arguments.opt "super" '(' argument_list.opt ')' ';'
| expression_name '.' type_arguments.opt "super" '(' argument_list.opt ')' ';'
| primary '.' type_arguments.opt "super" '(' argument_list.opt ')' ';'
;
argument_list.opt:
  argument_list
| /*empty*/
;
enum_declaration:
  class_modifier.multiopt "enum" type_ID class_implements.opt enum_body
;
enum_body:
  '{' enum_constant_list.opt com.opt enum_body_declarations.opt '}'
;
com.opt:
  ','
| /*empty*/
;
enum_body_declarations.opt:
  enum_body_declarations
| /*empty*/
;
enum_constant_list.opt:
  enum_constant_list
| /*empty*/
;
enum_constant_list:
  enum_constant com_enum_constant.multiopt
;
com_enum_constant.multiopt:
  com_enum_constant.multiopt ',' enum_constant
| /*empty*/
;
enum_constant:
  enum_constant_modifier.multiopt ID "[(" argument_list.opt ")]" class_body.opt
;
enum_constant_modifier.multiopt:
  enum_constant_modifier.multiopt enum_constant_modifier
| /*empty*/
;
class_body.opt:
  class_body
| /*empty*/
;
enum_constant_modifier:
  annotation
;
enum_body_declarations:
  ';' class_body_declaration.multiopt
;
record_declaration:
  class_modifier.multiopt "record" type_ID type_parameters.opt record_header class_implements.opt record_body
;
record_header:
  '(' record_component_list.opt ')'
;
record_component_list.opt:
  record_component_list
| /*empty*/
;
record_component_list:
  record_component com_record_component.multiopt
;
com_record_component.multiopt:
  com_record_component.multiopt ',' record_component
| /*empty*/
;

record_component:
  record_component_modifier.multiopt unann_type ID
| variable_arity_record_component
;
record_component_modifier.multiopt:
  record_component_modifier.multiopt record_component_modifier
| /*empty*/
;
variable_arity_record_component:
  record_component_modifier.multiopt unann_type annotation.multiopt "..." ID
;
record_component_modifier:
  annotation
;
record_body:
  '{' record_body_declaration.multiopt '}'
;
record_body_declaration.multiopt:
  record_body_declaration.multiopt record_body_declaration
| /*empty*/
;
record_body_declaration:
  class_body_declaration
| compact_constructor_declaration
;
compact_constructor_declaration:
  constructor_modifier.multiopt simple_type_name constructor_body
;

	/* Interfaces */

interface_declaration:
  normal_interface_declaration
| annotation_interface_declaration
;
normal_interface_declaration:
  interface_modifier.multiopt "interface" type_ID type_parameters.opt interface_extends.opt interface_permits.opt interface_body
;
interface_modifier.multiopt:
  interface_modifier.multiopt interface_modifier
| /*empty*/
;
interface_extends.opt:
  interface_extends
| /*empty*/
;
interface_permits.opt:
  interface_permits
| /*empty*/
;
interface_modifier:
  annotation
| "public"
| "protected"
| "private"
| "abstract"
| "static"
| "sealed"
| "non-sealed"
| "strictfp"
;
interface_extends:
  "extends" interface_type_list
;
interface_permits:
  "permits" type_name com_type_name.multiopt
;
interface_body:
  '{' interface_member_declaration.multiopt '}'
;
interface_member_declaration.multiopt:
  interface_member_declaration.multiopt interface_member_declaration
| /*empty*/
;
interface_member_declaration:
  constant_declaration
| interface_method_declaration
| class_declaration
| interface_declaration
| ';'
;
constant_declaration:
  constant_modifier.multiopt unann_type variable_declarator_list ';'
;
constant_modifier.multiopt:
  constant_modifier.multiopt constant_modifier
| /*empty*/
;
constant_modifier:
  annotation
| "public"
| "static"
| "final"
;
interface_method_declaration:
  interface_method_modifier.multiopt method_header method_body
;
interface_method_modifier.multiopt:
  interface_method_modifier.multiopt interface_method_modifier
| /*empty*/
;
interface_method_modifier:
  annotation
| "public"
| "private"
| "abstract"
| "default"
| "static"
| "strictfp"
;
annotation_interface_declaration:
  interface_modifier.multiopt '@' "interface" type_ID annotation_interface_body
;
annotation_interface_body:
  '{' annotation_interface_member_declaration.multiopt '}'
;
annotation_interface_member_declaration.multiopt:
  annotation_interface_member_declaration.multiopt annotation_interface_member_declaration
| /*empty*/
;
annotation_interface_member_declaration:
  annotation_interface_element_declaration
| constant_declaration
| class_declaration
| interface_declaration
| ';'
;
annotation_interface_element_declaration:
  annotation_interface_element_modifier.multiopt unann_type ID '(' ')' dims.opt default_value.opt ';'
;
annotation_interface_element_modifier.multiopt:
  annotation_interface_element_modifier.multiopt annotation_interface_element_modifier
| /*empty*/
;
default_value.opt:
  default_value
| /*empty*/
;
annotation_interface_element_modifier:
  annotation
| "public"
| "abstract"
;
default_value:
  "default" element_value
;
annotation:
  normal_annotation
| marker_annotation
| single_element_annotation
;
normal_annotation:
  '@' type_name '(' element_value_pair_list.opt ')'
;
element_value_pair_list.opt:
  element_value_pair_list
| /*empty*/
;
element_value_pair_list:
  element_value_pair com_element_value_pair.multiopt
;
com_element_value_pair.multiopt:
  com_element_value_pair.multiopt ',' element_value_pair
| /*empty*/
;
element_value_pair:
  ID '=' element_value
;
element_value:
  conditional_expression
| element_value_array_initializer
| annotation
;
element_value_array_initializer:
  '{' element_valueList.opt com.opt '}'
;
element_valueList.opt:
  element_valueList
| /*empty*/
;
element_valueList:
  element_value com_element_value.multiopt
;
com_element_value.multiopt:
  com_element_value.multiopt ',' element_value
| /*empty*/
;
marker_annotation:
  '@' type_name
;
single_element_annotation:
  '@' type_name '(' element_value ')'
;
annotation.multiopt:
  annotation.multiopt annotation
| /*empty*/
	/* Arrays */

array_initializer:
  '{' variable_initializer_list.opt com.opt '}'
;
variable_initializer_list.opt:
  variable_initializer_list
| /*empty*/
;
variable_initializer_list:
  variable_initializer com_variable_initializer.multiopt
;
com_variable_initializer.multiopt:
  com_variable_initializer.multiopt ',' variable_initializer
| /*empty*/
;
	/* blocks, statements, and patterns */

block:
  '{' block_statements.opt '}'
;
block_statements:
  block_statement block_statement.multiopt
;
block_statement.multiopt:
  block_statement.multiopt block_statement
| /*empty*/
;
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
  local_variable_declaration ';'
;
local_variable_declaration:
  variable_modifier.multiopt local_variable_type variable_declarator_list
;
local_variable_type:
  unann_type
| "var"
;
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
  ';'
;
labeled_statement:
  ID ':' statement
;
labeled_statement_no_short_if:
  ID ':' statement_no_short_if
;
expression_statement:
  statement_expression ';'
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
  "if" '(' expression ')' statement
;
if_then_else_statement:
  "if" '(' expression ')' statement_no_short_if "else" statement
;
if_then_else_statement_no_short_if:
  "if" '(' expression ')' statement_no_short_if "else" statement_no_short_if
;
assert_statement:
  "assert" expression ';'
| "assert" expression ':' expression ';'
;
switch_statement:
  "switch" '(' expression ')' switch_block
;
switch_block:
  '{' switch_rule switch_rule.multiopt ';'
| '{' switch_block_statement_group.multiopt switch_label_col.multiopt '}'
;
switch_rule.multiopt:
  switch_rule.multiopt switch_rule
| /*empty*/
;
switch_block_statement_group.multiopt:
  switch_block_statement_group.multiopt switch_block_statement_group
| /*empty*/
;
switch_label_col.multiopt:
  switch_label_col.multiopt switch_label ':'
| /*empty*/
;
switch_rule:
  switch_label "->" expression ';'
| switch_label "->" block
| switch_label "->" throw_statement
;
switch_block_statement_group:
  switch_label ':' switch_label_col.multiopt block_statements
;
switch_label:
  "case" case_constant com_case_constant.multiopt
  "default"
;
com_case_constant.multiopt:
  com_case_constant.multiopt ',' case_constant
| /*empty*/
;
case_constant:
  conditional_expression
;
while_statement:
  "while" '(' expression ')' statement
;
while_statement_no_short_if:
  "while" '(' expression ')' statement_no_short_if
;
do_statement:
  "do" statement "while" '(' expression ')' ';'
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
  "for" '(' for_init.opt ';' expression.opt ';' for_update.opt ')' statement
;
for_init.opt:
  for_init
| /*empty*/
;
expression.opt:
  expression
| /*empty*/
;
for_update.opt:
  for_update
| /*empty*/
;
basic_for_statement_no_short_if:
  "for" '(' for_init.opt ';' expression.opt ';' for_update.opt ')' statement_no_short_if
;
for_init:
  statement_expression_list
  local_variable_declaration
;
for_update:
  statement_expression_list
;
statement_expression_list:
  statement_expression com_statement_expression.multiopt
;
com_statement_expression.multiopt:
  com_statement_expression.multiopt ',' statement_expression
| /*empty*/
;
enhanced_for_statement:
  "for" '(' local_variable_declaration ':' expression ')' statement
;
enhanced_for_statement_no_short_if:
  "for" '(' local_variable_declaration ':' expression ')' statement_no_short_if
;
break_statement:
  "break" ID.opt ';'
;
ID.opt:
  ID
| /*empty*/
;
yield_statement:
  "yield" expression ';'
;
continue_statement:
  "continue" ID.opt ';'
;
return_statement:
  "return" expression.opt ';'
;
throw_statement:
  "throw" expression ';'
;
synchronized_statement:
  "synchronized" '(' expression ')' block
;
try_statement:
  "try" block catches
  "try" block catches.opt finally
  try_with_resources_statement
;
catches.opt:
  catches
| /*empty*/
;
catches:
  catch_clause catch_clause.multiopt
;
catch_clause.multiopt:
  catch_clause.multiopt catch_clause
| /*empty*/
;
catch_clause:
  "catch" '(' catch_formal_parameter ')' block
;
catch_formal_parameter:
  variable_modifier.multiopt catch_type variable_declarator_id
;
catch_type:
  unann_class_type vt_class_type.multiopt
;
vt_class_type.multiopt:
  vt_class_type.multiopt '|' class_type
| /*empty*/
;
finally:
  "finally" block
;
try_with_resources_statement:
  "try" resource_specification block catches.opt finally.opt
;
finally.opt:
  finally
| /*empty*/
;
resource_specification:
  '(' resource_list semcol.opt ')'
;
semcol.opt:
  ';'
| /*empty*/
;
resource_list:
  resource semcol_resource.multiopt
;
semcol_resource.multiopt:
  semcol_resource.multiopt ';' resource
| /*empty*/
;
resource:
  local_variable_declaration
| variable_access
;
variable_access:
  expression_name
| field_access
;
pattern:
  type_pattern
;
type_pattern:
  local_variable_declaration

	/* expressions */

primary:
  primary_no_new_array
| array_creation_expression
;
primary_no_new_array:
  CHAR_LIT
| class_literal
| "this"
| type_name '.' "this"
| '(' expression ')'
| class_instance_creation_expression
| field_access
| array_access
| method_invocation
| method_reference
;
class_literal:
  type_name space.opt.multiopt '.' "class"
| numeric_type space.opt.multiopt '.' "class"
| "boolean" space.opt.multiopt "." "class"
| "void" "." "class"
;
class_instance_creation_expression:
  unqualified_class_instance_creation_expression
| expression_name '.' unqualified_class_instance_creation_expression
| primary '.' unqualified_class_instance_creation_expression
;
unqualified_class_instance_creation_expression:
  "new" type_arguments.opt class_or_interface_type_to_instantiate '(' argument_list.opt ')' class_body.opt
;
class_or_interface_type_to_instantiate:
  annotation.multiopt ID dot_annotation.multiopt_ID.multiopt type_arguments_or_diamond.opt
;
dot_annotation.multiopt_ID.multiopt:
  dot_annotation.multiopt_ID.multiopt '.' annotation.multiopt ID
| /*empty*/
;
type_arguments_or_diamond.opt:
  type_arguments_or_diamond
| /*empty*/
;
type_arguments_or_diamond:
  type_arguments
| "<>"
;
field_access:
  primary '.' ID
| "super" '.' ID
| type_name '.' "super" '.' ID
;
array_access:
  expression_name '[' expression ']'
| primary_no_new_array '[' expression ']'
;
method_invocation:
  method_name '(' argument_list.opt ')'
| type_name '.' type_arguments.opt ID '(' argument_list.opt ')'
| expression_name '.' type_arguments.opt ID '(' argument_list.opt ')'
| primary '.' type_arguments.opt ID '(' argument_list.opt ')'
| "super" '.' type_arguments.opt ID '(' argument_list.opt ')'
| type_name '.' "super" '.' type_arguments.opt ID '(' argument_list.opt ')'
;
argument_list:
  expression com_expression.multiopt
;
com_expression.multiopt:
  com_expression.multiopt ',' expression
| /*empty*/
;
method_reference:
  expression_name "::" type_arguments.opt ID
| primary "::" type_arguments.opt ID
| reference_type "::" type_arguments.opt ID
| "super" "::" type_arguments.opt ID
| type_name '.' "super" "::" type_arguments.opt ID
| class_type "::" type_arguments.opt "new"
| array_type "::" "new"
;
array_creation_expression:
  "new" primitive_type dim_exprs dims.opt
| "new" class_or_interface_type dim_exprs dims.opt
| "new" primitive_type dims array_initializer
| "new" class_or_interface_type dims array_initializer
;
dim_exprs:
  dim_expr dim_expr.multiopt
;
dim_expr.multiopt:
  dim_expr.multiopt dim_expr
| /*empty*/
;
dim_expr:
  annotation.multiopt '[' expression ']'
;
expression:
  lambda_expression
| assignment_expression
;
lambda_expression:
  lambda_parameters "->" lambda_body
;
lambda_parameters:
  '(' lambda_parameter_list.opt ')'
| ID
;
lambda_parameter_list.opt:
  lambda_parameter_list
| /*empty*/
;
lambda_parameter_list:
  lambda_parameter com_lambda_parameter.multiopt
| ID com_ID.multiopt
;
com_ID.multiopt:
  com_ID.multiopt ',' ID
| /*empty*/
;
com_lambda_parameter.multiopt:
  com_lambda_parameter.multiopt ',' lambda_parameter
| /*empty*/
;
lambda_parameter:
  variable_modifier.multiopt lambda_parameter_type variable_declarator_id
| variable_arity_parameter
;
lambda_parameter_type:
  unann_type
| "var"
;
lambda_body:
  expression
| block
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
  '='
| "*="
| "/="
| "%="
| "+="
| "-="
| "<<="
| ">>="
| ">>>="
| "&="
| "^="
| "|="
;
conditional_expression:
  conditional_or_expression
| conditional_or_expression "?" expression ':' conditional_expression
| conditional_or_expression "?" expression ":" lambda_expression
;
conditional_or_expression:
  conditional_and_expression
| conditional_or_expression "||" conditional_and_expression
;
conditional_and_expression:
  inclusive_or_expression
| conditional_and_expression "&&" inclusive_or_expression
;
inclusive_or_expression:
  exclusive_or_expression
| inclusive_or_expression '|' exclusive_or_expression
;
exclusive_or_expression:
  and_expression
| exclusive_or_expression '^' and_expression
;
and_expression:
  equality_expression
| and_expression '&' equality_expression
;
equality_expression:
  relational_expression
| equality_expression "==" relational_expression
| equality_expression "!=" relational_expression
;
relational_expression:
  shift_expression
| relational_expression "<" shift_expression
| relational_expression ">" shift_expression
| relational_expression "<=" shift_expression
| relational_expression ">=" shift_expression
| instanceof_expression
;
instanceof_expression:
  relational_expression "instanceof" reference_type
| relational_expression "instanceof" pattern
;
shift_expression:
  additive_expression
| shift_expression "<<" additive_expression
| shift_expression ">>" additive_expression
| shift_expression ">>>" additive_expression
;
additive_expression:
  multiplicative_expression
| additive_expression '+' multiplicative_expression
| additive_expression '-' multiplicative_expression
;
multiplicative_expression:
  unary_expression
| multiplicative_expression '*' unary_expression
| multiplicative_expression '/' unary_expression
| multiplicative_expression '%' unary_expression
;
unary_expression:
  pre_increment_expression
| pre_decrement_expression
| '+' unary_expression
| '-' unary_expression
| unary_expression_not_plus_minus
;
pre_increment_expression:
  "++" unary_expression
pre_decrement_expression:
  "--" unary_expression
unary_expression_not_plus_minus:
  postfix_expression
| '~' unary_expression
| '!' unary_expression
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
  postfix_expression "++"
;
post_decrement_expression:
  postfix_expression "--"
;
cast_expression:
  '(' primitive_type ')' unary_expression
| '(' reference_type additional_bound.multiopt ')' unary_expression_not_plus_minus
| '(' reference_type additional_bound.multiopt ')' lambda_expression
;
additional_bound.multiopt:
  additional_bound.multiopt additional_bound
| /*empty*/
;
switch_expression:
  "switch" '(' expression ')' switch_block
;
constant_expression:
  expression
;
%%

int createNode(string lbl) {
	vector<int> v;
	nodes.push_back({lbl, v});
	// cout << "Node Created - " << lbl << endl;
	return nodes.size()-1;
}

void addChild(int parent, int child) {
	nodes[parent].second.push_back(child);
	// cout << "Added Child - " << label[parent] << "->" << label[child] << endl;
}

int main(int argc, char** argv){
	yyin = fopen(argv[1], "r");
	yyparse();
	fclose(yyin);
	return 0;
}