// Generated from /Users/NishantRoshan/Downloads/milestone1/src/JavaParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, MODULE=51, OPEN=52, REQUIRES=53, EXPORTS=54, OPENS=55, TO=56, 
		USES=57, PROVIDES=58, WITH=59, TRANSITIVE=60, VAR=61, YIELD=62, RECORD=63, 
		SEALED=64, PERMITS=65, NON_SEALED=66, SEMI=67, COMMA=68, DOT=69, PAREN_S=70, 
		PAREN_E=71, BLOCK_S=72, BLOCK_E=73, ARRAY_S=74, ARRAY_E=75, DECIMAL_LITERAL=76, 
		HEX_LITERAL=77, OCT_LITERAL=78, BINARY_LITERAL=79, FLOAT_LITERAL=80, HEX_FLOAT_LITERAL=81, 
		BOOL_LITERAL=82, CHAR_LITERAL=83, STRING_LITERAL=84, TEXT_BLOCK=85, NULL_LITERAL=86, 
		WS=87, COMMENT=88, LINE_COMMENT=89, ASSIGN=90, GT=91, LT=92, LOG_NOT=93, 
		TILDE=94, QUESTION=95, COLON=96, EQUAL=97, LE=98, GE=99, NOTEQUAL=100, 
		LOG_AND=101, LOG_OR=102, UNN_INC=103, UNN_DEC=104, ADD=105, SUB=106, MUL=107, 
		DIV=108, BITAND=109, BITOR=110, CARET=111, MOD=112, ADD_ASS=113, SUB_ASS=114, 
		MUL_ASS=115, DIV_ASS=116, AND_ASS=117, OR_ASS=118, XOR_ASS=119, MOD_ASS=120, 
		LSHIFT_ASS=121, RSHIFT_ASS=122, URSHIFT_ASS=123, ARROW=124, COLONCOLON=125, 
		AT=126, ELLIPSIS=127, IDENTIFIER=128;
	public static final int
		RULE_identifier = 0, RULE_type_identifier = 1, RULE_non_wild_card_type_arguments_or_diamond = 2, 
		RULE_non_wildcard_type_arguments = 3, RULE_type_list = 4, RULE_type_type = 5, 
		RULE_primitive_type = 6, RULE_type_parameter = 7, RULE_type_bound = 8, 
		RULE_type_argument = 9, RULE_type_arguments = 10, RULE_super_suffix = 11, 
		RULE_explicit_generic_invocation_suffix = 12, RULE_arguments = 13, RULE_class_or_interface_type = 14, 
		RULE_class_type = 15, RULE_compilation_unit = 16, RULE_package_declaration = 17, 
		RULE_import_declaration = 18, RULE_module_declaration = 19, RULE_type_declaration = 20, 
		RULE_module_body = 21, RULE_module_directive = 22, RULE_modifier = 23, 
		RULE_requires_modifier = 24, RULE_class_or_interface_modifier = 25, RULE_class_declaration = 26, 
		RULE_type_parameters = 27, RULE_class_body = 28, RULE_class_body_declaration = 29, 
		RULE_member_declaration = 30, RULE_field_declaration = 31, RULE_variable_declarators = 32, 
		RULE_variable_declarator = 33, RULE_variable_declarator_id = 34, RULE_variable_initializer = 35, 
		RULE_method_declaration = 36, RULE_receiver_parameter = 37, RULE_formal_parameter_list = 38, 
		RULE_formal_parameters = 39, RULE_formal_parameter = 40, RULE_variable_modifier = 41, 
		RULE_method_body = 42, RULE_generic_constructor_declaration = 43, RULE_constructor_declaration = 44, 
		RULE_enum_declaration = 45, RULE_enum_constants = 46, RULE_enum_constant = 47, 
		RULE_enum_body_declarations = 48, RULE_record_declaration = 49, RULE_record_header = 50, 
		RULE_record_component_list = 51, RULE_record_component = 52, RULE_record_body = 53, 
		RULE_compact_constructor_declaration = 54, RULE_interface_declaration = 55, 
		RULE_interface_body = 56, RULE_type_type_or_void = 57, RULE_generic_method_declaration = 58, 
		RULE_interface_body_declaration = 59, RULE_interface_member_declaration = 60, 
		RULE_const_declaration = 61, RULE_constant_declarator = 62, RULE_interface_method_declaration = 63, 
		RULE_interface_method_modifier = 64, RULE_generic_interface_method_declaration = 65, 
		RULE_interface_common_body_declaration = 66, RULE_default_value = 67, 
		RULE_alt_annotation_qualified_name = 68, RULE_annotation = 69, RULE_element_value_pairs = 70, 
		RULE_element_value_pair = 71, RULE_element_value = 72, RULE_element_value_array_initializer = 73, 
		RULE_annotation_type_declaration = 74, RULE_annotation_type_body = 75, 
		RULE_annotation_type_element_declaration = 76, RULE_annotation_type_element_rest = 77, 
		RULE_annotation_method_or_constant_rest = 78, RULE_annotation_method_rest = 79, 
		RULE_annotation_constant_rest = 80, RULE_array_initializer = 81, RULE_block = 82, 
		RULE_block_statement = 83, RULE_local_variable_declaration = 84, RULE_statement = 85, 
		RULE_switch_rule_outcome = 86, RULE_switch_block_statement_group = 87, 
		RULE_switch_label = 88, RULE_for_init = 89, RULE_for_control = 90, RULE_enhanced_for_control = 91, 
		RULE_catch_clause = 92, RULE_catch_type = 93, RULE_finally_block = 94, 
		RULE_resource_specification = 95, RULE_resources = 96, RULE_resource = 97, 
		RULE_pattern = 98, RULE_primary = 99, RULE_literal = 100, RULE_integer_literal = 101, 
		RULE_float_literal = 102, RULE_type_arguments_or_diamond = 103, RULE_expression = 104, 
		RULE_switch_expression = 105, RULE_switch_labeled_rule = 106, RULE_qualified_name_list = 107, 
		RULE_last_formal_parameter = 108, RULE_qualified_name = 109, RULE_local_type_declaration = 110, 
		RULE_par_expression = 111, RULE_expression_list = 112, RULE_method_call = 113, 
		RULE_guarded_pattern = 114, RULE_creator = 115, RULE_created_name = 116, 
		RULE_inner_creator = 117, RULE_array_creator_rest = 118, RULE_class_creator_rest = 119, 
		RULE_explicit_generic_invocation = 120;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "type_identifier", "non_wild_card_type_arguments_or_diamond", 
			"non_wildcard_type_arguments", "type_list", "type_type", "primitive_type", 
			"type_parameter", "type_bound", "type_argument", "type_arguments", "super_suffix", 
			"explicit_generic_invocation_suffix", "arguments", "class_or_interface_type", 
			"class_type", "compilation_unit", "package_declaration", "import_declaration", 
			"module_declaration", "type_declaration", "module_body", "module_directive", 
			"modifier", "requires_modifier", "class_or_interface_modifier", "class_declaration", 
			"type_parameters", "class_body", "class_body_declaration", "member_declaration", 
			"field_declaration", "variable_declarators", "variable_declarator", "variable_declarator_id", 
			"variable_initializer", "method_declaration", "receiver_parameter", "formal_parameter_list", 
			"formal_parameters", "formal_parameter", "variable_modifier", "method_body", 
			"generic_constructor_declaration", "constructor_declaration", "enum_declaration", 
			"enum_constants", "enum_constant", "enum_body_declarations", "record_declaration", 
			"record_header", "record_component_list", "record_component", "record_body", 
			"compact_constructor_declaration", "interface_declaration", "interface_body", 
			"type_type_or_void", "generic_method_declaration", "interface_body_declaration", 
			"interface_member_declaration", "const_declaration", "constant_declarator", 
			"interface_method_declaration", "interface_method_modifier", "generic_interface_method_declaration", 
			"interface_common_body_declaration", "default_value", "alt_annotation_qualified_name", 
			"annotation", "element_value_pairs", "element_value_pair", "element_value", 
			"element_value_array_initializer", "annotation_type_declaration", "annotation_type_body", 
			"annotation_type_element_declaration", "annotation_type_element_rest", 
			"annotation_method_or_constant_rest", "annotation_method_rest", "annotation_constant_rest", 
			"array_initializer", "block", "block_statement", "local_variable_declaration", 
			"statement", "switch_rule_outcome", "switch_block_statement_group", "switch_label", 
			"for_init", "for_control", "enhanced_for_control", "catch_clause", "catch_type", 
			"finally_block", "resource_specification", "resources", "resource", "pattern", 
			"primary", "literal", "integer_literal", "float_literal", "type_arguments_or_diamond", 
			"expression", "switch_expression", "switch_labeled_rule", "qualified_name_list", 
			"last_formal_parameter", "qualified_name", "local_type_declaration", 
			"par_expression", "expression_list", "method_call", "guarded_pattern", 
			"creator", "created_name", "inner_creator", "array_creator_rest", "class_creator_rest", 
			"explicit_generic_invocation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'module'", 
			"'open'", "'requires'", "'exports'", "'opens'", "'to'", "'uses'", "'provides'", 
			"'with'", "'transitive'", "'var'", "'yield'", "'record'", "'sealed'", 
			"'permits'", "'non-sealed'", "';'", "','", "'.'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", null, null, null, null, null, null, null, null, 
			null, null, "'null'", null, null, null, "'='", "'>'", "'<'", "'!'", "'~'", 
			"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
			"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'>>>='", "'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "MODULE", 
			"OPEN", "REQUIRES", "EXPORTS", "OPENS", "TO", "USES", "PROVIDES", "WITH", 
			"TRANSITIVE", "VAR", "YIELD", "RECORD", "SEALED", "PERMITS", "NON_SEALED", 
			"SEMI", "COMMA", "DOT", "PAREN_S", "PAREN_E", "BLOCK_S", "BLOCK_E", "ARRAY_S", 
			"ARRAY_E", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", 
			"FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
			"STRING_LITERAL", "TEXT_BLOCK", "NULL_LITERAL", "WS", "COMMENT", "LINE_COMMENT", 
			"ASSIGN", "GT", "LT", "LOG_NOT", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "LOG_AND", "LOG_OR", "UNN_INC", "UNN_DEC", "ADD", 
			"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASS", "SUB_ASS", 
			"MUL_ASS", "DIV_ASS", "AND_ASS", "OR_ASS", "XOR_ASS", "MOD_ASS", "LSHIFT_ASS", 
			"RSHIFT_ASS", "URSHIFT_ASS", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", 
			"IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode YIELD() { return getToken(JavaParser.YIELD, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_identifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_wild_card_type_arguments_or_diamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public Non_wildcard_type_argumentsContext non_wildcard_type_arguments() {
			return getRuleContext(Non_wildcard_type_argumentsContext.class,0);
		}
		public Non_wild_card_type_arguments_or_diamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_wild_card_type_arguments_or_diamond; }
	}

	public final Non_wild_card_type_arguments_or_diamondContext non_wild_card_type_arguments_or_diamond() throws RecognitionException {
		Non_wild_card_type_arguments_or_diamondContext _localctx = new Non_wild_card_type_arguments_or_diamondContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_non_wild_card_type_arguments_or_diamond);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(LT);
				setState(247);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				non_wildcard_type_arguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_wildcard_type_argumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public Non_wildcard_type_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_wildcard_type_arguments; }
	}

	public final Non_wildcard_type_argumentsContext non_wildcard_type_arguments() throws RecognitionException {
		Non_wildcard_type_argumentsContext _localctx = new Non_wildcard_type_argumentsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_non_wildcard_type_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LT);
			setState(252);
			type_list();
			setState(253);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_listContext extends ParserRuleContext {
		public List<Type_typeContext> type_type() {
			return getRuleContexts(Type_typeContext.class);
		}
		public Type_typeContext type_type(int i) {
			return getRuleContext(Type_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_list; }
	}

	public final Type_listContext type_list() throws RecognitionException {
		Type_listContext _localctx = new Type_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			type_type();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				type_type();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_typeContext extends ParserRuleContext {
		public Class_or_interface_typeContext class_or_interface_type() {
			return getRuleContext(Class_or_interface_typeContext.class,0);
		}
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> ARRAY_S() { return getTokens(JavaParser.ARRAY_S); }
		public TerminalNode ARRAY_S(int i) {
			return getToken(JavaParser.ARRAY_S, i);
		}
		public List<TerminalNode> ARRAY_E() { return getTokens(JavaParser.ARRAY_E); }
		public TerminalNode ARRAY_E(int i) {
			return getToken(JavaParser.ARRAY_E, i);
		}
		public Type_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_type; }
	}

	public final Type_typeContext type_type() throws RecognitionException {
		Type_typeContext _localctx = new Type_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					annotation();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				{
				setState(269);
				class_or_interface_type();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(270);
				primitive_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
						{
						{
						setState(273);
						annotation();
						}
						}
						setState(278);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(279);
					match(ARRAY_S);
					setState(280);
					match(ARRAY_E);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public Type_boundContext type_bound() {
			return getRuleContext(Type_boundContext.class,0);
		}
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_parameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					annotation();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(294);
			identifier();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(295);
				match(EXTENDS);
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(296);
						annotation();
						}
						} 
					}
					setState(301);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(302);
				type_bound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_boundContext extends ParserRuleContext {
		public List<Type_typeContext> type_type() {
			return getRuleContexts(Type_typeContext.class);
		}
		public Type_typeContext type_type(int i) {
			return getRuleContext(Type_typeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public Type_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_bound; }
	}

	public final Type_boundContext type_bound() throws RecognitionException {
		Type_boundContext _localctx = new Type_boundContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_bound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			type_type();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(306);
				match(BITAND);
				setState(307);
				type_type();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_argumentContext extends ParserRuleContext {
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public Type_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument; }
	}

	public final Type_argumentContext type_argument() throws RecognitionException {
		Type_argumentContext _localctx = new Type_argumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_argument);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				type_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(314);
					annotation();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				match(QUESTION);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(321);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(322);
					type_type();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_argumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<Type_argumentContext> type_argument() {
			return getRuleContexts(Type_argumentContext.class);
		}
		public Type_argumentContext type_argument(int i) {
			return getRuleContext(Type_argumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Type_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_arguments; }
	}

	public final Type_argumentsContext type_arguments() throws RecognitionException {
		Type_argumentsContext _localctx = new Type_argumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(LT);
			setState(328);
			type_argument();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(330);
				type_argument();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Super_suffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argumentsContext type_arguments() {
			return getRuleContext(Type_argumentsContext.class,0);
		}
		public Super_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_super_suffix; }
	}

	public final Super_suffixContext super_suffix() throws RecognitionException {
		Super_suffixContext _localctx = new Super_suffixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_super_suffix);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_S:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(DOT);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(340);
					type_arguments();
					}
				}

				setState(343);
				identifier();
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(344);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_generic_invocation_suffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public Super_suffixContext super_suffix() {
			return getRuleContext(Super_suffixContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Explicit_generic_invocation_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_generic_invocation_suffix; }
	}

	public final Explicit_generic_invocation_suffixContext explicit_generic_invocation_suffix() throws RecognitionException {
		Explicit_generic_invocation_suffixContext _localctx = new Explicit_generic_invocation_suffixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_explicit_generic_invocation_suffix);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(SUPER);
				setState(350);
				super_suffix();
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				identifier();
				setState(352);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(PAREN_S);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PAREN_S - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (OCT_LITERAL - 70)) | (1L << (BINARY_LITERAL - 70)) | (1L << (FLOAT_LITERAL - 70)) | (1L << (HEX_FLOAT_LITERAL - 70)) | (1L << (BOOL_LITERAL - 70)) | (1L << (CHAR_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (TEXT_BLOCK - 70)) | (1L << (NULL_LITERAL - 70)) | (1L << (LT - 70)) | (1L << (LOG_NOT - 70)) | (1L << (TILDE - 70)) | (1L << (UNN_INC - 70)) | (1L << (UNN_DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(357);
				expression_list();
				}
			}

			setState(360);
			match(PAREN_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_or_interface_typeContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public List<Type_argumentsContext> type_arguments() {
			return getRuleContexts(Type_argumentsContext.class);
		}
		public Type_argumentsContext type_arguments(int i) {
			return getRuleContext(Type_argumentsContext.class,i);
		}
		public Class_or_interface_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_or_interface_type; }
	}

	public final Class_or_interface_typeContext class_or_interface_type() throws RecognitionException {
		Class_or_interface_typeContext _localctx = new Class_or_interface_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_class_or_interface_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					identifier();
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(363);
						type_arguments();
						}
					}

					setState(366);
					match(DOT);
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(373);
			type_identifier();
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(374);
				type_arguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_typeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_or_interface_typeContext class_or_interface_type() {
			return getRuleContext(Class_or_interface_typeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Type_argumentsContext type_arguments() {
			return getRuleContext(Type_argumentsContext.class,0);
		}
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_class_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(377);
				class_or_interface_type();
				setState(378);
				match(DOT);
				}
				break;
			}
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					annotation();
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(388);
			identifier();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(389);
				type_arguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class,0);
		}
		public List<Import_declarationContext> import_declaration() {
			return getRuleContexts(Import_declarationContext.class);
		}
		public Import_declarationContext import_declaration(int i) {
			return getRuleContext(Import_declarationContext.class,i);
		}
		public List<Type_declarationContext> type_declaration() {
			return getRuleContexts(Type_declarationContext.class);
		}
		public Type_declarationContext type_declaration(int i) {
			return getRuleContext(Type_declarationContext.class,i);
		}
		public Module_declarationContext module_declaration() {
			return getRuleContext(Module_declarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compilation_unit);
		int _la;
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(392);
					package_declaration();
					}
					break;
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
					{
					setState(395);
					import_declaration();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (CLASS - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (INTERFACE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(401);
					type_declaration();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				module_declaration();
				setState(408);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_declarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Package_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declaration; }
	}

	public final Package_declarationContext package_declaration() throws RecognitionException {
		Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_package_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(412);
				annotation();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(PACKAGE);
			setState(419);
			qualified_name();
			setState(420);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_declarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(IMPORT);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(423);
				match(STATIC);
				}
			}

			setState(426);
			qualified_name();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(427);
				match(DOT);
				setState(428);
				match(MUL);
				}
			}

			setState(431);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_declarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Module_bodyContext module_body() {
			return getRuleContext(Module_bodyContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public Module_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_declaration; }
	}

	public final Module_declarationContext module_declaration() throws RecognitionException {
		Module_declarationContext _localctx = new Module_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_module_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(433);
				match(OPEN);
				}
			}

			setState(436);
			match(MODULE);
			setState(437);
			qualified_name();
			setState(438);
			module_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declarationContext extends ParserRuleContext {
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Annotation_type_declarationContext annotation_type_declaration() {
			return getRuleContext(Annotation_type_declarationContext.class,0);
		}
		public Record_declarationContext record_declaration() {
			return getRuleContext(Record_declarationContext.class,0);
		}
		public List<Class_or_interface_modifierContext> class_or_interface_modifier() {
			return getRuleContexts(Class_or_interface_modifierContext.class);
		}
		public Class_or_interface_modifierContext class_or_interface_modifier(int i) {
			return getRuleContext(Class_or_interface_modifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_declaration);
		try {
			int _alt;
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(440);
						class_or_interface_modifier();
						}
						} 
					}
					setState(445);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(451);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(446);
					class_declaration();
					}
					break;
				case ENUM:
					{
					setState(447);
					enum_declaration();
					}
					break;
				case INTERFACE:
					{
					setState(448);
					interface_declaration();
					}
					break;
				case AT:
					{
					setState(449);
					annotation_type_declaration();
					}
					break;
				case RECORD:
					{
					setState(450);
					record_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_bodyContext extends ParserRuleContext {
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public List<Module_directiveContext> module_directive() {
			return getRuleContexts(Module_directiveContext.class);
		}
		public Module_directiveContext module_directive(int i) {
			return getRuleContext(Module_directiveContext.class,i);
		}
		public Module_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_body; }
	}

	public final Module_bodyContext module_body() throws RecognitionException {
		Module_bodyContext _localctx = new Module_bodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_module_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(BLOCK_S);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << USES) | (1L << PROVIDES))) != 0)) {
				{
				{
				setState(457);
				module_directive();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			match(BLOCK_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_directiveContext extends ParserRuleContext {
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public List<Qualified_nameContext> qualified_name() {
			return getRuleContexts(Qualified_nameContext.class);
		}
		public Qualified_nameContext qualified_name(int i) {
			return getRuleContext(Qualified_nameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<Requires_modifierContext> requires_modifier() {
			return getRuleContexts(Requires_modifierContext.class);
		}
		public Requires_modifierContext requires_modifier(int i) {
			return getRuleContext(Requires_modifierContext.class,i);
		}
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public Module_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_directive; }
	}

	public final Module_directiveContext module_directive() throws RecognitionException {
		Module_directiveContext _localctx = new Module_directiveContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_module_directive);
		int _la;
		try {
			int _alt;
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRES:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(REQUIRES);
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(466);
						requires_modifier();
						}
						} 
					}
					setState(471);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(472);
				qualified_name();
				setState(473);
				match(SEMI);
				}
				break;
			case EXPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(EXPORTS);
				setState(476);
				qualified_name();
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(477);
					match(TO);
					setState(478);
					qualified_name();
					}
				}

				setState(481);
				match(SEMI);
				}
				break;
			case OPENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(OPENS);
				setState(484);
				qualified_name();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(485);
					match(TO);
					setState(486);
					qualified_name();
					}
				}

				setState(489);
				match(SEMI);
				}
				break;
			case USES:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				match(USES);
				setState(492);
				qualified_name();
				setState(493);
				match(SEMI);
				}
				break;
			case PROVIDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(495);
				match(PROVIDES);
				setState(496);
				qualified_name();
				setState(497);
				match(WITH);
				setState(498);
				qualified_name();
				setState(499);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public Class_or_interface_modifierContext class_or_interface_modifier() {
			return getRuleContext(Class_or_interface_modifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifier);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				class_or_interface_modifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(507);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requires_modifierContext extends ParserRuleContext {
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public Requires_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requires_modifier; }
	}

	public final Requires_modifierContext requires_modifier() throws RecognitionException {
		Requires_modifierContext _localctx = new Requires_modifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_requires_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !(_la==STATIC || _la==TRANSITIVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_or_interface_modifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode NON_SEALED() { return getToken(JavaParser.NON_SEALED, 0); }
		public Class_or_interface_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_or_interface_modifier; }
	}

	public final Class_or_interface_modifierContext class_or_interface_modifier() throws RecognitionException {
		Class_or_interface_modifierContext _localctx = new Class_or_interface_modifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_class_or_interface_modifier);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(PUBLIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				match(PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				match(PRIVATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(516);
				match(STATIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(517);
				match(ABSTRACT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(518);
				match(FINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(519);
				match(STRICTFP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(520);
				match(SEALED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(521);
				match(NON_SEALED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public List<Type_listContext> type_list() {
			return getRuleContexts(Type_listContext.class);
		}
		public Type_listContext type_list(int i) {
			return getRuleContext(Type_listContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(CLASS);
			setState(525);
			identifier();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(526);
				type_parameters();
				}
			}

			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(529);
				match(EXTENDS);
				setState(530);
				type_type();
				}
			}

			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(533);
				match(IMPLEMENTS);
				setState(534);
				type_list();
				}
			}

			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(537);
				match(PERMITS);
				setState(538);
				type_list();
				}
			}

			setState(541);
			class_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<Type_parameterContext> type_parameter() {
			return getRuleContexts(Type_parameterContext.class);
		}
		public Type_parameterContext type_parameter(int i) {
			return getRuleContext(Type_parameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Type_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameters; }
	}

	public final Type_parametersContext type_parameters() throws RecognitionException {
		Type_parametersContext _localctx = new Type_parametersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(LT);
			setState(544);
			type_parameter();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(545);
				match(COMMA);
				setState(546);
				type_parameter();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public List<Class_body_declarationContext> class_body_declaration() {
			return getRuleContexts(Class_body_declarationContext.class);
		}
		public Class_body_declarationContext class_body_declaration(int i) {
			return getRuleContext(Class_body_declarationContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(BLOCK_S);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (BLOCK_S - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(555);
				class_body_declaration();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(BLOCK_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_body_declarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public Member_declarationContext member_declaration() {
			return getRuleContext(Member_declarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Class_body_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body_declaration; }
	}

	public final Class_body_declarationContext class_body_declaration() throws RecognitionException {
		Class_body_declarationContext _localctx = new Class_body_declarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_class_body_declaration);
		int _la;
		try {
			int _alt;
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(564);
					match(STATIC);
					}
				}

				setState(567);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(568);
						modifier();
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(574);
				member_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_declarationContext extends ParserRuleContext {
		public Record_declarationContext record_declaration() {
			return getRuleContext(Record_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Generic_method_declarationContext generic_method_declaration() {
			return getRuleContext(Generic_method_declarationContext.class,0);
		}
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public Generic_constructor_declarationContext generic_constructor_declaration() {
			return getRuleContext(Generic_constructor_declarationContext.class,0);
		}
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Annotation_type_declarationContext annotation_type_declaration() {
			return getRuleContext(Annotation_type_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declaration; }
	}

	public final Member_declarationContext member_declaration() throws RecognitionException {
		Member_declarationContext _localctx = new Member_declarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_member_declaration);
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				record_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				generic_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				field_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(581);
				constructor_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				generic_constructor_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(583);
				interface_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(584);
				annotation_type_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(585);
				class_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(586);
				enum_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declarationContext extends ParserRuleContext {
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			type_type();
			setState(590);
			variable_declarators();
			setState(591);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaratorsContext extends ParserRuleContext {
		public List<Variable_declaratorContext> variable_declarator() {
			return getRuleContexts(Variable_declaratorContext.class);
		}
		public Variable_declaratorContext variable_declarator(int i) {
			return getRuleContext(Variable_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Variable_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarators; }
	}

	public final Variable_declaratorsContext variable_declarators() throws RecognitionException {
		Variable_declaratorsContext _localctx = new Variable_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			variable_declarator();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(594);
				match(COMMA);
				setState(595);
				variable_declarator();
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaratorContext extends ParserRuleContext {
		public Variable_declarator_idContext variable_declarator_id() {
			return getRuleContext(Variable_declarator_idContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator; }
	}

	public final Variable_declaratorContext variable_declarator() throws RecognitionException {
		Variable_declaratorContext _localctx = new Variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			variable_declarator_id();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(602);
				match(ASSIGN);
				setState(603);
				variable_initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarator_idContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> ARRAY_S() { return getTokens(JavaParser.ARRAY_S); }
		public TerminalNode ARRAY_S(int i) {
			return getToken(JavaParser.ARRAY_S, i);
		}
		public List<TerminalNode> ARRAY_E() { return getTokens(JavaParser.ARRAY_E); }
		public TerminalNode ARRAY_E(int i) {
			return getToken(JavaParser.ARRAY_E, i);
		}
		public Variable_declarator_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator_id; }
	}

	public final Variable_declarator_idContext variable_declarator_id() throws RecognitionException {
		Variable_declarator_idContext _localctx = new Variable_declarator_idContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variable_declarator_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			identifier();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_S) {
				{
				{
				setState(607);
				match(ARRAY_S);
				setState(608);
				match(ARRAY_E);
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_initializerContext extends ParserRuleContext {
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initializer; }
	}

	public final Variable_initializerContext variable_initializer() throws RecognitionException {
		Variable_initializerContext _localctx = new Variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variable_initializer);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_S:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				array_initializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case PAREN_S:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LT:
			case LOG_NOT:
			case TILDE:
			case UNN_INC:
			case UNN_DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Type_type_or_voidContext type_type_or_void() {
			return getRuleContext(Type_type_or_voidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Formal_parametersContext formal_parameters() {
			return getRuleContext(Formal_parametersContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public List<TerminalNode> ARRAY_S() { return getTokens(JavaParser.ARRAY_S); }
		public TerminalNode ARRAY_S(int i) {
			return getToken(JavaParser.ARRAY_S, i);
		}
		public List<TerminalNode> ARRAY_E() { return getTokens(JavaParser.ARRAY_E); }
		public TerminalNode ARRAY_E(int i) {
			return getToken(JavaParser.ARRAY_E, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public Qualified_name_listContext qualified_name_list() {
			return getRuleContext(Qualified_name_listContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			type_type_or_void();
			setState(619);
			identifier();
			setState(620);
			formal_parameters();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_S) {
				{
				{
				setState(621);
				match(ARRAY_S);
				setState(622);
				match(ARRAY_E);
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(628);
				match(THROWS);
				setState(629);
				qualified_name_list();
				}
			}

			setState(632);
			method_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Receiver_parameterContext extends ParserRuleContext {
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public Receiver_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver_parameter; }
	}

	public final Receiver_parameterContext receiver_parameter() throws RecognitionException {
		Receiver_parameterContext _localctx = new Receiver_parameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_receiver_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			type_type();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(635);
				identifier();
				setState(636);
				match(DOT);
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(643);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_parameter_listContext extends ParserRuleContext {
		public List<Formal_parameterContext> formal_parameter() {
			return getRuleContexts(Formal_parameterContext.class);
		}
		public Formal_parameterContext formal_parameter(int i) {
			return getRuleContext(Formal_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Last_formal_parameterContext last_formal_parameter() {
			return getRuleContext(Last_formal_parameterContext.class,0);
		}
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_formal_parameter_list);
		int _la;
		try {
			int _alt;
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				formal_parameter();
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(646);
						match(COMMA);
						setState(647);
						formal_parameter();
						}
						} 
					}
					setState(652);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(653);
					match(COMMA);
					setState(654);
					last_formal_parameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				last_formal_parameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_parametersContext extends ParserRuleContext {
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public Receiver_parameterContext receiver_parameter() {
			return getRuleContext(Receiver_parameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Formal_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameters; }
	}

	public final Formal_parametersContext formal_parameters() throws RecognitionException {
		Formal_parametersContext _localctx = new Formal_parametersContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_formal_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(PAREN_S);
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(661);
					receiver_parameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(664);
				receiver_parameter();
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(665);
					match(COMMA);
					setState(666);
					formal_parameter_list();
					}
				}

				}
				break;
			case 3:
				{
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(669);
					formal_parameter_list();
					}
				}

				}
				break;
			}
			setState(674);
			match(PAREN_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_parameterContext extends ParserRuleContext {
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public Variable_declarator_idContext variable_declarator_id() {
			return getRuleContext(Variable_declarator_idContext.class,0);
		}
		public List<Variable_modifierContext> variable_modifier() {
			return getRuleContexts(Variable_modifierContext.class);
		}
		public Variable_modifierContext variable_modifier(int i) {
			return getRuleContext(Variable_modifierContext.class,i);
		}
		public Formal_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter; }
	}

	public final Formal_parameterContext formal_parameter() throws RecognitionException {
		Formal_parameterContext _localctx = new Formal_parameterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_formal_parameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(676);
					variable_modifier();
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(682);
			type_type();
			setState(683);
			variable_declarator_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_modifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public Variable_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_modifier; }
	}

	public final Variable_modifierContext variable_modifier() throws RecognitionException {
		Variable_modifierContext _localctx = new Variable_modifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variable_modifier);
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				match(FINAL);
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_method_body);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_S:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_constructor_declarationContext extends ParserRuleContext {
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public Generic_constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_constructor_declaration; }
	}

	public final Generic_constructor_declarationContext generic_constructor_declaration() throws RecognitionException {
		Generic_constructor_declarationContext _localctx = new Generic_constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_generic_constructor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			type_parameters();
			setState(694);
			constructor_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_declarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Formal_parametersContext formal_parameters() {
			return getRuleContext(Formal_parametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public Qualified_name_listContext qualified_name_list() {
			return getRuleContext(Qualified_name_listContext.class,0);
		}
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			identifier();
			setState(697);
			formal_parameters();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(698);
				match(THROWS);
				setState(699);
				qualified_name_list();
				}
			}

			setState(702);
			((Constructor_declarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Enum_constantsContext enum_constants() {
			return getRuleContext(Enum_constantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public Enum_body_declarationsContext enum_body_declarations() {
			return getRuleContext(Enum_body_declarationsContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_enum_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(ENUM);
			setState(705);
			identifier();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(706);
				match(IMPLEMENTS);
				setState(707);
				type_list();
				}
			}

			setState(710);
			match(BLOCK_S);
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(711);
				enum_constants();
				}
			}

			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(714);
				match(COMMA);
				}
			}

			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(717);
				enum_body_declarations();
				}
			}

			setState(720);
			match(BLOCK_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_constantsContext extends ParserRuleContext {
		public List<Enum_constantContext> enum_constant() {
			return getRuleContexts(Enum_constantContext.class);
		}
		public Enum_constantContext enum_constant(int i) {
			return getRuleContext(Enum_constantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Enum_constantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_constants; }
	}

	public final Enum_constantsContext enum_constants() throws RecognitionException {
		Enum_constantsContext _localctx = new Enum_constantsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enum_constants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			enum_constant();
			setState(727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(723);
					match(COMMA);
					setState(724);
					enum_constant();
					}
					} 
				}
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_constantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Enum_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_constant; }
	}

	public final Enum_constantContext enum_constant() throws RecognitionException {
		Enum_constantContext _localctx = new Enum_constantContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_enum_constant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(730);
					annotation();
					}
					} 
				}
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(736);
			identifier();
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_S) {
				{
				setState(737);
				arguments();
				}
			}

			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BLOCK_S) {
				{
				setState(740);
				class_body();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_body_declarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<Class_body_declarationContext> class_body_declaration() {
			return getRuleContexts(Class_body_declarationContext.class);
		}
		public Class_body_declarationContext class_body_declaration(int i) {
			return getRuleContext(Class_body_declarationContext.class,i);
		}
		public Enum_body_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_body_declarations; }
	}

	public final Enum_body_declarationsContext enum_body_declarations() throws RecognitionException {
		Enum_body_declarationsContext _localctx = new Enum_body_declarationsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enum_body_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(SEMI);
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (BLOCK_S - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(744);
				class_body_declaration();
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_declarationContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Record_headerContext record_header() {
			return getRuleContext(Record_headerContext.class,0);
		}
		public Record_bodyContext record_body() {
			return getRuleContext(Record_bodyContext.class,0);
		}
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Record_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_declaration; }
	}

	public final Record_declarationContext record_declaration() throws RecognitionException {
		Record_declarationContext _localctx = new Record_declarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_record_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(RECORD);
			setState(751);
			identifier();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(752);
				type_parameters();
				}
			}

			setState(755);
			record_header();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(756);
				match(IMPLEMENTS);
				setState(757);
				type_list();
				}
			}

			setState(760);
			record_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_headerContext extends ParserRuleContext {
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public Record_component_listContext record_component_list() {
			return getRuleContext(Record_component_listContext.class,0);
		}
		public Record_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_header; }
	}

	public final Record_headerContext record_header() throws RecognitionException {
		Record_headerContext _localctx = new Record_headerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_record_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(PAREN_S);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(763);
				record_component_list();
				}
			}

			setState(766);
			match(PAREN_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_component_listContext extends ParserRuleContext {
		public List<Record_componentContext> record_component() {
			return getRuleContexts(Record_componentContext.class);
		}
		public Record_componentContext record_component(int i) {
			return getRuleContext(Record_componentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Record_component_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_component_list; }
	}

	public final Record_component_listContext record_component_list() throws RecognitionException {
		Record_component_listContext _localctx = new Record_component_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_record_component_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			record_component();
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(769);
				match(COMMA);
				setState(770);
				record_component();
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_componentContext extends ParserRuleContext {
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Record_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_component; }
	}

	public final Record_componentContext record_component() throws RecognitionException {
		Record_componentContext _localctx = new Record_componentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_record_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			type_type();
			setState(777);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_bodyContext extends ParserRuleContext {
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public List<Class_body_declarationContext> class_body_declaration() {
			return getRuleContexts(Class_body_declarationContext.class);
		}
		public Class_body_declarationContext class_body_declaration(int i) {
			return getRuleContext(Class_body_declarationContext.class,i);
		}
		public List<Compact_constructor_declarationContext> compact_constructor_declaration() {
			return getRuleContexts(Compact_constructor_declarationContext.class);
		}
		public Compact_constructor_declarationContext compact_constructor_declaration(int i) {
			return getRuleContext(Compact_constructor_declarationContext.class,i);
		}
		public Record_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_body; }
	}

	public final Record_bodyContext record_body() throws RecognitionException {
		Record_bodyContext _localctx = new Record_bodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_record_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(BLOCK_S);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (BLOCK_S - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(780);
					class_body_declaration();
					}
					break;
				case 2:
					{
					setState(781);
					compact_constructor_declaration();
					}
					break;
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(787);
			match(BLOCK_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compact_constructor_declarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Compact_constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compact_constructor_declaration; }
	}

	public final Compact_constructor_declarationContext compact_constructor_declaration() throws RecognitionException {
		Compact_constructor_declarationContext _localctx = new Compact_constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_compact_constructor_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(789);
					modifier();
					}
					} 
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(795);
			identifier();
			setState(796);
			((Compact_constructor_declarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_declarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public List<Type_listContext> type_list() {
			return getRuleContexts(Type_listContext.class);
		}
		public Type_listContext type_list(int i) {
			return getRuleContext(Type_listContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration; }
	}

	public final Interface_declarationContext interface_declaration() throws RecognitionException {
		Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_interface_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(INTERFACE);
			setState(799);
			identifier();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(800);
				type_parameters();
				}
			}

			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(803);
				match(EXTENDS);
				setState(804);
				type_list();
				}
			}

			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(807);
				match(PERMITS);
				setState(808);
				type_list();
				}
			}

			setState(811);
			interface_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_bodyContext extends ParserRuleContext {
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public List<Interface_body_declarationContext> interface_body_declaration() {
			return getRuleContexts(Interface_body_declarationContext.class);
		}
		public Interface_body_declarationContext interface_body_declaration(int i) {
			return getRuleContext(Interface_body_declarationContext.class,i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(BLOCK_S);
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DEFAULT - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(814);
				interface_body_declaration();
				}
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(820);
			match(BLOCK_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_type_or_voidContext extends ParserRuleContext {
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public Type_type_or_voidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_type_or_void; }
	}

	public final Type_type_or_voidContext type_type_or_void() throws RecognitionException {
		Type_type_or_voidContext _localctx = new Type_type_or_voidContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_type_type_or_void);
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				type_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_method_declarationContext extends ParserRuleContext {
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Generic_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_method_declaration; }
	}

	public final Generic_method_declarationContext generic_method_declaration() throws RecognitionException {
		Generic_method_declarationContext _localctx = new Generic_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_generic_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			type_parameters();
			setState(827);
			method_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_body_declarationContext extends ParserRuleContext {
		public Interface_member_declarationContext interface_member_declaration() {
			return getRuleContext(Interface_member_declarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Interface_body_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body_declaration; }
	}

	public final Interface_body_declarationContext interface_body_declaration() throws RecognitionException {
		Interface_body_declarationContext _localctx = new Interface_body_declarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_interface_body_declaration);
		try {
			int _alt;
			setState(837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(829);
						modifier();
						}
						} 
					}
					setState(834);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				setState(835);
				interface_member_declaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_member_declarationContext extends ParserRuleContext {
		public Const_declarationContext const_declaration() {
			return getRuleContext(Const_declarationContext.class,0);
		}
		public Interface_method_declarationContext interface_method_declaration() {
			return getRuleContext(Interface_method_declarationContext.class,0);
		}
		public Generic_interface_method_declarationContext generic_interface_method_declaration() {
			return getRuleContext(Generic_interface_method_declarationContext.class,0);
		}
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Annotation_type_declarationContext annotation_type_declaration() {
			return getRuleContext(Annotation_type_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Record_declarationContext record_declaration() {
			return getRuleContext(Record_declarationContext.class,0);
		}
		public Interface_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_member_declaration; }
	}

	public final Interface_member_declarationContext interface_member_declaration() throws RecognitionException {
		Interface_member_declarationContext _localctx = new Interface_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_interface_member_declaration);
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				const_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				interface_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(841);
				generic_interface_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(842);
				interface_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(843);
				annotation_type_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(844);
				class_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(845);
				enum_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(846);
				record_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_declarationContext extends ParserRuleContext {
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public List<Constant_declaratorContext> constant_declarator() {
			return getRuleContexts(Constant_declaratorContext.class);
		}
		public Constant_declaratorContext constant_declarator(int i) {
			return getRuleContext(Constant_declaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Const_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_declaration; }
	}

	public final Const_declarationContext const_declaration() throws RecognitionException {
		Const_declarationContext _localctx = new Const_declarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_const_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			type_type();
			setState(850);
			constant_declarator();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(851);
				match(COMMA);
				setState(852);
				constant_declarator();
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(858);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public List<TerminalNode> ARRAY_S() { return getTokens(JavaParser.ARRAY_S); }
		public TerminalNode ARRAY_S(int i) {
			return getToken(JavaParser.ARRAY_S, i);
		}
		public List<TerminalNode> ARRAY_E() { return getTokens(JavaParser.ARRAY_E); }
		public TerminalNode ARRAY_E(int i) {
			return getToken(JavaParser.ARRAY_E, i);
		}
		public Constant_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarator; }
	}

	public final Constant_declaratorContext constant_declarator() throws RecognitionException {
		Constant_declaratorContext _localctx = new Constant_declaratorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constant_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			identifier();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_S) {
				{
				{
				setState(861);
				match(ARRAY_S);
				setState(862);
				match(ARRAY_E);
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(868);
			match(ASSIGN);
			setState(869);
			variable_initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_method_declarationContext extends ParserRuleContext {
		public Interface_common_body_declarationContext interface_common_body_declaration() {
			return getRuleContext(Interface_common_body_declarationContext.class,0);
		}
		public List<Interface_method_modifierContext> interface_method_modifier() {
			return getRuleContexts(Interface_method_modifierContext.class);
		}
		public Interface_method_modifierContext interface_method_modifier(int i) {
			return getRuleContext(Interface_method_modifierContext.class,i);
		}
		public Interface_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_method_declaration; }
	}

	public final Interface_method_declarationContext interface_method_declaration() throws RecognitionException {
		Interface_method_declarationContext _localctx = new Interface_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_interface_method_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(871);
					interface_method_modifier();
					}
					} 
				}
				setState(876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(877);
			interface_common_body_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_method_modifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public Interface_method_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_method_modifier; }
	}

	public final Interface_method_modifierContext interface_method_modifier() throws RecognitionException {
		Interface_method_modifierContext _localctx = new Interface_method_modifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_interface_method_modifier);
		try {
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(881);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(882);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(883);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(884);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_interface_method_declarationContext extends ParserRuleContext {
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Interface_common_body_declarationContext interface_common_body_declaration() {
			return getRuleContext(Interface_common_body_declarationContext.class,0);
		}
		public List<Interface_method_modifierContext> interface_method_modifier() {
			return getRuleContexts(Interface_method_modifierContext.class);
		}
		public Interface_method_modifierContext interface_method_modifier(int i) {
			return getRuleContext(Interface_method_modifierContext.class,i);
		}
		public Generic_interface_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_interface_method_declaration; }
	}

	public final Generic_interface_method_declarationContext generic_interface_method_declaration() throws RecognitionException {
		Generic_interface_method_declarationContext _localctx = new Generic_interface_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_generic_interface_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (DEFAULT - 1)) | (1L << (PUBLIC - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(887);
				interface_method_modifier();
				}
				}
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(893);
			type_parameters();
			setState(894);
			interface_common_body_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_common_body_declarationContext extends ParserRuleContext {
		public Type_type_or_voidContext type_type_or_void() {
			return getRuleContext(Type_type_or_voidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Formal_parametersContext formal_parameters() {
			return getRuleContext(Formal_parametersContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> ARRAY_S() { return getTokens(JavaParser.ARRAY_S); }
		public TerminalNode ARRAY_S(int i) {
			return getToken(JavaParser.ARRAY_S, i);
		}
		public List<TerminalNode> ARRAY_E() { return getTokens(JavaParser.ARRAY_E); }
		public TerminalNode ARRAY_E(int i) {
			return getToken(JavaParser.ARRAY_E, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public Qualified_name_listContext qualified_name_list() {
			return getRuleContext(Qualified_name_listContext.class,0);
		}
		public Interface_common_body_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_common_body_declaration; }
	}

	public final Interface_common_body_declarationContext interface_common_body_declaration() throws RecognitionException {
		Interface_common_body_declarationContext _localctx = new Interface_common_body_declarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_interface_common_body_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(896);
					annotation();
					}
					} 
				}
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(902);
			type_type_or_void();
			setState(903);
			identifier();
			setState(904);
			formal_parameters();
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY_S) {
				{
				{
				setState(905);
				match(ARRAY_S);
				setState(906);
				match(ARRAY_E);
				}
				}
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(912);
				match(THROWS);
				setState(913);
				qualified_name_list();
				}
			}

			setState(916);
			method_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public Element_valueContext element_value() {
			return getRuleContext(Element_valueContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(DEFAULT);
			setState(919);
			element_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alt_annotation_qualified_nameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public Alt_annotation_qualified_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_annotation_qualified_name; }
	}

	public final Alt_annotation_qualified_nameContext alt_annotation_qualified_name() throws RecognitionException {
		Alt_annotation_qualified_nameContext _localctx = new Alt_annotation_qualified_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_alt_annotation_qualified_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(921);
				identifier();
				setState(922);
				match(DOT);
				}
				}
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(929);
			match(AT);
			setState(930);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Alt_annotation_qualified_nameContext alt_annotation_qualified_name() {
			return getRuleContext(Alt_annotation_qualified_nameContext.class,0);
		}
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public Element_value_pairsContext element_value_pairs() {
			return getRuleContext(Element_value_pairsContext.class,0);
		}
		public Element_valueContext element_value() {
			return getRuleContext(Element_valueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(932);
				match(AT);
				setState(933);
				qualified_name();
				}
				break;
			case 2:
				{
				setState(934);
				alt_annotation_qualified_name();
				}
				break;
			}
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_S) {
				{
				setState(937);
				match(PAREN_S);
				setState(940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(938);
					element_value_pairs();
					}
					break;
				case 2:
					{
					setState(939);
					element_value();
					}
					break;
				}
				setState(942);
				match(PAREN_E);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_value_pairsContext extends ParserRuleContext {
		public List<Element_value_pairContext> element_value_pair() {
			return getRuleContexts(Element_value_pairContext.class);
		}
		public Element_value_pairContext element_value_pair(int i) {
			return getRuleContext(Element_value_pairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Element_value_pairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_value_pairs; }
	}

	public final Element_value_pairsContext element_value_pairs() throws RecognitionException {
		Element_value_pairsContext _localctx = new Element_value_pairsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_element_value_pairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			element_value_pair();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(946);
				match(COMMA);
				setState(947);
				element_value_pair();
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_value_pairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public Element_valueContext element_value() {
			return getRuleContext(Element_valueContext.class,0);
		}
		public Element_value_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_value_pair; }
	}

	public final Element_value_pairContext element_value_pair() throws RecognitionException {
		Element_value_pairContext _localctx = new Element_value_pairContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_element_value_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			identifier();
			setState(954);
			match(ASSIGN);
			setState(955);
			element_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public Element_value_array_initializerContext element_value_array_initializer() {
			return getRuleContext(Element_value_array_initializerContext.class,0);
		}
		public Element_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_value; }
	}

	public final Element_valueContext element_value() throws RecognitionException {
		Element_valueContext _localctx = new Element_valueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_element_value);
		try {
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				element_value_array_initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_value_array_initializerContext extends ParserRuleContext {
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public List<Element_valueContext> element_value() {
			return getRuleContexts(Element_valueContext.class);
		}
		public Element_valueContext element_value(int i) {
			return getRuleContext(Element_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Element_value_array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_value_array_initializer; }
	}

	public final Element_value_array_initializerContext element_value_array_initializer() throws RecognitionException {
		Element_value_array_initializerContext _localctx = new Element_value_array_initializerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_element_value_array_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(BLOCK_S);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PAREN_S - 70)) | (1L << (BLOCK_S - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (OCT_LITERAL - 70)) | (1L << (BINARY_LITERAL - 70)) | (1L << (FLOAT_LITERAL - 70)) | (1L << (HEX_FLOAT_LITERAL - 70)) | (1L << (BOOL_LITERAL - 70)) | (1L << (CHAR_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (TEXT_BLOCK - 70)) | (1L << (NULL_LITERAL - 70)) | (1L << (LT - 70)) | (1L << (LOG_NOT - 70)) | (1L << (TILDE - 70)) | (1L << (UNN_INC - 70)) | (1L << (UNN_DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(963);
				element_value();
				setState(968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(964);
						match(COMMA);
						setState(965);
						element_value();
						}
						} 
					}
					setState(970);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
			}

			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(973);
				match(COMMA);
				}
			}

			setState(976);
			match(BLOCK_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_type_declarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Annotation_type_bodyContext annotation_type_body() {
			return getRuleContext(Annotation_type_bodyContext.class,0);
		}
		public Annotation_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_type_declaration; }
	}

	public final Annotation_type_declarationContext annotation_type_declaration() throws RecognitionException {
		Annotation_type_declarationContext _localctx = new Annotation_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_annotation_type_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(AT);
			setState(979);
			match(INTERFACE);
			setState(980);
			identifier();
			setState(981);
			annotation_type_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_type_bodyContext extends ParserRuleContext {
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public List<Annotation_type_element_declarationContext> annotation_type_element_declaration() {
			return getRuleContexts(Annotation_type_element_declarationContext.class);
		}
		public Annotation_type_element_declarationContext annotation_type_element_declaration(int i) {
			return getRuleContext(Annotation_type_element_declarationContext.class,i);
		}
		public Annotation_type_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_type_body; }
	}

	public final Annotation_type_bodyContext annotation_type_body() throws RecognitionException {
		Annotation_type_bodyContext _localctx = new Annotation_type_bodyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_annotation_type_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(BLOCK_S);
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(984);
				annotation_type_element_declaration();
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990);
			match(BLOCK_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_type_element_declarationContext extends ParserRuleContext {
		public Annotation_type_element_restContext annotation_type_element_rest() {
			return getRuleContext(Annotation_type_element_restContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Annotation_type_element_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_type_element_declaration; }
	}

	public final Annotation_type_element_declarationContext annotation_type_element_declaration() throws RecognitionException {
		Annotation_type_element_declarationContext _localctx = new Annotation_type_element_declarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_annotation_type_element_declaration);
		try {
			int _alt;
			setState(1000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(992);
						modifier();
						}
						} 
					}
					setState(997);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				setState(998);
				annotation_type_element_rest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_type_element_restContext extends ParserRuleContext {
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public Annotation_method_or_constant_restContext annotation_method_or_constant_rest() {
			return getRuleContext(Annotation_method_or_constant_restContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Annotation_type_declarationContext annotation_type_declaration() {
			return getRuleContext(Annotation_type_declarationContext.class,0);
		}
		public Record_declarationContext record_declaration() {
			return getRuleContext(Record_declarationContext.class,0);
		}
		public Annotation_type_element_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_type_element_rest; }
	}

	public final Annotation_type_element_restContext annotation_type_element_rest() throws RecognitionException {
		Annotation_type_element_restContext _localctx = new Annotation_type_element_restContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotation_type_element_rest);
		try {
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				type_type();
				setState(1003);
				annotation_method_or_constant_rest();
				setState(1004);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				class_declaration();
				setState(1008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1007);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1010);
				interface_declaration();
				setState(1012);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1011);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1014);
				enum_declaration();
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1015);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1018);
				annotation_type_declaration();
				setState(1020);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1019);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1022);
				record_declaration();
				setState(1024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1023);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_method_or_constant_restContext extends ParserRuleContext {
		public Annotation_method_restContext annotation_method_rest() {
			return getRuleContext(Annotation_method_restContext.class,0);
		}
		public Annotation_constant_restContext annotation_constant_rest() {
			return getRuleContext(Annotation_constant_restContext.class,0);
		}
		public Annotation_method_or_constant_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_method_or_constant_rest; }
	}

	public final Annotation_method_or_constant_restContext annotation_method_or_constant_rest() throws RecognitionException {
		Annotation_method_or_constant_restContext _localctx = new Annotation_method_or_constant_restContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotation_method_or_constant_rest);
		try {
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				annotation_method_rest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				annotation_constant_rest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_method_restContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public Annotation_method_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_method_rest; }
	}

	public final Annotation_method_restContext annotation_method_rest() throws RecognitionException {
		Annotation_method_restContext _localctx = new Annotation_method_restContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_annotation_method_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			identifier();
			setState(1033);
			match(PAREN_S);
			setState(1034);
			match(PAREN_E);
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1035);
				default_value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_constant_restContext extends ParserRuleContext {
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public Annotation_constant_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_constant_rest; }
	}

	public final Annotation_constant_restContext annotation_constant_rest() throws RecognitionException {
		Annotation_constant_restContext _localctx = new Annotation_constant_restContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_annotation_constant_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			variable_declarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_initializerContext extends ParserRuleContext {
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public List<Variable_initializerContext> variable_initializer() {
			return getRuleContexts(Variable_initializerContext.class);
		}
		public Variable_initializerContext variable_initializer(int i) {
			return getRuleContext(Variable_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_array_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(BLOCK_S);
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PAREN_S - 70)) | (1L << (BLOCK_S - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (OCT_LITERAL - 70)) | (1L << (BINARY_LITERAL - 70)) | (1L << (FLOAT_LITERAL - 70)) | (1L << (HEX_FLOAT_LITERAL - 70)) | (1L << (BOOL_LITERAL - 70)) | (1L << (CHAR_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (TEXT_BLOCK - 70)) | (1L << (NULL_LITERAL - 70)) | (1L << (LT - 70)) | (1L << (LOG_NOT - 70)) | (1L << (TILDE - 70)) | (1L << (UNN_INC - 70)) | (1L << (UNN_DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(1041);
				variable_initializer();
				setState(1046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1042);
						match(COMMA);
						setState(1043);
						variable_initializer();
						}
						} 
					}
					setState(1048);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1049);
					match(COMMA);
					}
				}

				}
			}

			setState(1054);
			match(BLOCK_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(BLOCK_S);
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (PAREN_S - 65)) | (1L << (BLOCK_S - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LT - 65)) | (1L << (LOG_NOT - 65)) | (1L << (TILDE - 65)) | (1L << (UNN_INC - 65)) | (1L << (UNN_DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(1057);
				block_statement();
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1063);
			match(BLOCK_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_statementContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Local_type_declarationContext local_type_declaration() {
			return getRuleContext(Local_type_declarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_block_statement);
		try {
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				local_variable_declaration();
				setState(1066);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				local_type_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1069);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public List<Variable_modifierContext> variable_modifier() {
			return getRuleContexts(Variable_modifierContext.class);
		}
		public Variable_modifierContext variable_modifier(int i) {
			return getRuleContext(Variable_modifierContext.class,i);
		}
		public Local_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration; }
	}

	public final Local_variable_declarationContext local_variable_declaration() throws RecognitionException {
		Local_variable_declarationContext _localctx = new Local_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_local_variable_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1072);
					variable_modifier();
					}
					} 
				}
				setState(1077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1078);
				match(VAR);
				setState(1079);
				identifier();
				setState(1080);
				match(ASSIGN);
				setState(1081);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1083);
				type_type();
				setState(1084);
				variable_declarators();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public IdentifierContext identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public Par_expressionContext par_expression() {
			return getRuleContext(Par_expressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public For_controlContext for_control() {
			return getRuleContext(For_controlContext.class,0);
		}
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public Finally_blockContext finally_block() {
			return getRuleContext(Finally_blockContext.class,0);
		}
		public List<Catch_clauseContext> catch_clause() {
			return getRuleContexts(Catch_clauseContext.class);
		}
		public Catch_clauseContext catch_clause(int i) {
			return getRuleContext(Catch_clauseContext.class,i);
		}
		public Resource_specificationContext resource_specification() {
			return getRuleContext(Resource_specificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public List<Switch_block_statement_groupContext> switch_block_statement_group() {
			return getRuleContexts(Switch_block_statement_groupContext.class);
		}
		public Switch_block_statement_groupContext switch_block_statement_group(int i) {
			return getRuleContext(Switch_block_statement_groupContext.class,i);
		}
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public TerminalNode YIELD() { return getToken(JavaParser.YIELD, 0); }
		public Switch_expressionContext switch_expression() {
			return getRuleContext(Switch_expressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				match(ASSERT);
				setState(1090);
				expression(0);
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1091);
					match(COLON);
					setState(1092);
					expression(0);
					}
				}

				setState(1095);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1097);
				match(IF);
				setState(1098);
				par_expression();
				setState(1099);
				statement();
				setState(1102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1100);
					match(ELSE);
					setState(1101);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1104);
				match(FOR);
				setState(1105);
				match(PAREN_S);
				setState(1106);
				for_control();
				setState(1107);
				match(PAREN_E);
				setState(1108);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1110);
				match(WHILE);
				setState(1111);
				par_expression();
				setState(1112);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1114);
				match(DO);
				setState(1115);
				statement();
				setState(1116);
				match(WHILE);
				setState(1117);
				par_expression();
				setState(1118);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1120);
				match(TRY);
				setState(1121);
				block();
				setState(1131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1122);
						catch_clause();
						}
						}
						setState(1125); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1127);
						finally_block();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1130);
					finally_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1133);
				match(TRY);
				setState(1134);
				resource_specification();
				setState(1135);
				block();
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1136);
					catch_clause();
					}
					}
					setState(1141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1142);
					finally_block();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1145);
				match(SWITCH);
				setState(1146);
				par_expression();
				setState(1147);
				match(BLOCK_S);
				setState(1151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1148);
						switch_block_statement_group();
						}
						} 
					}
					setState(1153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1154);
					switch_label();
					}
					}
					setState(1159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1160);
				match(BLOCK_E);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1162);
				match(SYNCHRONIZED);
				setState(1163);
				par_expression();
				setState(1164);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1166);
				match(RETURN);
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PAREN_S - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (OCT_LITERAL - 70)) | (1L << (BINARY_LITERAL - 70)) | (1L << (FLOAT_LITERAL - 70)) | (1L << (HEX_FLOAT_LITERAL - 70)) | (1L << (BOOL_LITERAL - 70)) | (1L << (CHAR_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (TEXT_BLOCK - 70)) | (1L << (NULL_LITERAL - 70)) | (1L << (LT - 70)) | (1L << (LOG_NOT - 70)) | (1L << (TILDE - 70)) | (1L << (UNN_INC - 70)) | (1L << (UNN_DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					setState(1167);
					expression(0);
					}
				}

				setState(1170);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1171);
				match(THROW);
				setState(1172);
				expression(0);
				setState(1173);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1175);
				match(BREAK);
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1176);
					identifier();
					}
				}

				setState(1179);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1180);
				match(CONTINUE);
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1181);
					identifier();
					}
				}

				setState(1184);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1185);
				match(YIELD);
				setState(1186);
				expression(0);
				setState(1187);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1189);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1190);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1191);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1193);
				switch_expression();
				setState(1195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1194);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1197);
				((StatementContext)_localctx).identifierLabel = identifier();
				setState(1198);
				match(COLON);
				setState(1199);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_rule_outcomeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public Switch_rule_outcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_rule_outcome; }
	}

	public final Switch_rule_outcomeContext switch_rule_outcome() throws RecognitionException {
		Switch_rule_outcomeContext _localctx = new Switch_rule_outcomeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_switch_rule_outcome);
		int _la;
		try {
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (PAREN_S - 65)) | (1L << (BLOCK_S - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LT - 65)) | (1L << (LOG_NOT - 65)) | (1L << (TILDE - 65)) | (1L << (UNN_INC - 65)) | (1L << (UNN_DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(1204);
					block_statement();
					}
					}
					setState(1209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_block_statement_groupContext extends ParserRuleContext {
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public Switch_block_statement_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_block_statement_group; }
	}

	public final Switch_block_statement_groupContext switch_block_statement_group() throws RecognitionException {
		Switch_block_statement_groupContext _localctx = new Switch_block_statement_groupContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_switch_block_statement_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1212);
				switch_label();
				}
				}
				setState(1215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1217);
				block_statement();
				}
				}
				setState(1220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (PAREN_S - 65)) | (1L << (BLOCK_S - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LT - 65)) | (1L << (LOG_NOT - 65)) | (1L << (TILDE - 65)) | (1L << (UNN_INC - 65)) | (1L << (UNN_DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_labelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public IdentifierContext varName;
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public Switch_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_label; }
	}

	public final Switch_labelContext switch_label() throws RecognitionException {
		Switch_labelContext _localctx = new Switch_labelContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_switch_label);
		try {
			setState(1233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				match(CASE);
				setState(1228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1223);
					((Switch_labelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1224);
					((Switch_labelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1225);
					type_type();
					setState(1226);
					((Switch_labelContext)_localctx).varName = identifier();
					}
					break;
				}
				setState(1230);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				match(DEFAULT);
				setState(1232);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_for_init);
		try {
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1235);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1236);
				expression_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_controlContext extends ParserRuleContext {
		public Expression_listContext forUpdate;
		public Enhanced_for_controlContext enhanced_for_control() {
			return getRuleContext(Enhanced_for_controlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_control; }
	}

	public final For_controlContext for_control() throws RecognitionException {
		For_controlContext _localctx = new For_controlContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_for_control);
		int _la;
		try {
			setState(1251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				enhanced_for_control();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PAREN_S - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (OCT_LITERAL - 70)) | (1L << (BINARY_LITERAL - 70)) | (1L << (FLOAT_LITERAL - 70)) | (1L << (HEX_FLOAT_LITERAL - 70)) | (1L << (BOOL_LITERAL - 70)) | (1L << (CHAR_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (TEXT_BLOCK - 70)) | (1L << (NULL_LITERAL - 70)) | (1L << (LT - 70)) | (1L << (LOG_NOT - 70)) | (1L << (TILDE - 70)) | (1L << (UNN_INC - 70)) | (1L << (UNN_DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					setState(1240);
					for_init();
					}
				}

				setState(1243);
				match(SEMI);
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PAREN_S - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (OCT_LITERAL - 70)) | (1L << (BINARY_LITERAL - 70)) | (1L << (FLOAT_LITERAL - 70)) | (1L << (HEX_FLOAT_LITERAL - 70)) | (1L << (BOOL_LITERAL - 70)) | (1L << (CHAR_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (TEXT_BLOCK - 70)) | (1L << (NULL_LITERAL - 70)) | (1L << (LT - 70)) | (1L << (LOG_NOT - 70)) | (1L << (TILDE - 70)) | (1L << (UNN_INC - 70)) | (1L << (UNN_DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					setState(1244);
					expression(0);
					}
				}

				setState(1247);
				match(SEMI);
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PAREN_S - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (OCT_LITERAL - 70)) | (1L << (BINARY_LITERAL - 70)) | (1L << (FLOAT_LITERAL - 70)) | (1L << (HEX_FLOAT_LITERAL - 70)) | (1L << (BOOL_LITERAL - 70)) | (1L << (CHAR_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (TEXT_BLOCK - 70)) | (1L << (NULL_LITERAL - 70)) | (1L << (LT - 70)) | (1L << (LOG_NOT - 70)) | (1L << (TILDE - 70)) | (1L << (UNN_INC - 70)) | (1L << (UNN_DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					setState(1248);
					((For_controlContext)_localctx).forUpdate = expression_list();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enhanced_for_controlContext extends ParserRuleContext {
		public Variable_declarator_idContext variable_declarator_id() {
			return getRuleContext(Variable_declarator_idContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public List<Variable_modifierContext> variable_modifier() {
			return getRuleContexts(Variable_modifierContext.class);
		}
		public Variable_modifierContext variable_modifier(int i) {
			return getRuleContext(Variable_modifierContext.class,i);
		}
		public Enhanced_for_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhanced_for_control; }
	}

	public final Enhanced_for_controlContext enhanced_for_control() throws RecognitionException {
		Enhanced_for_controlContext _localctx = new Enhanced_for_controlContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_enhanced_for_control);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1253);
					variable_modifier();
					}
					} 
				}
				setState(1258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1259);
				type_type();
				}
				break;
			case 2:
				{
				setState(1260);
				match(VAR);
				}
				break;
			}
			setState(1263);
			variable_declarator_id();
			setState(1264);
			match(COLON);
			setState(1265);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public Catch_typeContext catch_type() {
			return getRuleContext(Catch_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Variable_modifierContext> variable_modifier() {
			return getRuleContexts(Variable_modifierContext.class);
		}
		public Variable_modifierContext variable_modifier(int i) {
			return getRuleContext(Variable_modifierContext.class,i);
		}
		public Catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clause; }
	}

	public final Catch_clauseContext catch_clause() throws RecognitionException {
		Catch_clauseContext _localctx = new Catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_catch_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(CATCH);
			setState(1268);
			match(PAREN_S);
			setState(1272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1269);
					variable_modifier();
					}
					} 
				}
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			setState(1275);
			catch_type();
			setState(1276);
			identifier();
			setState(1277);
			match(PAREN_E);
			setState(1278);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_typeContext extends ParserRuleContext {
		public List<Qualified_nameContext> qualified_name() {
			return getRuleContexts(Qualified_nameContext.class);
		}
		public Qualified_nameContext qualified_name(int i) {
			return getRuleContext(Qualified_nameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public Catch_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_type; }
	}

	public final Catch_typeContext catch_type() throws RecognitionException {
		Catch_typeContext _localctx = new Catch_typeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_catch_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			qualified_name();
			setState(1285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1281);
				match(BITOR);
				setState(1282);
				qualified_name();
				}
				}
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_blockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_block; }
	}

	public final Finally_blockContext finally_block() throws RecognitionException {
		Finally_blockContext _localctx = new Finally_blockContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_finally_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(FINALLY);
			setState(1289);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_specificationContext extends ParserRuleContext {
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public Resource_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_specification; }
	}

	public final Resource_specificationContext resource_specification() throws RecognitionException {
		Resource_specificationContext _localctx = new Resource_specificationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_resource_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			match(PAREN_S);
			setState(1292);
			resources();
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1293);
				match(SEMI);
				}
			}

			setState(1296);
			match(PAREN_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			resource();
			setState(1303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1299);
					match(SEMI);
					setState(1300);
					resource();
					}
					} 
				}
				setState(1305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Class_or_interface_typeContext class_or_interface_type() {
			return getRuleContext(Class_or_interface_typeContext.class,0);
		}
		public Variable_declarator_idContext variable_declarator_id() {
			return getRuleContext(Variable_declarator_idContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Variable_modifierContext> variable_modifier() {
			return getRuleContexts(Variable_modifierContext.class);
		}
		public Variable_modifierContext variable_modifier(int i) {
			return getRuleContext(Variable_modifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_resource);
		try {
			int _alt;
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1306);
						variable_modifier();
						}
						} 
					}
					setState(1311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				}
				setState(1317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1312);
					class_or_interface_type();
					setState(1313);
					variable_declarator_id();
					}
					break;
				case 2:
					{
					setState(1315);
					match(VAR);
					setState(1316);
					identifier();
					}
					break;
				}
				setState(1319);
				match(ASSIGN);
				setState(1320);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1322);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Variable_modifierContext> variable_modifier() {
			return getRuleContexts(Variable_modifierContext.class);
		}
		public Variable_modifierContext variable_modifier(int i) {
			return getRuleContext(Variable_modifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1325);
					variable_modifier();
					}
					} 
				}
				setState(1330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1331);
			type_type();
			setState(1335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1332);
					annotation();
					}
					} 
				}
				setState(1337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			setState(1338);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_type_or_voidContext type_type_or_void() {
			return getRuleContext(Type_type_or_voidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public Non_wildcard_type_argumentsContext non_wildcard_type_arguments() {
			return getRuleContext(Non_wildcard_type_argumentsContext.class,0);
		}
		public Explicit_generic_invocation_suffixContext explicit_generic_invocation_suffix() {
			return getRuleContext(Explicit_generic_invocation_suffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_primary);
		try {
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				match(PAREN_S);
				setState(1341);
				expression(0);
				setState(1342);
				match(PAREN_E);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1345);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1346);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1347);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1348);
				type_type_or_void();
				setState(1349);
				match(DOT);
				setState(1350);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1352);
				non_wildcard_type_arguments();
				setState(1356);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case IDENTIFIER:
					{
					setState(1353);
					explicit_generic_invocation_suffix();
					}
					break;
				case THIS:
					{
					setState(1354);
					match(THIS);
					setState(1355);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(JavaParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JavaParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public TerminalNode TEXT_BLOCK() { return getToken(JavaParser.TEXT_BLOCK, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_literal);
		try {
			setState(1367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				integer_literal();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1361);
				float_literal();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1362);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1363);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1364);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1365);
				match(NULL_LITERAL);
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1366);
				match(TEXT_BLOCK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JavaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JavaParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JavaParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(JavaParser.BINARY_LITERAL, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (DECIMAL_LITERAL - 76)) | (1L << (HEX_LITERAL - 76)) | (1L << (OCT_LITERAL - 76)) | (1L << (BINARY_LITERAL - 76)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_literalContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(JavaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JavaParser.HEX_FLOAT_LITERAL, 0); }
		public Float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal; }
	}

	public final Float_literalContext float_literal() throws RecognitionException {
		Float_literalContext _localctx = new Float_literalContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_float_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_arguments_or_diamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public Type_argumentsContext type_arguments() {
			return getRuleContext(Type_argumentsContext.class,0);
		}
		public Type_arguments_or_diamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_arguments_or_diamond; }
	}

	public final Type_arguments_or_diamondContext type_arguments_or_diamond() throws RecognitionException {
		Type_arguments_or_diamondContext _localctx = new Type_arguments_or_diamondContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_type_arguments_or_diamond);
		try {
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				match(LT);
				setState(1374);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1375);
				type_arguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public List<Type_typeContext> type_type() {
			return getRuleContexts(Type_typeContext.class);
		}
		public Type_typeContext type_type(int i) {
			return getRuleContext(Type_typeContext.class,i);
		}
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode UNN_INC() { return getToken(JavaParser.UNN_INC, 0); }
		public TerminalNode UNN_DEC() { return getToken(JavaParser.UNN_DEC, 0); }
		public TerminalNode TILDE() { return getToken(JavaParser.TILDE, 0); }
		public TerminalNode LOG_NOT() { return getToken(JavaParser.LOG_NOT, 0); }
		public Switch_expressionContext switch_expression() {
			return getRuleContext(Switch_expressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(JavaParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argumentsContext type_arguments() {
			return getRuleContext(Type_argumentsContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(JavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(JavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(JavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaParser.NOTEQUAL, 0); }
		public TerminalNode CARET() { return getToken(JavaParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(JavaParser.BITOR, 0); }
		public TerminalNode LOG_AND() { return getToken(JavaParser.LOG_AND, 0); }
		public TerminalNode LOG_OR() { return getToken(JavaParser.LOG_OR, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASS() { return getToken(JavaParser.ADD_ASS, 0); }
		public TerminalNode SUB_ASS() { return getToken(JavaParser.SUB_ASS, 0); }
		public TerminalNode MUL_ASS() { return getToken(JavaParser.MUL_ASS, 0); }
		public TerminalNode DIV_ASS() { return getToken(JavaParser.DIV_ASS, 0); }
		public TerminalNode AND_ASS() { return getToken(JavaParser.AND_ASS, 0); }
		public TerminalNode OR_ASS() { return getToken(JavaParser.OR_ASS, 0); }
		public TerminalNode XOR_ASS() { return getToken(JavaParser.XOR_ASS, 0); }
		public TerminalNode RSHIFT_ASS() { return getToken(JavaParser.RSHIFT_ASS, 0); }
		public TerminalNode URSHIFT_ASS() { return getToken(JavaParser.URSHIFT_ASS, 0); }
		public TerminalNode LSHIFT_ASS() { return getToken(JavaParser.LSHIFT_ASS, 0); }
		public TerminalNode MOD_ASS() { return getToken(JavaParser.MOD_ASS, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public Inner_creatorContext inner_creator() {
			return getRuleContext(Inner_creatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public Super_suffixContext super_suffix() {
			return getRuleContext(Super_suffixContext.class,0);
		}
		public Explicit_generic_invocationContext explicit_generic_invocation() {
			return getRuleContext(Explicit_generic_invocationContext.class,0);
		}
		public Non_wildcard_type_argumentsContext non_wildcard_type_arguments() {
			return getRuleContext(Non_wildcard_type_argumentsContext.class,0);
		}
		public TerminalNode ARRAY_S() { return getToken(JavaParser.ARRAY_S, 0); }
		public TerminalNode ARRAY_E() { return getToken(JavaParser.ARRAY_E, 0); }
		public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1379);
				primary();
				}
				break;
			case 2:
				{
				setState(1380);
				method_call();
				}
				break;
			case 3:
				{
				setState(1381);
				match(NEW);
				setState(1382);
				creator();
				}
				break;
			case 4:
				{
				setState(1383);
				match(PAREN_S);
				setState(1387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1384);
						annotation();
						}
						} 
					}
					setState(1389);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				setState(1390);
				type_type();
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1391);
					match(BITAND);
					setState(1392);
					type_type();
					}
					}
					setState(1397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1398);
				match(PAREN_E);
				setState(1399);
				expression(21);
				}
				break;
			case 5:
				{
				setState(1401);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (UNN_INC - 103)) | (1L << (UNN_DEC - 103)) | (1L << (ADD - 103)) | (1L << (SUB - 103)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1402);
				expression(19);
				}
				break;
			case 6:
				{
				setState(1403);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOG_NOT || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1404);
				expression(18);
				}
				break;
			case 7:
				{
				setState(1405);
				switch_expression();
				}
				break;
			case 8:
				{
				setState(1406);
				type_type();
				setState(1407);
				match(COLONCOLON);
				setState(1413);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case LT:
				case IDENTIFIER:
					{
					setState(1409);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1408);
						type_arguments();
						}
					}

					setState(1411);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1412);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				setState(1415);
				class_type();
				setState(1416);
				match(COLONCOLON);
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1417);
					type_arguments();
					}
				}

				setState(1420);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1505);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1424);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1425);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (MUL - 107)) | (1L << (DIV - 107)) | (1L << (MOD - 107)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1426);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1427);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1428);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1429);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1430);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1438);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
						case 1:
							{
							setState(1431);
							match(LT);
							setState(1432);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1433);
							match(GT);
							setState(1434);
							match(GT);
							setState(1435);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1436);
							match(GT);
							setState(1437);
							match(GT);
							}
							break;
						}
						setState(1440);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1441);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1442);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (GT - 91)) | (1L << (LT - 91)) | (1L << (LE - 91)) | (1L << (GE - 91)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1443);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1444);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1445);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1446);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1447);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1448);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1449);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1450);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1451);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1452);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1453);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1454);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1455);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1456);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1457);
						((ExpressionContext)_localctx).bop = match(LOG_AND);
						setState(1458);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1459);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1460);
						((ExpressionContext)_localctx).bop = match(LOG_OR);
						setState(1461);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1462);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1463);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1464);
						expression(0);
						setState(1465);
						match(COLON);
						setState(1466);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1468);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1469);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ASSIGN - 90)) | (1L << (ADD_ASS - 90)) | (1L << (SUB_ASS - 90)) | (1L << (MUL_ASS - 90)) | (1L << (DIV_ASS - 90)) | (1L << (AND_ASS - 90)) | (1L << (OR_ASS - 90)) | (1L << (XOR_ASS - 90)) | (1L << (MOD_ASS - 90)) | (1L << (LSHIFT_ASS - 90)) | (1L << (RSHIFT_ASS - 90)) | (1L << (URSHIFT_ASS - 90)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1470);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1471);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1472);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1484);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
						case 1:
							{
							setState(1473);
							identifier();
							}
							break;
						case 2:
							{
							setState(1474);
							method_call();
							}
							break;
						case 3:
							{
							setState(1475);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1476);
							match(NEW);
							setState(1478);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1477);
								non_wildcard_type_arguments();
								}
							}

							setState(1480);
							inner_creator();
							}
							break;
						case 5:
							{
							setState(1481);
							match(SUPER);
							setState(1482);
							super_suffix();
							}
							break;
						case 6:
							{
							setState(1483);
							explicit_generic_invocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1486);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1487);
						match(ARRAY_S);
						setState(1488);
						expression(0);
						setState(1489);
						match(ARRAY_E);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1491);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1492);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==UNN_INC || _la==UNN_DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1493);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1494);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1497);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
						case 1:
							{
							setState(1495);
							type_type();
							}
							break;
						case 2:
							{
							setState(1496);
							pattern();
							}
							break;
						}
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1499);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1500);
						match(COLONCOLON);
						setState(1502);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1501);
							type_arguments();
							}
						}

						setState(1504);
						identifier();
						}
						break;
					}
					} 
				}
				setState(1509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Switch_expressionContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public Par_expressionContext par_expression() {
			return getRuleContext(Par_expressionContext.class,0);
		}
		public TerminalNode BLOCK_S() { return getToken(JavaParser.BLOCK_S, 0); }
		public TerminalNode BLOCK_E() { return getToken(JavaParser.BLOCK_E, 0); }
		public List<Switch_labeled_ruleContext> switch_labeled_rule() {
			return getRuleContexts(Switch_labeled_ruleContext.class);
		}
		public Switch_labeled_ruleContext switch_labeled_rule(int i) {
			return getRuleContext(Switch_labeled_ruleContext.class,i);
		}
		public Switch_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression; }
	}

	public final Switch_expressionContext switch_expression() throws RecognitionException {
		Switch_expressionContext _localctx = new Switch_expressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_switch_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			match(SWITCH);
			setState(1511);
			par_expression();
			setState(1512);
			match(BLOCK_S);
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1513);
				switch_labeled_rule();
				}
				}
				setState(1518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1519);
			match(BLOCK_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_labeled_ruleContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public Switch_rule_outcomeContext switch_rule_outcome() {
			return getRuleContext(Switch_rule_outcomeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public Guarded_patternContext guarded_pattern() {
			return getRuleContext(Guarded_patternContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public Switch_labeled_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_labeled_rule; }
	}

	public final Switch_labeled_ruleContext switch_labeled_rule() throws RecognitionException {
		Switch_labeled_ruleContext _localctx = new Switch_labeled_ruleContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_switch_labeled_rule);
		int _la;
		try {
			setState(1532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				match(CASE);
				setState(1525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1522);
					expression_list();
					}
					break;
				case 2:
					{
					setState(1523);
					match(NULL_LITERAL);
					}
					break;
				case 3:
					{
					setState(1524);
					guarded_pattern(0);
					}
					break;
				}
				setState(1527);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1528);
				switch_rule_outcome();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1529);
				match(DEFAULT);
				setState(1530);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1531);
				switch_rule_outcome();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_name_listContext extends ParserRuleContext {
		public List<Qualified_nameContext> qualified_name() {
			return getRuleContexts(Qualified_nameContext.class);
		}
		public Qualified_nameContext qualified_name(int i) {
			return getRuleContext(Qualified_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Qualified_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_name_list; }
	}

	public final Qualified_name_listContext qualified_name_list() throws RecognitionException {
		Qualified_name_listContext _localctx = new Qualified_name_listContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_qualified_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			qualified_name();
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1535);
				match(COMMA);
				setState(1536);
				qualified_name();
				}
				}
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Last_formal_parameterContext extends ParserRuleContext {
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
		public Variable_declarator_idContext variable_declarator_id() {
			return getRuleContext(Variable_declarator_idContext.class,0);
		}
		public List<Variable_modifierContext> variable_modifier() {
			return getRuleContexts(Variable_modifierContext.class);
		}
		public Variable_modifierContext variable_modifier(int i) {
			return getRuleContext(Variable_modifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Last_formal_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_last_formal_parameter; }
	}

	public final Last_formal_parameterContext last_formal_parameter() throws RecognitionException {
		Last_formal_parameterContext _localctx = new Last_formal_parameterContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_last_formal_parameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1542);
					variable_modifier();
					}
					} 
				}
				setState(1547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			setState(1548);
			type_type();
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(1549);
				annotation();
				}
				}
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1555);
			match(ELLIPSIS);
			setState(1556);
			variable_declarator_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public Qualified_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_name; }
	}

	public final Qualified_nameContext qualified_name() throws RecognitionException {
		Qualified_nameContext _localctx = new Qualified_nameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_qualified_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			identifier();
			setState(1563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1559);
					match(DOT);
					setState(1560);
					identifier();
					}
					} 
				}
				setState(1565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_type_declarationContext extends ParserRuleContext {
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Record_declarationContext record_declaration() {
			return getRuleContext(Record_declarationContext.class,0);
		}
		public List<Class_or_interface_modifierContext> class_or_interface_modifier() {
			return getRuleContexts(Class_or_interface_modifierContext.class);
		}
		public Class_or_interface_modifierContext class_or_interface_modifier(int i) {
			return getRuleContext(Class_or_interface_modifierContext.class,i);
		}
		public Local_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_type_declaration; }
	}

	public final Local_type_declarationContext local_type_declaration() throws RecognitionException {
		Local_type_declarationContext _localctx = new Local_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_local_type_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1566);
					class_or_interface_modifier();
					}
					} 
				}
				setState(1571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			setState(1575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1572);
				class_declaration();
				}
				break;
			case INTERFACE:
				{
				setState(1573);
				interface_declaration();
				}
				break;
			case RECORD:
				{
				setState(1574);
				record_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Par_expressionContext extends ParserRuleContext {
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public Par_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par_expression; }
	}

	public final Par_expressionContext par_expression() throws RecognitionException {
		Par_expressionContext _localctx = new Par_expressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_par_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(PAREN_S);
			setState(1578);
			expression(0);
			setState(1579);
			match(PAREN_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			expression(0);
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1582);
				match(COMMA);
				setState(1583);
				expression(0);
				}
				}
				setState(1588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_method_call);
		int _la;
		try {
			setState(1608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1589);
				identifier();
				setState(1590);
				match(PAREN_S);
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PAREN_S - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (OCT_LITERAL - 70)) | (1L << (BINARY_LITERAL - 70)) | (1L << (FLOAT_LITERAL - 70)) | (1L << (HEX_FLOAT_LITERAL - 70)) | (1L << (BOOL_LITERAL - 70)) | (1L << (CHAR_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (TEXT_BLOCK - 70)) | (1L << (NULL_LITERAL - 70)) | (1L << (LT - 70)) | (1L << (LOG_NOT - 70)) | (1L << (TILDE - 70)) | (1L << (UNN_INC - 70)) | (1L << (UNN_DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					setState(1591);
					expression_list();
					}
				}

				setState(1594);
				match(PAREN_E);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				match(THIS);
				setState(1597);
				match(PAREN_S);
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PAREN_S - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (OCT_LITERAL - 70)) | (1L << (BINARY_LITERAL - 70)) | (1L << (FLOAT_LITERAL - 70)) | (1L << (HEX_FLOAT_LITERAL - 70)) | (1L << (BOOL_LITERAL - 70)) | (1L << (CHAR_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (TEXT_BLOCK - 70)) | (1L << (NULL_LITERAL - 70)) | (1L << (LT - 70)) | (1L << (LOG_NOT - 70)) | (1L << (TILDE - 70)) | (1L << (UNN_INC - 70)) | (1L << (UNN_DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					setState(1598);
					expression_list();
					}
				}

				setState(1601);
				match(PAREN_E);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1602);
				match(SUPER);
				setState(1603);
				match(PAREN_S);
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (PAREN_S - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (OCT_LITERAL - 70)) | (1L << (BINARY_LITERAL - 70)) | (1L << (FLOAT_LITERAL - 70)) | (1L << (HEX_FLOAT_LITERAL - 70)) | (1L << (BOOL_LITERAL - 70)) | (1L << (CHAR_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (TEXT_BLOCK - 70)) | (1L << (NULL_LITERAL - 70)) | (1L << (LT - 70)) | (1L << (LOG_NOT - 70)) | (1L << (TILDE - 70)) | (1L << (UNN_INC - 70)) | (1L << (UNN_DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					setState(1604);
					expression_list();
					}
				}

				setState(1607);
				match(PAREN_E);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guarded_patternContext extends ParserRuleContext {
		public TerminalNode PAREN_S() { return getToken(JavaParser.PAREN_S, 0); }
		public Guarded_patternContext guarded_pattern() {
			return getRuleContext(Guarded_patternContext.class,0);
		}
		public TerminalNode PAREN_E() { return getToken(JavaParser.PAREN_E, 0); }
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Variable_modifierContext> variable_modifier() {
			return getRuleContexts(Variable_modifierContext.class);
		}
		public Variable_modifierContext variable_modifier(int i) {
			return getRuleContext(Variable_modifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LOG_AND() { return getTokens(JavaParser.LOG_AND); }
		public TerminalNode LOG_AND(int i) {
			return getToken(JavaParser.LOG_AND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Guarded_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_pattern; }
	}

	public final Guarded_patternContext guarded_pattern() throws RecognitionException {
		return guarded_pattern(0);
	}

	private Guarded_patternContext guarded_pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Guarded_patternContext _localctx = new Guarded_patternContext(_ctx, _parentState);
		Guarded_patternContext _prevctx = _localctx;
		int _startState = 228;
		enterRecursionRule(_localctx, 228, RULE_guarded_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_S:
				{
				setState(1611);
				match(PAREN_S);
				setState(1612);
				guarded_pattern(0);
				setState(1613);
				match(PAREN_E);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				{
				setState(1618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1615);
						variable_modifier();
						}
						} 
					}
					setState(1620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(1621);
				type_type();
				setState(1625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1622);
						annotation();
						}
						} 
					}
					setState(1627);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				}
				setState(1628);
				identifier();
				setState(1633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1629);
						match(LOG_AND);
						setState(1630);
						expression(0);
						}
						} 
					}
					setState(1635);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Guarded_patternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guarded_pattern);
					setState(1638);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1639);
					match(LOG_AND);
					setState(1640);
					expression(0);
					}
					} 
				}
				setState(1645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public Non_wildcard_type_argumentsContext non_wildcard_type_arguments() {
			return getRuleContext(Non_wildcard_type_argumentsContext.class,0);
		}
		public Created_nameContext created_name() {
			return getRuleContext(Created_nameContext.class,0);
		}
		public Class_creator_restContext class_creator_rest() {
			return getRuleContext(Class_creator_restContext.class,0);
		}
		public Array_creator_restContext array_creator_rest() {
			return getRuleContext(Array_creator_restContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_creator);
		try {
			setState(1655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646);
				non_wildcard_type_arguments();
				setState(1647);
				created_name();
				setState(1648);
				class_creator_rest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1650);
				created_name();
				setState(1653);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARRAY_S:
					{
					setState(1651);
					array_creator_rest();
					}
					break;
				case PAREN_S:
					{
					setState(1652);
					class_creator_rest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Created_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Type_arguments_or_diamondContext> type_arguments_or_diamond() {
			return getRuleContexts(Type_arguments_or_diamondContext.class);
		}
		public Type_arguments_or_diamondContext type_arguments_or_diamond(int i) {
			return getRuleContext(Type_arguments_or_diamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Created_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_created_name; }
	}

	public final Created_nameContext created_name() throws RecognitionException {
		Created_nameContext _localctx = new Created_nameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_created_name);
		int _la;
		try {
			setState(1672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1657);
				identifier();
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1658);
					type_arguments_or_diamond();
					}
				}

				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1661);
					match(DOT);
					setState(1662);
					identifier();
					setState(1664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1663);
						type_arguments_or_diamond();
						}
					}

					}
					}
					setState(1670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1671);
				primitive_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inner_creatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_creator_restContext class_creator_rest() {
			return getRuleContext(Class_creator_restContext.class,0);
		}
		public Non_wild_card_type_arguments_or_diamondContext non_wild_card_type_arguments_or_diamond() {
			return getRuleContext(Non_wild_card_type_arguments_or_diamondContext.class,0);
		}
		public Inner_creatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_creator; }
	}

	public final Inner_creatorContext inner_creator() throws RecognitionException {
		Inner_creatorContext _localctx = new Inner_creatorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_inner_creator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			identifier();
			setState(1676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1675);
				non_wild_card_type_arguments_or_diamond();
				}
			}

			setState(1678);
			class_creator_rest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_creator_restContext extends ParserRuleContext {
		public List<TerminalNode> ARRAY_S() { return getTokens(JavaParser.ARRAY_S); }
		public TerminalNode ARRAY_S(int i) {
			return getToken(JavaParser.ARRAY_S, i);
		}
		public List<TerminalNode> ARRAY_E() { return getTokens(JavaParser.ARRAY_E); }
		public TerminalNode ARRAY_E(int i) {
			return getToken(JavaParser.ARRAY_E, i);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Array_creator_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_creator_rest; }
	}

	public final Array_creator_restContext array_creator_rest() throws RecognitionException {
		Array_creator_restContext _localctx = new Array_creator_restContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_array_creator_rest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			match(ARRAY_S);
			setState(1708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY_E:
				{
				setState(1681);
				match(ARRAY_E);
				setState(1686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARRAY_S) {
					{
					{
					setState(1682);
					match(ARRAY_S);
					setState(1683);
					match(ARRAY_E);
					}
					}
					setState(1688);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1689);
				array_initializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case PAREN_S:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LT:
			case LOG_NOT:
			case TILDE:
			case UNN_INC:
			case UNN_DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1690);
				expression(0);
				setState(1691);
				match(ARRAY_E);
				setState(1698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1692);
						match(ARRAY_S);
						setState(1693);
						expression(0);
						setState(1694);
						match(ARRAY_E);
						}
						} 
					}
					setState(1700);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				}
				setState(1705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1701);
						match(ARRAY_S);
						setState(1702);
						match(ARRAY_E);
						}
						} 
					}
					setState(1707);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_creator_restContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Class_creator_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_creator_rest; }
	}

	public final Class_creator_restContext class_creator_rest() throws RecognitionException {
		Class_creator_restContext _localctx = new Class_creator_restContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_class_creator_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			arguments();
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1711);
				class_body();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_generic_invocationContext extends ParserRuleContext {
		public Non_wildcard_type_argumentsContext non_wildcard_type_arguments() {
			return getRuleContext(Non_wildcard_type_argumentsContext.class,0);
		}
		public Explicit_generic_invocation_suffixContext explicit_generic_invocation_suffix() {
			return getRuleContext(Explicit_generic_invocation_suffixContext.class,0);
		}
		public Explicit_generic_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_generic_invocation; }
	}

	public final Explicit_generic_invocationContext explicit_generic_invocation() throws RecognitionException {
		Explicit_generic_invocationContext _localctx = new Explicit_generic_invocationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_explicit_generic_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			non_wildcard_type_arguments();
			setState(1715);
			explicit_generic_invocation_suffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 104:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 114:
			return guarded_pattern_sempred((Guarded_patternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 13);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean guarded_pattern_sempred(Guarded_patternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u06b8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\3\2\3\2\3\3\3\3\3\4\3\4\3\4\5\4\u00fc\n\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\7\6\u0105\n\6\f\6\16\6\u0108\13\6\3\7\7\7\u010b"+
		"\n\7\f\7\16\7\u010e\13\7\3\7\3\7\5\7\u0112\n\7\3\7\7\7\u0115\n\7\f\7\16"+
		"\7\u0118\13\7\3\7\3\7\7\7\u011c\n\7\f\7\16\7\u011f\13\7\3\b\3\b\3\t\7"+
		"\t\u0124\n\t\f\t\16\t\u0127\13\t\3\t\3\t\3\t\7\t\u012c\n\t\f\t\16\t\u012f"+
		"\13\t\3\t\5\t\u0132\n\t\3\n\3\n\3\n\7\n\u0137\n\n\f\n\16\n\u013a\13\n"+
		"\3\13\3\13\7\13\u013e\n\13\f\13\16\13\u0141\13\13\3\13\3\13\3\13\5\13"+
		"\u0146\n\13\5\13\u0148\n\13\3\f\3\f\3\f\3\f\7\f\u014e\n\f\f\f\16\f\u0151"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u0158\n\r\3\r\3\r\5\r\u015c\n\r\5\r\u015e"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0165\n\16\3\17\3\17\5\17\u0169\n\17"+
		"\3\17\3\17\3\20\3\20\5\20\u016f\n\20\3\20\3\20\7\20\u0173\n\20\f\20\16"+
		"\20\u0176\13\20\3\20\3\20\5\20\u017a\n\20\3\21\3\21\3\21\5\21\u017f\n"+
		"\21\3\21\7\21\u0182\n\21\f\21\16\21\u0185\13\21\3\21\3\21\5\21\u0189\n"+
		"\21\3\22\5\22\u018c\n\22\3\22\7\22\u018f\n\22\f\22\16\22\u0192\13\22\3"+
		"\22\7\22\u0195\n\22\f\22\16\22\u0198\13\22\3\22\3\22\3\22\5\22\u019d\n"+
		"\22\3\23\7\23\u01a0\n\23\f\23\16\23\u01a3\13\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\5\24\u01ab\n\24\3\24\3\24\3\24\5\24\u01b0\n\24\3\24\3\24\3\25"+
		"\5\25\u01b5\n\25\3\25\3\25\3\25\3\25\3\26\7\26\u01bc\n\26\f\26\16\26\u01bf"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\5\26\u01c6\n\26\3\26\5\26\u01c9\n\26\3"+
		"\27\3\27\7\27\u01cd\n\27\f\27\16\27\u01d0\13\27\3\27\3\27\3\30\3\30\7"+
		"\30\u01d6\n\30\f\30\16\30\u01d9\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u01e2\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01ea\n\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01f8\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u01ff\n\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u020d\n\33\3\34\3\34\3\34\5\34\u0212"+
		"\n\34\3\34\3\34\5\34\u0216\n\34\3\34\3\34\5\34\u021a\n\34\3\34\3\34\5"+
		"\34\u021e\n\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u0226\n\35\f\35\16\35"+
		"\u0229\13\35\3\35\3\35\3\36\3\36\7\36\u022f\n\36\f\36\16\36\u0232\13\36"+
		"\3\36\3\36\3\37\3\37\5\37\u0238\n\37\3\37\3\37\7\37\u023c\n\37\f\37\16"+
		"\37\u023f\13\37\3\37\5\37\u0242\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 "+
		"\u024e\n \3!\3!\3!\3!\3\"\3\"\3\"\7\"\u0257\n\"\f\"\16\"\u025a\13\"\3"+
		"#\3#\3#\5#\u025f\n#\3$\3$\3$\7$\u0264\n$\f$\16$\u0267\13$\3%\3%\5%\u026b"+
		"\n%\3&\3&\3&\3&\3&\7&\u0272\n&\f&\16&\u0275\13&\3&\3&\5&\u0279\n&\3&\3"+
		"&\3\'\3\'\3\'\3\'\7\'\u0281\n\'\f\'\16\'\u0284\13\'\3\'\3\'\3(\3(\3(\7"+
		"(\u028b\n(\f(\16(\u028e\13(\3(\3(\5(\u0292\n(\3(\5(\u0295\n(\3)\3)\5)"+
		"\u0299\n)\3)\3)\3)\5)\u029e\n)\3)\5)\u02a1\n)\5)\u02a3\n)\3)\3)\3*\7*"+
		"\u02a8\n*\f*\16*\u02ab\13*\3*\3*\3*\3+\3+\5+\u02b2\n+\3,\3,\5,\u02b6\n"+
		",\3-\3-\3-\3.\3.\3.\3.\5.\u02bf\n.\3.\3.\3/\3/\3/\3/\5/\u02c7\n/\3/\3"+
		"/\5/\u02cb\n/\3/\5/\u02ce\n/\3/\5/\u02d1\n/\3/\3/\3\60\3\60\3\60\7\60"+
		"\u02d8\n\60\f\60\16\60\u02db\13\60\3\61\7\61\u02de\n\61\f\61\16\61\u02e1"+
		"\13\61\3\61\3\61\5\61\u02e5\n\61\3\61\5\61\u02e8\n\61\3\62\3\62\7\62\u02ec"+
		"\n\62\f\62\16\62\u02ef\13\62\3\63\3\63\3\63\5\63\u02f4\n\63\3\63\3\63"+
		"\3\63\5\63\u02f9\n\63\3\63\3\63\3\64\3\64\5\64\u02ff\n\64\3\64\3\64\3"+
		"\65\3\65\3\65\7\65\u0306\n\65\f\65\16\65\u0309\13\65\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\7\67\u0311\n\67\f\67\16\67\u0314\13\67\3\67\3\67\38\78\u0319"+
		"\n8\f8\168\u031c\138\38\38\38\39\39\39\59\u0324\n9\39\39\59\u0328\n9\3"+
		"9\39\59\u032c\n9\39\39\3:\3:\7:\u0332\n:\f:\16:\u0335\13:\3:\3:\3;\3;"+
		"\5;\u033b\n;\3<\3<\3<\3=\7=\u0341\n=\f=\16=\u0344\13=\3=\3=\5=\u0348\n"+
		"=\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0352\n>\3?\3?\3?\3?\7?\u0358\n?\f?\16?\u035b"+
		"\13?\3?\3?\3@\3@\3@\7@\u0362\n@\f@\16@\u0365\13@\3@\3@\3@\3A\7A\u036b"+
		"\nA\fA\16A\u036e\13A\3A\3A\3B\3B\3B\3B\3B\3B\5B\u0378\nB\3C\7C\u037b\n"+
		"C\fC\16C\u037e\13C\3C\3C\3C\3D\7D\u0384\nD\fD\16D\u0387\13D\3D\3D\3D\3"+
		"D\3D\7D\u038e\nD\fD\16D\u0391\13D\3D\3D\5D\u0395\nD\3D\3D\3E\3E\3E\3F"+
		"\3F\3F\7F\u039f\nF\fF\16F\u03a2\13F\3F\3F\3F\3G\3G\3G\5G\u03aa\nG\3G\3"+
		"G\3G\5G\u03af\nG\3G\5G\u03b2\nG\3H\3H\3H\7H\u03b7\nH\fH\16H\u03ba\13H"+
		"\3I\3I\3I\3I\3J\3J\3J\5J\u03c3\nJ\3K\3K\3K\3K\7K\u03c9\nK\fK\16K\u03cc"+
		"\13K\5K\u03ce\nK\3K\5K\u03d1\nK\3K\3K\3L\3L\3L\3L\3L\3M\3M\7M\u03dc\n"+
		"M\fM\16M\u03df\13M\3M\3M\3N\7N\u03e4\nN\fN\16N\u03e7\13N\3N\3N\5N\u03eb"+
		"\nN\3O\3O\3O\3O\3O\3O\5O\u03f3\nO\3O\3O\5O\u03f7\nO\3O\3O\5O\u03fb\nO"+
		"\3O\3O\5O\u03ff\nO\3O\3O\5O\u0403\nO\5O\u0405\nO\3P\3P\5P\u0409\nP\3Q"+
		"\3Q\3Q\3Q\5Q\u040f\nQ\3R\3R\3S\3S\3S\3S\7S\u0417\nS\fS\16S\u041a\13S\3"+
		"S\5S\u041d\nS\5S\u041f\nS\3S\3S\3T\3T\7T\u0425\nT\fT\16T\u0428\13T\3T"+
		"\3T\3U\3U\3U\3U\3U\5U\u0431\nU\3V\7V\u0434\nV\fV\16V\u0437\13V\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\5V\u0441\nV\3W\3W\3W\3W\3W\5W\u0448\nW\3W\3W\3W\3W\3"+
		"W\3W\3W\5W\u0451\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\6W\u0466\nW\rW\16W\u0467\3W\5W\u046b\nW\3W\5W\u046e\nW\3W\3W\3"+
		"W\3W\7W\u0474\nW\fW\16W\u0477\13W\3W\5W\u047a\nW\3W\3W\3W\3W\7W\u0480"+
		"\nW\fW\16W\u0483\13W\3W\7W\u0486\nW\fW\16W\u0489\13W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\5W\u0493\nW\3W\3W\3W\3W\3W\3W\3W\5W\u049c\nW\3W\3W\3W\5W\u04a1"+
		"\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u04ae\nW\3W\3W\3W\3W\5W\u04b4"+
		"\nW\3X\3X\7X\u04b8\nX\fX\16X\u04bb\13X\5X\u04bd\nX\3Y\6Y\u04c0\nY\rY\16"+
		"Y\u04c1\3Y\6Y\u04c5\nY\rY\16Y\u04c6\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u04cf\nZ\3Z\3"+
		"Z\3Z\5Z\u04d4\nZ\3[\3[\5[\u04d8\n[\3\\\3\\\5\\\u04dc\n\\\3\\\3\\\5\\\u04e0"+
		"\n\\\3\\\3\\\5\\\u04e4\n\\\5\\\u04e6\n\\\3]\7]\u04e9\n]\f]\16]\u04ec\13"+
		"]\3]\3]\5]\u04f0\n]\3]\3]\3]\3]\3^\3^\3^\7^\u04f9\n^\f^\16^\u04fc\13^"+
		"\3^\3^\3^\3^\3^\3_\3_\3_\7_\u0506\n_\f_\16_\u0509\13_\3`\3`\3`\3a\3a\3"+
		"a\5a\u0511\na\3a\3a\3b\3b\3b\7b\u0518\nb\fb\16b\u051b\13b\3c\7c\u051e"+
		"\nc\fc\16c\u0521\13c\3c\3c\3c\3c\3c\5c\u0528\nc\3c\3c\3c\3c\5c\u052e\n"+
		"c\3d\7d\u0531\nd\fd\16d\u0534\13d\3d\3d\7d\u0538\nd\fd\16d\u053b\13d\3"+
		"d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u054f\ne\5e\u0551"+
		"\ne\3f\3f\3f\3f\3f\3f\3f\5f\u055a\nf\3g\3g\3h\3h\3i\3i\3i\5i\u0563\ni"+
		"\3j\3j\3j\3j\3j\3j\3j\7j\u056c\nj\fj\16j\u056f\13j\3j\3j\3j\7j\u0574\n"+
		"j\fj\16j\u0577\13j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0584\nj\3j\3j"+
		"\5j\u0588\nj\3j\3j\3j\5j\u058d\nj\3j\3j\5j\u0591\nj\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\5j\u05a1\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\5j\u05c9\nj\3j\3j\3j\3j\5j\u05cf\nj\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\5j\u05dc\nj\3j\3j\3j\5j\u05e1\nj\3j\7j\u05e4\nj\fj\16j\u05e7"+
		"\13j\3k\3k\3k\3k\7k\u05ed\nk\fk\16k\u05f0\13k\3k\3k\3l\3l\3l\3l\5l\u05f8"+
		"\nl\3l\3l\3l\3l\3l\5l\u05ff\nl\3m\3m\3m\7m\u0604\nm\fm\16m\u0607\13m\3"+
		"n\7n\u060a\nn\fn\16n\u060d\13n\3n\3n\7n\u0611\nn\fn\16n\u0614\13n\3n\3"+
		"n\3n\3o\3o\3o\7o\u061c\no\fo\16o\u061f\13o\3p\7p\u0622\np\fp\16p\u0625"+
		"\13p\3p\3p\3p\5p\u062a\np\3q\3q\3q\3q\3r\3r\3r\7r\u0633\nr\fr\16r\u0636"+
		"\13r\3s\3s\3s\5s\u063b\ns\3s\3s\3s\3s\3s\5s\u0642\ns\3s\3s\3s\3s\5s\u0648"+
		"\ns\3s\5s\u064b\ns\3t\3t\3t\3t\3t\3t\7t\u0653\nt\ft\16t\u0656\13t\3t\3"+
		"t\7t\u065a\nt\ft\16t\u065d\13t\3t\3t\3t\7t\u0662\nt\ft\16t\u0665\13t\5"+
		"t\u0667\nt\3t\3t\3t\7t\u066c\nt\ft\16t\u066f\13t\3u\3u\3u\3u\3u\3u\3u"+
		"\5u\u0678\nu\5u\u067a\nu\3v\3v\5v\u067e\nv\3v\3v\3v\5v\u0683\nv\7v\u0685"+
		"\nv\fv\16v\u0688\13v\3v\5v\u068b\nv\3w\3w\5w\u068f\nw\3w\3w\3x\3x\3x\3"+
		"x\7x\u0697\nx\fx\16x\u069a\13x\3x\3x\3x\3x\3x\3x\3x\7x\u06a3\nx\fx\16"+
		"x\u06a6\13x\3x\3x\7x\u06aa\nx\fx\16x\u06ad\13x\5x\u06af\nx\3y\3y\5y\u06b3"+
		"\ny\3z\3z\3z\3z\2\4\u00d2\u00e6{\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\2\22\4\2\65C\u0082\u0082"+
		"\5\2\65>AC\u0082\u0082\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\4\2"+
		"\23\23**\4\2((>>\3\2NQ\3\2RS\3\2il\3\2_`\4\2mnrr\3\2kl\4\2]^de\4\2ccf"+
		"f\4\2\\\\s}\3\2ij\4\2bb~~\2\u077a\2\u00f4\3\2\2\2\4\u00f6\3\2\2\2\6\u00fb"+
		"\3\2\2\2\b\u00fd\3\2\2\2\n\u0101\3\2\2\2\f\u010c\3\2\2\2\16\u0120\3\2"+
		"\2\2\20\u0125\3\2\2\2\22\u0133\3\2\2\2\24\u0147\3\2\2\2\26\u0149\3\2\2"+
		"\2\30\u015d\3\2\2\2\32\u0164\3\2\2\2\34\u0166\3\2\2\2\36\u0174\3\2\2\2"+
		" \u017e\3\2\2\2\"\u019c\3\2\2\2$\u01a1\3\2\2\2&\u01a8\3\2\2\2(\u01b4\3"+
		"\2\2\2*\u01c8\3\2\2\2,\u01ca\3\2\2\2.\u01f7\3\2\2\2\60\u01fe\3\2\2\2\62"+
		"\u0200\3\2\2\2\64\u020c\3\2\2\2\66\u020e\3\2\2\28\u0221\3\2\2\2:\u022c"+
		"\3\2\2\2<\u0241\3\2\2\2>\u024d\3\2\2\2@\u024f\3\2\2\2B\u0253\3\2\2\2D"+
		"\u025b\3\2\2\2F\u0260\3\2\2\2H\u026a\3\2\2\2J\u026c\3\2\2\2L\u027c\3\2"+
		"\2\2N\u0294\3\2\2\2P\u0296\3\2\2\2R\u02a9\3\2\2\2T\u02b1\3\2\2\2V\u02b5"+
		"\3\2\2\2X\u02b7\3\2\2\2Z\u02ba\3\2\2\2\\\u02c2\3\2\2\2^\u02d4\3\2\2\2"+
		"`\u02df\3\2\2\2b\u02e9\3\2\2\2d\u02f0\3\2\2\2f\u02fc\3\2\2\2h\u0302\3"+
		"\2\2\2j\u030a\3\2\2\2l\u030d\3\2\2\2n\u031a\3\2\2\2p\u0320\3\2\2\2r\u032f"+
		"\3\2\2\2t\u033a\3\2\2\2v\u033c\3\2\2\2x\u0347\3\2\2\2z\u0351\3\2\2\2|"+
		"\u0353\3\2\2\2~\u035e\3\2\2\2\u0080\u036c\3\2\2\2\u0082\u0377\3\2\2\2"+
		"\u0084\u037c\3\2\2\2\u0086\u0385\3\2\2\2\u0088\u0398\3\2\2\2\u008a\u03a0"+
		"\3\2\2\2\u008c\u03a9\3\2\2\2\u008e\u03b3\3\2\2\2\u0090\u03bb\3\2\2\2\u0092"+
		"\u03c2\3\2\2\2\u0094\u03c4\3\2\2\2\u0096\u03d4\3\2\2\2\u0098\u03d9\3\2"+
		"\2\2\u009a\u03ea\3\2\2\2\u009c\u0404\3\2\2\2\u009e\u0408\3\2\2\2\u00a0"+
		"\u040a\3\2\2\2\u00a2\u0410\3\2\2\2\u00a4\u0412\3\2\2\2\u00a6\u0422\3\2"+
		"\2\2\u00a8\u0430\3\2\2\2\u00aa\u0435\3\2\2\2\u00ac\u04b3\3\2\2\2\u00ae"+
		"\u04bc\3\2\2\2\u00b0\u04bf\3\2\2\2\u00b2\u04d3\3\2\2\2\u00b4\u04d7\3\2"+
		"\2\2\u00b6\u04e5\3\2\2\2\u00b8\u04ea\3\2\2\2\u00ba\u04f5\3\2\2\2\u00bc"+
		"\u0502\3\2\2\2\u00be\u050a\3\2\2\2\u00c0\u050d\3\2\2\2\u00c2\u0514\3\2"+
		"\2\2\u00c4\u052d\3\2\2\2\u00c6\u0532\3\2\2\2\u00c8\u0550\3\2\2\2\u00ca"+
		"\u0559\3\2\2\2\u00cc\u055b\3\2\2\2\u00ce\u055d\3\2\2\2\u00d0\u0562\3\2"+
		"\2\2\u00d2\u0590\3\2\2\2\u00d4\u05e8\3\2\2\2\u00d6\u05fe\3\2\2\2\u00d8"+
		"\u0600\3\2\2\2\u00da\u060b\3\2\2\2\u00dc\u0618\3\2\2\2\u00de\u0623\3\2"+
		"\2\2\u00e0\u062b\3\2\2\2\u00e2\u062f\3\2\2\2\u00e4\u064a\3\2\2\2\u00e6"+
		"\u0666\3\2\2\2\u00e8\u0679\3\2\2\2\u00ea\u068a\3\2\2\2\u00ec\u068c\3\2"+
		"\2\2\u00ee\u0692\3\2\2\2\u00f0\u06b0\3\2\2\2\u00f2\u06b4\3\2\2\2\u00f4"+
		"\u00f5\t\2\2\2\u00f5\3\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f7\5\3\2\2\2\u00f8"+
		"\u00f9\7^\2\2\u00f9\u00fc\7]\2\2\u00fa\u00fc\5\b\5\2\u00fb\u00f8\3\2\2"+
		"\2\u00fb\u00fa\3\2\2\2\u00fc\7\3\2\2\2\u00fd\u00fe\7^\2\2\u00fe\u00ff"+
		"\5\n\6\2\u00ff\u0100\7]\2\2\u0100\t\3\2\2\2\u0101\u0106\5\f\7\2\u0102"+
		"\u0103\7F\2\2\u0103\u0105\5\f\7\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\13\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010b\5\u008cG\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0111\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010f\u0112\5\36\20\2\u0110\u0112\5\16\b\2\u0111\u010f\3\2\2"+
		"\2\u0111\u0110\3\2\2\2\u0112\u011d\3\2\2\2\u0113\u0115\5\u008cG\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7L\2\2\u011a"+
		"\u011c\7M\2\2\u011b\u0116\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\r\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121"+
		"\t\4\2\2\u0121\17\3\2\2\2\u0122\u0124\5\u008cG\2\u0123\u0122\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128\u0131\5\2\2\2\u0129\u012d\7\23\2\2\u012a"+
		"\u012c\5\u008cG\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0132\5\22\n\2\u0131\u0129\3\2\2\2\u0131\u0132\3\2\2\2\u0132\21\3\2\2"+
		"\2\u0133\u0138\5\f\7\2\u0134\u0135\7o\2\2\u0135\u0137\5\f\7\2\u0136\u0134"+
		"\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\23\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0148\5\f\7\2\u013c\u013e\5\u008c"+
		"G\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0145\7a"+
		"\2\2\u0143\u0144\t\5\2\2\u0144\u0146\5\f\7\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u013b\3\2\2\2\u0147\u013f\3\2"+
		"\2\2\u0148\25\3\2\2\2\u0149\u014a\7^\2\2\u014a\u014f\5\24\13\2\u014b\u014c"+
		"\7F\2\2\u014c\u014e\5\24\13\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2"+
		"\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0153\7]\2\2\u0153\27\3\2\2\2\u0154\u015e\5\34\17\2\u0155"+
		"\u0157\7G\2\2\u0156\u0158\5\26\f\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015b\5\2\2\2\u015a\u015c\5\34\17\2\u015b"+
		"\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u0154\3\2"+
		"\2\2\u015d\u0155\3\2\2\2\u015e\31\3\2\2\2\u015f\u0160\7*\2\2\u0160\u0165"+
		"\5\30\r\2\u0161\u0162\5\2\2\2\u0162\u0163\5\34\17\2\u0163\u0165\3\2\2"+
		"\2\u0164\u015f\3\2\2\2\u0164\u0161\3\2\2\2\u0165\33\3\2\2\2\u0166\u0168"+
		"\7H\2\2\u0167\u0169\5\u00e2r\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2"+
		"\u0169\u016a\3\2\2\2\u016a\u016b\7I\2\2\u016b\35\3\2\2\2\u016c\u016e\5"+
		"\2\2\2\u016d\u016f\5\26\f\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\7G\2\2\u0171\u0173\3\2\2\2\u0172\u016c\3\2"+
		"\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0179\5\4\3\2\u0178\u017a\5\26"+
		"\f\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\37\3\2\2\2\u017b\u017c"+
		"\5\36\20\2\u017c\u017d\7G\2\2\u017d\u017f\3\2\2\2\u017e\u017b\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017f\u0183\3\2\2\2\u0180\u0182\5\u008cG\2\u0181"+
		"\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188\5\2\2\2\u0187"+
		"\u0189\5\26\f\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189!\3\2\2\2"+
		"\u018a\u018c\5$\23\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0190"+
		"\3\2\2\2\u018d\u018f\5&\24\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0196\3\2\2\2\u0192\u0190\3\2"+
		"\2\2\u0193\u0195\5*\26\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019d\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0199\u019a\5(\25\2\u019a\u019b\7\2\2\3\u019b\u019d\3\2\2\2\u019c"+
		"\u018b\3\2\2\2\u019c\u0199\3\2\2\2\u019d#\3\2\2\2\u019e\u01a0\5\u008c"+
		"G\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7\""+
		"\2\2\u01a5\u01a6\5\u00dco\2\u01a6\u01a7\7E\2\2\u01a7%\3\2\2\2\u01a8\u01aa"+
		"\7\33\2\2\u01a9\u01ab\7(\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01af\5\u00dco\2\u01ad\u01ae\7G\2\2\u01ae\u01b0\7"+
		"m\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\7E\2\2\u01b2\'\3\2\2\2\u01b3\u01b5\7\66\2\2\u01b4\u01b3\3\2\2\2"+
		"\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7\65\2\2\u01b7\u01b8"+
		"\5\u00dco\2\u01b8\u01b9\5,\27\2\u01b9)\3\2\2\2\u01ba\u01bc\5\64\33\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01c5\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c6\5\66\34\2\u01c1"+
		"\u01c6\5\\/\2\u01c2\u01c6\5p9\2\u01c3\u01c6\5\u0096L\2\u01c4\u01c6\5d"+
		"\63\2\u01c5\u01c0\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c9\7E"+
		"\2\2\u01c8\u01bd\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9+\3\2\2\2\u01ca\u01ce"+
		"\7J\2\2\u01cb\u01cd\5.\30\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d1\u01d2\7K\2\2\u01d2-\3\2\2\2\u01d3\u01d7\7\67\2\2\u01d4\u01d6"+
		"\5\62\32\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2"+
		"\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db"+
		"\5\u00dco\2\u01db\u01dc\7E\2\2\u01dc\u01f8\3\2\2\2\u01dd\u01de\78\2\2"+
		"\u01de\u01e1\5\u00dco\2\u01df\u01e0\7:\2\2\u01e0\u01e2\5\u00dco\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7E"+
		"\2\2\u01e4\u01f8\3\2\2\2\u01e5\u01e6\79\2\2\u01e6\u01e9\5\u00dco\2\u01e7"+
		"\u01e8\7:\2\2\u01e8\u01ea\5\u00dco\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3"+
		"\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\7E\2\2\u01ec\u01f8\3\2\2\2\u01ed"+
		"\u01ee\7;\2\2\u01ee\u01ef\5\u00dco\2\u01ef\u01f0\7E\2\2\u01f0\u01f8\3"+
		"\2\2\2\u01f1\u01f2\7<\2\2\u01f2\u01f3\5\u00dco\2\u01f3\u01f4\7=\2\2\u01f4"+
		"\u01f5\5\u00dco\2\u01f5\u01f6\7E\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01d3\3"+
		"\2\2\2\u01f7\u01dd\3\2\2\2\u01f7\u01e5\3\2\2\2\u01f7\u01ed\3\2\2\2\u01f7"+
		"\u01f1\3\2\2\2\u01f8/\3\2\2\2\u01f9\u01ff\5\64\33\2\u01fa\u01ff\7 \2\2"+
		"\u01fb\u01ff\7,\2\2\u01fc\u01ff\7\60\2\2\u01fd\u01ff\7\63\2\2\u01fe\u01f9"+
		"\3\2\2\2\u01fe\u01fa\3\2\2\2\u01fe\u01fb\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe"+
		"\u01fd\3\2\2\2\u01ff\61\3\2\2\2\u0200\u0201\t\6\2\2\u0201\63\3\2\2\2\u0202"+
		"\u020d\5\u008cG\2\u0203\u020d\7%\2\2\u0204\u020d\7$\2\2\u0205\u020d\7"+
		"#\2\2\u0206\u020d\7(\2\2\u0207\u020d\7\3\2\2\u0208\u020d\7\24\2\2\u0209"+
		"\u020d\7)\2\2\u020a\u020d\7B\2\2\u020b\u020d\7D\2\2\u020c\u0202\3\2\2"+
		"\2\u020c\u0203\3\2\2\2\u020c\u0204\3\2\2\2\u020c\u0205\3\2\2\2\u020c\u0206"+
		"\3\2\2\2\u020c\u0207\3\2\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\65\3\2\2\2\u020e\u020f\7\13\2"+
		"\2\u020f\u0211\5\2\2\2\u0210\u0212\58\35\2\u0211\u0210\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0214\7\23\2\2\u0214\u0216\5\f\7\2"+
		"\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0218"+
		"\7\32\2\2\u0218\u021a\5\n\6\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2"+
		"\u021a\u021d\3\2\2\2\u021b\u021c\7C\2\2\u021c\u021e\5\n\6\2\u021d\u021b"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\5:\36\2\u0220"+
		"\67\3\2\2\2\u0221\u0222\7^\2\2\u0222\u0227\5\20\t\2\u0223\u0224\7F\2\2"+
		"\u0224\u0226\5\20\t\2\u0225\u0223\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a"+
		"\u022b\7]\2\2\u022b9\3\2\2\2\u022c\u0230\7J\2\2\u022d\u022f\5<\37\2\u022e"+
		"\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\7K\2\2\u0234"+
		";\3\2\2\2\u0235\u0242\7E\2\2\u0236\u0238\7(\2\2\u0237\u0236\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0242\5\u00a6T\2\u023a\u023c"+
		"\5\60\31\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2"+
		"\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0242"+
		"\5> \2\u0241\u0235\3\2\2\2\u0241\u0237\3\2\2\2\u0241\u023d\3\2\2\2\u0242"+
		"=\3\2\2\2\u0243\u024e\5d\63\2\u0244\u024e\5J&\2\u0245\u024e\5v<\2\u0246"+
		"\u024e\5@!\2\u0247\u024e\5Z.\2\u0248\u024e\5X-\2\u0249\u024e\5p9\2\u024a"+
		"\u024e\5\u0096L\2\u024b\u024e\5\66\34\2\u024c\u024e\5\\/\2\u024d\u0243"+
		"\3\2\2\2\u024d\u0244\3\2\2\2\u024d\u0245\3\2\2\2\u024d\u0246\3\2\2\2\u024d"+
		"\u0247\3\2\2\2\u024d\u0248\3\2\2\2\u024d\u0249\3\2\2\2\u024d\u024a\3\2"+
		"\2\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024e?\3\2\2\2\u024f\u0250"+
		"\5\f\7\2\u0250\u0251\5B\"\2\u0251\u0252\7E\2\2\u0252A\3\2\2\2\u0253\u0258"+
		"\5D#\2\u0254\u0255\7F\2\2\u0255\u0257\5D#\2\u0256\u0254\3\2\2\2\u0257"+
		"\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259C\3\2\2\2"+
		"\u025a\u0258\3\2\2\2\u025b\u025e\5F$\2\u025c\u025d\7\\\2\2\u025d\u025f"+
		"\5H%\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025fE\3\2\2\2\u0260\u0265"+
		"\5\2\2\2\u0261\u0262\7L\2\2\u0262\u0264\7M\2\2\u0263\u0261\3\2\2\2\u0264"+
		"\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266G\3\2\2\2"+
		"\u0267\u0265\3\2\2\2\u0268\u026b\5\u00a4S\2\u0269\u026b\5\u00d2j\2\u026a"+
		"\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026bI\3\2\2\2\u026c\u026d\5t;\2\u026d"+
		"\u026e\5\2\2\2\u026e\u0273\5P)\2\u026f\u0270\7L\2\2\u0270\u0272\7M\2\2"+
		"\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0278\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277\7/\2\2\u0277"+
		"\u0279\5\u00d8m\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a"+
		"\3\2\2\2\u027a\u027b\5V,\2\u027bK\3\2\2\2\u027c\u0282\5\f\7\2\u027d\u027e"+
		"\5\2\2\2\u027e\u027f\7G\2\2\u027f\u0281\3\2\2\2\u0280\u027d\3\2\2\2\u0281"+
		"\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0285\u0286\7-\2\2\u0286M\3\2\2\2\u0287\u028c"+
		"\5R*\2\u0288\u0289\7F\2\2\u0289\u028b\5R*\2\u028a\u0288\3\2\2\2\u028b"+
		"\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0291\3\2"+
		"\2\2\u028e\u028c\3\2\2\2\u028f\u0290\7F\2\2\u0290\u0292\5\u00dan\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0295\5\u00da"+
		"n\2\u0294\u0287\3\2\2\2\u0294\u0293\3\2\2\2\u0295O\3\2\2\2\u0296\u02a2"+
		"\7H\2\2\u0297\u0299\5L\'\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u02a3\3\2\2\2\u029a\u029d\5L\'\2\u029b\u029c\7F\2\2\u029c\u029e\5N(\2"+
		"\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a3\3\2\2\2\u029f\u02a1"+
		"\5N(\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2"+
		"\u0298\3\2\2\2\u02a2\u029a\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\3\2"+
		"\2\2\u02a4\u02a5\7I\2\2\u02a5Q\3\2\2\2\u02a6\u02a8\5T+\2\u02a7\u02a6\3"+
		"\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\5\f\7\2\u02ad\u02ae\5F"+
		"$\2\u02aeS\3\2\2\2\u02af\u02b2\7\24\2\2\u02b0\u02b2\5\u008cG\2\u02b1\u02af"+
		"\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2U\3\2\2\2\u02b3\u02b6\5\u00a6T\2\u02b4"+
		"\u02b6\7E\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6W\3\2\2\2\u02b7"+
		"\u02b8\58\35\2\u02b8\u02b9\5Z.\2\u02b9Y\3\2\2\2\u02ba\u02bb\5\2\2\2\u02bb"+
		"\u02be\5P)\2\u02bc\u02bd\7/\2\2\u02bd\u02bf\5\u00d8m\2\u02be\u02bc\3\2"+
		"\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\5\u00a6T\2\u02c1"+
		"[\3\2\2\2\u02c2\u02c3\7\22\2\2\u02c3\u02c6\5\2\2\2\u02c4\u02c5\7\32\2"+
		"\2\u02c5\u02c7\5\n\6\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02ca\7J\2\2\u02c9\u02cb\5^\60\2\u02ca\u02c9\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02ce\7F\2\2\u02cd\u02cc\3\2"+
		"\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02d1\5b\62\2\u02d0"+
		"\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\7K"+
		"\2\2\u02d3]\3\2\2\2\u02d4\u02d9\5`\61\2\u02d5\u02d6\7F\2\2\u02d6\u02d8"+
		"\5`\61\2\u02d7\u02d5\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da_\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02de\5\u008c"+
		"G\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e4\5\2"+
		"\2\2\u02e3\u02e5\5\34\17\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e7\3\2\2\2\u02e6\u02e8\5:\36\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8a\3\2\2\2\u02e9\u02ed\7E\2\2\u02ea\u02ec\5<\37\2\u02eb\u02ea"+
		"\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"c\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\7A\2\2\u02f1\u02f3\5\2\2\2\u02f2"+
		"\u02f4\58\35\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2"+
		"\2\2\u02f5\u02f8\5f\64\2\u02f6\u02f7\7\32\2\2\u02f7\u02f9\5\n\6\2\u02f8"+
		"\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\5l"+
		"\67\2\u02fbe\3\2\2\2\u02fc\u02fe\7H\2\2\u02fd\u02ff\5h\65\2\u02fe\u02fd"+
		"\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\7I\2\2\u0301"+
		"g\3\2\2\2\u0302\u0307\5j\66\2\u0303\u0304\7F\2\2\u0304\u0306\5j\66\2\u0305"+
		"\u0303\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2"+
		"\2\2\u0308i\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030b\5\f\7\2\u030b\u030c"+
		"\5\2\2\2\u030ck\3\2\2\2\u030d\u0312\7J\2\2\u030e\u0311\5<\37\2\u030f\u0311"+
		"\5n8\2\u0310\u030e\3\2\2\2\u0310\u030f\3\2\2\2\u0311\u0314\3\2\2\2\u0312"+
		"\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314\u0312\3\2"+
		"\2\2\u0315\u0316\7K\2\2\u0316m\3\2\2\2\u0317\u0319\5\60\31\2\u0318\u0317"+
		"\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031d\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u031e\5\2\2\2\u031e\u031f\5\u00a6"+
		"T\2\u031fo\3\2\2\2\u0320\u0321\7\36\2\2\u0321\u0323\5\2\2\2\u0322\u0324"+
		"\58\35\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0327\3\2\2\2\u0325"+
		"\u0326\7\23\2\2\u0326\u0328\5\n\6\2\u0327\u0325\3\2\2\2\u0327\u0328\3"+
		"\2\2\2\u0328\u032b\3\2\2\2\u0329\u032a\7C\2\2\u032a\u032c\5\n\6\2\u032b"+
		"\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\5r"+
		":\2\u032eq\3\2\2\2\u032f\u0333\7J\2\2\u0330\u0332\5x=\2\u0331\u0330\3"+
		"\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0336\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0337\7K\2\2\u0337s\3\2\2\2\u0338"+
		"\u033b\5\f\7\2\u0339\u033b\7\62\2\2\u033a\u0338\3\2\2\2\u033a\u0339\3"+
		"\2\2\2\u033bu\3\2\2\2\u033c\u033d\58\35\2\u033d\u033e\5J&\2\u033ew\3\2"+
		"\2\2\u033f\u0341\5\60\31\2\u0340\u033f\3\2\2\2\u0341\u0344\3\2\2\2\u0342"+
		"\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u0342\3\2"+
		"\2\2\u0345\u0348\5z>\2\u0346\u0348\7E\2\2\u0347\u0342\3\2\2\2\u0347\u0346"+
		"\3\2\2\2\u0348y\3\2\2\2\u0349\u0352\5|?\2\u034a\u0352\5\u0080A\2\u034b"+
		"\u0352\5\u0084C\2\u034c\u0352\5p9\2\u034d\u0352\5\u0096L\2\u034e\u0352"+
		"\5\66\34\2\u034f\u0352\5\\/\2\u0350\u0352\5d\63\2\u0351\u0349\3\2\2\2"+
		"\u0351\u034a\3\2\2\2\u0351\u034b\3\2\2\2\u0351\u034c\3\2\2\2\u0351\u034d"+
		"\3\2\2\2\u0351\u034e\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0350\3\2\2\2\u0352"+
		"{\3\2\2\2\u0353\u0354\5\f\7\2\u0354\u0359\5~@\2\u0355\u0356\7F\2\2\u0356"+
		"\u0358\5~@\2\u0357\u0355\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2"+
		"\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u035d"+
		"\7E\2\2\u035d}\3\2\2\2\u035e\u0363\5\2\2\2\u035f\u0360\7L\2\2\u0360\u0362"+
		"\7M\2\2\u0361\u035f\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u0367\7\\"+
		"\2\2\u0367\u0368\5H%\2\u0368\177\3\2\2\2\u0369\u036b\5\u0082B\2\u036a"+
		"\u0369\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2"+
		"\2\2\u036d\u036f\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0370\5\u0086D\2\u0370"+
		"\u0081\3\2\2\2\u0371\u0378\5\u008cG\2\u0372\u0378\7%\2\2\u0373\u0378\7"+
		"\3\2\2\u0374\u0378\7\16\2\2\u0375\u0378\7(\2\2\u0376\u0378\7)\2\2\u0377"+
		"\u0371\3\2\2\2\u0377\u0372\3\2\2\2\u0377\u0373\3\2\2\2\u0377\u0374\3\2"+
		"\2\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2\2\u0378\u0083\3\2\2\2\u0379"+
		"\u037b\5\u0082B\2\u037a\u0379\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a"+
		"\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f\3\2\2\2\u037e\u037c\3\2\2\2\u037f"+
		"\u0380\58\35\2\u0380\u0381\5\u0086D\2\u0381\u0085\3\2\2\2\u0382\u0384"+
		"\5\u008cG\2\u0383\u0382\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2"+
		"\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0389"+
		"\5t;\2\u0389\u038a\5\2\2\2\u038a\u038f\5P)\2\u038b\u038c\7L\2\2\u038c"+
		"\u038e\7M\2\2\u038d\u038b\3\2\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2"+
		"\2\2\u038f\u0390\3\2\2\2\u0390\u0394\3\2\2\2\u0391\u038f\3\2\2\2\u0392"+
		"\u0393\7/\2\2\u0393\u0395\5\u00d8m\2\u0394\u0392\3\2\2\2\u0394\u0395\3"+
		"\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\5V,\2\u0397\u0087\3\2\2\2\u0398"+
		"\u0399\7\16\2\2\u0399\u039a\5\u0092J\2\u039a\u0089\3\2\2\2\u039b\u039c"+
		"\5\2\2\2\u039c\u039d\7G\2\2\u039d\u039f\3\2\2\2\u039e\u039b\3\2\2\2\u039f"+
		"\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2"+
		"\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a4\7\u0080\2\2\u03a4\u03a5\5\2\2\2\u03a5"+
		"\u008b\3\2\2\2\u03a6\u03a7\7\u0080\2\2\u03a7\u03aa\5\u00dco\2\u03a8\u03aa"+
		"\5\u008aF\2\u03a9\u03a6\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\u03b1\3\2\2"+
		"\2\u03ab\u03ae\7H\2\2\u03ac\u03af\5\u008eH\2\u03ad\u03af\5\u0092J\2\u03ae"+
		"\u03ac\3\2\2\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2"+
		"\2\2\u03b0\u03b2\7I\2\2\u03b1\u03ab\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u008d\3\2\2\2\u03b3\u03b8\5\u0090I\2\u03b4\u03b5\7F\2\2\u03b5\u03b7\5"+
		"\u0090I\2\u03b6\u03b4\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2"+
		"\u03b8\u03b9\3\2\2\2\u03b9\u008f\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bc"+
		"\5\2\2\2\u03bc\u03bd\7\\\2\2\u03bd\u03be\5\u0092J\2\u03be\u0091\3\2\2"+
		"\2\u03bf\u03c3\5\u00d2j\2\u03c0\u03c3\5\u008cG\2\u03c1\u03c3\5\u0094K"+
		"\2\u03c2\u03bf\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c1\3\2\2\2\u03c3\u0093"+
		"\3\2\2\2\u03c4\u03cd\7J\2\2\u03c5\u03ca\5\u0092J\2\u03c6\u03c7\7F\2\2"+
		"\u03c7\u03c9\5\u0092J\2\u03c8\u03c6\3\2\2\2\u03c9\u03cc\3\2\2\2\u03ca"+
		"\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc\u03ca\3\2"+
		"\2\2\u03cd\u03c5\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf"+
		"\u03d1\7F\2\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\3\2"+
		"\2\2\u03d2\u03d3\7K\2\2\u03d3\u0095\3\2\2\2\u03d4\u03d5\7\u0080\2\2\u03d5"+
		"\u03d6\7\36\2\2\u03d6\u03d7\5\2\2\2\u03d7\u03d8\5\u0098M\2\u03d8\u0097"+
		"\3\2\2\2\u03d9\u03dd\7J\2\2\u03da\u03dc\5\u009aN\2\u03db\u03da\3\2\2\2"+
		"\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0"+
		"\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e1\7K\2\2\u03e1\u0099\3\2\2\2\u03e2"+
		"\u03e4\5\60\31\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3"+
		"\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8"+
		"\u03eb\5\u009cO\2\u03e9\u03eb\7E\2\2\u03ea\u03e5\3\2\2\2\u03ea\u03e9\3"+
		"\2\2\2\u03eb\u009b\3\2\2\2\u03ec\u03ed\5\f\7\2\u03ed\u03ee\5\u009eP\2"+
		"\u03ee\u03ef\7E\2\2\u03ef\u0405\3\2\2\2\u03f0\u03f2\5\66\34\2\u03f1\u03f3"+
		"\7E\2\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u0405\3\2\2\2\u03f4"+
		"\u03f6\5p9\2\u03f5\u03f7\7E\2\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2"+
		"\2\u03f7\u0405\3\2\2\2\u03f8\u03fa\5\\/\2\u03f9\u03fb\7E\2\2\u03fa\u03f9"+
		"\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u0405\3\2\2\2\u03fc\u03fe\5\u0096L"+
		"\2\u03fd\u03ff\7E\2\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0405"+
		"\3\2\2\2\u0400\u0402\5d\63\2\u0401\u0403\7E\2\2\u0402\u0401\3\2\2\2\u0402"+
		"\u0403\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u03ec\3\2\2\2\u0404\u03f0\3\2"+
		"\2\2\u0404\u03f4\3\2\2\2\u0404\u03f8\3\2\2\2\u0404\u03fc\3\2\2\2\u0404"+
		"\u0400\3\2\2\2\u0405\u009d\3\2\2\2\u0406\u0409\5\u00a0Q\2\u0407\u0409"+
		"\5\u00a2R\2\u0408\u0406\3\2\2\2\u0408\u0407\3\2\2\2\u0409\u009f\3\2\2"+
		"\2\u040a\u040b\5\2\2\2\u040b\u040c\7H\2\2\u040c\u040e\7I\2\2\u040d\u040f"+
		"\5\u0088E\2\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u00a1\3\2\2"+
		"\2\u0410\u0411\5B\"\2\u0411\u00a3\3\2\2\2\u0412\u041e\7J\2\2\u0413\u0418"+
		"\5H%\2\u0414\u0415\7F\2\2\u0415\u0417\5H%\2\u0416\u0414\3\2\2\2\u0417"+
		"\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041c\3\2"+
		"\2\2\u041a\u0418\3\2\2\2\u041b\u041d\7F\2\2\u041c\u041b\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041d\u041f\3\2\2\2\u041e\u0413\3\2\2\2\u041e\u041f\3\2"+
		"\2\2\u041f\u0420\3\2\2\2\u0420\u0421\7K\2\2\u0421\u00a5\3\2\2\2\u0422"+
		"\u0426\7J\2\2\u0423\u0425\5\u00a8U\2\u0424\u0423\3\2\2\2\u0425\u0428\3"+
		"\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429\3\2\2\2\u0428"+
		"\u0426\3\2\2\2\u0429\u042a\7K\2\2\u042a\u00a7\3\2\2\2\u042b\u042c\5\u00aa"+
		"V\2\u042c\u042d\7E\2\2\u042d\u0431\3\2\2\2\u042e\u0431\5\u00dep\2\u042f"+
		"\u0431\5\u00acW\2\u0430\u042b\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u042f"+
		"\3\2\2\2\u0431\u00a9\3\2\2\2\u0432\u0434\5T+\2\u0433\u0432\3\2\2\2\u0434"+
		"\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0440\3\2"+
		"\2\2\u0437\u0435\3\2\2\2\u0438\u0439\7?\2\2\u0439\u043a\5\2\2\2\u043a"+
		"\u043b\7\\\2\2\u043b\u043c\5\u00d2j\2\u043c\u0441\3\2\2\2\u043d\u043e"+
		"\5\f\7\2\u043e\u043f\5B\"\2\u043f\u0441\3\2\2\2\u0440\u0438\3\2\2\2\u0440"+
		"\u043d\3\2\2\2\u0441\u00ab\3\2\2\2\u0442\u04b4\5\u00a6T\2\u0443\u0444"+
		"\7\4\2\2\u0444\u0447\5\u00d2j\2\u0445\u0446\7b\2\2\u0446\u0448\5\u00d2"+
		"j\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449"+
		"\u044a\7E\2\2\u044a\u04b4\3\2\2\2\u044b\u044c\7\30\2\2\u044c\u044d\5\u00e0"+
		"q\2\u044d\u0450\5\u00acW\2\u044e\u044f\7\21\2\2\u044f\u0451\5\u00acW\2"+
		"\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u04b4\3\2\2\2\u0452\u0453"+
		"\7\27\2\2\u0453\u0454\7H\2\2\u0454\u0455\5\u00b6\\\2\u0455\u0456\7I\2"+
		"\2\u0456\u0457\5\u00acW\2\u0457\u04b4\3\2\2\2\u0458\u0459\7\64\2\2\u0459"+
		"\u045a\5\u00e0q\2\u045a\u045b\5\u00acW\2\u045b\u04b4\3\2\2\2\u045c\u045d"+
		"\7\17\2\2\u045d\u045e\5\u00acW\2\u045e\u045f\7\64\2\2\u045f\u0460\5\u00e0"+
		"q\2\u0460\u0461\7E\2\2\u0461\u04b4\3\2\2\2\u0462\u0463\7\61\2\2\u0463"+
		"\u046d\5\u00a6T\2\u0464\u0466\5\u00ba^\2\u0465\u0464\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u046a\3\2\2\2\u0469"+
		"\u046b\5\u00be`\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046e"+
		"\3\2\2\2\u046c\u046e\5\u00be`\2\u046d\u0465\3\2\2\2\u046d\u046c\3\2\2"+
		"\2\u046e\u04b4\3\2\2\2\u046f\u0470\7\61\2\2\u0470\u0471\5\u00c0a\2\u0471"+
		"\u0475\5\u00a6T\2\u0472\u0474\5\u00ba^\2\u0473\u0472\3\2\2\2\u0474\u0477"+
		"\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0479\3\2\2\2\u0477"+
		"\u0475\3\2\2\2\u0478\u047a\5\u00be`\2\u0479\u0478\3\2\2\2\u0479\u047a"+
		"\3\2\2\2\u047a\u04b4\3\2\2\2\u047b\u047c\7+\2\2\u047c\u047d\5\u00e0q\2"+
		"\u047d\u0481\7J\2\2\u047e\u0480\5\u00b0Y\2\u047f\u047e\3\2\2\2\u0480\u0483"+
		"\3\2\2\2\u0481\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0487\3\2\2\2\u0483"+
		"\u0481\3\2\2\2\u0484\u0486\5\u00b2Z\2\u0485\u0484\3\2\2\2\u0486\u0489"+
		"\3\2\2\2\u0487\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048a\3\2\2\2\u0489"+
		"\u0487\3\2\2\2\u048a\u048b\7K\2\2\u048b\u04b4\3\2\2\2\u048c\u048d\7,\2"+
		"\2\u048d\u048e\5\u00e0q\2\u048e\u048f\5\u00a6T\2\u048f\u04b4\3\2\2\2\u0490"+
		"\u0492\7&\2\2\u0491\u0493\5\u00d2j\2\u0492\u0491\3\2\2\2\u0492\u0493\3"+
		"\2\2\2\u0493\u0494\3\2\2\2\u0494\u04b4\7E\2\2\u0495\u0496\7.\2\2\u0496"+
		"\u0497\5\u00d2j\2\u0497\u0498\7E\2\2\u0498\u04b4\3\2\2\2\u0499\u049b\7"+
		"\6\2\2\u049a\u049c\5\2\2\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c"+
		"\u049d\3\2\2\2\u049d\u04b4\7E\2\2\u049e\u04a0\7\r\2\2\u049f\u04a1\5\2"+
		"\2\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04b4\7E\2\2\u04a3\u04a4\7@\2\2\u04a4\u04a5\5\u00d2j\2\u04a5\u04a6\7"+
		"E\2\2\u04a6\u04b4\3\2\2\2\u04a7\u04b4\7E\2\2\u04a8\u04a9\5\u00d2j\2\u04a9"+
		"\u04aa\7E\2\2\u04aa\u04b4\3\2\2\2\u04ab\u04ad\5\u00d4k\2\u04ac\u04ae\7"+
		"E\2\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b4\3\2\2\2\u04af"+
		"\u04b0\5\2\2\2\u04b0\u04b1\7b\2\2\u04b1\u04b2\5\u00acW\2\u04b2\u04b4\3"+
		"\2\2\2\u04b3\u0442\3\2\2\2\u04b3\u0443\3\2\2\2\u04b3\u044b\3\2\2\2\u04b3"+
		"\u0452\3\2\2\2\u04b3\u0458\3\2\2\2\u04b3\u045c\3\2\2\2\u04b3\u0462\3\2"+
		"\2\2\u04b3\u046f\3\2\2\2\u04b3\u047b\3\2\2\2\u04b3\u048c\3\2\2\2\u04b3"+
		"\u0490\3\2\2\2\u04b3\u0495\3\2\2\2\u04b3\u0499\3\2\2\2\u04b3\u049e\3\2"+
		"\2\2\u04b3\u04a3\3\2\2\2\u04b3\u04a7\3\2\2\2\u04b3\u04a8\3\2\2\2\u04b3"+
		"\u04ab\3\2\2\2\u04b3\u04af\3\2\2\2\u04b4\u00ad\3\2\2\2\u04b5\u04bd\5\u00a6"+
		"T\2\u04b6\u04b8\5\u00a8U\2\u04b7\u04b6\3\2\2\2\u04b8\u04bb\3\2\2\2\u04b9"+
		"\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2"+
		"\2\2\u04bc\u04b5\3\2\2\2\u04bc\u04b9\3\2\2\2\u04bd\u00af\3\2\2\2\u04be"+
		"\u04c0\5\u00b2Z\2\u04bf\u04be\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04bf"+
		"\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04c5\5\u00a8U"+
		"\2\u04c4\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7"+
		"\3\2\2\2\u04c7\u00b1\3\2\2\2\u04c8\u04ce\7\b\2\2\u04c9\u04cf\5\u00d2j"+
		"\2\u04ca\u04cf\7\u0082\2\2\u04cb\u04cc\5\f\7\2\u04cc\u04cd\5\2\2\2\u04cd"+
		"\u04cf\3\2\2\2\u04ce\u04c9\3\2\2\2\u04ce\u04ca\3\2\2\2\u04ce\u04cb\3\2"+
		"\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d4\7b\2\2\u04d1\u04d2\7\16\2\2\u04d2"+
		"\u04d4\7b\2\2\u04d3\u04c8\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u00b3\3\2"+
		"\2\2\u04d5\u04d8\5\u00aaV\2\u04d6\u04d8\5\u00e2r\2\u04d7\u04d5\3\2\2\2"+
		"\u04d7\u04d6\3\2\2\2\u04d8\u00b5\3\2\2\2\u04d9\u04e6\5\u00b8]\2\u04da"+
		"\u04dc\5\u00b4[\2\u04db\u04da\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04dd"+
		"\3\2\2\2\u04dd\u04df\7E\2\2\u04de\u04e0\5\u00d2j\2\u04df\u04de\3\2\2\2"+
		"\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\7E\2\2\u04e2\u04e4"+
		"\5\u00e2r\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e6\3\2\2"+
		"\2\u04e5\u04d9\3\2\2\2\u04e5\u04db\3\2\2\2\u04e6\u00b7\3\2\2\2\u04e7\u04e9"+
		"\5T+\2\u04e8\u04e7\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea"+
		"\u04eb\3\2\2\2\u04eb\u04ef\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04f0\5\f"+
		"\7\2\u04ee\u04f0\7?\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04ee\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u04f2\5F$\2\u04f2\u04f3\7b\2\2\u04f3\u04f4\5\u00d2"+
		"j\2\u04f4\u00b9\3\2\2\2\u04f5\u04f6\7\t\2\2\u04f6\u04fa\7H\2\2\u04f7\u04f9"+
		"\5T+\2\u04f8\u04f7\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa"+
		"\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd\u04fe\5\u00bc"+
		"_\2\u04fe\u04ff\5\2\2\2\u04ff\u0500\7I\2\2\u0500\u0501\5\u00a6T\2\u0501"+
		"\u00bb\3\2\2\2\u0502\u0507\5\u00dco\2\u0503\u0504\7p\2\2\u0504\u0506\5"+
		"\u00dco\2\u0505\u0503\3\2\2\2\u0506\u0509\3\2\2\2\u0507\u0505\3\2\2\2"+
		"\u0507\u0508\3\2\2\2\u0508\u00bd\3\2\2\2\u0509\u0507\3\2\2\2\u050a\u050b"+
		"\7\25\2\2\u050b\u050c\5\u00a6T\2\u050c\u00bf\3\2\2\2\u050d\u050e\7H\2"+
		"\2\u050e\u0510\5\u00c2b\2\u050f\u0511\7E\2\2\u0510\u050f\3\2\2\2\u0510"+
		"\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\7I\2\2\u0513\u00c1\3\2"+
		"\2\2\u0514\u0519\5\u00c4c\2\u0515\u0516\7E\2\2\u0516\u0518\5\u00c4c\2"+
		"\u0517\u0515\3\2\2\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a"+
		"\3\2\2\2\u051a\u00c3\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u051e\5T+\2\u051d"+
		"\u051c\3\2\2\2\u051e\u0521\3\2\2\2\u051f\u051d\3\2\2\2\u051f\u0520\3\2"+
		"\2\2\u0520\u0527\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u0523\5\36\20\2\u0523"+
		"\u0524\5F$\2\u0524\u0528\3\2\2\2\u0525\u0526\7?\2\2\u0526\u0528\5\2\2"+
		"\2\u0527\u0522\3\2\2\2\u0527\u0525\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a"+
		"\7\\\2\2\u052a\u052b\5\u00d2j\2\u052b\u052e\3\2\2\2\u052c\u052e\5\2\2"+
		"\2\u052d\u051f\3\2\2\2\u052d\u052c\3\2\2\2\u052e\u00c5\3\2\2\2\u052f\u0531"+
		"\5T+\2\u0530\u052f\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0530\3\2\2\2\u0532"+
		"\u0533\3\2\2\2\u0533\u0535\3\2\2\2\u0534\u0532\3\2\2\2\u0535\u0539\5\f"+
		"\7\2\u0536\u0538\5\u008cG\2\u0537\u0536\3\2\2\2\u0538\u053b\3\2\2\2\u0539"+
		"\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053c\3\2\2\2\u053b\u0539\3\2"+
		"\2\2\u053c\u053d\5\2\2\2\u053d\u00c7\3\2\2\2\u053e\u053f\7H\2\2\u053f"+
		"\u0540\5\u00d2j\2\u0540\u0541\7I\2\2\u0541\u0551\3\2\2\2\u0542\u0551\7"+
		"-\2\2\u0543\u0551\7*\2\2\u0544\u0551\5\u00caf\2\u0545\u0551\5\2\2\2\u0546"+
		"\u0547\5t;\2\u0547\u0548\7G\2\2\u0548\u0549\7\13\2\2\u0549\u0551\3\2\2"+
		"\2\u054a\u054e\5\b\5\2\u054b\u054f\5\32\16\2\u054c\u054d\7-\2\2\u054d"+
		"\u054f\5\34\17\2\u054e\u054b\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0551\3"+
		"\2\2\2\u0550\u053e\3\2\2\2\u0550\u0542\3\2\2\2\u0550\u0543\3\2\2\2\u0550"+
		"\u0544\3\2\2\2\u0550\u0545\3\2\2\2\u0550\u0546\3\2\2\2\u0550\u054a\3\2"+
		"\2\2\u0551\u00c9\3\2\2\2\u0552\u055a\5\u00ccg\2\u0553\u055a\5\u00ceh\2"+
		"\u0554\u055a\7U\2\2\u0555\u055a\7V\2\2\u0556\u055a\7T\2\2\u0557\u055a"+
		"\7X\2\2\u0558\u055a\7W\2\2\u0559\u0552\3\2\2\2\u0559\u0553\3\2\2\2\u0559"+
		"\u0554\3\2\2\2\u0559\u0555\3\2\2\2\u0559\u0556\3\2\2\2\u0559\u0557\3\2"+
		"\2\2\u0559\u0558\3\2\2\2\u055a\u00cb\3\2\2\2\u055b\u055c\t\7\2\2\u055c"+
		"\u00cd\3\2\2\2\u055d\u055e\t\b\2\2\u055e\u00cf\3\2\2\2\u055f\u0560\7^"+
		"\2\2\u0560\u0563\7]\2\2\u0561\u0563\5\26\f\2\u0562\u055f\3\2\2\2\u0562"+
		"\u0561\3\2\2\2\u0563\u00d1\3\2\2\2\u0564\u0565\bj\1\2\u0565\u0591\5\u00c8"+
		"e\2\u0566\u0591\5\u00e4s\2\u0567\u0568\7!\2\2\u0568\u0591\5\u00e8u\2\u0569"+
		"\u056d\7H\2\2\u056a\u056c\5\u008cG\2\u056b\u056a\3\2\2\2\u056c\u056f\3"+
		"\2\2\2\u056d\u056b\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0570\3\2\2\2\u056f"+
		"\u056d\3\2\2\2\u0570\u0575\5\f\7\2\u0571\u0572\7o\2\2\u0572\u0574\5\f"+
		"\7\2\u0573\u0571\3\2\2\2\u0574\u0577\3\2\2\2\u0575\u0573\3\2\2\2\u0575"+
		"\u0576\3\2\2\2\u0576\u0578\3\2\2\2\u0577\u0575\3\2\2\2\u0578\u0579\7I"+
		"\2\2\u0579\u057a\5\u00d2j\27\u057a\u0591\3\2\2\2\u057b\u057c\t\t\2\2\u057c"+
		"\u0591\5\u00d2j\25\u057d\u057e\t\n\2\2\u057e\u0591\5\u00d2j\24\u057f\u0591"+
		"\5\u00d4k\2\u0580\u0581\5\f\7\2\u0581\u0587\7\177\2\2\u0582\u0584\5\26"+
		"\f\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u0588\5\2\2\2\u0586\u0588\7!\2\2\u0587\u0583\3\2\2\2\u0587\u0586\3\2"+
		"\2\2\u0588\u0591\3\2\2\2\u0589\u058a\5 \21\2\u058a\u058c\7\177\2\2\u058b"+
		"\u058d\5\26\f\2\u058c\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058e\3"+
		"\2\2\2\u058e\u058f\7!\2\2\u058f\u0591\3\2\2\2\u0590\u0564\3\2\2\2\u0590"+
		"\u0566\3\2\2\2\u0590\u0567\3\2\2\2\u0590\u0569\3\2\2\2\u0590\u057b\3\2"+
		"\2\2\u0590\u057d\3\2\2\2\u0590\u057f\3\2\2\2\u0590\u0580\3\2\2\2\u0590"+
		"\u0589\3\2\2\2\u0591\u05e5\3\2\2\2\u0592\u0593\f\23\2\2\u0593\u0594\t"+
		"\13\2\2\u0594\u05e4\5\u00d2j\24\u0595\u0596\f\22\2\2\u0596\u0597\t\f\2"+
		"\2\u0597\u05e4\5\u00d2j\23\u0598\u05a0\f\21\2\2\u0599\u059a\7^\2\2\u059a"+
		"\u05a1\7^\2\2\u059b\u059c\7]\2\2\u059c\u059d\7]\2\2\u059d\u05a1\7]\2\2"+
		"\u059e\u059f\7]\2\2\u059f\u05a1\7]\2\2\u05a0\u0599\3\2\2\2\u05a0\u059b"+
		"\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05e4\5\u00d2j"+
		"\22\u05a3\u05a4\f\20\2\2\u05a4\u05a5\t\r\2\2\u05a5\u05e4\5\u00d2j\21\u05a6"+
		"\u05a7\f\16\2\2\u05a7\u05a8\t\16\2\2\u05a8\u05e4\5\u00d2j\17\u05a9\u05aa"+
		"\f\r\2\2\u05aa\u05ab\7o\2\2\u05ab\u05e4\5\u00d2j\16\u05ac\u05ad\f\f\2"+
		"\2\u05ad\u05ae\7q\2\2\u05ae\u05e4\5\u00d2j\r\u05af\u05b0\f\13\2\2\u05b0"+
		"\u05b1\7p\2\2\u05b1\u05e4\5\u00d2j\f\u05b2\u05b3\f\n\2\2\u05b3\u05b4\7"+
		"g\2\2\u05b4\u05e4\5\u00d2j\13\u05b5\u05b6\f\t\2\2\u05b6\u05b7\7h\2\2\u05b7"+
		"\u05e4\5\u00d2j\n\u05b8\u05b9\f\b\2\2\u05b9\u05ba\7a\2\2\u05ba\u05bb\5"+
		"\u00d2j\2\u05bb\u05bc\7b\2\2\u05bc\u05bd\5\u00d2j\b\u05bd\u05e4\3\2\2"+
		"\2\u05be\u05bf\f\7\2\2\u05bf\u05c0\t\17\2\2\u05c0\u05e4\5\u00d2j\7\u05c1"+
		"\u05c2\f\33\2\2\u05c2\u05ce\7G\2\2\u05c3\u05cf\5\2\2\2\u05c4\u05cf\5\u00e4"+
		"s\2\u05c5\u05cf\7-\2\2\u05c6\u05c8\7!\2\2\u05c7\u05c9\5\b\5\2\u05c8\u05c7"+
		"\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cf\5\u00ecw"+
		"\2\u05cb\u05cc\7*\2\2\u05cc\u05cf\5\30\r\2\u05cd\u05cf\5\u00f2z\2\u05ce"+
		"\u05c3\3\2\2\2\u05ce\u05c4\3\2\2\2\u05ce\u05c5\3\2\2\2\u05ce\u05c6\3\2"+
		"\2\2\u05ce\u05cb\3\2\2\2\u05ce\u05cd\3\2\2\2\u05cf\u05e4\3\2\2\2\u05d0"+
		"\u05d1\f\32\2\2\u05d1\u05d2\7L\2\2\u05d2\u05d3\5\u00d2j\2\u05d3\u05d4"+
		"\7M\2\2\u05d4\u05e4\3\2\2\2\u05d5\u05d6\f\26\2\2\u05d6\u05e4\t\20\2\2"+
		"\u05d7\u05d8\f\17\2\2\u05d8\u05db\7\34\2\2\u05d9\u05dc\5\f\7\2\u05da\u05dc"+
		"\5\u00c6d\2\u05db\u05d9\3\2\2\2\u05db\u05da\3\2\2\2\u05dc\u05e4\3\2\2"+
		"\2\u05dd\u05de\f\5\2\2\u05de\u05e0\7\177\2\2\u05df\u05e1\5\26\f\2\u05e0"+
		"\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e4\5\2"+
		"\2\2\u05e3\u0592\3\2\2\2\u05e3\u0595\3\2\2\2\u05e3\u0598\3\2\2\2\u05e3"+
		"\u05a3\3\2\2\2\u05e3\u05a6\3\2\2\2\u05e3\u05a9\3\2\2\2\u05e3\u05ac\3\2"+
		"\2\2\u05e3\u05af\3\2\2\2\u05e3\u05b2\3\2\2\2\u05e3\u05b5\3\2\2\2\u05e3"+
		"\u05b8\3\2\2\2\u05e3\u05be\3\2\2\2\u05e3\u05c1\3\2\2\2\u05e3\u05d0\3\2"+
		"\2\2\u05e3\u05d5\3\2\2\2\u05e3\u05d7\3\2\2\2\u05e3\u05dd\3\2\2\2\u05e4"+
		"\u05e7\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u00d3\3\2"+
		"\2\2\u05e7\u05e5\3\2\2\2\u05e8\u05e9\7+\2\2\u05e9\u05ea\5\u00e0q\2\u05ea"+
		"\u05ee\7J\2\2\u05eb\u05ed\5\u00d6l\2\u05ec\u05eb\3\2\2\2\u05ed\u05f0\3"+
		"\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f1\3\2\2\2\u05f0"+
		"\u05ee\3\2\2\2\u05f1\u05f2\7K\2\2\u05f2\u00d5\3\2\2\2\u05f3\u05f7\7\b"+
		"\2\2\u05f4\u05f8\5\u00e2r\2\u05f5\u05f8\7X\2\2\u05f6\u05f8\5\u00e6t\2"+
		"\u05f7\u05f4\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f6\3\2\2\2\u05f8\u05f9"+
		"\3\2\2\2\u05f9\u05fa\t\21\2\2\u05fa\u05ff\5\u00aeX\2\u05fb\u05fc\7\16"+
		"\2\2\u05fc\u05fd\t\21\2\2\u05fd\u05ff\5\u00aeX\2\u05fe\u05f3\3\2\2\2\u05fe"+
		"\u05fb\3\2\2\2\u05ff\u00d7\3\2\2\2\u0600\u0605\5\u00dco\2\u0601\u0602"+
		"\7F\2\2\u0602\u0604\5\u00dco\2\u0603\u0601\3\2\2\2\u0604\u0607\3\2\2\2"+
		"\u0605\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u00d9\3\2\2\2\u0607\u0605"+
		"\3\2\2\2\u0608\u060a\5T+\2\u0609\u0608\3\2\2\2\u060a\u060d\3\2\2\2\u060b"+
		"\u0609\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060e\3\2\2\2\u060d\u060b\3\2"+
		"\2\2\u060e\u0612\5\f\7\2\u060f\u0611\5\u008cG\2\u0610\u060f\3\2\2\2\u0611"+
		"\u0614\3\2\2\2\u0612\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\3\2"+
		"\2\2\u0614\u0612\3\2\2\2\u0615\u0616\7\u0081\2\2\u0616\u0617\5F$\2\u0617"+
		"\u00db\3\2\2\2\u0618\u061d\5\2\2\2\u0619\u061a\7G\2\2\u061a\u061c\5\2"+
		"\2\2\u061b\u0619\3\2\2\2\u061c\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061d"+
		"\u061e\3\2\2\2\u061e\u00dd\3\2\2\2\u061f\u061d\3\2\2\2\u0620\u0622\5\64"+
		"\33\2\u0621\u0620\3\2\2\2\u0622\u0625\3\2\2\2\u0623\u0621\3\2\2\2\u0623"+
		"\u0624\3\2\2\2\u0624\u0629\3\2\2\2\u0625\u0623\3\2\2\2\u0626\u062a\5\66"+
		"\34\2\u0627\u062a\5p9\2\u0628\u062a\5d\63\2\u0629\u0626\3\2\2\2\u0629"+
		"\u0627\3\2\2\2\u0629\u0628\3\2\2\2\u062a\u00df\3\2\2\2\u062b\u062c\7H"+
		"\2\2\u062c\u062d\5\u00d2j\2\u062d\u062e\7I\2\2\u062e\u00e1\3\2\2\2\u062f"+
		"\u0634\5\u00d2j\2\u0630\u0631\7F\2\2\u0631\u0633\5\u00d2j\2\u0632\u0630"+
		"\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0632\3\2\2\2\u0634\u0635\3\2\2\2\u0635"+
		"\u00e3\3\2\2\2\u0636\u0634\3\2\2\2\u0637\u0638\5\2\2\2\u0638\u063a\7H"+
		"\2\2\u0639\u063b\5\u00e2r\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u063c\3\2\2\2\u063c\u063d\7I\2\2\u063d\u064b\3\2\2\2\u063e\u063f\7-\2"+
		"\2\u063f\u0641\7H\2\2\u0640\u0642\5\u00e2r\2\u0641\u0640\3\2\2\2\u0641"+
		"\u0642\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u064b\7I\2\2\u0644\u0645\7*\2"+
		"\2\u0645\u0647\7H\2\2\u0646\u0648\5\u00e2r\2\u0647\u0646\3\2\2\2\u0647"+
		"\u0648\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064b\7I\2\2\u064a\u0637\3\2"+
		"\2\2\u064a\u063e\3\2\2\2\u064a\u0644\3\2\2\2\u064b\u00e5\3\2\2\2\u064c"+
		"\u064d\bt\1\2\u064d\u064e\7H\2\2\u064e\u064f\5\u00e6t\2\u064f\u0650\7"+
		"I\2\2\u0650\u0667\3\2\2\2\u0651\u0653\5T+\2\u0652\u0651\3\2\2\2\u0653"+
		"\u0656\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0657\3\2"+
		"\2\2\u0656\u0654\3\2\2\2\u0657\u065b\5\f\7\2\u0658\u065a\5\u008cG\2\u0659"+
		"\u0658\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2\2\u065b\u065c\3\2"+
		"\2\2\u065c\u065e\3\2\2\2\u065d\u065b\3\2\2\2\u065e\u0663\5\2\2\2\u065f"+
		"\u0660\7g\2\2\u0660\u0662\5\u00d2j\2\u0661\u065f\3\2\2\2\u0662\u0665\3"+
		"\2\2\2\u0663\u0661\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0667\3\2\2\2\u0665"+
		"\u0663\3\2\2\2\u0666\u064c\3\2\2\2\u0666\u0654\3\2\2\2\u0667\u066d\3\2"+
		"\2\2\u0668\u0669\f\3\2\2\u0669\u066a\7g\2\2\u066a\u066c\5\u00d2j\2\u066b"+
		"\u0668\3\2\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2"+
		"\2\2\u066e\u00e7\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u0671\5\b\5\2\u0671"+
		"\u0672\5\u00eav\2\u0672\u0673\5\u00f0y\2\u0673\u067a\3\2\2\2\u0674\u0677"+
		"\5\u00eav\2\u0675\u0678\5\u00eex\2\u0676\u0678\5\u00f0y\2\u0677\u0675"+
		"\3\2\2\2\u0677\u0676\3\2\2\2\u0678\u067a\3\2\2\2\u0679\u0670\3\2\2\2\u0679"+
		"\u0674\3\2\2\2\u067a\u00e9\3\2\2\2\u067b\u067d\5\2\2\2\u067c\u067e\5\u00d0"+
		"i\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0686\3\2\2\2\u067f"+
		"\u0680\7G\2\2\u0680\u0682\5\2\2\2\u0681\u0683\5\u00d0i\2\u0682\u0681\3"+
		"\2\2\2\u0682\u0683\3\2\2\2\u0683\u0685\3\2\2\2\u0684\u067f\3\2\2\2\u0685"+
		"\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u068b\3\2"+
		"\2\2\u0688\u0686\3\2\2\2\u0689\u068b\5\16\b\2\u068a\u067b\3\2\2\2\u068a"+
		"\u0689\3\2\2\2\u068b\u00eb\3\2\2\2\u068c\u068e\5\2\2\2\u068d\u068f\5\6"+
		"\4\2\u068e\u068d\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0690\3\2\2\2\u0690"+
		"\u0691\5\u00f0y\2\u0691\u00ed\3\2\2\2\u0692\u06ae\7L\2\2\u0693\u0698\7"+
		"M\2\2\u0694\u0695\7L\2\2\u0695\u0697\7M\2\2\u0696\u0694\3\2\2\2\u0697"+
		"\u069a\3\2\2\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069b\3\2"+
		"\2\2\u069a\u0698\3\2\2\2\u069b\u06af\5\u00a4S\2\u069c\u069d\5\u00d2j\2"+
		"\u069d\u06a4\7M\2\2\u069e\u069f\7L\2\2\u069f\u06a0\5\u00d2j\2\u06a0\u06a1"+
		"\7M\2\2\u06a1\u06a3\3\2\2\2\u06a2\u069e\3\2\2\2\u06a3\u06a6\3\2\2\2\u06a4"+
		"\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06ab\3\2\2\2\u06a6\u06a4\3\2"+
		"\2\2\u06a7\u06a8\7L\2\2\u06a8\u06aa\7M\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ad"+
		"\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06af\3\2\2\2\u06ad"+
		"\u06ab\3\2\2\2\u06ae\u0693\3\2\2\2\u06ae\u069c\3\2\2\2\u06af\u00ef\3\2"+
		"\2\2\u06b0\u06b2\5\34\17\2\u06b1\u06b3\5:\36\2\u06b2\u06b1\3\2\2\2\u06b2"+
		"\u06b3\3\2\2\2\u06b3\u00f1\3\2\2\2\u06b4\u06b5\5\b\5\2\u06b5\u06b6\5\32"+
		"\16\2\u06b6\u00f3\3\2\2\2\u00d8\u00fb\u0106\u010c\u0111\u0116\u011d\u0125"+
		"\u012d\u0131\u0138\u013f\u0145\u0147\u014f\u0157\u015b\u015d\u0164\u0168"+
		"\u016e\u0174\u0179\u017e\u0183\u0188\u018b\u0190\u0196\u019c\u01a1\u01aa"+
		"\u01af\u01b4\u01bd\u01c5\u01c8\u01ce\u01d7\u01e1\u01e9\u01f7\u01fe\u020c"+
		"\u0211\u0215\u0219\u021d\u0227\u0230\u0237\u023d\u0241\u024d\u0258\u025e"+
		"\u0265\u026a\u0273\u0278\u0282\u028c\u0291\u0294\u0298\u029d\u02a0\u02a2"+
		"\u02a9\u02b1\u02b5\u02be\u02c6\u02ca\u02cd\u02d0\u02d9\u02df\u02e4\u02e7"+
		"\u02ed\u02f3\u02f8\u02fe\u0307\u0310\u0312\u031a\u0323\u0327\u032b\u0333"+
		"\u033a\u0342\u0347\u0351\u0359\u0363\u036c\u0377\u037c\u0385\u038f\u0394"+
		"\u03a0\u03a9\u03ae\u03b1\u03b8\u03c2\u03ca\u03cd\u03d0\u03dd\u03e5\u03ea"+
		"\u03f2\u03f6\u03fa\u03fe\u0402\u0404\u0408\u040e\u0418\u041c\u041e\u0426"+
		"\u0430\u0435\u0440\u0447\u0450\u0467\u046a\u046d\u0475\u0479\u0481\u0487"+
		"\u0492\u049b\u04a0\u04ad\u04b3\u04b9\u04bc\u04c1\u04c6\u04ce\u04d3\u04d7"+
		"\u04db\u04df\u04e3\u04e5\u04ea\u04ef\u04fa\u0507\u0510\u0519\u051f\u0527"+
		"\u052d\u0532\u0539\u054e\u0550\u0559\u0562\u056d\u0575\u0583\u0587\u058c"+
		"\u0590\u05a0\u05c8\u05ce\u05db\u05e0\u05e3\u05e5\u05ee\u05f7\u05fe\u0605"+
		"\u060b\u0612\u061d\u0623\u0629\u0634\u063a\u0641\u0647\u064a\u0654\u065b"+
		"\u0663\u0666\u066d\u0677\u0679\u067d\u0682\u0686\u068a\u068e\u0698\u06a4"+
		"\u06ab\u06ae\u06b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}