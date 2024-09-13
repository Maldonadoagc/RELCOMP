// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.relcomp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RELCOMPParser}.
 */
public interface RELCOMPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RELCOMPParser#relatorio}.
	 * @param ctx the parse tree
	 */
	void enterRelatorio(RELCOMPParser.RelatorioContext ctx);
	/**
	 * Exit a parse tree produced by {@link RELCOMPParser#relatorio}.
	 * @param ctx the parse tree
	 */
	void exitRelatorio(RELCOMPParser.RelatorioContext ctx);
	/**
	 * Enter a parse tree produced by {@link RELCOMPParser#evento}.
	 * @param ctx the parse tree
	 */
	void enterEvento(RELCOMPParser.EventoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RELCOMPParser#evento}.
	 * @param ctx the parse tree
	 */
	void exitEvento(RELCOMPParser.EventoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RELCOMPParser#modalidade}.
	 * @param ctx the parse tree
	 */
	void enterModalidade(RELCOMPParser.ModalidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RELCOMPParser#modalidade}.
	 * @param ctx the parse tree
	 */
	void exitModalidade(RELCOMPParser.ModalidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RELCOMPParser#participantes}.
	 * @param ctx the parse tree
	 */
	void enterParticipantes(RELCOMPParser.ParticipantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RELCOMPParser#participantes}.
	 * @param ctx the parse tree
	 */
	void exitParticipantes(RELCOMPParser.ParticipantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RELCOMPParser#medalha}.
	 * @param ctx the parse tree
	 */
	void enterMedalha(RELCOMPParser.MedalhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RELCOMPParser#medalha}.
	 * @param ctx the parse tree
	 */
	void exitMedalha(RELCOMPParser.MedalhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RELCOMPParser#recorde}.
	 * @param ctx the parse tree
	 */
	void enterRecorde(RELCOMPParser.RecordeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RELCOMPParser#recorde}.
	 * @param ctx the parse tree
	 */
	void exitRecorde(RELCOMPParser.RecordeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RELCOMPParser#observacoes}.
	 * @param ctx the parse tree
	 */
	void enterObservacoes(RELCOMPParser.ObservacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RELCOMPParser#observacoes}.
	 * @param ctx the parse tree
	 */
	void exitObservacoes(RELCOMPParser.ObservacoesContext ctx);
}