// Generated from C:/Users/Andres/Documents/Proyectos/DB-Rust/parser\Rust.g4 by ANTLR 4.9.2

    import arrayList "github.com/colegno/arraylist"
    import "OLC2/interfaces"
    import "OLC2/expressions"
    import "OLC2/instructions"
    import "OLC2/environment"
    import "strings"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Rust extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, CHAR=4, STR1=5, STR2=6, USIZE=7, VECTOR=8, STRUCT=9, 
		TRU=10, FAL=11, POW=12, PRINT=13, LET=14, MUT=15, FUNC=16, ARROW1=17, 
		ARROW2=18, ABS=19, SQRT=20, TOSTR=21, CLONE=22, NEW=23, LEN=24, PUSH=25, 
		REMOVE=26, CONTAINS=27, INSERT=28, CAPACITY=29, WCAPACITY=30, MAIN=31, 
		IF=32, ELSE=33, MATCH=34, LOOP=35, WHILE=36, FOR=37, IN=38, BREAK=39, 
		CONTINUE=40, RETURN=41, MODULE=42, PUB=43, NUMBER=44, STRING=45, ID=46, 
		CHARACTER=47, PUNTO=48, C_PTS=49, D_PTS=50, PYC=51, COMA=52, DIFERENTE=53, 
		IG_IG=54, NOT=55, OR=56, PLEC=57, UNDERSCORE=58, AND=59, IGUAL=60, MAYORIGUAL=61, 
		MENORIGUAL=62, MAYOR=63, MENOR=64, MUL=65, DIV=66, ADD=67, SUB=68, MOD=69, 
		PARIZQ=70, PARDER=71, LLAVEIZQ=72, LLAVEDER=73, CORIZQ=74, CORDER=75, 
		WHITESPACE=76, COMMENT=77, LINE_COMMENT=78;
	public static final int
		RULE_start = 0, RULE_global_env = 1, RULE_main = 2, RULE_instructions = 3, 
		RULE_instruction = 4, RULE_loopWhile = 5, RULE_loopBucle = 6, RULE_loopForin = 7, 
		RULE_transBreak = 8, RULE_transContinue = 9, RULE_condIf = 10, RULE_condElseIf = 11, 
		RULE_condElse = 12, RULE_block = 13, RULE_condMatch = 14, RULE_listArms = 15, 
		RULE_listMatch = 16, RULE_defaultArm = 17, RULE_impression = 18, RULE_declaration = 19, 
		RULE_structCreation = 20, RULE_listStructDec = 21, RULE_assignment = 22, 
		RULE_listAccessStruct = 23, RULE_arrayType = 24, RULE_function = 25, RULE_module = 26, 
		RULE_types = 27, RULE_listParams = 28, RULE_expression = 29, RULE_expr_arit = 30, 
		RULE_primitive = 31, RULE_stringsTypes = 32, RULE_listArray = 33, RULE_listStructExp = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "global_env", "main", "instructions", "instruction", "loopWhile", 
			"loopBucle", "loopForin", "transBreak", "transContinue", "condIf", "condElseIf", 
			"condElse", "block", "condMatch", "listArms", "listMatch", "defaultArm", 
			"impression", "declaration", "structCreation", "listStructDec", "assignment", 
			"listAccessStruct", "arrayType", "function", "module", "types", "listParams", 
			"expression", "expr_arit", "primitive", "stringsTypes", "listArray", 
			"listStructExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'i64'", "'f64'", "'bool'", "'char'", "'String'", "'&str'", "'usize'", 
			"'vec'", "'struct'", "'true'", "'false'", "'pow'", "'println!'", "'let'", 
			"'mut'", "'fn'", "'->'", "'=>'", "'abs'", "'sqrt'", "'to_string'", "'clone'", 
			"'new'", "'len'", "'push'", "'remove'", "'contains'", "'insert'", "'capacity'", 
			"'with_capacity'", "'main'", "'if'", "'else'", "'match'", "'loop'", "'while'", 
			"'for'", "'in'", "'break'", "'continue'", "'return'", "'mod'", "'pub'", 
			null, null, null, null, "'.'", "'::'", "':'", "';'", "','", "'!='", "'=='", 
			"'!'", "'||'", "'|'", "'_'", "'&&'", "'='", "'>='", "'<='", "'>'", "'<'", 
			"'*'", "'/'", "'+'", "'-'", "'%'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "CHAR", "STR1", "STR2", "USIZE", "VECTOR", 
			"STRUCT", "TRU", "FAL", "POW", "PRINT", "LET", "MUT", "FUNC", "ARROW1", 
			"ARROW2", "ABS", "SQRT", "TOSTR", "CLONE", "NEW", "LEN", "PUSH", "REMOVE", 
			"CONTAINS", "INSERT", "CAPACITY", "WCAPACITY", "MAIN", "IF", "ELSE", 
			"MATCH", "LOOP", "WHILE", "FOR", "IN", "BREAK", "CONTINUE", "RETURN", 
			"MODULE", "PUB", "NUMBER", "STRING", "ID", "CHARACTER", "PUNTO", "C_PTS", 
			"D_PTS", "PYC", "COMA", "DIFERENTE", "IG_IG", "NOT", "OR", "PLEC", "UNDERSCORE", 
			"AND", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", 
			"DIV", "ADD", "SUB", "MOD", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
			"CORIZQ", "CORDER", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Rust.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Rust(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public environment.Code code;
		public Global_envContext global_env;
		public List<Global_envContext> e = new ArrayList<Global_envContext>();
		public MainContext main;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<Global_envContext> global_env() {
			return getRuleContexts(Global_envContext.class);
		}
		public Global_envContext global_env(int i) {
			return getRuleContext(Global_envContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					((StartContext)_localctx).global_env = global_env();
					((StartContext)_localctx).e.add(((StartContext)_localctx).global_env);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(76);
			((StartContext)_localctx).main = main();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FUNC) | (1L << MODULE))) != 0)) {
				{
				{
				setState(77);
				((StartContext)_localctx).global_env = global_env();
				((StartContext)_localctx).e.add(((StartContext)_localctx).global_env);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        global := arrayList.New()
			        listInt := localctx.(*StartContext).GetE()
			        for _, e := range listInt {
			            global.Add(e.GetHi())
			        }
			        _localctx.code = environment.NewCode(((StartContext)_localctx).main.mainInst, global)
			    
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

	public static class Global_envContext extends ParserRuleContext {
		public string hi;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode PYC() { return getToken(Rust.PYC, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public Global_envContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_env; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterGlobal_env(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitGlobal_env(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitGlobal_env(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_envContext global_env() throws RecognitionException {
		Global_envContext _localctx = new Global_envContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global_env);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				declaration();
				setState(86);
				match(PYC);
				_localctx.hi = "declaration"
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				function();
				_localctx.hi = "function"
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				module();
				_localctx.hi = "module"
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

	public static class MainContext extends ParserRuleContext {
		public *arrayList.List mainInst;
		public InstructionsContext instructions;
		public TerminalNode FUNC() { return getToken(Rust.FUNC, 0); }
		public TerminalNode MAIN() { return getToken(Rust.MAIN, 0); }
		public TerminalNode PARIZQ() { return getToken(Rust.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(Rust.PARDER, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(FUNC);
			setState(98);
			match(MAIN);
			setState(99);
			match(PARIZQ);
			setState(100);
			match(PARDER);
			setState(101);
			match(LLAVEIZQ);
			setState(102);
			((MainContext)_localctx).instructions = instructions();
			setState(103);
			match(LLAVEDER);
			 _localctx.mainInst = ((MainContext)_localctx).instructions.insts 
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

	public static class InstructionsContext extends ParserRuleContext {
		public *arrayList.List insts;
		public InstructionContext instruction;
		public List<InstructionContext> e = new ArrayList<InstructionContext>();
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instructions);

		    _localctx.insts = arrayList.New()
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				((InstructionsContext)_localctx).instruction = instruction();
				((InstructionsContext)_localctx).e.add(((InstructionsContext)_localctx).instruction);
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << PRINT) | (1L << LET) | (1L << IF) | (1L << MATCH) | (1L << LOOP) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << ID))) != 0) );

			        listInt := localctx.(*InstructionsContext).GetE()
			        for _, e := range listInt {
			            _localctx.insts.Add(e.GetInst())
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

	public static class InstructionContext extends ParserRuleContext {
		public interfaces.Instruction inst;
		public ImpressionContext impression;
		public DeclarationContext declaration;
		public AssignmentContext assignment;
		public CondIfContext condIf;
		public CondMatchContext condMatch;
		public LoopWhileContext loopWhile;
		public LoopBucleContext loopBucle;
		public LoopForinContext loopForin;
		public TransBreakContext transBreak;
		public TransContinueContext transContinue;
		public StructCreationContext structCreation;
		public ImpressionContext impression() {
			return getRuleContext(ImpressionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(Rust.PYC, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CondIfContext condIf() {
			return getRuleContext(CondIfContext.class,0);
		}
		public CondMatchContext condMatch() {
			return getRuleContext(CondMatchContext.class,0);
		}
		public LoopWhileContext loopWhile() {
			return getRuleContext(LoopWhileContext.class,0);
		}
		public LoopBucleContext loopBucle() {
			return getRuleContext(LoopBucleContext.class,0);
		}
		public LoopForinContext loopForin() {
			return getRuleContext(LoopForinContext.class,0);
		}
		public TransBreakContext transBreak() {
			return getRuleContext(TransBreakContext.class,0);
		}
		public TransContinueContext transContinue() {
			return getRuleContext(TransContinueContext.class,0);
		}
		public StructCreationContext structCreation() {
			return getRuleContext(StructCreationContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((InstructionContext)_localctx).impression = impression();
				setState(114);
				match(PYC);
				 _localctx.inst = ((InstructionContext)_localctx).impression.pr 
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				((InstructionContext)_localctx).declaration = declaration();
				setState(118);
				match(PYC);
				 _localctx.inst = ((InstructionContext)_localctx).declaration.dec 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				((InstructionContext)_localctx).assignment = assignment();
				setState(122);
				match(PYC);
				 _localctx.inst = ((InstructionContext)_localctx).assignment.ass 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				((InstructionContext)_localctx).condIf = condIf();
				 _localctx.inst = ((InstructionContext)_localctx).condIf.ifCond 
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				((InstructionContext)_localctx).condMatch = condMatch();
				 _localctx.inst = ((InstructionContext)_localctx).condMatch.mtch 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				((InstructionContext)_localctx).loopWhile = loopWhile();
				 _localctx.inst = ((InstructionContext)_localctx).loopWhile.lw 
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				((InstructionContext)_localctx).loopBucle = loopBucle();
				 _localctx.inst = ((InstructionContext)_localctx).loopBucle.lb 
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				((InstructionContext)_localctx).loopForin = loopForin();
				 _localctx.inst = ((InstructionContext)_localctx).loopForin.lfi 
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				((InstructionContext)_localctx).transBreak = transBreak();
				setState(141);
				match(PYC);
				 _localctx.inst = ((InstructionContext)_localctx).transBreak.brk 
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
				((InstructionContext)_localctx).transContinue = transContinue();
				setState(145);
				match(PYC);
				 _localctx.inst = ((InstructionContext)_localctx).transContinue.cnt 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 11);
				{
				setState(148);
				((InstructionContext)_localctx).structCreation = structCreation();
				 _localctx.inst = ((InstructionContext)_localctx).structCreation.dec 
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

	public static class LoopWhileContext extends ParserRuleContext {
		public interfaces.Instruction lw;
		public Token WHILE;
		public ExpressionContext expression;
		public BlockContext block;
		public TerminalNode WHILE() { return getToken(Rust.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public LoopWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterLoopWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitLoopWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitLoopWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopWhileContext loopWhile() throws RecognitionException {
		LoopWhileContext _localctx = new LoopWhileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((LoopWhileContext)_localctx).WHILE = match(WHILE);
			setState(154);
			((LoopWhileContext)_localctx).expression = expression(0);
			setState(155);
			match(LLAVEIZQ);
			setState(156);
			((LoopWhileContext)_localctx).block = block(0);
			setState(157);
			match(LLAVEDER);
			 _localctx.lw = instructions.NewWhile((((LoopWhileContext)_localctx).WHILE!=null?((LoopWhileContext)_localctx).WHILE.getLine():0), (((LoopWhileContext)_localctx).WHILE!=null?((LoopWhileContext)_localctx).WHILE.getCharPositionInLine():0), ((LoopWhileContext)_localctx).expression.p, ((LoopWhileContext)_localctx).block.blk ) 
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

	public static class LoopBucleContext extends ParserRuleContext {
		public interfaces.Instruction lb;
		public Token LOOP;
		public BlockContext block;
		public TerminalNode LOOP() { return getToken(Rust.LOOP, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public LoopBucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterLoopBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitLoopBucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitLoopBucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBucleContext loopBucle() throws RecognitionException {
		LoopBucleContext _localctx = new LoopBucleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loopBucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((LoopBucleContext)_localctx).LOOP = match(LOOP);
			setState(161);
			match(LLAVEIZQ);
			setState(162);
			((LoopBucleContext)_localctx).block = block(0);
			setState(163);
			match(LLAVEDER);
			 _localctx.lb = instructions.NewLoop((((LoopBucleContext)_localctx).LOOP!=null?((LoopBucleContext)_localctx).LOOP.getLine():0), (((LoopBucleContext)_localctx).LOOP!=null?((LoopBucleContext)_localctx).LOOP.getCharPositionInLine():0), ((LoopBucleContext)_localctx).block.blk) 
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

	public static class LoopForinContext extends ParserRuleContext {
		public interfaces.Instruction lfi;
		public Token FOR;
		public Token ID;
		public ExpressionContext expression;
		public InstructionsContext instructions;
		public TerminalNode FOR() { return getToken(Rust.FOR, 0); }
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode IN() { return getToken(Rust.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public LoopForinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopForin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterLoopForin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitLoopForin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitLoopForin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopForinContext loopForin() throws RecognitionException {
		LoopForinContext _localctx = new LoopForinContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopForin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((LoopForinContext)_localctx).FOR = match(FOR);
			setState(167);
			((LoopForinContext)_localctx).ID = match(ID);
			setState(168);
			match(IN);
			setState(169);
			((LoopForinContext)_localctx).expression = expression(0);
			setState(170);
			match(LLAVEIZQ);
			setState(171);
			((LoopForinContext)_localctx).instructions = instructions();
			setState(172);
			match(LLAVEDER);
			 _localctx.lfi = instructions.NewForIn((((LoopForinContext)_localctx).FOR!=null?((LoopForinContext)_localctx).FOR.getLine():0), (((LoopForinContext)_localctx).FOR!=null?((LoopForinContext)_localctx).FOR.getCharPositionInLine():0), (((LoopForinContext)_localctx).ID!=null?((LoopForinContext)_localctx).ID.getText():null), ((LoopForinContext)_localctx).expression.p, ((LoopForinContext)_localctx).instructions.insts) 
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

	public static class TransBreakContext extends ParserRuleContext {
		public interfaces.Instruction brk;
		public Token BREAK;
		public ExpressionContext expression;
		public TerminalNode BREAK() { return getToken(Rust.BREAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TransBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterTransBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitTransBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitTransBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransBreakContext transBreak() throws RecognitionException {
		TransBreakContext _localctx = new TransBreakContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transBreak);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				((TransBreakContext)_localctx).BREAK = match(BREAK);
				setState(176);
				((TransBreakContext)_localctx).expression = expression(0);
				 _localctx.brk = instructions.NewBreak((((TransBreakContext)_localctx).BREAK!=null?((TransBreakContext)_localctx).BREAK.getLine():0), (((TransBreakContext)_localctx).BREAK!=null?((TransBreakContext)_localctx).BREAK.getCharPositionInLine():0), ((TransBreakContext)_localctx).expression.p) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((TransBreakContext)_localctx).BREAK = match(BREAK);
				 _localctx.brk = instructions.NewBreak((((TransBreakContext)_localctx).BREAK!=null?((TransBreakContext)_localctx).BREAK.getLine():0), (((TransBreakContext)_localctx).BREAK!=null?((TransBreakContext)_localctx).BREAK.getCharPositionInLine():0), nil) 
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

	public static class TransContinueContext extends ParserRuleContext {
		public interfaces.Instruction cnt;
		public Token CONTINUE;
		public TerminalNode CONTINUE() { return getToken(Rust.CONTINUE, 0); }
		public TransContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transContinue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterTransContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitTransContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitTransContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransContinueContext transContinue() throws RecognitionException {
		TransContinueContext _localctx = new TransContinueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((TransContinueContext)_localctx).CONTINUE = match(CONTINUE);
			 _localctx.cnt = instructions.NewContinue((((TransContinueContext)_localctx).CONTINUE!=null?((TransContinueContext)_localctx).CONTINUE.getLine():0), (((TransContinueContext)_localctx).CONTINUE!=null?((TransContinueContext)_localctx).CONTINUE.getCharPositionInLine():0)) 
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

	public static class CondIfContext extends ParserRuleContext {
		public interfaces.Instruction ifCond;
		public Token IF;
		public ExpressionContext expression;
		public BlockContext block;
		public CondElseIfContext condElseIf;
		public List<CondElseIfContext> e = new ArrayList<CondElseIfContext>();
		public CondElseContext condElse;
		public TerminalNode IF() { return getToken(Rust.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public CondElseContext condElse() {
			return getRuleContext(CondElseContext.class,0);
		}
		public List<CondElseIfContext> condElseIf() {
			return getRuleContexts(CondElseIfContext.class);
		}
		public CondElseIfContext condElseIf(int i) {
			return getRuleContext(CondElseIfContext.class,i);
		}
		public CondIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterCondIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitCondIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitCondIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondIfContext condIf() throws RecognitionException {
		CondIfContext _localctx = new CondIfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condIf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((CondIfContext)_localctx).IF = match(IF);
			setState(187);
			((CondIfContext)_localctx).expression = expression(0);
			setState(188);
			match(LLAVEIZQ);
			setState(189);
			((CondIfContext)_localctx).block = block(0);
			setState(190);
			match(LLAVEDER);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					((CondIfContext)_localctx).condElseIf = condElseIf();
					((CondIfContext)_localctx).e.add(((CondIfContext)_localctx).condElseIf);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(197);
			((CondIfContext)_localctx).condElse = condElse();

			            elif := arrayList.New()
			            listElif := localctx.(*CondIfContext).GetE()
			            for _, e := range listElif {
			                elif.Add(e.GetElif())
			            }
			            _localctx.ifCond = instructions.NewIf((((CondIfContext)_localctx).IF!=null?((CondIfContext)_localctx).IF.getLine():0), (((CondIfContext)_localctx).IF!=null?((CondIfContext)_localctx).IF.getCharPositionInLine():0), ((CondIfContext)_localctx).expression.p, ((CondIfContext)_localctx).block.blk, elif, ((CondIfContext)_localctx).condElse.blkelse)
			            
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

	public static class CondElseIfContext extends ParserRuleContext {
		public interfaces.Instruction elif;
		public Token ELSE;
		public ExpressionContext expression;
		public BlockContext block;
		public TerminalNode ELSE() { return getToken(Rust.ELSE, 0); }
		public TerminalNode IF() { return getToken(Rust.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public CondElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterCondElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitCondElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitCondElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondElseIfContext condElseIf() throws RecognitionException {
		CondElseIfContext _localctx = new CondElseIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((CondElseIfContext)_localctx).ELSE = match(ELSE);
			setState(201);
			match(IF);
			setState(202);
			((CondElseIfContext)_localctx).expression = expression(0);
			setState(203);
			match(LLAVEIZQ);
			setState(204);
			((CondElseIfContext)_localctx).block = block(0);
			setState(205);
			match(LLAVEDER);

			    elif := arrayList.New()
			    condelse := arrayList.New()
			    _localctx.elif = instructions.NewIf((((CondElseIfContext)_localctx).ELSE!=null?((CondElseIfContext)_localctx).ELSE.getLine():0), (((CondElseIfContext)_localctx).ELSE!=null?((CondElseIfContext)_localctx).ELSE.getCharPositionInLine():0), ((CondElseIfContext)_localctx).expression.p, ((CondElseIfContext)_localctx).block.blk, elif, condelse)
			    
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

	public static class CondElseContext extends ParserRuleContext {
		public *arrayList.List blkelse;
		public BlockContext block;
		public TerminalNode ELSE() { return getToken(Rust.ELSE, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public CondElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterCondElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitCondElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitCondElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondElseContext condElse() throws RecognitionException {
		CondElseContext _localctx = new CondElseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condElse);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(ELSE);
				setState(209);
				match(LLAVEIZQ);
				setState(210);
				((CondElseContext)_localctx).block = block(0);
				setState(211);
				match(LLAVEDER);
				 _localctx.blkelse = ((CondElseContext)_localctx).block.blk 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 _localctx.blkelse = arrayList.New() 
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

	public static class BlockContext extends ParserRuleContext {
		public *arrayList.List blk;
		public BlockContext bloque;
		public InstructionContext instruction;
		public ExpressionContext expression;
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		return block(0);
	}

	private BlockContext block(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockContext _localctx = new BlockContext(_ctx, _parentState);
		BlockContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_block, _p);

		    _localctx.blk = arrayList.New()
		  
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(218);
				((BlockContext)_localctx).instruction = instruction();
				 _localctx.blk.Add(((BlockContext)_localctx).instruction.inst) 
				}
				break;
			case 2:
				{
				setState(221);
				((BlockContext)_localctx).expression = expression(0);
				 _localctx.blk.Add(((BlockContext)_localctx).expression.p) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new BlockContext(_parentctx, _parentState);
						_localctx.bloque = _prevctx;
						_localctx.bloque = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_block);
						setState(226);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(227);
						((BlockContext)_localctx).instruction = instruction();

						                                      ((BlockContext)_localctx).bloque.blk.Add(((BlockContext)_localctx).instruction.inst)
						                                      _localctx.blk = ((BlockContext)_localctx).bloque.blk
						                                      
						}
						break;
					case 2:
						{
						_localctx = new BlockContext(_parentctx, _parentState);
						_localctx.bloque = _prevctx;
						_localctx.bloque = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_block);
						setState(230);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(231);
						((BlockContext)_localctx).expression = expression(0);

						                                      ((BlockContext)_localctx).bloque.blk.Add(((BlockContext)_localctx).expression.p)
						                                      _localctx.blk = ((BlockContext)_localctx).bloque.blk
						                                     
						}
						break;
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class CondMatchContext extends ParserRuleContext {
		public interfaces.Instruction mtch;
		public Token MATCH;
		public ExpressionContext expression;
		public ListArmsContext listArms;
		public List<ListArmsContext> e = new ArrayList<ListArmsContext>();
		public DefaultArmContext defaultArm;
		public TerminalNode MATCH() { return getToken(Rust.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public DefaultArmContext defaultArm() {
			return getRuleContext(DefaultArmContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public List<ListArmsContext> listArms() {
			return getRuleContexts(ListArmsContext.class);
		}
		public ListArmsContext listArms(int i) {
			return getRuleContext(ListArmsContext.class,i);
		}
		public CondMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterCondMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitCondMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitCondMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondMatchContext condMatch() throws RecognitionException {
		CondMatchContext _localctx = new CondMatchContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condMatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			((CondMatchContext)_localctx).MATCH = match(MATCH);
			setState(240);
			((CondMatchContext)_localctx).expression = expression(0);
			setState(241);
			match(LLAVEIZQ);
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				((CondMatchContext)_localctx).listArms = listArms();
				((CondMatchContext)_localctx).e.add(((CondMatchContext)_localctx).listArms);
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRU) | (1L << FAL) | (1L << IF) | (1L << MATCH) | (1L << LOOP) | (1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << CHARACTER) | (1L << NOT))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SUB - 68)) | (1L << (PARIZQ - 68)) | (1L << (CORIZQ - 68)))) != 0) );
			setState(247);
			((CondMatchContext)_localctx).defaultArm = defaultArm();
			setState(248);
			match(LLAVEDER);

			        arrarms := arrayList.New()
			        larms := localctx.(*CondMatchContext).GetE()
			        for _, e := range larms {
			            arrarms.Add(e.GetArms())
			        }
			        _localctx.mtch = instructions.NewMatch((((CondMatchContext)_localctx).MATCH!=null?((CondMatchContext)_localctx).MATCH.getLine():0), (((CondMatchContext)_localctx).MATCH!=null?((CondMatchContext)_localctx).MATCH.getCharPositionInLine():0), ((CondMatchContext)_localctx).expression.p, arrarms, ((CondMatchContext)_localctx).defaultArm.defa)
			        
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

	public static class ListArmsContext extends ParserRuleContext {
		public interfaces.Instruction arms;
		public ListMatchContext listMatch;
		public BlockContext block;
		public ListMatchContext listMatch() {
			return getRuleContext(ListMatchContext.class,0);
		}
		public TerminalNode ARROW2() { return getToken(Rust.ARROW2, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Rust.COMA, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public ListArmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterListArms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitListArms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitListArms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListArmsContext listArms() throws RecognitionException {
		ListArmsContext _localctx = new ListArmsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listArms);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((ListArmsContext)_localctx).listMatch = listMatch(0);
				setState(252);
				match(ARROW2);
				setState(253);
				((ListArmsContext)_localctx).block = block(0);
				setState(254);
				match(COMA);

				         _localctx.arms = instructions.NewArm((((ListArmsContext)_localctx).listMatch!=null?(((ListArmsContext)_localctx).listMatch.start):null).GetLine(),(((ListArmsContext)_localctx).listMatch!=null?(((ListArmsContext)_localctx).listMatch.start):null).GetColumn(), ((ListArmsContext)_localctx).listMatch.ma, ((ListArmsContext)_localctx).block.blk)
				         
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				((ListArmsContext)_localctx).listMatch = listMatch(0);
				setState(258);
				match(ARROW2);
				setState(259);
				match(LLAVEIZQ);
				setState(260);
				((ListArmsContext)_localctx).block = block(0);
				setState(261);
				match(LLAVEDER);
				setState(262);
				match(COMA);

				        _localctx.arms = instructions.NewArm((((ListArmsContext)_localctx).listMatch!=null?(((ListArmsContext)_localctx).listMatch.start):null).GetLine(),(((ListArmsContext)_localctx).listMatch!=null?(((ListArmsContext)_localctx).listMatch.start):null).GetColumn(), ((ListArmsContext)_localctx).listMatch.ma, ((ListArmsContext)_localctx).block.blk)
				        
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

	public static class ListMatchContext extends ParserRuleContext {
		public *arrayList.List ma;
		public ListMatchContext lma;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLEC() { return getToken(Rust.PLEC, 0); }
		public ListMatchContext listMatch() {
			return getRuleContext(ListMatchContext.class,0);
		}
		public ListMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterListMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitListMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitListMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListMatchContext listMatch() throws RecognitionException {
		return listMatch(0);
	}

	private ListMatchContext listMatch(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListMatchContext _localctx = new ListMatchContext(_ctx, _parentState);
		ListMatchContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_listMatch, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268);
			((ListMatchContext)_localctx).expression = expression(0);

			                 _localctx.ma = arrayList.New()
			                 _localctx.ma.Add(((ListMatchContext)_localctx).expression.p)
			              
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListMatchContext(_parentctx, _parentState);
					_localctx.lma = _prevctx;
					_localctx.lma = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listMatch);
					setState(271);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(272);
					match(PLEC);
					setState(273);
					((ListMatchContext)_localctx).expression = expression(0);

					                                          ((ListMatchContext)_localctx).lma.ma.Add(((ListMatchContext)_localctx).expression.p)
					                                          _localctx.ma = ((ListMatchContext)_localctx).lma.ma
					                                       
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class DefaultArmContext extends ParserRuleContext {
		public *arrayList.List defa;
		public BlockContext block;
		public TerminalNode UNDERSCORE() { return getToken(Rust.UNDERSCORE, 0); }
		public TerminalNode ARROW2() { return getToken(Rust.ARROW2, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Rust.COMA, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public DefaultArmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultArm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterDefaultArm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitDefaultArm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitDefaultArm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultArmContext defaultArm() throws RecognitionException {
		DefaultArmContext _localctx = new DefaultArmContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_defaultArm);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(UNDERSCORE);
				setState(282);
				match(ARROW2);
				setState(283);
				((DefaultArmContext)_localctx).block = block(0);
				setState(284);
				match(COMA);
				 _localctx.defa = ((DefaultArmContext)_localctx).block.blk 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(UNDERSCORE);
				setState(288);
				match(ARROW2);
				setState(289);
				match(LLAVEIZQ);
				setState(290);
				((DefaultArmContext)_localctx).block = block(0);
				setState(291);
				match(LLAVEDER);
				setState(292);
				match(COMA);
				 _localctx.defa = ((DefaultArmContext)_localctx).block.blk 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 _localctx.defa = arrayList.New() 
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

	public static class ImpressionContext extends ParserRuleContext {
		public interfaces.Instruction pr;
		public Token PRINT;
		public ListParamsContext listParams;
		public TerminalNode PRINT() { return getToken(Rust.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(Rust.PARIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(Rust.PARDER, 0); }
		public ImpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterImpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitImpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitImpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpressionContext impression() throws RecognitionException {
		ImpressionContext _localctx = new ImpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_impression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((ImpressionContext)_localctx).PRINT = match(PRINT);
			setState(299);
			match(PARIZQ);
			setState(300);
			((ImpressionContext)_localctx).listParams = listParams(0);
			setState(301);
			match(PARDER);
			 _localctx.pr = instructions.NewPrint((((ImpressionContext)_localctx).PRINT!=null?((ImpressionContext)_localctx).PRINT.getLine():0),(((ImpressionContext)_localctx).PRINT!=null?((ImpressionContext)_localctx).PRINT.getCharPositionInLine():0),((ImpressionContext)_localctx).listParams.l) 
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

	public static class DeclarationContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token LET;
		public Token ID;
		public TypesContext types;
		public ExpressionContext expression;
		public ArrayTypeContext arrayType;
		public TerminalNode LET() { return getToken(Rust.LET, 0); }
		public TerminalNode MUT() { return getToken(Rust.MUT, 0); }
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode D_PTS() { return getToken(Rust.D_PTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Rust.IGUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				((DeclarationContext)_localctx).LET = match(LET);
				setState(305);
				match(MUT);
				setState(306);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(307);
				match(D_PTS);
				setState(308);
				((DeclarationContext)_localctx).types = types();
				setState(309);
				match(IGUAL);
				setState(310);
				((DeclarationContext)_localctx).expression = expression(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getLine():0), (((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), ((DeclarationContext)_localctx).types.ty, ((DeclarationContext)_localctx).expression.p, true) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				((DeclarationContext)_localctx).LET = match(LET);
				setState(314);
				match(MUT);
				setState(315);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(316);
				match(IGUAL);
				setState(317);
				((DeclarationContext)_localctx).expression = expression(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getLine():0), (((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), environment.WILDCARD, ((DeclarationContext)_localctx).expression.p, true) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				((DeclarationContext)_localctx).LET = match(LET);
				setState(321);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(322);
				match(D_PTS);
				setState(323);
				((DeclarationContext)_localctx).types = types();
				setState(324);
				match(IGUAL);
				setState(325);
				((DeclarationContext)_localctx).expression = expression(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getLine():0), (((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), ((DeclarationContext)_localctx).types.ty, ((DeclarationContext)_localctx).expression.p, false) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				((DeclarationContext)_localctx).LET = match(LET);
				setState(329);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(330);
				match(IGUAL);
				setState(331);
				((DeclarationContext)_localctx).expression = expression(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getLine():0), (((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), environment.WILDCARD, ((DeclarationContext)_localctx).expression.p, false) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				((DeclarationContext)_localctx).LET = match(LET);
				setState(335);
				match(MUT);
				setState(336);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(337);
				match(D_PTS);
				setState(338);
				((DeclarationContext)_localctx).arrayType = arrayType();
				setState(339);
				match(IGUAL);
				setState(340);
				((DeclarationContext)_localctx).expression = expression(0);
				 _localctx.dec = instructions.NewArrayDeclaration((((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getLine():0), (((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), ((DeclarationContext)_localctx).arrayType.t, ((DeclarationContext)_localctx).expression.p, true) 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				((DeclarationContext)_localctx).LET = match(LET);
				setState(344);
				((DeclarationContext)_localctx).ID = match(ID);
				setState(345);
				match(D_PTS);
				setState(346);
				((DeclarationContext)_localctx).arrayType = arrayType();
				setState(347);
				match(IGUAL);
				setState(348);
				((DeclarationContext)_localctx).expression = expression(0);
				 _localctx.dec = instructions.NewArrayDeclaration((((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getLine():0), (((DeclarationContext)_localctx).LET!=null?((DeclarationContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), ((DeclarationContext)_localctx).arrayType.t, ((DeclarationContext)_localctx).expression.p, false) 
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

	public static class StructCreationContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token STRUCT;
		public Token ID;
		public ListStructDecContext listStructDec;
		public TerminalNode STRUCT() { return getToken(Rust.STRUCT, 0); }
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public ListStructDecContext listStructDec() {
			return getRuleContext(ListStructDecContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public StructCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterStructCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitStructCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitStructCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructCreationContext structCreation() throws RecognitionException {
		StructCreationContext _localctx = new StructCreationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_structCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			((StructCreationContext)_localctx).STRUCT = match(STRUCT);
			setState(354);
			((StructCreationContext)_localctx).ID = match(ID);
			setState(355);
			match(LLAVEIZQ);
			setState(356);
			((StructCreationContext)_localctx).listStructDec = listStructDec(0);
			setState(357);
			match(LLAVEDER);
			 _localctx.dec = instructions.NewStruct((((StructCreationContext)_localctx).STRUCT!=null?((StructCreationContext)_localctx).STRUCT.getLine():0), (((StructCreationContext)_localctx).STRUCT!=null?((StructCreationContext)_localctx).STRUCT.getCharPositionInLine():0), (((StructCreationContext)_localctx).ID!=null?((StructCreationContext)_localctx).ID.getText():null), ((StructCreationContext)_localctx).listStructDec.l) 
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

	public static class ListStructDecContext extends ParserRuleContext {
		public *arrayList.List l;
		public ListStructDecContext list;
		public Token ID;
		public TypesContext types;
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode D_PTS() { return getToken(Rust.D_PTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Rust.COMA, 0); }
		public ListStructDecContext listStructDec() {
			return getRuleContext(ListStructDecContext.class,0);
		}
		public ListStructDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterListStructDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitListStructDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitListStructDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStructDecContext listStructDec() throws RecognitionException {
		return listStructDec(0);
	}

	private ListStructDecContext listStructDec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructDecContext _localctx = new ListStructDecContext(_ctx, _parentState);
		ListStructDecContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_listStructDec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(361);
			((ListStructDecContext)_localctx).ID = match(ID);
			setState(362);
			match(D_PTS);
			setState(363);
			((ListStructDecContext)_localctx).types = types();

			                    StrDef := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).types.ty)
			                    ((ListStructDecContext)_localctx).l =  arrayList.New();
			                    _localctx.l.Add(StrDef);
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructDecContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructDec);
					setState(366);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(367);
					match(COMA);
					setState(368);
					((ListStructDecContext)_localctx).ID = match(ID);
					setState(369);
					match(D_PTS);
					setState(370);
					((ListStructDecContext)_localctx).types = types();

					                                                  StrDef := environment.NewStructType((((ListStructDecContext)_localctx).ID!=null?((ListStructDecContext)_localctx).ID.getText():null), ((ListStructDecContext)_localctx).types.ty)
					                                                  ((ListStructDecContext)_localctx).list.l.Add(StrDef);
					                                                  ((ListStructDecContext)_localctx).l =  ((ListStructDecContext)_localctx).list.l;
					                                              
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public interfaces.Instruction ass;
		public Token ID;
		public ExpressionContext expression;
		public ListAccessStructContext listAccessStruct;
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode IGUAL() { return getToken(Rust.IGUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListAccessStructContext listAccessStruct() {
			return getRuleContext(ListAccessStructContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				((AssignmentContext)_localctx).ID = match(ID);
				setState(379);
				match(IGUAL);
				setState(380);
				((AssignmentContext)_localctx).expression = expression(0);
				 _localctx.ass = instructions.NewAssignment((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getLine():0), (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getCharPositionInLine():0), (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), ((AssignmentContext)_localctx).expression.p)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				((AssignmentContext)_localctx).listAccessStruct = listAccessStruct(0);
				setState(384);
				match(IGUAL);
				setState(385);
				((AssignmentContext)_localctx).expression = expression(0);
				 _localctx.ass = instructions.NewStructAssign((((AssignmentContext)_localctx).listAccessStruct!=null?(((AssignmentContext)_localctx).listAccessStruct.start):null).GetLine(),(((AssignmentContext)_localctx).listAccessStruct!=null?(((AssignmentContext)_localctx).listAccessStruct.start):null).GetColumn(), ((AssignmentContext)_localctx).listAccessStruct.l, ((AssignmentContext)_localctx).expression.p) 
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

	public static class ListAccessStructContext extends ParserRuleContext {
		public *arrayList.List l;
		public ListAccessStructContext list;
		public Token ID;
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode PUNTO() { return getToken(Rust.PUNTO, 0); }
		public ListAccessStructContext listAccessStruct() {
			return getRuleContext(ListAccessStructContext.class,0);
		}
		public ListAccessStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAccessStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterListAccessStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitListAccessStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitListAccessStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListAccessStructContext listAccessStruct() throws RecognitionException {
		return listAccessStruct(0);
	}

	private ListAccessStructContext listAccessStruct(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListAccessStructContext _localctx = new ListAccessStructContext(_ctx, _parentState);
		ListAccessStructContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_listAccessStruct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(391);
			((ListAccessStructContext)_localctx).ID = match(ID);

			            _localctx.l = arrayList.New()
			            _localctx.l.Add((((ListAccessStructContext)_localctx).ID!=null?((ListAccessStructContext)_localctx).ID.getText():null))

			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListAccessStructContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listAccessStruct);
					setState(394);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(395);
					match(PUNTO);
					setState(396);
					((ListAccessStructContext)_localctx).ID = match(ID);

					                                             ((ListAccessStructContext)_localctx).list.l.Add((((ListAccessStructContext)_localctx).ID!=null?((ListAccessStructContext)_localctx).ID.getText():null))
					                                             _localctx.l = ((ListAccessStructContext)_localctx).list.l
					                                            
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public *arrayList.List t;
		public ArrayTypeContext arrayType;
		public ExpressionContext expression;
		public TypesContext types;
		public TerminalNode CORIZQ() { return getToken(Rust.CORIZQ, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode PYC() { return getToken(Rust.PYC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(Rust.CORDER, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayType);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(CORIZQ);
				setState(404);
				((ArrayTypeContext)_localctx).arrayType = arrayType();
				setState(405);
				match(PYC);
				setState(406);
				((ArrayTypeContext)_localctx).expression = expression(0);
				setState(407);
				match(CORDER);

				                                            newType := environment.NewArrayType(environment.ARRAY, ((ArrayTypeContext)_localctx).expression.p)
				                                           ((ArrayTypeContext)_localctx).arrayType.t.Add(newType)
				                                           _localctx.t = ((ArrayTypeContext)_localctx).arrayType.t
				                                            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(CORIZQ);
				setState(411);
				((ArrayTypeContext)_localctx).types = types();
				setState(412);
				match(PYC);
				setState(413);
				((ArrayTypeContext)_localctx).expression = expression(0);
				setState(414);
				match(CORDER);

				                                        _localctx.t = arrayList.New()
				                                        newType := environment.NewArrayType(((ArrayTypeContext)_localctx).types.ty, ((ArrayTypeContext)_localctx).expression.p)
				                                        _localctx.t.Add(newType)
				                                     
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(Rust.FUNC, 0); }
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(Rust.PARIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(Rust.PARDER, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(FUNC);
			setState(420);
			match(ID);
			setState(421);
			match(PARIZQ);
			setState(422);
			listParams(0);
			setState(423);
			match(PARDER);
			setState(424);
			match(LLAVEIZQ);
			setState(425);
			instructions();
			setState(426);
			match(LLAVEDER);
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

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(Rust.MODULE, 0); }
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(MODULE);
			setState(429);
			match(ID);
			setState(430);
			match(LLAVEIZQ);
			setState(431);
			match(LLAVEDER);
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

	public static class TypesContext extends ParserRuleContext {
		public environment.TipoExpresion ty;
		public TerminalNode INT() { return getToken(Rust.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Rust.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(Rust.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(Rust.CHAR, 0); }
		public TerminalNode STR1() { return getToken(Rust.STR1, 0); }
		public TerminalNode STR2() { return getToken(Rust.STR2, 0); }
		public TerminalNode VECTOR() { return getToken(Rust.VECTOR, 0); }
		public TerminalNode STRUCT() { return getToken(Rust.STRUCT, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_types);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(INT);
				 _localctx.ty = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(FLOAT);
				 _localctx.ty = environment.FLOAT 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(BOOL);
				 _localctx.ty = environment.BOOLEAN 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				match(CHAR);
				 _localctx.ty = environment.CHAR 
				}
				break;
			case STR1:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				match(STR1);
				 _localctx.ty = environment.STRING 
				}
				break;
			case STR2:
				enterOuterAlt(_localctx, 6);
				{
				setState(443);
				match(STR2);
				 _localctx.ty = environment.STR 
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(445);
				match(VECTOR);
				 _localctx.ty = environment.VECTOR 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 8);
				{
				setState(447);
				match(STRUCT);
				 _localctx.ty = environment.STRUCT 
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

	public static class ListParamsContext extends ParserRuleContext {
		public *arrayList.List l;
		public ListParamsContext list;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Rust.COMA, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public ListParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterListParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitListParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitListParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListParamsContext listParams() throws RecognitionException {
		return listParams(0);
	}

	private ListParamsContext listParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsContext _localctx = new ListParamsContext(_ctx, _parentState);
		ListParamsContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(452);
			((ListParamsContext)_localctx).expression = expression(0);

			                _localctx.l = arrayList.New()
			                _localctx.l.Add(((ListParamsContext)_localctx).expression.p)
			             
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(455);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(456);
					match(COMA);
					setState(457);
					((ListParamsContext)_localctx).expression = expression(0);

					                                                  ((ListParamsContext)_localctx).list.l.Add(((ListParamsContext)_localctx).expression.p)
					                                                  _localctx.l = ((ListParamsContext)_localctx).list.l
					                                               
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public interfaces.Expression p;
		public ExpressionContext expuno;
		public Expr_aritContext expr_arit;
		public ExpressionContext expdos;
		public Expr_aritContext expr_arit() {
			return getRuleContext(Expr_aritContext.class,0);
		}
		public List<TerminalNode> PUNTO() { return getTokens(Rust.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(Rust.PUNTO, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(466);
			((ExpressionContext)_localctx).expr_arit = expr_arit(0);
			 _localctx.p = ((ExpressionContext)_localctx).expr_arit.p 
			}
			_ctx.stop = _input.LT(-1);
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.expuno = _prevctx;
					_localctx.expuno = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(469);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(470);
					match(PUNTO);
					setState(471);
					match(PUNTO);
					setState(472);
					((ExpressionContext)_localctx).expdos = expression(2);
					 _localctx.p = expressions.NewRange((((ExpressionContext)_localctx).expuno!=null?(((ExpressionContext)_localctx).expuno.start):null).GetLine(),(((ExpressionContext)_localctx).expuno!=null?(((ExpressionContext)_localctx).expuno.start):null).GetColumn(), ((ExpressionContext)_localctx).expuno.p, ((ExpressionContext)_localctx).expdos.p) 
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Expr_aritContext extends ParserRuleContext {
		public interfaces.Expression p;
		public Expr_aritContext opIz;
		public Token SUB;
		public Expr_aritContext opDe;
		public Token NOT;
		public Token CORIZQ;
		public ListParamsContext listParams;
		public ExpressionContext expression;
		public Token ID;
		public ListStructExpContext listStructExp;
		public PrimitiveContext primitive;
		public CondIfContext condIf;
		public CondMatchContext condMatch;
		public LoopBucleContext loopBucle;
		public Token op;
		public TerminalNode SUB() { return getToken(Rust.SUB, 0); }
		public List<Expr_aritContext> expr_arit() {
			return getRuleContexts(Expr_aritContext.class);
		}
		public Expr_aritContext expr_arit(int i) {
			return getRuleContext(Expr_aritContext.class,i);
		}
		public TerminalNode NOT() { return getToken(Rust.NOT, 0); }
		public TerminalNode CORIZQ() { return getToken(Rust.CORIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(Rust.CORDER, 0); }
		public TerminalNode PARIZQ() { return getToken(Rust.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(Rust.PARDER, 0); }
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(Rust.LLAVEIZQ, 0); }
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Rust.LLAVEDER, 0); }
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public CondIfContext condIf() {
			return getRuleContext(CondIfContext.class,0);
		}
		public CondMatchContext condMatch() {
			return getRuleContext(CondMatchContext.class,0);
		}
		public LoopBucleContext loopBucle() {
			return getRuleContext(LoopBucleContext.class,0);
		}
		public TerminalNode MUL() { return getToken(Rust.MUL, 0); }
		public TerminalNode DIV() { return getToken(Rust.DIV, 0); }
		public TerminalNode MOD() { return getToken(Rust.MOD, 0); }
		public TerminalNode ADD() { return getToken(Rust.ADD, 0); }
		public TerminalNode MENOR() { return getToken(Rust.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Rust.MENORIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Rust.MAYORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(Rust.MAYOR, 0); }
		public TerminalNode IG_IG() { return getToken(Rust.IG_IG, 0); }
		public TerminalNode DIFERENTE() { return getToken(Rust.DIFERENTE, 0); }
		public Expr_aritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_arit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterExpr_arit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitExpr_arit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitExpr_arit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_aritContext expr_arit() throws RecognitionException {
		return expr_arit(0);
	}

	private Expr_aritContext expr_arit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_aritContext _localctx = new Expr_aritContext(_ctx, _parentState);
		Expr_aritContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(481);
				((Expr_aritContext)_localctx).SUB = match(SUB);
				setState(482);
				((Expr_aritContext)_localctx).opDe = expr_arit(9);
				_localctx.p = expressions.NewOperation((((Expr_aritContext)_localctx).SUB!=null?((Expr_aritContext)_localctx).SUB.getLine():0),(((Expr_aritContext)_localctx).SUB!=null?((Expr_aritContext)_localctx).SUB.getCharPositionInLine():0),((Expr_aritContext)_localctx).opDe.p,"MENOS_UNARIO",nil)
				}
				break;
			case 2:
				{
				setState(485);
				((Expr_aritContext)_localctx).NOT = match(NOT);
				setState(486);
				((Expr_aritContext)_localctx).opDe = expr_arit(8);
				_localctx.p = expressions.NewOperation((((Expr_aritContext)_localctx).NOT!=null?((Expr_aritContext)_localctx).NOT.getLine():0),(((Expr_aritContext)_localctx).NOT!=null?((Expr_aritContext)_localctx).NOT.getCharPositionInLine():0),((Expr_aritContext)_localctx).opDe.p,(((Expr_aritContext)_localctx).NOT!=null?((Expr_aritContext)_localctx).NOT.getText():null),nil)
				}
				break;
			case 3:
				{
				setState(489);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(490);
				((Expr_aritContext)_localctx).listParams = listParams(0);
				setState(491);
				match(CORDER);
				 _localctx.p = expressions.NewArray((((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0), ((Expr_aritContext)_localctx).listParams.l) 
				}
				break;
			case 4:
				{
				setState(494);
				match(PARIZQ);
				setState(495);
				((Expr_aritContext)_localctx).expression = expression(0);
				setState(496);
				match(PARDER);
				 _localctx.p = ((Expr_aritContext)_localctx).expression.p 
				}
				break;
			case 5:
				{
				setState(499);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(500);
				match(LLAVEIZQ);
				setState(501);
				((Expr_aritContext)_localctx).listStructExp = listStructExp(0);
				setState(502);
				match(LLAVEDER);
				 _localctx.p = expressions.NewStructExp((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).listStructExp.l ) 
				}
				break;
			case 6:
				{
				setState(505);
				((Expr_aritContext)_localctx).primitive = primitive();
				 _localctx.p = ((Expr_aritContext)_localctx).primitive.p 
				}
				break;
			case 7:
				{
				setState(508);
				((Expr_aritContext)_localctx).condIf = condIf();
				 _localctx.p = ((Expr_aritContext)_localctx).condIf.ifCond 
				}
				break;
			case 8:
				{
				setState(511);
				((Expr_aritContext)_localctx).condMatch = condMatch();
				 _localctx.p = ((Expr_aritContext)_localctx).condMatch.mtch 
				}
				break;
			case 9:
				{
				setState(514);
				((Expr_aritContext)_localctx).loopBucle = loopBucle();
				 _localctx.p = ((Expr_aritContext)_localctx).loopBucle.lb 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(534);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(519);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(520);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (MUL - 65)) | (1L << (DIV - 65)) | (1L << (MOD - 65)))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(521);
						((Expr_aritContext)_localctx).opDe = expr_arit(13);
						_localctx.p = expressions.NewOperation((((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn(),((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p)
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(524);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(525);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(526);
						((Expr_aritContext)_localctx).opDe = expr_arit(12);
						_localctx.p = expressions.NewOperation((((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn(),((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p)
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(529);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(530);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (DIFERENTE - 53)) | (1L << (IG_IG - 53)) | (1L << (MAYORIGUAL - 53)) | (1L << (MENORIGUAL - 53)) | (1L << (MAYOR - 53)) | (1L << (MENOR - 53)))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(531);
						((Expr_aritContext)_localctx).opDe = expr_arit(11);
						_localctx.p = expressions.NewOperation((((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn(),((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p)
						}
						break;
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class PrimitiveContext extends ParserRuleContext {
		public interfaces.Expression p;
		public Token NUMBER;
		public Token STRING;
		public Token CHARACTER;
		public Token TRU;
		public Token FAL;
		public ListArrayContext list;
		public TerminalNode NUMBER() { return getToken(Rust.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(Rust.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(Rust.CHARACTER, 0); }
		public TerminalNode TRU() { return getToken(Rust.TRU, 0); }
		public TerminalNode FAL() { return getToken(Rust.FAL, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primitive);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				((PrimitiveContext)_localctx).NUMBER = match(NUMBER);

				            if (strings.Contains((((PrimitiveContext)_localctx).NUMBER!=null?((PrimitiveContext)_localctx).NUMBER.getText():null),".")){
				                num,err := strconv.ParseFloat((((PrimitiveContext)_localctx).NUMBER!=null?((PrimitiveContext)_localctx).NUMBER.getText():null), 64);
				                if err!= nil{
				                    fmt.Println(err)
				                }
				                _localctx.p = expressions.NewPrimitive((((PrimitiveContext)_localctx).NUMBER!=null?((PrimitiveContext)_localctx).NUMBER.getLine():0),(((PrimitiveContext)_localctx).NUMBER!=null?((PrimitiveContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.FLOAT)
				            }else{
				                num,err := strconv.Atoi((((PrimitiveContext)_localctx).NUMBER!=null?((PrimitiveContext)_localctx).NUMBER.getText():null))
				                if err!= nil{
				                    fmt.Println(err)
				                }
				                _localctx.p = expressions.NewPrimitive((((PrimitiveContext)_localctx).NUMBER!=null?((PrimitiveContext)_localctx).NUMBER.getLine():0),(((PrimitiveContext)_localctx).NUMBER!=null?((PrimitiveContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.INTEGER)
				            }
				        
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				((PrimitiveContext)_localctx).STRING = match(STRING);

				                str := (((PrimitiveContext)_localctx).STRING!=null?((PrimitiveContext)_localctx).STRING.getText():null)
				                _localctx.p = expressions.NewPrimitive((((PrimitiveContext)_localctx).STRING!=null?((PrimitiveContext)_localctx).STRING.getLine():0), (((PrimitiveContext)_localctx).STRING!=null?((PrimitiveContext)_localctx).STRING.getCharPositionInLine():0),str[1:len(str)-1],environment.STR)
				            
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(543);
				((PrimitiveContext)_localctx).CHARACTER = match(CHARACTER);
				 _localctx.p = expressions.NewPrimitive((((PrimitiveContext)_localctx).CHARACTER!=null?((PrimitiveContext)_localctx).CHARACTER.getLine():0), (((PrimitiveContext)_localctx).CHARACTER!=null?((PrimitiveContext)_localctx).CHARACTER.getCharPositionInLine():0),(((PrimitiveContext)_localctx).CHARACTER!=null?((PrimitiveContext)_localctx).CHARACTER.getText():null),environment.CHAR) 
				}
				break;
			case TRU:
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				((PrimitiveContext)_localctx).TRU = match(TRU);
				 _localctx.p = expressions.NewPrimitive((((PrimitiveContext)_localctx).TRU!=null?((PrimitiveContext)_localctx).TRU.getLine():0), (((PrimitiveContext)_localctx).TRU!=null?((PrimitiveContext)_localctx).TRU.getCharPositionInLine():0),true,environment.BOOLEAN) 
				}
				break;
			case FAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(547);
				((PrimitiveContext)_localctx).FAL = match(FAL);
				 _localctx.p = expressions.NewPrimitive((((PrimitiveContext)_localctx).FAL!=null?((PrimitiveContext)_localctx).FAL.getLine():0), (((PrimitiveContext)_localctx).FAL!=null?((PrimitiveContext)_localctx).FAL.getCharPositionInLine():0),false,environment.BOOLEAN) 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(549);
				((PrimitiveContext)_localctx).list = listArray(0);
				 _localctx.p = ((PrimitiveContext)_localctx).list.p
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

	public static class StringsTypesContext extends ParserRuleContext {
		public StringsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringsTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterStringsTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitStringsTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitStringsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsTypesContext stringsTypes() throws RecognitionException {
		StringsTypesContext _localctx = new StringsTypesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_stringsTypes);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class ListArrayContext extends ParserRuleContext {
		public interfaces.Expression p;
		public ListArrayContext list;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(Rust.CORIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(Rust.CORDER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(Rust.PUNTO, 0); }
		public ListArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterListArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitListArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitListArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListArrayContext listArray() throws RecognitionException {
		return listArray(0);
	}

	private ListArrayContext listArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListArrayContext _localctx = new ListArrayContext(_ctx, _parentState);
		ListArrayContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(557);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVar((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(570);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(560);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(561);
						match(CORIZQ);
						setState(562);
						((ListArrayContext)_localctx).expression = expression(0);
						setState(563);
						match(CORDER);
						 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expression.p) 
						}
						break;
					case 2:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(566);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(567);
						match(PUNTO);
						setState(568);
						((ListArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expressions.NewStructAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))  
						}
						break;
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class ListStructExpContext extends ParserRuleContext {
		public *arrayList.List l;
		public ListStructExpContext list;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(Rust.ID, 0); }
		public TerminalNode D_PTS() { return getToken(Rust.D_PTS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Rust.COMA, 0); }
		public ListStructExpContext listStructExp() {
			return getRuleContext(ListStructExpContext.class,0);
		}
		public ListStructExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStructExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterListStructExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitListStructExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitListStructExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStructExpContext listStructExp() throws RecognitionException {
		return listStructExp(0);
	}

	private ListStructExpContext listStructExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListStructExpContext _localctx = new ListStructExpContext(_ctx, _parentState);
		ListStructExpContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_listStructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(576);
			((ListStructExpContext)_localctx).ID = match(ID);
			setState(577);
			match(D_PTS);
			setState(578);
			((ListStructExpContext)_localctx).expression = expression(0);

			                    StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expression.p)
			                    ((ListStructExpContext)_localctx).l =  arrayList.New();
			                    _localctx.l.Add(StrExp);
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListStructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listStructExp);
					setState(581);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(582);
					match(COMA);
					setState(583);
					((ListStructExpContext)_localctx).ID = match(ID);
					setState(584);
					match(D_PTS);
					setState(585);
					((ListStructExpContext)_localctx).expression = expression(0);

					                                                  StrExp := environment.NewStructContent((((ListStructExpContext)_localctx).ID!=null?((ListStructExpContext)_localctx).ID.getText():null), ((ListStructExpContext)_localctx).expression.p)
					                                                  ((ListStructExpContext)_localctx).list.l.Add(StrExp);
					                                                  ((ListStructExpContext)_localctx).l =  ((ListStructExpContext)_localctx).list.l;
					                                              
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return block_sempred((BlockContext)_localctx, predIndex);
		case 16:
			return listMatch_sempred((ListMatchContext)_localctx, predIndex);
		case 21:
			return listStructDec_sempred((ListStructDecContext)_localctx, predIndex);
		case 23:
			return listAccessStruct_sempred((ListAccessStructContext)_localctx, predIndex);
		case 28:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 29:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 30:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 33:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		case 34:
			return listStructExp_sempred((ListStructExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_sempred(BlockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listMatch_sempred(ListMatchContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listStructDec_sempred(ListStructDecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listAccessStruct_sempred(ListAccessStructContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listStructExp_sempred(ListStructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u0254\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\7\2Q\n\2\f"+
		"\2\16\2T\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5n\n\5\r\5\16\5o\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u009a\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00b8\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16"+
		"\f\u00c6\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00da\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00e3\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ed"+
		"\n\17\f\17\16\17\u00f0\13\17\3\20\3\20\3\20\3\20\6\20\u00f6\n\20\r\20"+
		"\16\20\u00f7\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010c\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0117\n\22\f\22\16\22\u011a\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u012b\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0162\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0178\n\27\f\27\16"+
		"\27\u017b\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0187\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0191\n\31\f"+
		"\31\16\31\u0194\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u01a4\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01c4\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01cf\n\36\f\36\16\36\u01d2\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01de\n\37"+
		"\f\37\16\37\u01e1\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0208"+
		"\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0219\n \f \16 \u021c"+
		"\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u022b\n!\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u023d\n#\f#\16#\u0240\13#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u024f\n$\f$\16$\u0252\13$\3$\2\13"+
		"\34\",\60:<>DF%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDF\2\5\4\2CDGG\3\2EF\4\2\678?B\2\u026f\2K\3\2\2\2\4a\3\2\2"+
		"\2\6c\3\2\2\2\bm\3\2\2\2\n\u0099\3\2\2\2\f\u009b\3\2\2\2\16\u00a2\3\2"+
		"\2\2\20\u00a8\3\2\2\2\22\u00b7\3\2\2\2\24\u00b9\3\2\2\2\26\u00bc\3\2\2"+
		"\2\30\u00ca\3\2\2\2\32\u00d9\3\2\2\2\34\u00e2\3\2\2\2\36\u00f1\3\2\2\2"+
		" \u010b\3\2\2\2\"\u010d\3\2\2\2$\u012a\3\2\2\2&\u012c\3\2\2\2(\u0161\3"+
		"\2\2\2*\u0163\3\2\2\2,\u016a\3\2\2\2.\u0186\3\2\2\2\60\u0188\3\2\2\2\62"+
		"\u01a3\3\2\2\2\64\u01a5\3\2\2\2\66\u01ae\3\2\2\28\u01c3\3\2\2\2:\u01c5"+
		"\3\2\2\2<\u01d3\3\2\2\2>\u0207\3\2\2\2@\u022a\3\2\2\2B\u022c\3\2\2\2D"+
		"\u022e\3\2\2\2F\u0241\3\2\2\2HJ\5\4\3\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NR\5\6\4\2OQ\5\4\3\2PO\3\2\2\2QT\3\2\2\2"+
		"RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\b\2\1\2V\3\3\2\2\2WX\5(\25"+
		"\2XY\7\65\2\2YZ\b\3\1\2Zb\3\2\2\2[\\\5\64\33\2\\]\b\3\1\2]b\3\2\2\2^_"+
		"\5\66\34\2_`\b\3\1\2`b\3\2\2\2aW\3\2\2\2a[\3\2\2\2a^\3\2\2\2b\5\3\2\2"+
		"\2cd\7\22\2\2de\7!\2\2ef\7H\2\2fg\7I\2\2gh\7J\2\2hi\5\b\5\2ij\7K\2\2j"+
		"k\b\4\1\2k\7\3\2\2\2ln\5\n\6\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"pq\3\2\2\2qr\b\5\1\2r\t\3\2\2\2st\5&\24\2tu\7\65\2\2uv\b\6\1\2v\u009a"+
		"\3\2\2\2wx\5(\25\2xy\7\65\2\2yz\b\6\1\2z\u009a\3\2\2\2{|\5.\30\2|}\7\65"+
		"\2\2}~\b\6\1\2~\u009a\3\2\2\2\177\u0080\5\26\f\2\u0080\u0081\b\6\1\2\u0081"+
		"\u009a\3\2\2\2\u0082\u0083\5\36\20\2\u0083\u0084\b\6\1\2\u0084\u009a\3"+
		"\2\2\2\u0085\u0086\5\f\7\2\u0086\u0087\b\6\1\2\u0087\u009a\3\2\2\2\u0088"+
		"\u0089\5\16\b\2\u0089\u008a\b\6\1\2\u008a\u009a\3\2\2\2\u008b\u008c\5"+
		"\20\t\2\u008c\u008d\b\6\1\2\u008d\u009a\3\2\2\2\u008e\u008f\5\22\n\2\u008f"+
		"\u0090\7\65\2\2\u0090\u0091\b\6\1\2\u0091\u009a\3\2\2\2\u0092\u0093\5"+
		"\24\13\2\u0093\u0094\7\65\2\2\u0094\u0095\b\6\1\2\u0095\u009a\3\2\2\2"+
		"\u0096\u0097\5*\26\2\u0097\u0098\b\6\1\2\u0098\u009a\3\2\2\2\u0099s\3"+
		"\2\2\2\u0099w\3\2\2\2\u0099{\3\2\2\2\u0099\177\3\2\2\2\u0099\u0082\3\2"+
		"\2\2\u0099\u0085\3\2\2\2\u0099\u0088\3\2\2\2\u0099\u008b\3\2\2\2\u0099"+
		"\u008e\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0096\3\2\2\2\u009a\13\3\2\2"+
		"\2\u009b\u009c\7&\2\2\u009c\u009d\5<\37\2\u009d\u009e\7J\2\2\u009e\u009f"+
		"\5\34\17\2\u009f\u00a0\7K\2\2\u00a0\u00a1\b\7\1\2\u00a1\r\3\2\2\2\u00a2"+
		"\u00a3\7%\2\2\u00a3\u00a4\7J\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7K"+
		"\2\2\u00a6\u00a7\b\b\1\2\u00a7\17\3\2\2\2\u00a8\u00a9\7\'\2\2\u00a9\u00aa"+
		"\7\60\2\2\u00aa\u00ab\7(\2\2\u00ab\u00ac\5<\37\2\u00ac\u00ad\7J\2\2\u00ad"+
		"\u00ae\5\b\5\2\u00ae\u00af\7K\2\2\u00af\u00b0\b\t\1\2\u00b0\21\3\2\2\2"+
		"\u00b1\u00b2\7)\2\2\u00b2\u00b3\5<\37\2\u00b3\u00b4\b\n\1\2\u00b4\u00b8"+
		"\3\2\2\2\u00b5\u00b6\7)\2\2\u00b6\u00b8\b\n\1\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\23\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba\u00bb\b\13\1"+
		"\2\u00bb\25\3\2\2\2\u00bc\u00bd\7\"\2\2\u00bd\u00be\5<\37\2\u00be\u00bf"+
		"\7J\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c4\7K\2\2\u00c1\u00c3\5\30\r\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\5\32\16\2"+
		"\u00c8\u00c9\b\f\1\2\u00c9\27\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7"+
		"\"\2\2\u00cc\u00cd\5<\37\2\u00cd\u00ce\7J\2\2\u00ce\u00cf\5\34\17\2\u00cf"+
		"\u00d0\7K\2\2\u00d0\u00d1\b\r\1\2\u00d1\31\3\2\2\2\u00d2\u00d3\7#\2\2"+
		"\u00d3\u00d4\7J\2\2\u00d4\u00d5\5\34\17\2\u00d5\u00d6\7K\2\2\u00d6\u00d7"+
		"\b\16\1\2\u00d7\u00da\3\2\2\2\u00d8\u00da\b\16\1\2\u00d9\u00d2\3\2\2\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\33\3\2\2\2\u00db\u00dc\b\17\1\2\u00dc\u00dd"+
		"\5\n\6\2\u00dd\u00de\b\17\1\2\u00de\u00e3\3\2\2\2\u00df\u00e0\5<\37\2"+
		"\u00e0\u00e1\b\17\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00df"+
		"\3\2\2\2\u00e3\u00ee\3\2\2\2\u00e4\u00e5\f\6\2\2\u00e5\u00e6\5\n\6\2\u00e6"+
		"\u00e7\b\17\1\2\u00e7\u00ed\3\2\2\2\u00e8\u00e9\f\5\2\2\u00e9\u00ea\5"+
		"<\37\2\u00ea\u00eb\b\17\1\2\u00eb\u00ed\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec"+
		"\u00e8\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\35\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2\u00f3"+
		"\5<\37\2\u00f3\u00f5\7J\2\2\u00f4\u00f6\5 \21\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fa\5$\23\2\u00fa\u00fb\7K\2\2\u00fb\u00fc\b\20\1\2\u00fc"+
		"\37\3\2\2\2\u00fd\u00fe\5\"\22\2\u00fe\u00ff\7\24\2\2\u00ff\u0100\5\34"+
		"\17\2\u0100\u0101\7\66\2\2\u0101\u0102\b\21\1\2\u0102\u010c\3\2\2\2\u0103"+
		"\u0104\5\"\22\2\u0104\u0105\7\24\2\2\u0105\u0106\7J\2\2\u0106\u0107\5"+
		"\34\17\2\u0107\u0108\7K\2\2\u0108\u0109\7\66\2\2\u0109\u010a\b\21\1\2"+
		"\u010a\u010c\3\2\2\2\u010b\u00fd\3\2\2\2\u010b\u0103\3\2\2\2\u010c!\3"+
		"\2\2\2\u010d\u010e\b\22\1\2\u010e\u010f\5<\37\2\u010f\u0110\b\22\1\2\u0110"+
		"\u0118\3\2\2\2\u0111\u0112\f\4\2\2\u0112\u0113\7;\2\2\u0113\u0114\5<\37"+
		"\2\u0114\u0115\b\22\1\2\u0115\u0117\3\2\2\2\u0116\u0111\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119#\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011b\u011c\7<\2\2\u011c\u011d\7\24\2\2\u011d\u011e"+
		"\5\34\17\2\u011e\u011f\7\66\2\2\u011f\u0120\b\23\1\2\u0120\u012b\3\2\2"+
		"\2\u0121\u0122\7<\2\2\u0122\u0123\7\24\2\2\u0123\u0124\7J\2\2\u0124\u0125"+
		"\5\34\17\2\u0125\u0126\7K\2\2\u0126\u0127\7\66\2\2\u0127\u0128\b\23\1"+
		"\2\u0128\u012b\3\2\2\2\u0129\u012b\b\23\1\2\u012a\u011b\3\2\2\2\u012a"+
		"\u0121\3\2\2\2\u012a\u0129\3\2\2\2\u012b%\3\2\2\2\u012c\u012d\7\17\2\2"+
		"\u012d\u012e\7H\2\2\u012e\u012f\5:\36\2\u012f\u0130\7I\2\2\u0130\u0131"+
		"\b\24\1\2\u0131\'\3\2\2\2\u0132\u0133\7\20\2\2\u0133\u0134\7\21\2\2\u0134"+
		"\u0135\7\60\2\2\u0135\u0136\7\64\2\2\u0136\u0137\58\35\2\u0137\u0138\7"+
		">\2\2\u0138\u0139\5<\37\2\u0139\u013a\b\25\1\2\u013a\u0162\3\2\2\2\u013b"+
		"\u013c\7\20\2\2\u013c\u013d\7\21\2\2\u013d\u013e\7\60\2\2\u013e\u013f"+
		"\7>\2\2\u013f\u0140\5<\37\2\u0140\u0141\b\25\1\2\u0141\u0162\3\2\2\2\u0142"+
		"\u0143\7\20\2\2\u0143\u0144\7\60\2\2\u0144\u0145\7\64\2\2\u0145\u0146"+
		"\58\35\2\u0146\u0147\7>\2\2\u0147\u0148\5<\37\2\u0148\u0149\b\25\1\2\u0149"+
		"\u0162\3\2\2\2\u014a\u014b\7\20\2\2\u014b\u014c\7\60\2\2\u014c\u014d\7"+
		">\2\2\u014d\u014e\5<\37\2\u014e\u014f\b\25\1\2\u014f\u0162\3\2\2\2\u0150"+
		"\u0151\7\20\2\2\u0151\u0152\7\21\2\2\u0152\u0153\7\60\2\2\u0153\u0154"+
		"\7\64\2\2\u0154\u0155\5\62\32\2\u0155\u0156\7>\2\2\u0156\u0157\5<\37\2"+
		"\u0157\u0158\b\25\1\2\u0158\u0162\3\2\2\2\u0159\u015a\7\20\2\2\u015a\u015b"+
		"\7\60\2\2\u015b\u015c\7\64\2\2\u015c\u015d\5\62\32\2\u015d\u015e\7>\2"+
		"\2\u015e\u015f\5<\37\2\u015f\u0160\b\25\1\2\u0160\u0162\3\2\2\2\u0161"+
		"\u0132\3\2\2\2\u0161\u013b\3\2\2\2\u0161\u0142\3\2\2\2\u0161\u014a\3\2"+
		"\2\2\u0161\u0150\3\2\2\2\u0161\u0159\3\2\2\2\u0162)\3\2\2\2\u0163\u0164"+
		"\7\13\2\2\u0164\u0165\7\60\2\2\u0165\u0166\7J\2\2\u0166\u0167\5,\27\2"+
		"\u0167\u0168\7K\2\2\u0168\u0169\b\26\1\2\u0169+\3\2\2\2\u016a\u016b\b"+
		"\27\1\2\u016b\u016c\7\60\2\2\u016c\u016d\7\64\2\2\u016d\u016e\58\35\2"+
		"\u016e\u016f\b\27\1\2\u016f\u0179\3\2\2\2\u0170\u0171\f\4\2\2\u0171\u0172"+
		"\7\66\2\2\u0172\u0173\7\60\2\2\u0173\u0174\7\64\2\2\u0174\u0175\58\35"+
		"\2\u0175\u0176\b\27\1\2\u0176\u0178\3\2\2\2\u0177\u0170\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a-\3\2\2\2"+
		"\u017b\u0179\3\2\2\2\u017c\u017d\7\60\2\2\u017d\u017e\7>\2\2\u017e\u017f"+
		"\5<\37\2\u017f\u0180\b\30\1\2\u0180\u0187\3\2\2\2\u0181\u0182\5\60\31"+
		"\2\u0182\u0183\7>\2\2\u0183\u0184\5<\37\2\u0184\u0185\b\30\1\2\u0185\u0187"+
		"\3\2\2\2\u0186\u017c\3\2\2\2\u0186\u0181\3\2\2\2\u0187/\3\2\2\2\u0188"+
		"\u0189\b\31\1\2\u0189\u018a\7\60\2\2\u018a\u018b\b\31\1\2\u018b\u0192"+
		"\3\2\2\2\u018c\u018d\f\4\2\2\u018d\u018e\7\62\2\2\u018e\u018f\7\60\2\2"+
		"\u018f\u0191\b\31\1\2\u0190\u018c\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\61\3\2\2\2\u0194\u0192\3\2\2\2\u0195"+
		"\u0196\7L\2\2\u0196\u0197\5\62\32\2\u0197\u0198\7\65\2\2\u0198\u0199\5"+
		"<\37\2\u0199\u019a\7M\2\2\u019a\u019b\b\32\1\2\u019b\u01a4\3\2\2\2\u019c"+
		"\u019d\7L\2\2\u019d\u019e\58\35\2\u019e\u019f\7\65\2\2\u019f\u01a0\5<"+
		"\37\2\u01a0\u01a1\7M\2\2\u01a1\u01a2\b\32\1\2\u01a2\u01a4\3\2\2\2\u01a3"+
		"\u0195\3\2\2\2\u01a3\u019c\3\2\2\2\u01a4\63\3\2\2\2\u01a5\u01a6\7\22\2"+
		"\2\u01a6\u01a7\7\60\2\2\u01a7\u01a8\7H\2\2\u01a8\u01a9\5:\36\2\u01a9\u01aa"+
		"\7I\2\2\u01aa\u01ab\7J\2\2\u01ab\u01ac\5\b\5\2\u01ac\u01ad\7K\2\2\u01ad"+
		"\65\3\2\2\2\u01ae\u01af\7,\2\2\u01af\u01b0\7\60\2\2\u01b0\u01b1\7J\2\2"+
		"\u01b1\u01b2\7K\2\2\u01b2\67\3\2\2\2\u01b3\u01b4\7\3\2\2\u01b4\u01c4\b"+
		"\35\1\2\u01b5\u01b6\7\4\2\2\u01b6\u01c4\b\35\1\2\u01b7\u01b8\7\5\2\2\u01b8"+
		"\u01c4\b\35\1\2\u01b9\u01ba\7\6\2\2\u01ba\u01c4\b\35\1\2\u01bb\u01bc\7"+
		"\7\2\2\u01bc\u01c4\b\35\1\2\u01bd\u01be\7\b\2\2\u01be\u01c4\b\35\1\2\u01bf"+
		"\u01c0\7\n\2\2\u01c0\u01c4\b\35\1\2\u01c1\u01c2\7\13\2\2\u01c2\u01c4\b"+
		"\35\1\2\u01c3\u01b3\3\2\2\2\u01c3\u01b5\3\2\2\2\u01c3\u01b7\3\2\2\2\u01c3"+
		"\u01b9\3\2\2\2\u01c3\u01bb\3\2\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01bf\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c49\3\2\2\2\u01c5\u01c6\b\36\1\2\u01c6\u01c7"+
		"\5<\37\2\u01c7\u01c8\b\36\1\2\u01c8\u01d0\3\2\2\2\u01c9\u01ca\f\4\2\2"+
		"\u01ca\u01cb\7\66\2\2\u01cb\u01cc\5<\37\2\u01cc\u01cd\b\36\1\2\u01cd\u01cf"+
		"\3\2\2\2\u01ce\u01c9\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1;\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\b\37\1\2"+
		"\u01d4\u01d5\5> \2\u01d5\u01d6\b\37\1\2\u01d6\u01df\3\2\2\2\u01d7\u01d8"+
		"\f\3\2\2\u01d8\u01d9\7\62\2\2\u01d9\u01da\7\62\2\2\u01da\u01db\5<\37\4"+
		"\u01db\u01dc\b\37\1\2\u01dc\u01de\3\2\2\2\u01dd\u01d7\3\2\2\2\u01de\u01e1"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0=\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e2\u01e3\b \1\2\u01e3\u01e4\7F\2\2\u01e4\u01e5\5> \13"+
		"\u01e5\u01e6\b \1\2\u01e6\u0208\3\2\2\2\u01e7\u01e8\79\2\2\u01e8\u01e9"+
		"\5> \n\u01e9\u01ea\b \1\2\u01ea\u0208\3\2\2\2\u01eb\u01ec\7L\2\2\u01ec"+
		"\u01ed\5:\36\2\u01ed\u01ee\7M\2\2\u01ee\u01ef\b \1\2\u01ef\u0208\3\2\2"+
		"\2\u01f0\u01f1\7H\2\2\u01f1\u01f2\5<\37\2\u01f2\u01f3\7I\2\2\u01f3\u01f4"+
		"\b \1\2\u01f4\u0208\3\2\2\2\u01f5\u01f6\7\60\2\2\u01f6\u01f7\7J\2\2\u01f7"+
		"\u01f8\5F$\2\u01f8\u01f9\7K\2\2\u01f9\u01fa\b \1\2\u01fa\u0208\3\2\2\2"+
		"\u01fb\u01fc\5@!\2\u01fc\u01fd\b \1\2\u01fd\u0208\3\2\2\2\u01fe\u01ff"+
		"\5\26\f\2\u01ff\u0200\b \1\2\u0200\u0208\3\2\2\2\u0201\u0202\5\36\20\2"+
		"\u0202\u0203\b \1\2\u0203\u0208\3\2\2\2\u0204\u0205\5\16\b\2\u0205\u0206"+
		"\b \1\2\u0206\u0208\3\2\2\2\u0207\u01e2\3\2\2\2\u0207\u01e7\3\2\2\2\u0207"+
		"\u01eb\3\2\2\2\u0207\u01f0\3\2\2\2\u0207\u01f5\3\2\2\2\u0207\u01fb\3\2"+
		"\2\2\u0207\u01fe\3\2\2\2\u0207\u0201\3\2\2\2\u0207\u0204\3\2\2\2\u0208"+
		"\u021a\3\2\2\2\u0209\u020a\f\16\2\2\u020a\u020b\t\2\2\2\u020b\u020c\5"+
		"> \17\u020c\u020d\b \1\2\u020d\u0219\3\2\2\2\u020e\u020f\f\r\2\2\u020f"+
		"\u0210\t\3\2\2\u0210\u0211\5> \16\u0211\u0212\b \1\2\u0212\u0219\3\2\2"+
		"\2\u0213\u0214\f\f\2\2\u0214\u0215\t\4\2\2\u0215\u0216\5> \r\u0216\u0217"+
		"\b \1\2\u0217\u0219\3\2\2\2\u0218\u0209\3\2\2\2\u0218\u020e\3\2\2\2\u0218"+
		"\u0213\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b?\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\7.\2\2\u021e\u022b"+
		"\b!\1\2\u021f\u0220\7/\2\2\u0220\u022b\b!\1\2\u0221\u0222\7\61\2\2\u0222"+
		"\u022b\b!\1\2\u0223\u0224\7\f\2\2\u0224\u022b\b!\1\2\u0225\u0226\7\r\2"+
		"\2\u0226\u022b\b!\1\2\u0227\u0228\5D#\2\u0228\u0229\b!\1\2\u0229\u022b"+
		"\3\2\2\2\u022a\u021d\3\2\2\2\u022a\u021f\3\2\2\2\u022a\u0221\3\2\2\2\u022a"+
		"\u0223\3\2\2\2\u022a\u0225\3\2\2\2\u022a\u0227\3\2\2\2\u022bA\3\2\2\2"+
		"\u022c\u022d\3\2\2\2\u022dC\3\2\2\2\u022e\u022f\b#\1\2\u022f\u0230\7\60"+
		"\2\2\u0230\u0231\b#\1\2\u0231\u023e\3\2\2\2\u0232\u0233\f\5\2\2\u0233"+
		"\u0234\7L\2\2\u0234\u0235\5<\37\2\u0235\u0236\7M\2\2\u0236\u0237\b#\1"+
		"\2\u0237\u023d\3\2\2\2\u0238\u0239\f\4\2\2\u0239\u023a\7\62\2\2\u023a"+
		"\u023b\7\60\2\2\u023b\u023d\b#\1\2\u023c\u0232\3\2\2\2\u023c\u0238\3\2"+
		"\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"E\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0242\b$\1\2\u0242\u0243\7\60\2\2"+
		"\u0243\u0244\7\64\2\2\u0244\u0245\5<\37\2\u0245\u0246\b$\1\2\u0246\u0250"+
		"\3\2\2\2\u0247\u0248\f\4\2\2\u0248\u0249\7\66\2\2\u0249\u024a\7\60\2\2"+
		"\u024a\u024b\7\64\2\2\u024b\u024c\5<\37\2\u024c\u024d\b$\1\2\u024d\u024f"+
		"\3\2\2\2\u024e\u0247\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251G\3\2\2\2\u0252\u0250\3\2\2\2 KRao\u0099\u00b7\u00c4"+
		"\u00d9\u00e2\u00ec\u00ee\u00f7\u010b\u0118\u012a\u0161\u0179\u0186\u0192"+
		"\u01a3\u01c3\u01d0\u01df\u0207\u0218\u021a\u022a\u023c\u023e\u0250";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}