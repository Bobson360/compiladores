// Generated from MiniPascal.g4 by ANTLR 4.7.1

	package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, STR=3, AP=4, FP=5, SC=6, CL=7, OP=8, ATTR=9, VIR=10, ACH=11, 
		FCH=12, DOT=13, VAR=14, IF=15, ELSE=16, BEGIN=17, END=18, READ=19, WRITE=20, 
		INT=21, FLOAT=22, TEXT=23, CHAR=24, BOOL=25, OPREL=26, ID=27, NUMBER=28, 
		WS=29;
	public static final int
		RULE_program = 0, RULE_bloco = 1, RULE_decl = 2, RULE_declaravar = 3, 
		RULE_type = 4, RULE_cmd = 5, RULE_begin = 6, RULE_cmdleitura = 7, RULE_cmdescrita = 8, 
		RULE_cmdattrib = 9, RULE_expr = 10, RULE_term = 11, RULE_cmdselecao = 12;
	public static final String[] ruleNames = {
		"program", "bloco", "decl", "declaravar", "type", "cmd", "begin", "cmdleitura", 
		"cmdescrita", "cmdattrib", "expr", "term", "cmdselecao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'then'", null, "'('", "')'", "';'", "':'", null, "':='", 
		"','", "'{'", "'}'", "'.'", "'var'", "'if'", "'else'", "'begin'", "'end'", 
		"'read'", "'write'", "'int'", "'float'", "'text'", "'char'", "'boolean'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "STR", "AP", "FP", "SC", "CL", "OP", "ATTR", "VIR", 
		"ACH", "FCH", "DOT", "VAR", "IF", "ELSE", "BEGIN", "END", "READ", "WRITE", 
		"INT", "FLOAT", "TEXT", "CHAR", "BOOL", "OPREL", "ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "MiniPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(MiniPascalParser.STR, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public TerminalNode DOT() { return getToken(MiniPascalParser.DOT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(STR);
			setState(28);
			bloco();
			setState(29);
			match(END);
			setState(30);
			match(DOT);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<BeginContext> begin() {
			return getRuleContexts(BeginContext.class);
		}
		public BeginContext begin(int i) {
			return getRuleContext(BeginContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				begin();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR || _la==BEGIN );
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

	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				declaravar();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
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

	public static class DeclaravarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(MiniPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPascalParser.ID, i);
		}
		public TerminalNode CL() { return getToken(MiniPascalParser.CL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SC() { return getToken(MiniPascalParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(MiniPascalParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(MiniPascalParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(VAR);
			setState(43);
			match(ID);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(44);
				match(VIR);
				setState(45);
				match(ID);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(CL);
			setState(52);
			type();
			setState(53);
			match(SC);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiniPascalParser.INT, 0); }
		public TerminalNode TEXT() { return getToken(MiniPascalParser.TEXT, 0); }
		public TerminalNode FLOAT() { return getToken(MiniPascalParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(MiniPascalParser.CHAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(INT);
				 System.out.println("Int type declared"); 
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(TEXT);
				 System.out.println("Text type declared"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(FLOAT);
				 System.out.println("Float type declared"); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(CHAR);
				 System.out.println("Character type declared"); 
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

	public static class CmdContext extends ParserRuleContext {
		public DeclaravarContext declaravar() {
			return getRuleContext(DeclaravarContext.class,0);
		}
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdselecaoContext cmdselecao() {
			return getRuleContext(CmdselecaoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				declaravar();
				 System.out.println("Variable declaration"); 
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				cmdleitura();
				 System.out.println("Read Command"); 
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				cmdescrita();
				 System.out.println("Write command"); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				cmdattrib();
				 System.out.println("Assignment command"); 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				cmdselecao();
				 System.out.println("Logical command"); 
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

	public static class BeginContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public TerminalNode SC() { return getToken(MiniPascalParser.SC, 0); }
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(82);
				declaravar();
				 System.out.println("Declaracao de variavel"); 
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(BEGIN);
			 System.out.println("Inicio do Bloco"); 
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				cmd();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0) );
			setState(97);
			match(END);
			setState(98);
			match(SC);
			 System.out.println("End Block"); 
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

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MiniPascalParser.READ, 0); }
		public TerminalNode AP() { return getToken(MiniPascalParser.AP, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode FP() { return getToken(MiniPascalParser.FP, 0); }
		public TerminalNode SC() { return getToken(MiniPascalParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(READ);
			setState(102);
			match(AP);
			setState(103);
			match(ID);
			 System.out.println("READ: ID = " + _input.LT(-1).getText()); 
			setState(105);
			match(FP);
			setState(106);
			match(SC);
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

	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public TerminalNode AP() { return getToken(MiniPascalParser.AP, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode FP() { return getToken(MiniPascalParser.FP, 0); }
		public TerminalNode SC() { return getToken(MiniPascalParser.SC, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WRITE);
			setState(109);
			match(AP);
			setState(110);
			match(ID);
			 System.out.println("WRITE: ID = " + _input.LT(-1).getText()); 
			setState(112);
			match(FP);
			setState(113);
			match(SC);
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

	public static class CmdattribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(MiniPascalParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(MiniPascalParser.SC, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(116);
			match(ATTR);
			setState(117);
			expr();
			setState(118);
			match(SC);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(MiniPascalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MiniPascalParser.NUMBER, i);
		}
		public TerminalNode SC() { return getToken(MiniPascalParser.SC, 0); }
		public List<TerminalNode> OP() { return getTokens(MiniPascalParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(MiniPascalParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				term();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(NUMBER);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP) {
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(122);
						match(OP);
						setState(123);
						term();
						}
						break;
					case 2:
						{
						setState(124);
						match(OP);
						setState(125);
						match(NUMBER);
						}
						break;
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(SC);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(MiniPascalParser.NUMBER, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(135);
			match(NUMBER);
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

	public static class CmdselecaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public TerminalNode AP() { return getToken(MiniPascalParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(MiniPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPascalParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(MiniPascalParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(MiniPascalParser.FP, 0); }
		public TerminalNode NUMBER() { return getToken(MiniPascalParser.NUMBER, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public CmdselecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdselecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterCmdselecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitCmdselecao(this);
		}
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdselecao);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IF);
			setState(138);
			match(AP);
			setState(139);
			match(ID);
			setState(140);
			match(OPREL);
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
			match(FP);
			setState(143);
			match(T__1);
			setState(145); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(144);
					cmd();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(147); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(149);
				match(ELSE);
				{
				setState(151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(150);
						cmd();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3$\n\3\r"+
		"\3\16\3%\3\4\6\4)\n\4\r\4\16\4*\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64"+
		"\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7S\n\7\3\b\3\b"+
		"\3\b\7\bX\n\b\f\b\16\b[\13\b\3\b\3\b\3\b\6\b`\n\b\r\b\16\ba\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0081\n\f\f\f\16\f\u0084"+
		"\13\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\6\16\u0094\n\16\r\16\16\16\u0095\3\16\3\16\6\16\u009a\n\16\r\16"+
		"\16\16\u009b\5\16\u009e\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\2\3\3\2\35\36\2\u00a4\2\34\3\2\2\2\4#\3\2\2\2\6(\3\2\2\2\b,\3\2\2"+
		"\2\nA\3\2\2\2\fR\3\2\2\2\16Y\3\2\2\2\20g\3\2\2\2\22n\3\2\2\2\24u\3\2\2"+
		"\2\26\u0086\3\2\2\2\30\u0088\3\2\2\2\32\u008b\3\2\2\2\34\35\7\3\2\2\35"+
		"\36\7\5\2\2\36\37\5\4\3\2\37 \7\24\2\2 !\7\17\2\2!\3\3\2\2\2\"$\5\16\b"+
		"\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\')\5\b\5\2(\'\3"+
		"\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\7\3\2\2\2,-\7\20\2\2-\62\7\35\2"+
		"\2./\7\f\2\2/\61\7\35\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\t\2\2\66\67\5\n\6\2\678\7"+
		"\b\2\28\t\3\2\2\29:\7\27\2\2:B\b\6\1\2;<\7\31\2\2<B\b\6\1\2=>\7\30\2\2"+
		">B\b\6\1\2?@\7\32\2\2@B\b\6\1\2A9\3\2\2\2A;\3\2\2\2A=\3\2\2\2A?\3\2\2"+
		"\2B\13\3\2\2\2CD\5\b\5\2DE\b\7\1\2ES\3\2\2\2FG\5\20\t\2GH\b\7\1\2HS\3"+
		"\2\2\2IJ\5\22\n\2JK\b\7\1\2KS\3\2\2\2LM\5\24\13\2MN\b\7\1\2NS\3\2\2\2"+
		"OP\5\32\16\2PQ\b\7\1\2QS\3\2\2\2RC\3\2\2\2RF\3\2\2\2RI\3\2\2\2RL\3\2\2"+
		"\2RO\3\2\2\2S\r\3\2\2\2TU\5\b\5\2UV\b\b\1\2VX\3\2\2\2WT\3\2\2\2X[\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\23\2\2]_\b\b\1\2^`"+
		"\5\f\7\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\24\2\2"+
		"de\7\b\2\2ef\b\b\1\2f\17\3\2\2\2gh\7\25\2\2hi\7\6\2\2ij\7\35\2\2jk\b\t"+
		"\1\2kl\7\7\2\2lm\7\b\2\2m\21\3\2\2\2no\7\26\2\2op\7\6\2\2pq\7\35\2\2q"+
		"r\b\n\1\2rs\7\7\2\2st\7\b\2\2t\23\3\2\2\2uv\7\35\2\2vw\7\13\2\2wx\5\26"+
		"\f\2xy\7\b\2\2y\25\3\2\2\2z\u0087\5\30\r\2{\u0082\7\36\2\2|}\7\n\2\2}"+
		"\u0081\5\30\r\2~\177\7\n\2\2\177\u0081\7\36\2\2\u0080|\3\2\2\2\u0080~"+
		"\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\7\b\2\2\u0086z\3\2\2\2"+
		"\u0086{\3\2\2\2\u0087\27\3\2\2\2\u0088\u0089\7\35\2\2\u0089\u008a\7\36"+
		"\2\2\u008a\31\3\2\2\2\u008b\u008c\7\21\2\2\u008c\u008d\7\6\2\2\u008d\u008e"+
		"\7\35\2\2\u008e\u008f\7\34\2\2\u008f\u0090\t\2\2\2\u0090\u0091\7\7\2\2"+
		"\u0091\u0093\7\4\2\2\u0092\u0094\5\f\7\2\u0093\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009d\3\2\2\2\u0097"+
		"\u0099\7\22\2\2\u0098\u009a\5\f\7\2\u0099\u0098\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u0097\3\2\2\2\u009d\u009e\3\2\2\2\u009e\33\3\2\2\2\17%*\62ARYa\u0080"+
		"\u0082\u0086\u0095\u009b\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}