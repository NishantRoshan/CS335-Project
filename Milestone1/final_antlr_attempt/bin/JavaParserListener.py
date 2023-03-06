# Generated from JavaParser.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JavaParser import JavaParser
else:
    from JavaParser import JavaParser

# This class defines a complete listener for a parse tree produced by JavaParser.
class JavaParserListener(ParseTreeListener):

    # Enter a parse tree produced by JavaParser#identifier.
    def enterIdentifier(self, ctx:JavaParser.IdentifierContext):
        pass

    # Exit a parse tree produced by JavaParser#identifier.
    def exitIdentifier(self, ctx:JavaParser.IdentifierContext):
        pass


    # Enter a parse tree produced by JavaParser#type_identifier.
    def enterType_identifier(self, ctx:JavaParser.Type_identifierContext):
        pass

    # Exit a parse tree produced by JavaParser#type_identifier.
    def exitType_identifier(self, ctx:JavaParser.Type_identifierContext):
        pass


    # Enter a parse tree produced by JavaParser#non_wild_card_type_arguments_or_diamond.
    def enterNon_wild_card_type_arguments_or_diamond(self, ctx:JavaParser.Non_wild_card_type_arguments_or_diamondContext):
        pass

    # Exit a parse tree produced by JavaParser#non_wild_card_type_arguments_or_diamond.
    def exitNon_wild_card_type_arguments_or_diamond(self, ctx:JavaParser.Non_wild_card_type_arguments_or_diamondContext):
        pass


    # Enter a parse tree produced by JavaParser#non_wildcard_type_arguments.
    def enterNon_wildcard_type_arguments(self, ctx:JavaParser.Non_wildcard_type_argumentsContext):
        pass

    # Exit a parse tree produced by JavaParser#non_wildcard_type_arguments.
    def exitNon_wildcard_type_arguments(self, ctx:JavaParser.Non_wildcard_type_argumentsContext):
        pass


    # Enter a parse tree produced by JavaParser#type_list.
    def enterType_list(self, ctx:JavaParser.Type_listContext):
        pass

    # Exit a parse tree produced by JavaParser#type_list.
    def exitType_list(self, ctx:JavaParser.Type_listContext):
        pass


    # Enter a parse tree produced by JavaParser#type_type.
    def enterType_type(self, ctx:JavaParser.Type_typeContext):
        pass

    # Exit a parse tree produced by JavaParser#type_type.
    def exitType_type(self, ctx:JavaParser.Type_typeContext):
        pass


    # Enter a parse tree produced by JavaParser#primitive_type.
    def enterPrimitive_type(self, ctx:JavaParser.Primitive_typeContext):
        pass

    # Exit a parse tree produced by JavaParser#primitive_type.
    def exitPrimitive_type(self, ctx:JavaParser.Primitive_typeContext):
        pass


    # Enter a parse tree produced by JavaParser#type_parameter.
    def enterType_parameter(self, ctx:JavaParser.Type_parameterContext):
        pass

    # Exit a parse tree produced by JavaParser#type_parameter.
    def exitType_parameter(self, ctx:JavaParser.Type_parameterContext):
        pass


    # Enter a parse tree produced by JavaParser#type_bound.
    def enterType_bound(self, ctx:JavaParser.Type_boundContext):
        pass

    # Exit a parse tree produced by JavaParser#type_bound.
    def exitType_bound(self, ctx:JavaParser.Type_boundContext):
        pass


    # Enter a parse tree produced by JavaParser#type_argument.
    def enterType_argument(self, ctx:JavaParser.Type_argumentContext):
        pass

    # Exit a parse tree produced by JavaParser#type_argument.
    def exitType_argument(self, ctx:JavaParser.Type_argumentContext):
        pass


    # Enter a parse tree produced by JavaParser#type_arguments.
    def enterType_arguments(self, ctx:JavaParser.Type_argumentsContext):
        pass

    # Exit a parse tree produced by JavaParser#type_arguments.
    def exitType_arguments(self, ctx:JavaParser.Type_argumentsContext):
        pass


    # Enter a parse tree produced by JavaParser#super_suffix.
    def enterSuper_suffix(self, ctx:JavaParser.Super_suffixContext):
        pass

    # Exit a parse tree produced by JavaParser#super_suffix.
    def exitSuper_suffix(self, ctx:JavaParser.Super_suffixContext):
        pass


    # Enter a parse tree produced by JavaParser#explicit_generic_invocation_suffix.
    def enterExplicit_generic_invocation_suffix(self, ctx:JavaParser.Explicit_generic_invocation_suffixContext):
        pass

    # Exit a parse tree produced by JavaParser#explicit_generic_invocation_suffix.
    def exitExplicit_generic_invocation_suffix(self, ctx:JavaParser.Explicit_generic_invocation_suffixContext):
        pass


    # Enter a parse tree produced by JavaParser#arguments.
    def enterArguments(self, ctx:JavaParser.ArgumentsContext):
        pass

    # Exit a parse tree produced by JavaParser#arguments.
    def exitArguments(self, ctx:JavaParser.ArgumentsContext):
        pass


    # Enter a parse tree produced by JavaParser#class_or_interface_type.
    def enterClass_or_interface_type(self, ctx:JavaParser.Class_or_interface_typeContext):
        pass

    # Exit a parse tree produced by JavaParser#class_or_interface_type.
    def exitClass_or_interface_type(self, ctx:JavaParser.Class_or_interface_typeContext):
        pass


    # Enter a parse tree produced by JavaParser#class_type.
    def enterClass_type(self, ctx:JavaParser.Class_typeContext):
        pass

    # Exit a parse tree produced by JavaParser#class_type.
    def exitClass_type(self, ctx:JavaParser.Class_typeContext):
        pass


    # Enter a parse tree produced by JavaParser#compilation_unit.
    def enterCompilation_unit(self, ctx:JavaParser.Compilation_unitContext):
        pass

    # Exit a parse tree produced by JavaParser#compilation_unit.
    def exitCompilation_unit(self, ctx:JavaParser.Compilation_unitContext):
        pass


    # Enter a parse tree produced by JavaParser#package_declaration.
    def enterPackage_declaration(self, ctx:JavaParser.Package_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#package_declaration.
    def exitPackage_declaration(self, ctx:JavaParser.Package_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#import_declaration.
    def enterImport_declaration(self, ctx:JavaParser.Import_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#import_declaration.
    def exitImport_declaration(self, ctx:JavaParser.Import_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#module_declaration.
    def enterModule_declaration(self, ctx:JavaParser.Module_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#module_declaration.
    def exitModule_declaration(self, ctx:JavaParser.Module_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#type_declaration.
    def enterType_declaration(self, ctx:JavaParser.Type_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#type_declaration.
    def exitType_declaration(self, ctx:JavaParser.Type_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#module_body.
    def enterModule_body(self, ctx:JavaParser.Module_bodyContext):
        pass

    # Exit a parse tree produced by JavaParser#module_body.
    def exitModule_body(self, ctx:JavaParser.Module_bodyContext):
        pass


    # Enter a parse tree produced by JavaParser#module_directive.
    def enterModule_directive(self, ctx:JavaParser.Module_directiveContext):
        pass

    # Exit a parse tree produced by JavaParser#module_directive.
    def exitModule_directive(self, ctx:JavaParser.Module_directiveContext):
        pass


    # Enter a parse tree produced by JavaParser#modifier.
    def enterModifier(self, ctx:JavaParser.ModifierContext):
        pass

    # Exit a parse tree produced by JavaParser#modifier.
    def exitModifier(self, ctx:JavaParser.ModifierContext):
        pass


    # Enter a parse tree produced by JavaParser#requires_modifier.
    def enterRequires_modifier(self, ctx:JavaParser.Requires_modifierContext):
        pass

    # Exit a parse tree produced by JavaParser#requires_modifier.
    def exitRequires_modifier(self, ctx:JavaParser.Requires_modifierContext):
        pass


    # Enter a parse tree produced by JavaParser#class_or_interface_modifier.
    def enterClass_or_interface_modifier(self, ctx:JavaParser.Class_or_interface_modifierContext):
        pass

    # Exit a parse tree produced by JavaParser#class_or_interface_modifier.
    def exitClass_or_interface_modifier(self, ctx:JavaParser.Class_or_interface_modifierContext):
        pass


    # Enter a parse tree produced by JavaParser#class_declaration.
    def enterClass_declaration(self, ctx:JavaParser.Class_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#class_declaration.
    def exitClass_declaration(self, ctx:JavaParser.Class_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#type_parameters.
    def enterType_parameters(self, ctx:JavaParser.Type_parametersContext):
        pass

    # Exit a parse tree produced by JavaParser#type_parameters.
    def exitType_parameters(self, ctx:JavaParser.Type_parametersContext):
        pass


    # Enter a parse tree produced by JavaParser#class_body.
    def enterClass_body(self, ctx:JavaParser.Class_bodyContext):
        pass

    # Exit a parse tree produced by JavaParser#class_body.
    def exitClass_body(self, ctx:JavaParser.Class_bodyContext):
        pass


    # Enter a parse tree produced by JavaParser#class_body_declaration.
    def enterClass_body_declaration(self, ctx:JavaParser.Class_body_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#class_body_declaration.
    def exitClass_body_declaration(self, ctx:JavaParser.Class_body_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#member_declaration.
    def enterMember_declaration(self, ctx:JavaParser.Member_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#member_declaration.
    def exitMember_declaration(self, ctx:JavaParser.Member_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#field_declaration.
    def enterField_declaration(self, ctx:JavaParser.Field_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#field_declaration.
    def exitField_declaration(self, ctx:JavaParser.Field_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#variable_declarators.
    def enterVariable_declarators(self, ctx:JavaParser.Variable_declaratorsContext):
        pass

    # Exit a parse tree produced by JavaParser#variable_declarators.
    def exitVariable_declarators(self, ctx:JavaParser.Variable_declaratorsContext):
        pass


    # Enter a parse tree produced by JavaParser#variable_declarator.
    def enterVariable_declarator(self, ctx:JavaParser.Variable_declaratorContext):
        pass

    # Exit a parse tree produced by JavaParser#variable_declarator.
    def exitVariable_declarator(self, ctx:JavaParser.Variable_declaratorContext):
        pass


    # Enter a parse tree produced by JavaParser#variable_declarator_id.
    def enterVariable_declarator_id(self, ctx:JavaParser.Variable_declarator_idContext):
        pass

    # Exit a parse tree produced by JavaParser#variable_declarator_id.
    def exitVariable_declarator_id(self, ctx:JavaParser.Variable_declarator_idContext):
        pass


    # Enter a parse tree produced by JavaParser#variable_initializer.
    def enterVariable_initializer(self, ctx:JavaParser.Variable_initializerContext):
        pass

    # Exit a parse tree produced by JavaParser#variable_initializer.
    def exitVariable_initializer(self, ctx:JavaParser.Variable_initializerContext):
        pass


    # Enter a parse tree produced by JavaParser#method_declaration.
    def enterMethod_declaration(self, ctx:JavaParser.Method_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#method_declaration.
    def exitMethod_declaration(self, ctx:JavaParser.Method_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#receiver_parameter.
    def enterReceiver_parameter(self, ctx:JavaParser.Receiver_parameterContext):
        pass

    # Exit a parse tree produced by JavaParser#receiver_parameter.
    def exitReceiver_parameter(self, ctx:JavaParser.Receiver_parameterContext):
        pass


    # Enter a parse tree produced by JavaParser#formal_parameter_list.
    def enterFormal_parameter_list(self, ctx:JavaParser.Formal_parameter_listContext):
        pass

    # Exit a parse tree produced by JavaParser#formal_parameter_list.
    def exitFormal_parameter_list(self, ctx:JavaParser.Formal_parameter_listContext):
        pass


    # Enter a parse tree produced by JavaParser#formal_parameters.
    def enterFormal_parameters(self, ctx:JavaParser.Formal_parametersContext):
        pass

    # Exit a parse tree produced by JavaParser#formal_parameters.
    def exitFormal_parameters(self, ctx:JavaParser.Formal_parametersContext):
        pass


    # Enter a parse tree produced by JavaParser#formal_parameter.
    def enterFormal_parameter(self, ctx:JavaParser.Formal_parameterContext):
        pass

    # Exit a parse tree produced by JavaParser#formal_parameter.
    def exitFormal_parameter(self, ctx:JavaParser.Formal_parameterContext):
        pass


    # Enter a parse tree produced by JavaParser#variable_modifier.
    def enterVariable_modifier(self, ctx:JavaParser.Variable_modifierContext):
        pass

    # Exit a parse tree produced by JavaParser#variable_modifier.
    def exitVariable_modifier(self, ctx:JavaParser.Variable_modifierContext):
        pass


    # Enter a parse tree produced by JavaParser#method_body.
    def enterMethod_body(self, ctx:JavaParser.Method_bodyContext):
        pass

    # Exit a parse tree produced by JavaParser#method_body.
    def exitMethod_body(self, ctx:JavaParser.Method_bodyContext):
        pass


    # Enter a parse tree produced by JavaParser#generic_constructor_declaration.
    def enterGeneric_constructor_declaration(self, ctx:JavaParser.Generic_constructor_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#generic_constructor_declaration.
    def exitGeneric_constructor_declaration(self, ctx:JavaParser.Generic_constructor_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#constructor_declaration.
    def enterConstructor_declaration(self, ctx:JavaParser.Constructor_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#constructor_declaration.
    def exitConstructor_declaration(self, ctx:JavaParser.Constructor_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#enum_declaration.
    def enterEnum_declaration(self, ctx:JavaParser.Enum_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#enum_declaration.
    def exitEnum_declaration(self, ctx:JavaParser.Enum_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#enum_constants.
    def enterEnum_constants(self, ctx:JavaParser.Enum_constantsContext):
        pass

    # Exit a parse tree produced by JavaParser#enum_constants.
    def exitEnum_constants(self, ctx:JavaParser.Enum_constantsContext):
        pass


    # Enter a parse tree produced by JavaParser#enum_constant.
    def enterEnum_constant(self, ctx:JavaParser.Enum_constantContext):
        pass

    # Exit a parse tree produced by JavaParser#enum_constant.
    def exitEnum_constant(self, ctx:JavaParser.Enum_constantContext):
        pass


    # Enter a parse tree produced by JavaParser#enum_body_declarations.
    def enterEnum_body_declarations(self, ctx:JavaParser.Enum_body_declarationsContext):
        pass

    # Exit a parse tree produced by JavaParser#enum_body_declarations.
    def exitEnum_body_declarations(self, ctx:JavaParser.Enum_body_declarationsContext):
        pass


    # Enter a parse tree produced by JavaParser#record_declaration.
    def enterRecord_declaration(self, ctx:JavaParser.Record_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#record_declaration.
    def exitRecord_declaration(self, ctx:JavaParser.Record_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#record_header.
    def enterRecord_header(self, ctx:JavaParser.Record_headerContext):
        pass

    # Exit a parse tree produced by JavaParser#record_header.
    def exitRecord_header(self, ctx:JavaParser.Record_headerContext):
        pass


    # Enter a parse tree produced by JavaParser#record_component_list.
    def enterRecord_component_list(self, ctx:JavaParser.Record_component_listContext):
        pass

    # Exit a parse tree produced by JavaParser#record_component_list.
    def exitRecord_component_list(self, ctx:JavaParser.Record_component_listContext):
        pass


    # Enter a parse tree produced by JavaParser#record_component.
    def enterRecord_component(self, ctx:JavaParser.Record_componentContext):
        pass

    # Exit a parse tree produced by JavaParser#record_component.
    def exitRecord_component(self, ctx:JavaParser.Record_componentContext):
        pass


    # Enter a parse tree produced by JavaParser#record_body.
    def enterRecord_body(self, ctx:JavaParser.Record_bodyContext):
        pass

    # Exit a parse tree produced by JavaParser#record_body.
    def exitRecord_body(self, ctx:JavaParser.Record_bodyContext):
        pass


    # Enter a parse tree produced by JavaParser#compact_constructor_declaration.
    def enterCompact_constructor_declaration(self, ctx:JavaParser.Compact_constructor_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#compact_constructor_declaration.
    def exitCompact_constructor_declaration(self, ctx:JavaParser.Compact_constructor_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#interface_declaration.
    def enterInterface_declaration(self, ctx:JavaParser.Interface_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#interface_declaration.
    def exitInterface_declaration(self, ctx:JavaParser.Interface_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#interface_body.
    def enterInterface_body(self, ctx:JavaParser.Interface_bodyContext):
        pass

    # Exit a parse tree produced by JavaParser#interface_body.
    def exitInterface_body(self, ctx:JavaParser.Interface_bodyContext):
        pass


    # Enter a parse tree produced by JavaParser#type_type_or_void.
    def enterType_type_or_void(self, ctx:JavaParser.Type_type_or_voidContext):
        pass

    # Exit a parse tree produced by JavaParser#type_type_or_void.
    def exitType_type_or_void(self, ctx:JavaParser.Type_type_or_voidContext):
        pass


    # Enter a parse tree produced by JavaParser#generic_method_declaration.
    def enterGeneric_method_declaration(self, ctx:JavaParser.Generic_method_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#generic_method_declaration.
    def exitGeneric_method_declaration(self, ctx:JavaParser.Generic_method_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#interface_body_declaration.
    def enterInterface_body_declaration(self, ctx:JavaParser.Interface_body_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#interface_body_declaration.
    def exitInterface_body_declaration(self, ctx:JavaParser.Interface_body_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#interface_member_declaration.
    def enterInterface_member_declaration(self, ctx:JavaParser.Interface_member_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#interface_member_declaration.
    def exitInterface_member_declaration(self, ctx:JavaParser.Interface_member_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#const_declaration.
    def enterConst_declaration(self, ctx:JavaParser.Const_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#const_declaration.
    def exitConst_declaration(self, ctx:JavaParser.Const_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#constant_declarator.
    def enterConstant_declarator(self, ctx:JavaParser.Constant_declaratorContext):
        pass

    # Exit a parse tree produced by JavaParser#constant_declarator.
    def exitConstant_declarator(self, ctx:JavaParser.Constant_declaratorContext):
        pass


    # Enter a parse tree produced by JavaParser#interface_method_declaration.
    def enterInterface_method_declaration(self, ctx:JavaParser.Interface_method_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#interface_method_declaration.
    def exitInterface_method_declaration(self, ctx:JavaParser.Interface_method_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#interface_method_modifier.
    def enterInterface_method_modifier(self, ctx:JavaParser.Interface_method_modifierContext):
        pass

    # Exit a parse tree produced by JavaParser#interface_method_modifier.
    def exitInterface_method_modifier(self, ctx:JavaParser.Interface_method_modifierContext):
        pass


    # Enter a parse tree produced by JavaParser#generic_interface_method_declaration.
    def enterGeneric_interface_method_declaration(self, ctx:JavaParser.Generic_interface_method_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#generic_interface_method_declaration.
    def exitGeneric_interface_method_declaration(self, ctx:JavaParser.Generic_interface_method_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#interface_common_body_declaration.
    def enterInterface_common_body_declaration(self, ctx:JavaParser.Interface_common_body_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#interface_common_body_declaration.
    def exitInterface_common_body_declaration(self, ctx:JavaParser.Interface_common_body_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#default_value.
    def enterDefault_value(self, ctx:JavaParser.Default_valueContext):
        pass

    # Exit a parse tree produced by JavaParser#default_value.
    def exitDefault_value(self, ctx:JavaParser.Default_valueContext):
        pass


    # Enter a parse tree produced by JavaParser#alt_annotation_qualified_name.
    def enterAlt_annotation_qualified_name(self, ctx:JavaParser.Alt_annotation_qualified_nameContext):
        pass

    # Exit a parse tree produced by JavaParser#alt_annotation_qualified_name.
    def exitAlt_annotation_qualified_name(self, ctx:JavaParser.Alt_annotation_qualified_nameContext):
        pass


    # Enter a parse tree produced by JavaParser#annotation.
    def enterAnnotation(self, ctx:JavaParser.AnnotationContext):
        pass

    # Exit a parse tree produced by JavaParser#annotation.
    def exitAnnotation(self, ctx:JavaParser.AnnotationContext):
        pass


    # Enter a parse tree produced by JavaParser#element_value_pairs.
    def enterElement_value_pairs(self, ctx:JavaParser.Element_value_pairsContext):
        pass

    # Exit a parse tree produced by JavaParser#element_value_pairs.
    def exitElement_value_pairs(self, ctx:JavaParser.Element_value_pairsContext):
        pass


    # Enter a parse tree produced by JavaParser#element_value_pair.
    def enterElement_value_pair(self, ctx:JavaParser.Element_value_pairContext):
        pass

    # Exit a parse tree produced by JavaParser#element_value_pair.
    def exitElement_value_pair(self, ctx:JavaParser.Element_value_pairContext):
        pass


    # Enter a parse tree produced by JavaParser#element_value.
    def enterElement_value(self, ctx:JavaParser.Element_valueContext):
        pass

    # Exit a parse tree produced by JavaParser#element_value.
    def exitElement_value(self, ctx:JavaParser.Element_valueContext):
        pass


    # Enter a parse tree produced by JavaParser#element_value_array_initializer.
    def enterElement_value_array_initializer(self, ctx:JavaParser.Element_value_array_initializerContext):
        pass

    # Exit a parse tree produced by JavaParser#element_value_array_initializer.
    def exitElement_value_array_initializer(self, ctx:JavaParser.Element_value_array_initializerContext):
        pass


    # Enter a parse tree produced by JavaParser#annotation_type_declaration.
    def enterAnnotation_type_declaration(self, ctx:JavaParser.Annotation_type_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#annotation_type_declaration.
    def exitAnnotation_type_declaration(self, ctx:JavaParser.Annotation_type_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#annotation_type_body.
    def enterAnnotation_type_body(self, ctx:JavaParser.Annotation_type_bodyContext):
        pass

    # Exit a parse tree produced by JavaParser#annotation_type_body.
    def exitAnnotation_type_body(self, ctx:JavaParser.Annotation_type_bodyContext):
        pass


    # Enter a parse tree produced by JavaParser#annotation_type_element_declaration.
    def enterAnnotation_type_element_declaration(self, ctx:JavaParser.Annotation_type_element_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#annotation_type_element_declaration.
    def exitAnnotation_type_element_declaration(self, ctx:JavaParser.Annotation_type_element_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#annotation_type_element_rest.
    def enterAnnotation_type_element_rest(self, ctx:JavaParser.Annotation_type_element_restContext):
        pass

    # Exit a parse tree produced by JavaParser#annotation_type_element_rest.
    def exitAnnotation_type_element_rest(self, ctx:JavaParser.Annotation_type_element_restContext):
        pass


    # Enter a parse tree produced by JavaParser#annotation_method_or_constant_rest.
    def enterAnnotation_method_or_constant_rest(self, ctx:JavaParser.Annotation_method_or_constant_restContext):
        pass

    # Exit a parse tree produced by JavaParser#annotation_method_or_constant_rest.
    def exitAnnotation_method_or_constant_rest(self, ctx:JavaParser.Annotation_method_or_constant_restContext):
        pass


    # Enter a parse tree produced by JavaParser#annotation_method_rest.
    def enterAnnotation_method_rest(self, ctx:JavaParser.Annotation_method_restContext):
        pass

    # Exit a parse tree produced by JavaParser#annotation_method_rest.
    def exitAnnotation_method_rest(self, ctx:JavaParser.Annotation_method_restContext):
        pass


    # Enter a parse tree produced by JavaParser#annotation_constant_rest.
    def enterAnnotation_constant_rest(self, ctx:JavaParser.Annotation_constant_restContext):
        pass

    # Exit a parse tree produced by JavaParser#annotation_constant_rest.
    def exitAnnotation_constant_rest(self, ctx:JavaParser.Annotation_constant_restContext):
        pass


    # Enter a parse tree produced by JavaParser#array_initializer.
    def enterArray_initializer(self, ctx:JavaParser.Array_initializerContext):
        pass

    # Exit a parse tree produced by JavaParser#array_initializer.
    def exitArray_initializer(self, ctx:JavaParser.Array_initializerContext):
        pass


    # Enter a parse tree produced by JavaParser#block.
    def enterBlock(self, ctx:JavaParser.BlockContext):
        pass

    # Exit a parse tree produced by JavaParser#block.
    def exitBlock(self, ctx:JavaParser.BlockContext):
        pass


    # Enter a parse tree produced by JavaParser#block_statement.
    def enterBlock_statement(self, ctx:JavaParser.Block_statementContext):
        pass

    # Exit a parse tree produced by JavaParser#block_statement.
    def exitBlock_statement(self, ctx:JavaParser.Block_statementContext):
        pass


    # Enter a parse tree produced by JavaParser#local_variable_declaration.
    def enterLocal_variable_declaration(self, ctx:JavaParser.Local_variable_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#local_variable_declaration.
    def exitLocal_variable_declaration(self, ctx:JavaParser.Local_variable_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#statement.
    def enterStatement(self, ctx:JavaParser.StatementContext):
        pass

    # Exit a parse tree produced by JavaParser#statement.
    def exitStatement(self, ctx:JavaParser.StatementContext):
        pass


    # Enter a parse tree produced by JavaParser#switch_rule_outcome.
    def enterSwitch_rule_outcome(self, ctx:JavaParser.Switch_rule_outcomeContext):
        pass

    # Exit a parse tree produced by JavaParser#switch_rule_outcome.
    def exitSwitch_rule_outcome(self, ctx:JavaParser.Switch_rule_outcomeContext):
        pass


    # Enter a parse tree produced by JavaParser#switch_block_statement_group.
    def enterSwitch_block_statement_group(self, ctx:JavaParser.Switch_block_statement_groupContext):
        pass

    # Exit a parse tree produced by JavaParser#switch_block_statement_group.
    def exitSwitch_block_statement_group(self, ctx:JavaParser.Switch_block_statement_groupContext):
        pass


    # Enter a parse tree produced by JavaParser#switch_label.
    def enterSwitch_label(self, ctx:JavaParser.Switch_labelContext):
        pass

    # Exit a parse tree produced by JavaParser#switch_label.
    def exitSwitch_label(self, ctx:JavaParser.Switch_labelContext):
        pass


    # Enter a parse tree produced by JavaParser#for_init.
    def enterFor_init(self, ctx:JavaParser.For_initContext):
        pass

    # Exit a parse tree produced by JavaParser#for_init.
    def exitFor_init(self, ctx:JavaParser.For_initContext):
        pass


    # Enter a parse tree produced by JavaParser#for_control.
    def enterFor_control(self, ctx:JavaParser.For_controlContext):
        pass

    # Exit a parse tree produced by JavaParser#for_control.
    def exitFor_control(self, ctx:JavaParser.For_controlContext):
        pass


    # Enter a parse tree produced by JavaParser#enhanced_for_control.
    def enterEnhanced_for_control(self, ctx:JavaParser.Enhanced_for_controlContext):
        pass

    # Exit a parse tree produced by JavaParser#enhanced_for_control.
    def exitEnhanced_for_control(self, ctx:JavaParser.Enhanced_for_controlContext):
        pass


    # Enter a parse tree produced by JavaParser#catch_clause.
    def enterCatch_clause(self, ctx:JavaParser.Catch_clauseContext):
        pass

    # Exit a parse tree produced by JavaParser#catch_clause.
    def exitCatch_clause(self, ctx:JavaParser.Catch_clauseContext):
        pass


    # Enter a parse tree produced by JavaParser#catch_type.
    def enterCatch_type(self, ctx:JavaParser.Catch_typeContext):
        pass

    # Exit a parse tree produced by JavaParser#catch_type.
    def exitCatch_type(self, ctx:JavaParser.Catch_typeContext):
        pass


    # Enter a parse tree produced by JavaParser#finally_block.
    def enterFinally_block(self, ctx:JavaParser.Finally_blockContext):
        pass

    # Exit a parse tree produced by JavaParser#finally_block.
    def exitFinally_block(self, ctx:JavaParser.Finally_blockContext):
        pass


    # Enter a parse tree produced by JavaParser#resource_specification.
    def enterResource_specification(self, ctx:JavaParser.Resource_specificationContext):
        pass

    # Exit a parse tree produced by JavaParser#resource_specification.
    def exitResource_specification(self, ctx:JavaParser.Resource_specificationContext):
        pass


    # Enter a parse tree produced by JavaParser#resources.
    def enterResources(self, ctx:JavaParser.ResourcesContext):
        pass

    # Exit a parse tree produced by JavaParser#resources.
    def exitResources(self, ctx:JavaParser.ResourcesContext):
        pass


    # Enter a parse tree produced by JavaParser#resource.
    def enterResource(self, ctx:JavaParser.ResourceContext):
        pass

    # Exit a parse tree produced by JavaParser#resource.
    def exitResource(self, ctx:JavaParser.ResourceContext):
        pass


    # Enter a parse tree produced by JavaParser#pattern.
    def enterPattern(self, ctx:JavaParser.PatternContext):
        pass

    # Exit a parse tree produced by JavaParser#pattern.
    def exitPattern(self, ctx:JavaParser.PatternContext):
        pass


    # Enter a parse tree produced by JavaParser#primary.
    def enterPrimary(self, ctx:JavaParser.PrimaryContext):
        pass

    # Exit a parse tree produced by JavaParser#primary.
    def exitPrimary(self, ctx:JavaParser.PrimaryContext):
        pass


    # Enter a parse tree produced by JavaParser#literal.
    def enterLiteral(self, ctx:JavaParser.LiteralContext):
        pass

    # Exit a parse tree produced by JavaParser#literal.
    def exitLiteral(self, ctx:JavaParser.LiteralContext):
        pass


    # Enter a parse tree produced by JavaParser#integer_literal.
    def enterInteger_literal(self, ctx:JavaParser.Integer_literalContext):
        pass

    # Exit a parse tree produced by JavaParser#integer_literal.
    def exitInteger_literal(self, ctx:JavaParser.Integer_literalContext):
        pass


    # Enter a parse tree produced by JavaParser#float_literal.
    def enterFloat_literal(self, ctx:JavaParser.Float_literalContext):
        pass

    # Exit a parse tree produced by JavaParser#float_literal.
    def exitFloat_literal(self, ctx:JavaParser.Float_literalContext):
        pass


    # Enter a parse tree produced by JavaParser#type_arguments_or_diamond.
    def enterType_arguments_or_diamond(self, ctx:JavaParser.Type_arguments_or_diamondContext):
        pass

    # Exit a parse tree produced by JavaParser#type_arguments_or_diamond.
    def exitType_arguments_or_diamond(self, ctx:JavaParser.Type_arguments_or_diamondContext):
        pass


    # Enter a parse tree produced by JavaParser#expression.
    def enterExpression(self, ctx:JavaParser.ExpressionContext):
        pass

    # Exit a parse tree produced by JavaParser#expression.
    def exitExpression(self, ctx:JavaParser.ExpressionContext):
        pass


    # Enter a parse tree produced by JavaParser#switch_expression.
    def enterSwitch_expression(self, ctx:JavaParser.Switch_expressionContext):
        pass

    # Exit a parse tree produced by JavaParser#switch_expression.
    def exitSwitch_expression(self, ctx:JavaParser.Switch_expressionContext):
        pass


    # Enter a parse tree produced by JavaParser#switch_labeled_rule.
    def enterSwitch_labeled_rule(self, ctx:JavaParser.Switch_labeled_ruleContext):
        pass

    # Exit a parse tree produced by JavaParser#switch_labeled_rule.
    def exitSwitch_labeled_rule(self, ctx:JavaParser.Switch_labeled_ruleContext):
        pass


    # Enter a parse tree produced by JavaParser#qualified_name_list.
    def enterQualified_name_list(self, ctx:JavaParser.Qualified_name_listContext):
        pass

    # Exit a parse tree produced by JavaParser#qualified_name_list.
    def exitQualified_name_list(self, ctx:JavaParser.Qualified_name_listContext):
        pass


    # Enter a parse tree produced by JavaParser#last_formal_parameter.
    def enterLast_formal_parameter(self, ctx:JavaParser.Last_formal_parameterContext):
        pass

    # Exit a parse tree produced by JavaParser#last_formal_parameter.
    def exitLast_formal_parameter(self, ctx:JavaParser.Last_formal_parameterContext):
        pass


    # Enter a parse tree produced by JavaParser#qualified_name.
    def enterQualified_name(self, ctx:JavaParser.Qualified_nameContext):
        pass

    # Exit a parse tree produced by JavaParser#qualified_name.
    def exitQualified_name(self, ctx:JavaParser.Qualified_nameContext):
        pass


    # Enter a parse tree produced by JavaParser#local_type_declaration.
    def enterLocal_type_declaration(self, ctx:JavaParser.Local_type_declarationContext):
        pass

    # Exit a parse tree produced by JavaParser#local_type_declaration.
    def exitLocal_type_declaration(self, ctx:JavaParser.Local_type_declarationContext):
        pass


    # Enter a parse tree produced by JavaParser#par_expression.
    def enterPar_expression(self, ctx:JavaParser.Par_expressionContext):
        pass

    # Exit a parse tree produced by JavaParser#par_expression.
    def exitPar_expression(self, ctx:JavaParser.Par_expressionContext):
        pass


    # Enter a parse tree produced by JavaParser#expression_list.
    def enterExpression_list(self, ctx:JavaParser.Expression_listContext):
        pass

    # Exit a parse tree produced by JavaParser#expression_list.
    def exitExpression_list(self, ctx:JavaParser.Expression_listContext):
        pass


    # Enter a parse tree produced by JavaParser#method_call.
    def enterMethod_call(self, ctx:JavaParser.Method_callContext):
        pass

    # Exit a parse tree produced by JavaParser#method_call.
    def exitMethod_call(self, ctx:JavaParser.Method_callContext):
        pass


    # Enter a parse tree produced by JavaParser#guarded_pattern.
    def enterGuarded_pattern(self, ctx:JavaParser.Guarded_patternContext):
        pass

    # Exit a parse tree produced by JavaParser#guarded_pattern.
    def exitGuarded_pattern(self, ctx:JavaParser.Guarded_patternContext):
        pass


    # Enter a parse tree produced by JavaParser#creator.
    def enterCreator(self, ctx:JavaParser.CreatorContext):
        pass

    # Exit a parse tree produced by JavaParser#creator.
    def exitCreator(self, ctx:JavaParser.CreatorContext):
        pass


    # Enter a parse tree produced by JavaParser#created_name.
    def enterCreated_name(self, ctx:JavaParser.Created_nameContext):
        pass

    # Exit a parse tree produced by JavaParser#created_name.
    def exitCreated_name(self, ctx:JavaParser.Created_nameContext):
        pass


    # Enter a parse tree produced by JavaParser#inner_creator.
    def enterInner_creator(self, ctx:JavaParser.Inner_creatorContext):
        pass

    # Exit a parse tree produced by JavaParser#inner_creator.
    def exitInner_creator(self, ctx:JavaParser.Inner_creatorContext):
        pass


    # Enter a parse tree produced by JavaParser#array_creator_rest.
    def enterArray_creator_rest(self, ctx:JavaParser.Array_creator_restContext):
        pass

    # Exit a parse tree produced by JavaParser#array_creator_rest.
    def exitArray_creator_rest(self, ctx:JavaParser.Array_creator_restContext):
        pass


    # Enter a parse tree produced by JavaParser#class_creator_rest.
    def enterClass_creator_rest(self, ctx:JavaParser.Class_creator_restContext):
        pass

    # Exit a parse tree produced by JavaParser#class_creator_rest.
    def exitClass_creator_rest(self, ctx:JavaParser.Class_creator_restContext):
        pass


    # Enter a parse tree produced by JavaParser#explicit_generic_invocation.
    def enterExplicit_generic_invocation(self, ctx:JavaParser.Explicit_generic_invocationContext):
        pass

    # Exit a parse tree produced by JavaParser#explicit_generic_invocation.
    def exitExplicit_generic_invocation(self, ctx:JavaParser.Explicit_generic_invocationContext):
        pass



del JavaParser