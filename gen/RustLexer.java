// Generated from C:/Users/Andres/Documents/Proyectos/rust_test/parser\RustLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RustLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, CHAR=4, STR1=5, STR2=6, USIZE=7, VECTOR1=8, VECTOR2=9, 
		STRUCT=10, ARRAY=11, AS=12, TRU=13, FAL=14, POWF=15, POW=16, PRINT=17, 
		LET=18, MUT=19, FUNC=20, ARROW1=21, ARROW2=22, ABS=23, SQRT=24, TOSTR=25, 
		TOOWN=26, CLONE=27, NEW=28, LEN=29, PUSH=30, REMOVE=31, CONTAINS=32, INSERT=33, 
		CAPACITY=34, WCAPACITY=35, MAIN=36, IF=37, ELSE=38, MATCH=39, LOOP=40, 
		WHILE=41, FOR=42, IN=43, BREAK=44, CONTINUE=45, RETURN=46, MODULE=47, 
		PUB=48, NUMBER=49, STRING=50, ID=51, CHARACTER=52, PUNTO=53, C_PTS=54, 
		D_PTS=55, PYC=56, COMA=57, DIFERENTE=58, IG_IG=59, NOT=60, OR=61, PLEC=62, 
		UNDERSCORE=63, AND=64, IGUAL=65, MAYORIGUAL=66, MENORIGUAL=67, MAYOR=68, 
		MENOR=69, MUL=70, DIV=71, ADD=72, SUB=73, MOD=74, PARIZQ=75, PARDER=76, 
		LLAVEIZQ=77, LLAVEDER=78, CORIZQ=79, CORDER=80, AMP=81, WHITESPACE=82, 
		COMMENT=83, LINE_COMMENT=84;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOL", "CHAR", "STR1", "STR2", "USIZE", "VECTOR1", "VECTOR2", 
			"STRUCT", "ARRAY", "AS", "TRU", "FAL", "POWF", "POW", "PRINT", "LET", 
			"MUT", "FUNC", "ARROW1", "ARROW2", "ABS", "SQRT", "TOSTR", "TOOWN", "CLONE", 
			"NEW", "LEN", "PUSH", "REMOVE", "CONTAINS", "INSERT", "CAPACITY", "WCAPACITY", 
			"MAIN", "IF", "ELSE", "MATCH", "LOOP", "WHILE", "FOR", "IN", "BREAK", 
			"CONTINUE", "RETURN", "MODULE", "PUB", "NUMBER", "STRING", "ID", "CHARACTER", 
			"PUNTO", "C_PTS", "D_PTS", "PYC", "COMA", "DIFERENTE", "IG_IG", "NOT", 
			"OR", "PLEC", "UNDERSCORE", "AND", "IGUAL", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "PARIZQ", "PARDER", 
			"LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "AMP", "WHITESPACE", "COMMENT", 
			"LINE_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'i64'", "'f64'", "'bool'", "'char'", "'String'", "'&str'", "'usize'", 
			"'vec!'", "'Vec'", "'struct'", "'array'", "'as'", "'true'", "'false'", 
			"'powf'", "'pow'", "'println!'", "'let'", "'mut'", "'fn'", "'->'", "'=>'", 
			"'abs()'", "'sqrt()'", "'to_string()'", "'to_owned()'", "'clone()'", 
			"'new'", "'len'", "'push'", "'remove'", "'contains'", "'insert'", "'capacity'", 
			"'with_capacity'", "'main'", "'if'", "'else'", "'match'", "'loop'", "'while'", 
			"'for'", "'in'", "'break'", "'continue'", "'return'", "'mod'", "'pub'", 
			null, null, null, null, "'.'", "'::'", "':'", "';'", "','", "'!='", "'=='", 
			"'!'", "'||'", "'|'", "'_'", "'&&'", "'='", "'>='", "'<='", "'>'", "'<'", 
			"'*'", "'/'", "'+'", "'-'", "'%'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "CHAR", "STR1", "STR2", "USIZE", "VECTOR1", 
			"VECTOR2", "STRUCT", "ARRAY", "AS", "TRU", "FAL", "POWF", "POW", "PRINT", 
			"LET", "MUT", "FUNC", "ARROW1", "ARROW2", "ABS", "SQRT", "TOSTR", "TOOWN", 
			"CLONE", "NEW", "LEN", "PUSH", "REMOVE", "CONTAINS", "INSERT", "CAPACITY", 
			"WCAPACITY", "MAIN", "IF", "ELSE", "MATCH", "LOOP", "WHILE", "FOR", "IN", 
			"BREAK", "CONTINUE", "RETURN", "MODULE", "PUB", "NUMBER", "STRING", "ID", 
			"CHARACTER", "PUNTO", "C_PTS", "D_PTS", "PYC", "COMA", "DIFERENTE", "IG_IG", 
			"NOT", "OR", "PLEC", "UNDERSCORE", "AND", "IGUAL", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "PARIZQ", "PARDER", 
			"LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "AMP", "WHITESPACE", "COMMENT", 
			"LINE_COMMENT"
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


	public RustLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RustLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u0247\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\62\6\62\u01c4\n\62\r\62\16\62\u01c5\3"+
		"\62\3\62\6\62\u01ca\n\62\r\62\16\62\u01cb\5\62\u01ce\n\62\3\63\3\63\7"+
		"\63\u01d2\n\63\f\63\16\63\u01d5\13\63\3\63\3\63\3\64\3\64\7\64\u01db\n"+
		"\64\f\64\16\64\u01de\13\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3>\3?\3?\3@\3@\3A\3A"+
		"\3A\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K"+
		"\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\6S\u0226\nS\rS\16S\u0227"+
		"\3S\3S\3T\3T\3T\3T\7T\u0230\nT\fT\16T\u0233\13T\3T\3T\3T\3T\3T\3U\3U\3"+
		"U\3U\7U\u023e\nU\fU\16U\u0241\13U\3U\3U\3V\3V\3V\3\u0231\2W\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00ab\2\3\2\13\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C\\aac|\3"+
		"\2))\5\2\62;C\\c|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<"+
		"BB]_\2\u024d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\3\u00ad\3\2\2\2\5\u00b1\3\2\2\2\7\u00b5\3\2\2"+
		"\2\t\u00ba\3\2\2\2\13\u00bf\3\2\2\2\r\u00c6\3\2\2\2\17\u00cb\3\2\2\2\21"+
		"\u00d1\3\2\2\2\23\u00d6\3\2\2\2\25\u00da\3\2\2\2\27\u00e1\3\2\2\2\31\u00e7"+
		"\3\2\2\2\33\u00ea\3\2\2\2\35\u00ef\3\2\2\2\37\u00f5\3\2\2\2!\u00fa\3\2"+
		"\2\2#\u00fe\3\2\2\2%\u0107\3\2\2\2\'\u010b\3\2\2\2)\u010f\3\2\2\2+\u0112"+
		"\3\2\2\2-\u0115\3\2\2\2/\u0118\3\2\2\2\61\u011e\3\2\2\2\63\u0125\3\2\2"+
		"\2\65\u0131\3\2\2\2\67\u013c\3\2\2\29\u0144\3\2\2\2;\u0148\3\2\2\2=\u014c"+
		"\3\2\2\2?\u0151\3\2\2\2A\u0158\3\2\2\2C\u0161\3\2\2\2E\u0168\3\2\2\2G"+
		"\u0171\3\2\2\2I\u017f\3\2\2\2K\u0184\3\2\2\2M\u0187\3\2\2\2O\u018c\3\2"+
		"\2\2Q\u0192\3\2\2\2S\u0197\3\2\2\2U\u019d\3\2\2\2W\u01a1\3\2\2\2Y\u01a4"+
		"\3\2\2\2[\u01aa\3\2\2\2]\u01b3\3\2\2\2_\u01ba\3\2\2\2a\u01be\3\2\2\2c"+
		"\u01c3\3\2\2\2e\u01cf\3\2\2\2g\u01d8\3\2\2\2i\u01df\3\2\2\2k\u01e3\3\2"+
		"\2\2m\u01e5\3\2\2\2o\u01e8\3\2\2\2q\u01ea\3\2\2\2s\u01ec\3\2\2\2u\u01ee"+
		"\3\2\2\2w\u01f1\3\2\2\2y\u01f4\3\2\2\2{\u01f6\3\2\2\2}\u01f9\3\2\2\2\177"+
		"\u01fb\3\2\2\2\u0081\u01fd\3\2\2\2\u0083\u0200\3\2\2\2\u0085\u0202\3\2"+
		"\2\2\u0087\u0205\3\2\2\2\u0089\u0208\3\2\2\2\u008b\u020a\3\2\2\2\u008d"+
		"\u020c\3\2\2\2\u008f\u020e\3\2\2\2\u0091\u0210\3\2\2\2\u0093\u0212\3\2"+
		"\2\2\u0095\u0214\3\2\2\2\u0097\u0216\3\2\2\2\u0099\u0218\3\2\2\2\u009b"+
		"\u021a\3\2\2\2\u009d\u021c\3\2\2\2\u009f\u021e\3\2\2\2\u00a1\u0220\3\2"+
		"\2\2\u00a3\u0222\3\2\2\2\u00a5\u0225\3\2\2\2\u00a7\u022b\3\2\2\2\u00a9"+
		"\u0239\3\2\2\2\u00ab\u0244\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\78\2"+
		"\2\u00af\u00b0\7\66\2\2\u00b0\4\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3"+
		"\78\2\2\u00b3\u00b4\7\66\2\2\u00b4\6\3\2\2\2\u00b5\u00b6\7d\2\2\u00b6"+
		"\u00b7\7q\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7n\2\2\u00b9\b\3\2\2\2\u00ba"+
		"\u00bb\7e\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7t\2\2"+
		"\u00be\n\3\2\2\2\u00bf\u00c0\7U\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t"+
		"\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7i\2\2\u00c5\f"+
		"\3\2\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\16\3\2\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7u\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7|\2\2\u00cf\u00d0\7g\2\2\u00d0\20\3\2\2\2\u00d1"+
		"\u00d2\7x\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7#\2\2"+
		"\u00d5\22\3\2\2\2\u00d6\u00d7\7X\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7"+
		"e\2\2\u00d9\24\3\2\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7v\2\2\u00e0"+
		"\26\3\2\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7t\2\2\u00e4"+
		"\u00e5\7c\2\2\u00e5\u00e6\7{\2\2\u00e6\30\3\2\2\2\u00e7\u00e8\7c\2\2\u00e8"+
		"\u00e9\7u\2\2\u00e9\32\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7t\2\2\u00ec"+
		"\u00ed\7w\2\2\u00ed\u00ee\7g\2\2\u00ee\34\3\2\2\2\u00ef\u00f0\7h\2\2\u00f0"+
		"\u00f1\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7g\2\2"+
		"\u00f4\36\3\2\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7"+
		"y\2\2\u00f8\u00f9\7h\2\2\u00f9 \3\2\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7y\2\2\u00fd\"\3\2\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100"+
		"\7t\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7v\2\2\u0103"+
		"\u0104\7n\2\2\u0104\u0105\7p\2\2\u0105\u0106\7#\2\2\u0106$\3\2\2\2\u0107"+
		"\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109\u010a\7v\2\2\u010a&\3\2\2\2\u010b"+
		"\u010c\7o\2\2\u010c\u010d\7w\2\2\u010d\u010e\7v\2\2\u010e(\3\2\2\2\u010f"+
		"\u0110\7h\2\2\u0110\u0111\7p\2\2\u0111*\3\2\2\2\u0112\u0113\7/\2\2\u0113"+
		"\u0114\7@\2\2\u0114,\3\2\2\2\u0115\u0116\7?\2\2\u0116\u0117\7@\2\2\u0117"+
		".\3\2\2\2\u0118\u0119\7c\2\2\u0119\u011a\7d\2\2\u011a\u011b\7u\2\2\u011b"+
		"\u011c\7*\2\2\u011c\u011d\7+\2\2\u011d\60\3\2\2\2\u011e\u011f\7u\2\2\u011f"+
		"\u0120\7s\2\2\u0120\u0121\7t\2\2\u0121\u0122\7v\2\2\u0122\u0123\7*\2\2"+
		"\u0123\u0124\7+\2\2\u0124\62\3\2\2\2\u0125\u0126\7v\2\2\u0126\u0127\7"+
		"q\2\2\u0127\u0128\7a\2\2\u0128\u0129\7u\2\2\u0129\u012a\7v\2\2\u012a\u012b"+
		"\7t\2\2\u012b\u012c\7k\2\2\u012c\u012d\7p\2\2\u012d\u012e\7i\2\2\u012e"+
		"\u012f\7*\2\2\u012f\u0130\7+\2\2\u0130\64\3\2\2\2\u0131\u0132\7v\2\2\u0132"+
		"\u0133\7q\2\2\u0133\u0134\7a\2\2\u0134\u0135\7q\2\2\u0135\u0136\7y\2\2"+
		"\u0136\u0137\7p\2\2\u0137\u0138\7g\2\2\u0138\u0139\7f\2\2\u0139\u013a"+
		"\7*\2\2\u013a\u013b\7+\2\2\u013b\66\3\2\2\2\u013c\u013d\7e\2\2\u013d\u013e"+
		"\7n\2\2\u013e\u013f\7q\2\2\u013f\u0140\7p\2\2\u0140\u0141\7g\2\2\u0141"+
		"\u0142\7*\2\2\u0142\u0143\7+\2\2\u01438\3\2\2\2\u0144\u0145\7p\2\2\u0145"+
		"\u0146\7g\2\2\u0146\u0147\7y\2\2\u0147:\3\2\2\2\u0148\u0149\7n\2\2\u0149"+
		"\u014a\7g\2\2\u014a\u014b\7p\2\2\u014b<\3\2\2\2\u014c\u014d\7r\2\2\u014d"+
		"\u014e\7w\2\2\u014e\u014f\7u\2\2\u014f\u0150\7j\2\2\u0150>\3\2\2\2\u0151"+
		"\u0152\7t\2\2\u0152\u0153\7g\2\2\u0153\u0154\7o\2\2\u0154\u0155\7q\2\2"+
		"\u0155\u0156\7x\2\2\u0156\u0157\7g\2\2\u0157@\3\2\2\2\u0158\u0159\7e\2"+
		"\2\u0159\u015a\7q\2\2\u015a\u015b\7p\2\2\u015b\u015c\7v\2\2\u015c\u015d"+
		"\7c\2\2\u015d\u015e\7k\2\2\u015e\u015f\7p\2\2\u015f\u0160\7u\2\2\u0160"+
		"B\3\2\2\2\u0161\u0162\7k\2\2\u0162\u0163\7p\2\2\u0163\u0164\7u\2\2\u0164"+
		"\u0165\7g\2\2\u0165\u0166\7t\2\2\u0166\u0167\7v\2\2\u0167D\3\2\2\2\u0168"+
		"\u0169\7e\2\2\u0169\u016a\7c\2\2\u016a\u016b\7r\2\2\u016b\u016c\7c\2\2"+
		"\u016c\u016d\7e\2\2\u016d\u016e\7k\2\2\u016e\u016f\7v\2\2\u016f\u0170"+
		"\7{\2\2\u0170F\3\2\2\2\u0171\u0172\7y\2\2\u0172\u0173\7k\2\2\u0173\u0174"+
		"\7v\2\2\u0174\u0175\7j\2\2\u0175\u0176\7a\2\2\u0176\u0177\7e\2\2\u0177"+
		"\u0178\7c\2\2\u0178\u0179\7r\2\2\u0179\u017a\7c\2\2\u017a\u017b\7e\2\2"+
		"\u017b\u017c\7k\2\2\u017c\u017d\7v\2\2\u017d\u017e\7{\2\2\u017eH\3\2\2"+
		"\2\u017f\u0180\7o\2\2\u0180\u0181\7c\2\2\u0181\u0182\7k\2\2\u0182\u0183"+
		"\7p\2\2\u0183J\3\2\2\2\u0184\u0185\7k\2\2\u0185\u0186\7h\2\2\u0186L\3"+
		"\2\2\2\u0187\u0188\7g\2\2\u0188\u0189\7n\2\2\u0189\u018a\7u\2\2\u018a"+
		"\u018b\7g\2\2\u018bN\3\2\2\2\u018c\u018d\7o\2\2\u018d\u018e\7c\2\2\u018e"+
		"\u018f\7v\2\2\u018f\u0190\7e\2\2\u0190\u0191\7j\2\2\u0191P\3\2\2\2\u0192"+
		"\u0193\7n\2\2\u0193\u0194\7q\2\2\u0194\u0195\7q\2\2\u0195\u0196\7r\2\2"+
		"\u0196R\3\2\2\2\u0197\u0198\7y\2\2\u0198\u0199\7j\2\2\u0199\u019a\7k\2"+
		"\2\u019a\u019b\7n\2\2\u019b\u019c\7g\2\2\u019cT\3\2\2\2\u019d\u019e\7"+
		"h\2\2\u019e\u019f\7q\2\2\u019f\u01a0\7t\2\2\u01a0V\3\2\2\2\u01a1\u01a2"+
		"\7k\2\2\u01a2\u01a3\7p\2\2\u01a3X\3\2\2\2\u01a4\u01a5\7d\2\2\u01a5\u01a6"+
		"\7t\2\2\u01a6\u01a7\7g\2\2\u01a7\u01a8\7c\2\2\u01a8\u01a9\7m\2\2\u01a9"+
		"Z\3\2\2\2\u01aa\u01ab\7e\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\7p\2\2\u01ad"+
		"\u01ae\7v\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7w\2\2"+
		"\u01b1\u01b2\7g\2\2\u01b2\\\3\2\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7g"+
		"\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7w\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9"+
		"\7p\2\2\u01b9^\3\2\2\2\u01ba\u01bb\7o\2\2\u01bb\u01bc\7q\2\2\u01bc\u01bd"+
		"\7f\2\2\u01bd`\3\2\2\2\u01be\u01bf\7r\2\2\u01bf\u01c0\7w\2\2\u01c0\u01c1"+
		"\7d\2\2\u01c1b\3\2\2\2\u01c2\u01c4\t\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01cd\3\2\2\2\u01c7"+
		"\u01c9\7\60\2\2\u01c8\u01ca\t\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3"+
		"\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd"+
		"\u01c7\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ced\3\2\2\2\u01cf\u01d3\7$\2\2\u01d0"+
		"\u01d2\n\3\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6"+
		"\u01d7\7$\2\2\u01d7f\3\2\2\2\u01d8\u01dc\t\4\2\2\u01d9\u01db\t\5\2\2\u01da"+
		"\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01ddh\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\t\6\2\2\u01e0\u01e1"+
		"\t\7\2\2\u01e1\u01e2\t\6\2\2\u01e2j\3\2\2\2\u01e3\u01e4\7\60\2\2\u01e4"+
		"l\3\2\2\2\u01e5\u01e6\7<\2\2\u01e6\u01e7\7<\2\2\u01e7n\3\2\2\2\u01e8\u01e9"+
		"\7<\2\2\u01e9p\3\2\2\2\u01ea\u01eb\7=\2\2\u01ebr\3\2\2\2\u01ec\u01ed\7"+
		".\2\2\u01edt\3\2\2\2\u01ee\u01ef\7#\2\2\u01ef\u01f0\7?\2\2\u01f0v\3\2"+
		"\2\2\u01f1\u01f2\7?\2\2\u01f2\u01f3\7?\2\2\u01f3x\3\2\2\2\u01f4\u01f5"+
		"\7#\2\2\u01f5z\3\2\2\2\u01f6\u01f7\7~\2\2\u01f7\u01f8\7~\2\2\u01f8|\3"+
		"\2\2\2\u01f9\u01fa\7~\2\2\u01fa~\3\2\2\2\u01fb\u01fc\7a\2\2\u01fc\u0080"+
		"\3\2\2\2\u01fd\u01fe\7(\2\2\u01fe\u01ff\7(\2\2\u01ff\u0082\3\2\2\2\u0200"+
		"\u0201\7?\2\2\u0201\u0084\3\2\2\2\u0202\u0203\7@\2\2\u0203\u0204\7?\2"+
		"\2\u0204\u0086\3\2\2\2\u0205\u0206\7>\2\2\u0206\u0207\7?\2\2\u0207\u0088"+
		"\3\2\2\2\u0208\u0209\7@\2\2\u0209\u008a\3\2\2\2\u020a\u020b\7>\2\2\u020b"+
		"\u008c\3\2\2\2\u020c\u020d\7,\2\2\u020d\u008e\3\2\2\2\u020e\u020f\7\61"+
		"\2\2\u020f\u0090\3\2\2\2\u0210\u0211\7-\2\2\u0211\u0092\3\2\2\2\u0212"+
		"\u0213\7/\2\2\u0213\u0094\3\2\2\2\u0214\u0215\7\'\2\2\u0215\u0096\3\2"+
		"\2\2\u0216\u0217\7*\2\2\u0217\u0098\3\2\2\2\u0218\u0219\7+\2\2\u0219\u009a"+
		"\3\2\2\2\u021a\u021b\7}\2\2\u021b\u009c\3\2\2\2\u021c\u021d\7\177\2\2"+
		"\u021d\u009e\3\2\2\2\u021e\u021f\7]\2\2\u021f\u00a0\3\2\2\2\u0220\u0221"+
		"\7_\2\2\u0221\u00a2\3\2\2\2\u0222\u0223\7(\2\2\u0223\u00a4\3\2\2\2\u0224"+
		"\u0226\t\b\2\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\bS\2\2\u022a"+
		"\u00a6\3\2\2\2\u022b\u022c\7\61\2\2\u022c\u022d\7,\2\2\u022d\u0231\3\2"+
		"\2\2\u022e\u0230\13\2\2\2\u022f\u022e\3\2\2\2\u0230\u0233\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0234\3\2\2\2\u0233\u0231\3\2"+
		"\2\2\u0234\u0235\7,\2\2\u0235\u0236\7\61\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0238\bT\2\2\u0238\u00a8\3\2\2\2\u0239\u023a\7\61\2\2\u023a\u023b\7\61"+
		"\2\2\u023b\u023f\3\2\2\2\u023c\u023e\n\t\2\2\u023d\u023c\3\2\2\2\u023e"+
		"\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0242\u0243\bU\2\2\u0243\u00aa\3\2\2\2\u0244"+
		"\u0245\7^\2\2\u0245\u0246\t\n\2\2\u0246\u00ac\3\2\2\2\13\2\u01c5\u01cb"+
		"\u01cd\u01d3\u01dc\u0227\u0231\u023f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}