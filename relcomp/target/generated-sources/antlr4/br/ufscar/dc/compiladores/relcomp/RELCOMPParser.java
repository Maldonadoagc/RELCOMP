// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.relcomp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RELCOMPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PALAVRA_CHAVE=16, 
		IDENT=17, NUM_INT=18, CADEIA=19, DATA_FORMATO=20, DELIM=21, WS=22, ERRO=23;
	public static final int
		RULE_relatorio = 0, RULE_evento = 1, RULE_modalidade = 2, RULE_participantes = 3, 
		RULE_medalha = 4, RULE_recorde = 5, RULE_observacoes = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"relatorio", "evento", "modalidade", "participantes", "medalha", "recorde", 
			"observacoes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'relatorio'", "'fim_relatorio'", "'evento'", "'data'", "'modalidade'", 
			"'{'", "'}'", "'posicao'", "'participantes'", "'medalha'", "'ouro'", 
			"'prata'", "'bronze'", "'recorde'", "'observacoes'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "PALAVRA_CHAVE", "IDENT", "NUM_INT", "CADEIA", 
			"DATA_FORMATO", "DELIM", "WS", "ERRO"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RELCOMPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelatorioContext extends ParserRuleContext {
		public List<EventoContext> evento() {
			return getRuleContexts(EventoContext.class);
		}
		public EventoContext evento(int i) {
			return getRuleContext(EventoContext.class,i);
		}
		public RelatorioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relatorio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).enterRelatorio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).exitRelatorio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RELCOMPVisitor ) return ((RELCOMPVisitor<? extends T>)visitor).visitRelatorio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelatorioContext relatorio() throws RecognitionException {
		RelatorioContext _localctx = new RelatorioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_relatorio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				evento();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(20);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EventoContext extends ParserRuleContext {
		public List<TerminalNode> DELIM() { return getTokens(RELCOMPParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(RELCOMPParser.DELIM, i);
		}
		public TerminalNode IDENT() { return getToken(RELCOMPParser.IDENT, 0); }
		public TerminalNode DATA_FORMATO() { return getToken(RELCOMPParser.DATA_FORMATO, 0); }
		public List<ModalidadeContext> modalidade() {
			return getRuleContexts(ModalidadeContext.class);
		}
		public ModalidadeContext modalidade(int i) {
			return getRuleContext(ModalidadeContext.class,i);
		}
		public ObservacoesContext observacoes() {
			return getRuleContext(ObservacoesContext.class,0);
		}
		public EventoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).enterEvento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).exitEvento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RELCOMPVisitor ) return ((RELCOMPVisitor<? extends T>)visitor).visitEvento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventoContext evento() throws RecognitionException {
		EventoContext _localctx = new EventoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_evento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__2);
			setState(23);
			match(DELIM);
			setState(24);
			match(IDENT);
			setState(25);
			match(T__3);
			setState(26);
			match(DELIM);
			setState(27);
			match(DATA_FORMATO);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				modalidade();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(33);
				observacoes();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModalidadeContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(RELCOMPParser.DELIM, 0); }
		public TerminalNode IDENT() { return getToken(RELCOMPParser.IDENT, 0); }
		public List<ParticipantesContext> participantes() {
			return getRuleContexts(ParticipantesContext.class);
		}
		public ParticipantesContext participantes(int i) {
			return getRuleContext(ParticipantesContext.class,i);
		}
		public ModalidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modalidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).enterModalidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).exitModalidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RELCOMPVisitor ) return ((RELCOMPVisitor<? extends T>)visitor).visitModalidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModalidadeContext modalidade() throws RecognitionException {
		ModalidadeContext _localctx = new ModalidadeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modalidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__4);
			setState(37);
			match(DELIM);
			setState(38);
			match(IDENT);
			setState(39);
			match(T__5);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				participantes();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(45);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParticipantesContext extends ParserRuleContext {
		public List<TerminalNode> DELIM() { return getTokens(RELCOMPParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(RELCOMPParser.DELIM, i);
		}
		public TerminalNode NUM_INT() { return getToken(RELCOMPParser.NUM_INT, 0); }
		public TerminalNode IDENT() { return getToken(RELCOMPParser.IDENT, 0); }
		public RecordeContext recorde() {
			return getRuleContext(RecordeContext.class,0);
		}
		public MedalhaContext medalha() {
			return getRuleContext(MedalhaContext.class,0);
		}
		public ParticipantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).enterParticipantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).exitParticipantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RELCOMPVisitor ) return ((RELCOMPVisitor<? extends T>)visitor).visitParticipantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParticipantesContext participantes() throws RecognitionException {
		ParticipantesContext _localctx = new ParticipantesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_participantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__7);
			setState(48);
			match(DELIM);
			setState(49);
			match(NUM_INT);
			setState(50);
			match(T__8);
			setState(51);
			match(DELIM);
			setState(52);
			match(IDENT);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(53);
				recorde();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(56);
				medalha();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MedalhaContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(RELCOMPParser.DELIM, 0); }
		public MedalhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_medalha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).enterMedalha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).exitMedalha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RELCOMPVisitor ) return ((RELCOMPVisitor<? extends T>)visitor).visitMedalha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MedalhaContext medalha() throws RecognitionException {
		MedalhaContext _localctx = new MedalhaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_medalha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__9);
			setState(60);
			match(DELIM);
			setState(61);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecordeContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(RELCOMPParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(RELCOMPParser.CADEIA, 0); }
		public RecordeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recorde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).enterRecorde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).exitRecorde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RELCOMPVisitor ) return ((RELCOMPVisitor<? extends T>)visitor).visitRecorde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordeContext recorde() throws RecognitionException {
		RecordeContext _localctx = new RecordeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_recorde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__13);
			setState(64);
			match(DELIM);
			setState(65);
			match(CADEIA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObservacoesContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(RELCOMPParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(RELCOMPParser.CADEIA, 0); }
		public ObservacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).enterObservacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RELCOMPListener ) ((RELCOMPListener)listener).exitObservacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RELCOMPVisitor ) return ((RELCOMPVisitor<? extends T>)visitor).visitObservacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservacoesContext observacoes() throws RecognitionException {
		ObservacoesContext _localctx = new ObservacoesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_observacoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__14);
			setState(68);
			match(DELIM);
			setState(69);
			match(CADEIA);
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
		"\u0004\u0001\u0017H\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\u001e\b\u0001\u000b\u0001\f\u0001\u001f\u0001"+
		"\u0001\u0003\u0001#\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002*\b\u0002\u000b\u0002\f\u0002+\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00037\b\u0003\u0001\u0003\u0003\u0003"+
		":\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n"+
		"\f\u0000\u0001\u0001\u0000\u000b\rF\u0000\u000e\u0001\u0000\u0000\u0000"+
		"\u0002\u0016\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006"+
		"/\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000"+
		"\u0000\fC\u0001\u0000\u0000\u0000\u000e\u0010\u0005\u0001\u0000\u0000"+
		"\u000f\u0011\u0003\u0002\u0001\u0000\u0010\u000f\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0005\u0002\u0000\u0000\u0015\u0001\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0005\u0003\u0000\u0000\u0017\u0018\u0005\u0015\u0000\u0000"+
		"\u0018\u0019\u0005\u0011\u0000\u0000\u0019\u001a\u0005\u0004\u0000\u0000"+
		"\u001a\u001b\u0005\u0015\u0000\u0000\u001b\u001d\u0005\u0014\u0000\u0000"+
		"\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!#\u0003\f\u0006"+
		"\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0003\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0005\u0000\u0000%&\u0005\u0015\u0000\u0000"+
		"&\'\u0005\u0011\u0000\u0000\')\u0005\u0006\u0000\u0000(*\u0003\u0006\u0003"+
		"\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005"+
		"\u0007\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0005\b\u0000\u0000"+
		"01\u0005\u0015\u0000\u000012\u0005\u0012\u0000\u000023\u0005\t\u0000\u0000"+
		"34\u0005\u0015\u0000\u000046\u0005\u0011\u0000\u000057\u0003\n\u0005\u0000"+
		"65\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000\u0000"+
		"\u00008:\u0003\b\u0004\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0005\n\u0000\u0000<=\u0005\u0015"+
		"\u0000\u0000=>\u0007\u0000\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0005"+
		"\u000e\u0000\u0000@A\u0005\u0015\u0000\u0000AB\u0005\u0013\u0000\u0000"+
		"B\u000b\u0001\u0000\u0000\u0000CD\u0005\u000f\u0000\u0000DE\u0005\u0015"+
		"\u0000\u0000EF\u0005\u0013\u0000\u0000F\r\u0001\u0000\u0000\u0000\u0006"+
		"\u0012\u001f\"+69";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}