// Generated from IsiLang.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, AP=5, FP=6, SC=7, OP=8, ATTR=9, VIR=10, 
		ACH=11, FCH=12, OPREL=13, ID=14, NUMBER=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "AP", "FP", "SC", "OP", "ATTR", "VIR", 
		"ACH", "FCH", "OPREL", "ID", "NUMBER", "WS"
	};


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\\\n\16\3\17\3\17\7\17`\n\17\f\17\16\17c\13\17\3\20"+
		"\6\20f\n\20\r\20\16\20g\3\20\3\20\6\20l\n\20\r\20\16\20m\5\20p\n\20\3"+
		"\21\3\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\b\5\2,-//\61\61\4\2>>@@\3\2c|"+
		"\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"|\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5+\3\2\2\2\7\64\3\2\2\2"+
		"\t=\3\2\2\2\13B\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2"+
		"\25L\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37e\3\2\2"+
		"\2!q\3\2\2\2#$\7g\2\2$%\7u\2\2%&\7e\2\2&\'\7t\2\2\'(\7g\2\2()\7x\2\2)"+
		"*\7c\2\2*\4\3\2\2\2+,\7h\2\2,-\7k\2\2-.\7o\2\2./\7r\2\2/\60\7t\2\2\60"+
		"\61\7q\2\2\61\62\7i\2\2\62\63\7=\2\2\63\6\3\2\2\2\64\65\7r\2\2\65\66\7"+
		"t\2\2\66\67\7q\2\2\678\7i\2\289\7t\2\29:\7c\2\2:;\7o\2\2;<\7c\2\2<\b\3"+
		"\2\2\2=>\7n\2\2>?\7g\2\2?@\7k\2\2@A\7c\2\2A\n\3\2\2\2BC\7*\2\2C\f\3\2"+
		"\2\2DE\7+\2\2E\16\3\2\2\2FG\7=\2\2G\20\3\2\2\2HI\t\2\2\2I\22\3\2\2\2J"+
		"K\7?\2\2K\24\3\2\2\2LM\7.\2\2M\26\3\2\2\2NO\7}\2\2O\30\3\2\2\2PQ\7\177"+
		"\2\2Q\32\3\2\2\2R\\\t\3\2\2ST\7@\2\2T\\\7?\2\2UV\7>\2\2V\\\7?\2\2WX\7"+
		"?\2\2X\\\7?\2\2YZ\7#\2\2Z\\\7?\2\2[R\3\2\2\2[S\3\2\2\2[U\3\2\2\2[W\3\2"+
		"\2\2[Y\3\2\2\2\\\34\3\2\2\2]a\t\4\2\2^`\t\5\2\2_^\3\2\2\2`c\3\2\2\2a_"+
		"\3\2\2\2ab\3\2\2\2b\36\3\2\2\2ca\3\2\2\2df\t\6\2\2ed\3\2\2\2fg\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2ho\3\2\2\2ik\7\60\2\2jl\t\6\2\2kj\3\2\2\2lm\3\2\2"+
		"\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2oi\3\2\2\2op\3\2\2\2p \3\2\2\2qr\t\7\2"+
		"\2rs\3\2\2\2st\b\21\2\2t\"\3\2\2\2\t\2[_agmo\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}