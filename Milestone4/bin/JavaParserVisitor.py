# Generated from JavaParser.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JavaParser import JavaParser
else:
    from JavaParser import JavaParser

# This class defines a complete generic visitor for a parse tree produced by JavaParser.

class JavaParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by JavaParser#identifier.
    def visitIdentifier(self, ctx:JavaParser.IdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_identifier.
    def visitType_identifier(self, ctx:JavaParser.Type_identifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#non_wild_card_type_arguments_or_diamond.
    def visitNon_wild_card_type_arguments_or_diamond(self, ctx:JavaParser.Non_wild_card_type_arguments_or_diamondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#non_wildcard_type_arguments.
    def visitNon_wildcard_type_arguments(self, ctx:JavaParser.Non_wildcard_type_argumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_list.
    def visitType_list(self, ctx:JavaParser.Type_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_type.
    def visitType_type(self, ctx:JavaParser.Type_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#primitive_type.
    def visitPrimitive_type(self, ctx:JavaParser.Primitive_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_parameter.
    def visitType_parameter(self, ctx:JavaParser.Type_parameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_bound.
    def visitType_bound(self, ctx:JavaParser.Type_boundContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_argument.
    def visitType_argument(self, ctx:JavaParser.Type_argumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_arguments.
    def visitType_arguments(self, ctx:JavaParser.Type_argumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#super_suffix.
    def visitSuper_suffix(self, ctx:JavaParser.Super_suffixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#explicit_generic_invocation_suffix.
    def visitExplicit_generic_invocation_suffix(self, ctx:JavaParser.Explicit_generic_invocation_suffixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#arguments.
    def visitArguments(self, ctx:JavaParser.ArgumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#class_or_interface_type.
    def visitClass_or_interface_type(self, ctx:JavaParser.Class_or_interface_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#class_type.
    def visitClass_type(self, ctx:JavaParser.Class_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#compilation_unit.
    def visitCompilation_unit(self, ctx:JavaParser.Compilation_unitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#package_declaration.
    def visitPackage_declaration(self, ctx:JavaParser.Package_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#import_declaration.
    def visitImport_declaration(self, ctx:JavaParser.Import_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#module_declaration.
    def visitModule_declaration(self, ctx:JavaParser.Module_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_declaration.
    def visitType_declaration(self, ctx:JavaParser.Type_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#module_body.
    def visitModule_body(self, ctx:JavaParser.Module_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#module_directive.
    def visitModule_directive(self, ctx:JavaParser.Module_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#modifier.
    def visitModifier(self, ctx:JavaParser.ModifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#requires_modifier.
    def visitRequires_modifier(self, ctx:JavaParser.Requires_modifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#class_or_interface_modifier.
    def visitClass_or_interface_modifier(self, ctx:JavaParser.Class_or_interface_modifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#class_declaration.
    def visitClass_declaration(self, ctx:JavaParser.Class_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_parameters.
    def visitType_parameters(self, ctx:JavaParser.Type_parametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#class_body.
    def visitClass_body(self, ctx:JavaParser.Class_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#class_body_declaration.
    def visitClass_body_declaration(self, ctx:JavaParser.Class_body_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#member_declaration.
    def visitMember_declaration(self, ctx:JavaParser.Member_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#field_declaration.
    def visitField_declaration(self, ctx:JavaParser.Field_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#variable_declarators.
    def visitVariable_declarators(self, ctx:JavaParser.Variable_declaratorsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#variable_declarator.
    def visitVariable_declarator(self, ctx:JavaParser.Variable_declaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#variable_declarator_id.
    def visitVariable_declarator_id(self, ctx:JavaParser.Variable_declarator_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#variable_initializer.
    def visitVariable_initializer(self, ctx:JavaParser.Variable_initializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#method_declaration.
    def visitMethod_declaration(self, ctx:JavaParser.Method_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#receiver_parameter.
    def visitReceiver_parameter(self, ctx:JavaParser.Receiver_parameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#formal_parameter_list.
    def visitFormal_parameter_list(self, ctx:JavaParser.Formal_parameter_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#formal_parameters.
    def visitFormal_parameters(self, ctx:JavaParser.Formal_parametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#formal_parameter.
    def visitFormal_parameter(self, ctx:JavaParser.Formal_parameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#variable_modifier.
    def visitVariable_modifier(self, ctx:JavaParser.Variable_modifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#method_body.
    def visitMethod_body(self, ctx:JavaParser.Method_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#generic_constructor_declaration.
    def visitGeneric_constructor_declaration(self, ctx:JavaParser.Generic_constructor_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#constructor_declaration.
    def visitConstructor_declaration(self, ctx:JavaParser.Constructor_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#enum_declaration.
    def visitEnum_declaration(self, ctx:JavaParser.Enum_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#enum_constants.
    def visitEnum_constants(self, ctx:JavaParser.Enum_constantsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#enum_constant.
    def visitEnum_constant(self, ctx:JavaParser.Enum_constantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#enum_body_declarations.
    def visitEnum_body_declarations(self, ctx:JavaParser.Enum_body_declarationsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#record_declaration.
    def visitRecord_declaration(self, ctx:JavaParser.Record_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#record_header.
    def visitRecord_header(self, ctx:JavaParser.Record_headerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#record_component_list.
    def visitRecord_component_list(self, ctx:JavaParser.Record_component_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#record_component.
    def visitRecord_component(self, ctx:JavaParser.Record_componentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#record_body.
    def visitRecord_body(self, ctx:JavaParser.Record_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#compact_constructor_declaration.
    def visitCompact_constructor_declaration(self, ctx:JavaParser.Compact_constructor_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#interface_declaration.
    def visitInterface_declaration(self, ctx:JavaParser.Interface_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#interface_body.
    def visitInterface_body(self, ctx:JavaParser.Interface_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_type_or_void.
    def visitType_type_or_void(self, ctx:JavaParser.Type_type_or_voidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#generic_method_declaration.
    def visitGeneric_method_declaration(self, ctx:JavaParser.Generic_method_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#interface_body_declaration.
    def visitInterface_body_declaration(self, ctx:JavaParser.Interface_body_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#interface_member_declaration.
    def visitInterface_member_declaration(self, ctx:JavaParser.Interface_member_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#const_declaration.
    def visitConst_declaration(self, ctx:JavaParser.Const_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#constant_declarator.
    def visitConstant_declarator(self, ctx:JavaParser.Constant_declaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#interface_method_declaration.
    def visitInterface_method_declaration(self, ctx:JavaParser.Interface_method_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#interface_method_modifier.
    def visitInterface_method_modifier(self, ctx:JavaParser.Interface_method_modifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#generic_interface_method_declaration.
    def visitGeneric_interface_method_declaration(self, ctx:JavaParser.Generic_interface_method_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#interface_common_body_declaration.
    def visitInterface_common_body_declaration(self, ctx:JavaParser.Interface_common_body_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#default_value.
    def visitDefault_value(self, ctx:JavaParser.Default_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#alt_annotation_qualified_name.
    def visitAlt_annotation_qualified_name(self, ctx:JavaParser.Alt_annotation_qualified_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#annotation.
    def visitAnnotation(self, ctx:JavaParser.AnnotationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#element_value_pairs.
    def visitElement_value_pairs(self, ctx:JavaParser.Element_value_pairsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#element_value_pair.
    def visitElement_value_pair(self, ctx:JavaParser.Element_value_pairContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#element_value.
    def visitElement_value(self, ctx:JavaParser.Element_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#element_value_array_initializer.
    def visitElement_value_array_initializer(self, ctx:JavaParser.Element_value_array_initializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#annotation_type_declaration.
    def visitAnnotation_type_declaration(self, ctx:JavaParser.Annotation_type_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#annotation_type_body.
    def visitAnnotation_type_body(self, ctx:JavaParser.Annotation_type_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#annotation_type_element_declaration.
    def visitAnnotation_type_element_declaration(self, ctx:JavaParser.Annotation_type_element_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#annotation_type_element_rest.
    def visitAnnotation_type_element_rest(self, ctx:JavaParser.Annotation_type_element_restContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#annotation_method_or_constant_rest.
    def visitAnnotation_method_or_constant_rest(self, ctx:JavaParser.Annotation_method_or_constant_restContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#annotation_method_rest.
    def visitAnnotation_method_rest(self, ctx:JavaParser.Annotation_method_restContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#annotation_constant_rest.
    def visitAnnotation_constant_rest(self, ctx:JavaParser.Annotation_constant_restContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#array_initializer.
    def visitArray_initializer(self, ctx:JavaParser.Array_initializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#block.
    def visitBlock(self, ctx:JavaParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#block_statement.
    def visitBlock_statement(self, ctx:JavaParser.Block_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#local_variable_declaration.
    def visitLocal_variable_declaration(self, ctx:JavaParser.Local_variable_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#statement.
    def visitStatement(self, ctx:JavaParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#switch_rule_outcome.
    def visitSwitch_rule_outcome(self, ctx:JavaParser.Switch_rule_outcomeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#switch_block_statement_group.
    def visitSwitch_block_statement_group(self, ctx:JavaParser.Switch_block_statement_groupContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#switch_label.
    def visitSwitch_label(self, ctx:JavaParser.Switch_labelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#for_init.
    def visitFor_init(self, ctx:JavaParser.For_initContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#for_control.
    def visitFor_control(self, ctx:JavaParser.For_controlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#enhanced_for_control.
    def visitEnhanced_for_control(self, ctx:JavaParser.Enhanced_for_controlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#catch_clause.
    def visitCatch_clause(self, ctx:JavaParser.Catch_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#catch_type.
    def visitCatch_type(self, ctx:JavaParser.Catch_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#finally_block.
    def visitFinally_block(self, ctx:JavaParser.Finally_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#resource_specification.
    def visitResource_specification(self, ctx:JavaParser.Resource_specificationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#resources.
    def visitResources(self, ctx:JavaParser.ResourcesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#resource.
    def visitResource(self, ctx:JavaParser.ResourceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#pattern.
    def visitPattern(self, ctx:JavaParser.PatternContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#primary.
    def visitPrimary(self, ctx:JavaParser.PrimaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#literal.
    def visitLiteral(self, ctx:JavaParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#integer_literal.
    def visitInteger_literal(self, ctx:JavaParser.Integer_literalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#float_literal.
    def visitFloat_literal(self, ctx:JavaParser.Float_literalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#type_arguments_or_diamond.
    def visitType_arguments_or_diamond(self, ctx:JavaParser.Type_arguments_or_diamondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#expression.
    def visitExpression(self, ctx:JavaParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#switch_expression.
    def visitSwitch_expression(self, ctx:JavaParser.Switch_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#switch_labeled_rule.
    def visitSwitch_labeled_rule(self, ctx:JavaParser.Switch_labeled_ruleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#qualified_name_list.
    def visitQualified_name_list(self, ctx:JavaParser.Qualified_name_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#last_formal_parameter.
    def visitLast_formal_parameter(self, ctx:JavaParser.Last_formal_parameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#qualified_name.
    def visitQualified_name(self, ctx:JavaParser.Qualified_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#local_type_declaration.
    def visitLocal_type_declaration(self, ctx:JavaParser.Local_type_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#par_expression.
    def visitPar_expression(self, ctx:JavaParser.Par_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#expression_list.
    def visitExpression_list(self, ctx:JavaParser.Expression_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#method_call.
    def visitMethod_call(self, ctx:JavaParser.Method_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#guarded_pattern.
    def visitGuarded_pattern(self, ctx:JavaParser.Guarded_patternContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#creator.
    def visitCreator(self, ctx:JavaParser.CreatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#created_name.
    def visitCreated_name(self, ctx:JavaParser.Created_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#inner_creator.
    def visitInner_creator(self, ctx:JavaParser.Inner_creatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#array_creator_rest.
    def visitArray_creator_rest(self, ctx:JavaParser.Array_creator_restContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#class_creator_rest.
    def visitClass_creator_rest(self, ctx:JavaParser.Class_creator_restContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JavaParser#explicit_generic_invocation.
    def visitExplicit_generic_invocation(self, ctx:JavaParser.Explicit_generic_invocationContext):
        return self.visitChildren(ctx)



del JavaParser