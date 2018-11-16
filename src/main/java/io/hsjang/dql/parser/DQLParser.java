package io.hsjang.dql.parser;// Generated from DQL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NAME=15, STRING=16, NUMBER=17, 
		WS=18;
	public static final int
		RULE_dql = 0, RULE_single = 1, RULE_output = 2, RULE_query = 3, RULE_field = 4, 
		RULE_fields = 5, RULE_fieldparams = 6, RULE_queries = 7, RULE_queryparams = 8, 
		RULE_params = 9, RULE_paramparams = 10, RULE_obj = 11, RULE_pair = 12, 
		RULE_array = 13, RULE_value = 14, RULE_keyword = 15, RULE_dotname = 16, 
		RULE_name = 17;
	public static final String[] ruleNames = {
		"dql", "single", "output", "query", "field", "fields", "fieldparams", 
		"queries", "queryparams", "params", "paramparams", "obj", "pair", "array", 
		"value", "keyword", "dotname", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'@'", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "'true'", 
		"'false'", "'null'", "'!'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NAME", "STRING", "NUMBER", "WS"
	};
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
	public String getGrammarFileName() { return "DQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DqlContext extends ParserRuleContext {
		public List<SingleContext> single() {
			return getRuleContexts(SingleContext.class);
		}
		public SingleContext single(int i) {
			return getRuleContext(SingleContext.class,i);
		}
		public DqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterDql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitDql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitDql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DqlContext dql() throws RecognitionException {
		DqlContext _localctx = new DqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			single();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(37);
				match(T__0);
				setState(38);
				single();
				}
				}
				setState(43);
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

	public static class SingleContext extends ParserRuleContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleContext single() throws RecognitionException {
		SingleContext _localctx = new SingleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_single);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			output();
			setState(45);
			match(T__1);
			setState(46);
			query();
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

	public static class OutputContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			name();
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(49);
				field();
				}
				break;
			case T__4:
				{
				setState(50);
				fields();
				}
				break;
			case T__1:
				break;
			default:
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

	public static class QueryContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public QueriesContext queries() {
			return getRuleContext(QueriesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			name();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(54);
				queries();
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

	public static class FieldContext extends ParserRuleContext {
		public FieldparamsContext fieldparams() {
			return getRuleContext(FieldparamsContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__2);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << NAME) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(58);
				fieldparams();
				}
			}

			setState(61);
			match(T__3);
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

	public static class FieldsContext extends ParserRuleContext {
		public FieldparamsContext fieldparams() {
			return getRuleContext(FieldparamsContext.class,0);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__4);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << NAME) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(64);
				fieldparams();
				}
			}

			setState(67);
			match(T__5);
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

	public static class FieldparamsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public FieldparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterFieldparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitFieldparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitFieldparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldparamsContext fieldparams() throws RecognitionException {
		FieldparamsContext _localctx = new FieldparamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			value();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(70);
				match(T__0);
				setState(71);
				value();
				}
				}
				setState(76);
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

	public static class QueriesContext extends ParserRuleContext {
		public QueryparamsContext queryparams() {
			return getRuleContext(QueryparamsContext.class,0);
		}
		public QueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueriesContext queries() throws RecognitionException {
		QueriesContext _localctx = new QueriesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_queries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__2);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << NAME) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(78);
				queryparams();
				}
			}

			setState(81);
			match(T__3);
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

	public static class QueryparamsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public QueryparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterQueryparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitQueryparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitQueryparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryparamsContext queryparams() throws RecognitionException {
		QueryparamsContext _localctx = new QueryparamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_queryparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			value();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(84);
				match(T__0);
				setState(85);
				value();
				}
				}
				setState(90);
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

	public static class ParamsContext extends ParserRuleContext {
		public ParamparamsContext paramparams() {
			return getRuleContext(ParamparamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__2);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << NAME) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(92);
				paramparams();
				}
			}

			setState(95);
			match(T__3);
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

	public static class ParamparamsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ParamparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterParamparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitParamparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitParamparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamparamsContext paramparams() throws RecognitionException {
		ParamparamsContext _localctx = new ParamparamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			value();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(98);
				match(T__0);
				setState(99);
				value();
				}
				}
				setState(104);
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

	public static class ObjContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_obj);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__6);
				setState(106);
				pair();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(107);
					match(T__0);
					setState(108);
					pair();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__6);
				setState(117);
				match(T__7);
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

	public static class PairContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			name();
			setState(121);
			match(T__8);
			setState(122);
			value();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__4);
				setState(125);
				value();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(126);
					match(T__0);
					setState(127);
					value();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__4);
				setState(136);
				match(T__5);
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

	public static class ValueContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DQLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DQLParser.NUMBER, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				name();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(NUMBER);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				obj();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				array();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				match(T__11);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DQLParser.NAME, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__12);
			setState(150);
			match(NAME);
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

	public static class DotnameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DQLParser.NAME, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public DotnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterDotname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitDotname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitDotname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotnameContext dotname() throws RecognitionException {
		DotnameContext _localctx = new DotnameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dotname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__13);
			setState(153);
			match(NAME);
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(154);
				params();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DQLParser.NAME, 0); }
		public DotnameContext dotname() {
			return getRuleContext(DotnameContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_name);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(NAME);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(158);
					dotname();
					}
				}

				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				keyword();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00a7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\5\4\66\n\4\3\5\3\5\5\5:\n\5\3\6\3\6\5\6>\n\6\3\6\3\6\3\7\3\7\5\7"+
		"D\n\7\3\7\3\7\3\b\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\t\3\t\5\tR\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\7\nY\n\n\f\n\16\n\\\13\n\3\13\3\13\5\13`\n\13\3\13\3"+
		"\13\3\f\3\f\3\f\7\fg\n\f\f\f\16\fj\13\f\3\r\3\r\3\r\3\r\7\rp\n\r\f\r\16"+
		"\rs\13\r\3\r\3\r\3\r\3\r\5\ry\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\7\17\u0083\n\17\f\17\16\17\u0086\13\17\3\17\3\17\3\17\3\17\5\17\u008c"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0096\n\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u009e\n\22\3\23\3\23\5\23\u00a2\n\23\3\23\5"+
		"\23\u00a5\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"\2\2\2\u00ad\2&\3\2\2\2\4.\3\2\2\2\6\62\3\2\2\2\b\67\3\2\2\2\n;\3\2\2"+
		"\2\fA\3\2\2\2\16G\3\2\2\2\20O\3\2\2\2\22U\3\2\2\2\24]\3\2\2\2\26c\3\2"+
		"\2\2\30x\3\2\2\2\32z\3\2\2\2\34\u008b\3\2\2\2\36\u0095\3\2\2\2 \u0097"+
		"\3\2\2\2\"\u009a\3\2\2\2$\u00a4\3\2\2\2&+\5\4\3\2\'(\7\3\2\2(*\5\4\3\2"+
		")\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-+\3\2\2\2./\5\6\4"+
		"\2/\60\7\4\2\2\60\61\5\b\5\2\61\5\3\2\2\2\62\65\5$\23\2\63\66\5\n\6\2"+
		"\64\66\5\f\7\2\65\63\3\2\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2"+
		"\679\5$\23\28:\5\20\t\298\3\2\2\29:\3\2\2\2:\t\3\2\2\2;=\7\5\2\2<>\5\16"+
		"\b\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\6\2\2@\13\3\2\2\2AC\7\7\2\2BD\5"+
		"\16\b\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\b\2\2F\r\3\2\2\2GL\5\36\20\2"+
		"HI\7\3\2\2IK\5\36\20\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\17\3\2"+
		"\2\2NL\3\2\2\2OQ\7\5\2\2PR\5\22\n\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7"+
		"\6\2\2T\21\3\2\2\2UZ\5\36\20\2VW\7\3\2\2WY\5\36\20\2XV\3\2\2\2Y\\\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\23\3\2\2\2\\Z\3\2\2\2]_\7\5\2\2^`\5\26\f\2_"+
		"^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\6\2\2b\25\3\2\2\2ch\5\36\20\2de\7\3"+
		"\2\2eg\5\36\20\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\27\3\2\2\2j"+
		"h\3\2\2\2kl\7\t\2\2lq\5\32\16\2mn\7\3\2\2np\5\32\16\2om\3\2\2\2ps\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\n\2\2uy\3\2\2\2vw\7\t"+
		"\2\2wy\7\n\2\2xk\3\2\2\2xv\3\2\2\2y\31\3\2\2\2z{\5$\23\2{|\7\13\2\2|}"+
		"\5\36\20\2}\33\3\2\2\2~\177\7\7\2\2\177\u0084\5\36\20\2\u0080\u0081\7"+
		"\3\2\2\u0081\u0083\5\36\20\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7\b\2\2\u0088\u008c\3\2\2\2\u0089\u008a\7\7\2\2\u008a"+
		"\u008c\7\b\2\2\u008b~\3\2\2\2\u008b\u0089\3\2\2\2\u008c\35\3\2\2\2\u008d"+
		"\u0096\5$\23\2\u008e\u0096\7\22\2\2\u008f\u0096\7\23\2\2\u0090\u0096\5"+
		"\30\r\2\u0091\u0096\5\34\17\2\u0092\u0096\7\f\2\2\u0093\u0096\7\r\2\2"+
		"\u0094\u0096\7\16\2\2\u0095\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u008f"+
		"\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\37\3\2\2\2\u0097\u0098\7\17\2"+
		"\2\u0098\u0099\7\21\2\2\u0099!\3\2\2\2\u009a\u009b\7\20\2\2\u009b\u009d"+
		"\7\21\2\2\u009c\u009e\5\24\13\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2"+
		"\2\u009e#\3\2\2\2\u009f\u00a1\7\21\2\2\u00a0\u00a2\5\"\22\2\u00a1\u00a0"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5\5 \21\2\u00a4"+
		"\u009f\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5%\3\2\2\2\24+\659=CLQZ_hqx\u0084"+
		"\u008b\u0095\u009d\u00a1\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}