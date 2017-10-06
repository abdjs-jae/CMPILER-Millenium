// Generated from Millenium.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MilleniumLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HT_NL_CR=1, INT_DTYPE=2, FLOAT_DTYPE=3, CHAR_DTYPE=4, STRING_DTYPE=5, 
		BOOLEAN_DTYPE=6, IF_CONDITIONAL=7, ELSE_IF_CONDITIONAL=8, ELSE_CONDITIONAL=9, 
		FOR_LOOP=10, WHILE_LOOP=11, DO_LOOP=12, PRINT=13, SCAN=14, OPEN_PAR=15, 
		CLOSE_PAR=16, OPEN_CURLY_BRACK=17, CLOSE_CURLY_BRACK=18, OPEN_SQUARE_BRACK=19, 
		CLOSE_SQUARE_BRACK=20, ENUMERATION=21, COMMENT_BLOCK=22, END=23, ADDITION_OPE=24, 
		SUBTRACTION_OPE=25, MULTIPLICTION_OPE=26, DIVISION_OPE=27, MODULO_OPE=28, 
		LESS_THAN_OPE=29, LESS_THAN_EQUAL_TO_OPE=30, GREATER_THAN_OPE=31, GREATER_THAN_EQUAL_TO_OPE=32, 
		EQUAL_OPE=33, NOT_EQUAL_OPE=34, INCREMENT_OPE=35, DECREMENT_OPE=36, ASSINGMENT_OPE=37, 
		AND_OPE=38, OR_OPE=39, NOT_OPE=40, ARRAY_SIZE_DELIMETER=41, CONSTANT_KEYWORD=42, 
		FUNCTION_CALL=43, MAIN_FUNC=44, RETURN=45, VOID=46, INTEGER_LITERAL=47, 
		FLOAT_LITERAL=48, CHAR_LITERAL=49, STRING_LITERAL=50, BOOLEAN_LITERAL=51, 
		VARIABLE_IDENTIFIER=52, FUNCTION_IDENTIFIER=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"HT_NL_CR", "INT_DTYPE", "FLOAT_DTYPE", "CHAR_DTYPE", "STRING_DTYPE", 
		"BOOLEAN_DTYPE", "IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", 
		"FOR_LOOP", "WHILE_LOOP", "DO_LOOP", "PRINT", "SCAN", "OPEN_PAR", "CLOSE_PAR", 
		"OPEN_CURLY_BRACK", "CLOSE_CURLY_BRACK", "OPEN_SQUARE_BRACK", "CLOSE_SQUARE_BRACK", 
		"ENUMERATION", "COMMENT_BLOCK", "END", "ADDITION_OPE", "SUBTRACTION_OPE", 
		"MULTIPLICTION_OPE", "DIVISION_OPE", "MODULO_OPE", "LESS_THAN_OPE", "LESS_THAN_EQUAL_TO_OPE", 
		"GREATER_THAN_OPE", "GREATER_THAN_EQUAL_TO_OPE", "EQUAL_OPE", "NOT_EQUAL_OPE", 
		"INCREMENT_OPE", "DECREMENT_OPE", "ASSINGMENT_OPE", "AND_OPE", "OR_OPE", 
		"NOT_OPE", "ARRAY_SIZE_DELIMETER", "CONSTANT_KEYWORD", "FUNCTION_CALL", 
		"MAIN_FUNC", "RETURN", "VOID", "INTEGER_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", 
		"STRING_LITERAL", "BOOLEAN_LITERAL", "VARIABLE_IDENTIFIER", "FUNCTION_IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'digitz'", "'lutang'", "'single'", "'Msg'", "'weh'", "'priority'", 
		"'optionlang'", "'nochoice'", "'willingtowait'", "'hanggatkeri'", "'gora'", 
		"'post'", "'gimmeinput'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", 
		null, "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'++'", "'--'", "'='", "'AND'", "'OR'", "'NOT'", 
		"'#'", "'consistent'", "'shoutout'", "'LEZGO'", "'uwina'", "'walangibabalik'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HT_NL_CR", "INT_DTYPE", "FLOAT_DTYPE", "CHAR_DTYPE", "STRING_DTYPE", 
		"BOOLEAN_DTYPE", "IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", 
		"FOR_LOOP", "WHILE_LOOP", "DO_LOOP", "PRINT", "SCAN", "OPEN_PAR", "CLOSE_PAR", 
		"OPEN_CURLY_BRACK", "CLOSE_CURLY_BRACK", "OPEN_SQUARE_BRACK", "CLOSE_SQUARE_BRACK", 
		"ENUMERATION", "COMMENT_BLOCK", "END", "ADDITION_OPE", "SUBTRACTION_OPE", 
		"MULTIPLICTION_OPE", "DIVISION_OPE", "MODULO_OPE", "LESS_THAN_OPE", "LESS_THAN_EQUAL_TO_OPE", 
		"GREATER_THAN_OPE", "GREATER_THAN_EQUAL_TO_OPE", "EQUAL_OPE", "NOT_EQUAL_OPE", 
		"INCREMENT_OPE", "DECREMENT_OPE", "ASSINGMENT_OPE", "AND_OPE", "OR_OPE", 
		"NOT_OPE", "ARRAY_SIZE_DELIMETER", "CONSTANT_KEYWORD", "FUNCTION_CALL", 
		"MAIN_FUNC", "RETURN", "VOID", "INTEGER_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", 
		"STRING_LITERAL", "BOOLEAN_LITERAL", "VARIABLE_IDENTIFIER", "FUNCTION_IDENTIFIER"
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


	public MilleniumLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Millenium.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0197\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\6\2o\n\2\r\2\16\2p\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u00f1\n\27\f\27\16\27\u00f4"+
		"\13\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3\60\5\60\u015b\n\60\3\60\6\60\u015e\n\60\r\60\16\60\u015f\3\61"+
		"\5\61\u0163\n\61\3\61\3\61\6\61\u0167\n\61\r\61\16\61\u0168\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\7\63\u0171\n\63\f\63\16\63\u0174\13\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0180\n\64\3\65\6\65\u0183"+
		"\n\65\r\65\16\65\u0184\3\65\7\65\u0188\n\65\f\65\16\65\u018b\13\65\3\66"+
		"\6\66\u018e\n\66\r\66\16\66\u018f\3\66\7\66\u0193\n\66\f\66\16\66\u0196"+
		"\13\66\4\u00f2\u0172\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67\3\2\7\6\2\13\f\17\17\"\"~~\4\2--//\3\2\62;\3\2"+
		"c|\3\2C\\\2\u01a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\3n\3\2\2\2\5t\3\2\2\2\7{\3\2\2\2\t\u0082\3\2\2\2\13\u0089\3\2"+
		"\2\2\r\u008d\3\2\2\2\17\u0091\3\2\2\2\21\u009a\3\2\2\2\23\u00a5\3\2\2"+
		"\2\25\u00ae\3\2\2\2\27\u00bc\3\2\2\2\31\u00c8\3\2\2\2\33\u00cd\3\2\2\2"+
		"\35\u00d2\3\2\2\2\37\u00dd\3\2\2\2!\u00df\3\2\2\2#\u00e1\3\2\2\2%\u00e3"+
		"\3\2\2\2\'\u00e5\3\2\2\2)\u00e7\3\2\2\2+\u00e9\3\2\2\2-\u00eb\3\2\2\2"+
		"/\u00f9\3\2\2\2\61\u00fb\3\2\2\2\63\u00fd\3\2\2\2\65\u00ff\3\2\2\2\67"+
		"\u0101\3\2\2\29\u0103\3\2\2\2;\u0105\3\2\2\2=\u0107\3\2\2\2?\u010a\3\2"+
		"\2\2A\u010c\3\2\2\2C\u010f\3\2\2\2E\u0112\3\2\2\2G\u0115\3\2\2\2I\u0118"+
		"\3\2\2\2K\u011b\3\2\2\2M\u011d\3\2\2\2O\u0121\3\2\2\2Q\u0124\3\2\2\2S"+
		"\u0128\3\2\2\2U\u012a\3\2\2\2W\u0135\3\2\2\2Y\u013e\3\2\2\2[\u0144\3\2"+
		"\2\2]\u014a\3\2\2\2_\u015a\3\2\2\2a\u0162\3\2\2\2c\u016a\3\2\2\2e\u016e"+
		"\3\2\2\2g\u017f\3\2\2\2i\u0182\3\2\2\2k\u018d\3\2\2\2mo\t\2\2\2nm\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\2\2\2s\4\3\2\2\2tu\7"+
		"f\2\2uv\7k\2\2vw\7i\2\2wx\7k\2\2xy\7v\2\2yz\7|\2\2z\6\3\2\2\2{|\7n\2\2"+
		"|}\7w\2\2}~\7v\2\2~\177\7c\2\2\177\u0080\7p\2\2\u0080\u0081\7i\2\2\u0081"+
		"\b\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085"+
		"\u0086\7i\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\n\3\2\2\2\u0089"+
		"\u008a\7O\2\2\u008a\u008b\7u\2\2\u008b\u008c\7i\2\2\u008c\f\3\2\2\2\u008d"+
		"\u008e\7y\2\2\u008e\u008f\7g\2\2\u008f\u0090\7j\2\2\u0090\16\3\2\2\2\u0091"+
		"\u0092\7r\2\2\u0092\u0093\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7q\2\2"+
		"\u0095\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7v\2\2\u0098\u0099"+
		"\7{\2\2\u0099\20\3\2\2\2\u009a\u009b\7q\2\2\u009b\u009c\7r\2\2\u009c\u009d"+
		"\7v\2\2\u009d\u009e\7k\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7i\2\2"+
		"\u00a4\22\3\2\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7"+
		"e\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7e\2\2\u00ac\u00ad\7g\2\2\u00ad\24\3\2\2\2\u00ae\u00af\7y\2\2\u00af\u00b0"+
		"\7k\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7q\2\2"+
		"\u00b7\u00b8\7y\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7c\2\2\u00be\u00bf"+
		"\7p\2\2\u00bf\u00c0\7i\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\u00c4\7m\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7t\2\2"+
		"\u00c6\u00c7\7k\2\2\u00c7\30\3\2\2\2\u00c8\u00c9\7i\2\2\u00c9\u00ca\7"+
		"q\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7c\2\2\u00cc\32\3\2\2\2\u00cd\u00ce"+
		"\7r\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\34\3\2\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\u00d6\7o\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2"+
		"\u00d9\u00da\7r\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7v\2\2\u00dc\36\3\2"+
		"\2\2\u00dd\u00de\7*\2\2\u00de \3\2\2\2\u00df\u00e0\7+\2\2\u00e0\"\3\2"+
		"\2\2\u00e1\u00e2\7}\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7\177\2\2\u00e4&\3"+
		"\2\2\2\u00e5\u00e6\7]\2\2\u00e6(\3\2\2\2\u00e7\u00e8\7_\2\2\u00e8*\3\2"+
		"\2\2\u00e9\u00ea\7.\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7A\2\2\u00ec\u00ed"+
		"\7A\2\2\u00ed\u00ee\7A\2\2\u00ee\u00f2\3\2\2\2\u00ef\u00f1\13\2\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7A\2\2\u00f6"+
		"\u00f7\7A\2\2\u00f7\u00f8\7A\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7=\2\2\u00fa"+
		"\60\3\2\2\2\u00fb\u00fc\7-\2\2\u00fc\62\3\2\2\2\u00fd\u00fe\7/\2\2\u00fe"+
		"\64\3\2\2\2\u00ff\u0100\7,\2\2\u0100\66\3\2\2\2\u0101\u0102\7\61\2\2\u0102"+
		"8\3\2\2\2\u0103\u0104\7\'\2\2\u0104:\3\2\2\2\u0105\u0106\7>\2\2\u0106"+
		"<\3\2\2\2\u0107\u0108\7>\2\2\u0108\u0109\7?\2\2\u0109>\3\2\2\2\u010a\u010b"+
		"\7@\2\2\u010b@\3\2\2\2\u010c\u010d\7@\2\2\u010d\u010e\7?\2\2\u010eB\3"+
		"\2\2\2\u010f\u0110\7?\2\2\u0110\u0111\7?\2\2\u0111D\3\2\2\2\u0112\u0113"+
		"\7#\2\2\u0113\u0114\7?\2\2\u0114F\3\2\2\2\u0115\u0116\7-\2\2\u0116\u0117"+
		"\7-\2\2\u0117H\3\2\2\2\u0118\u0119\7/\2\2\u0119\u011a\7/\2\2\u011aJ\3"+
		"\2\2\2\u011b\u011c\7?\2\2\u011cL\3\2\2\2\u011d\u011e\7C\2\2\u011e\u011f"+
		"\7P\2\2\u011f\u0120\7F\2\2\u0120N\3\2\2\2\u0121\u0122\7Q\2\2\u0122\u0123"+
		"\7T\2\2\u0123P\3\2\2\2\u0124\u0125\7P\2\2\u0125\u0126\7Q\2\2\u0126\u0127"+
		"\7V\2\2\u0127R\3\2\2\2\u0128\u0129\7%\2\2\u0129T\3\2\2\2\u012a\u012b\7"+
		"e\2\2\u012b\u012c\7q\2\2\u012c\u012d\7p\2\2\u012d\u012e\7u\2\2\u012e\u012f"+
		"\7k\2\2\u012f\u0130\7u\2\2\u0130\u0131\7v\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7p\2\2\u0133\u0134\7v\2\2\u0134V\3\2\2\2\u0135\u0136\7u\2\2\u0136"+
		"\u0137\7j\2\2\u0137\u0138\7q\2\2\u0138\u0139\7w\2\2\u0139\u013a\7v\2\2"+
		"\u013a\u013b\7q\2\2\u013b\u013c\7w\2\2\u013c\u013d\7v\2\2\u013dX\3\2\2"+
		"\2\u013e\u013f\7N\2\2\u013f\u0140\7G\2\2\u0140\u0141\7\\\2\2\u0141\u0142"+
		"\7I\2\2\u0142\u0143\7Q\2\2\u0143Z\3\2\2\2\u0144\u0145\7w\2\2\u0145\u0146"+
		"\7y\2\2\u0146\u0147\7k\2\2\u0147\u0148\7p\2\2\u0148\u0149\7c\2\2\u0149"+
		"\\\3\2\2\2\u014a\u014b\7y\2\2\u014b\u014c\7c\2\2\u014c\u014d\7n\2\2\u014d"+
		"\u014e\7c\2\2\u014e\u014f\7p\2\2\u014f\u0150\7i\2\2\u0150\u0151\7k\2\2"+
		"\u0151\u0152\7d\2\2\u0152\u0153\7c\2\2\u0153\u0154\7d\2\2\u0154\u0155"+
		"\7c\2\2\u0155\u0156\7n\2\2\u0156\u0157\7k\2\2\u0157\u0158\7m\2\2\u0158"+
		"^\3\2\2\2\u0159\u015b\t\3\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2"+
		"\u015b\u015d\3\2\2\2\u015c\u015e\t\4\2\2\u015d\u015c\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160`\3\2\2\2\u0161"+
		"\u0163\5_\60\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0166\7\60\2\2\u0165\u0167\t\4\2\2\u0166\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169b\3\2\2\2"+
		"\u016a\u016b\7)\2\2\u016b\u016c\13\2\2\2\u016c\u016d\7)\2\2\u016dd\3\2"+
		"\2\2\u016e\u0172\7$\2\2\u016f\u0171\13\2\2\2\u0170\u016f\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7$\2\2\u0176f\3\2\2\2\u0177\u0178"+
		"\7{\2\2\u0178\u0179\7c\2\2\u0179\u0180\7u\2\2\u017a\u017b\7f\2\2\u017b"+
		"\u017c\7g\2\2\u017c\u017d\7k\2\2\u017d\u017e\7p\2\2\u017e\u0180\7u\2\2"+
		"\u017f\u0177\3\2\2\2\u017f\u017a\3\2\2\2\u0180h\3\2\2\2\u0181\u0183\t"+
		"\5\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0189\3\2\2\2\u0186\u0188\t\4\2\2\u0187\u0186\3\2"+
		"\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"j\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\t\6\2\2\u018d\u018c\3\2\2\2"+
		"\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0194"+
		"\3\2\2\2\u0191\u0193\t\4\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195l\3\2\2\2\u0196\u0194\3\2\2\2"+
		"\17\2p\u00f2\u015a\u015f\u0162\u0168\u0172\u017f\u0184\u0189\u018f\u0194"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}