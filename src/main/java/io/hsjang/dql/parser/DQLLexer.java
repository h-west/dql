package io.hsjang.dql.parser;// Generated from DQL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NAME=15, STRING=16, NUMBER=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "NAME", "STRING", "STR", "ESC", 
		"UNICODE", "HEX", "SAFECODEPOINT", "NUMBER", "EXP", "INT", "WS"
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


	public DQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20^\n\20\f\20\16\20"+
		"a\13\20\3\21\3\21\7\21e\n\21\f\21\16\21h\13\21\3\21\3\21\3\21\7\21m\n"+
		"\21\f\21\16\21p\13\21\3\21\5\21s\n\21\3\22\3\22\5\22w\n\22\3\23\3\23\3"+
		"\23\5\23|\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\5\27\u0089\n\27\3\27\3\27\3\27\6\27\u008e\n\27\r\27\16\27\u008f\5\27"+
		"\u0092\n\27\3\27\5\27\u0095\n\27\3\30\3\30\5\30\u0099\n\30\3\30\3\30\3"+
		"\31\3\31\3\31\7\31\u00a0\n\31\f\31\16\31\u00a3\13\31\5\31\u00a5\n\31\3"+
		"\32\6\32\u00a8\n\32\r\32\16\32\u00a9\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\2"+
		"\'\2)\2+\2-\23/\2\61\2\63\24\3\2\f\4\2C\\c|\6\2\62;C\\aac|\n\2$$\61\61"+
		"^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\3\2\62;\4\2GGgg\4\2--//\3\2\63;\5"+
		"\2\13\f\17\17\"\"\2\u00b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2-\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7"+
		"9\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23"+
		"E\3\2\2\2\25G\3\2\2\2\27L\3\2\2\2\31R\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2"+
		"\37[\3\2\2\2!r\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'}\3\2\2\2)\u0083\3\2\2\2+"+
		"\u0085\3\2\2\2-\u0088\3\2\2\2/\u0096\3\2\2\2\61\u00a4\3\2\2\2\63\u00a7"+
		"\3\2\2\2\65\66\7.\2\2\66\4\3\2\2\2\678\7B\2\28\6\3\2\2\29:\7*\2\2:\b\3"+
		"\2\2\2;<\7+\2\2<\n\3\2\2\2=>\7]\2\2>\f\3\2\2\2?@\7_\2\2@\16\3\2\2\2AB"+
		"\7}\2\2B\20\3\2\2\2CD\7\177\2\2D\22\3\2\2\2EF\7<\2\2F\24\3\2\2\2GH\7v"+
		"\2\2HI\7t\2\2IJ\7w\2\2JK\7g\2\2K\26\3\2\2\2LM\7h\2\2MN\7c\2\2NO\7n\2\2"+
		"OP\7u\2\2PQ\7g\2\2Q\30\3\2\2\2RS\7p\2\2ST\7w\2\2TU\7n\2\2UV\7n\2\2V\32"+
		"\3\2\2\2WX\7#\2\2X\34\3\2\2\2YZ\7\60\2\2Z\36\3\2\2\2[_\t\2\2\2\\^\t\3"+
		"\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2` \3\2\2\2a_\3\2\2\2bf\7"+
		"$\2\2ce\5#\22\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3"+
		"\2\2\2is\7$\2\2jn\7)\2\2km\5#\22\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2oq\3\2\2\2pn\3\2\2\2qs\7)\2\2rb\3\2\2\2rj\3\2\2\2s\"\3\2\2\2tw\5%"+
		"\23\2uw\5+\26\2vt\3\2\2\2vu\3\2\2\2w$\3\2\2\2x{\7^\2\2y|\t\4\2\2z|\5\'"+
		"\24\2{y\3\2\2\2{z\3\2\2\2|&\3\2\2\2}~\7w\2\2~\177\5)\25\2\177\u0080\5"+
		")\25\2\u0080\u0081\5)\25\2\u0081\u0082\5)\25\2\u0082(\3\2\2\2\u0083\u0084"+
		"\t\5\2\2\u0084*\3\2\2\2\u0085\u0086\n\6\2\2\u0086,\3\2\2\2\u0087\u0089"+
		"\7/\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0091\5\61\31\2\u008b\u008d\7\60\2\2\u008c\u008e\t\7\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0095\5/\30\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		".\3\2\2\2\u0096\u0098\t\b\2\2\u0097\u0099\t\t\2\2\u0098\u0097\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\5\61\31\2\u009b\60"+
		"\3\2\2\2\u009c\u00a5\7\62\2\2\u009d\u00a1\t\n\2\2\u009e\u00a0\t\7\2\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4"+
		"\u009d\3\2\2\2\u00a5\62\3\2\2\2\u00a6\u00a8\t\13\2\2\u00a7\u00a6\3\2\2"+
		"\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\b\32\2\2\u00ac\64\3\2\2\2\21\2_fnrv{\u0088\u008f"+
		"\u0091\u0094\u0098\u00a1\u00a4\u00a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}