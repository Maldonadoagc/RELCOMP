// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.relcomp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RELCOMPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RELCOMPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RELCOMPParser#relatorio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelatorio(RELCOMPParser.RelatorioContext ctx);
	/**
	 * Visit a parse tree produced by {@link RELCOMPParser#evento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvento(RELCOMPParser.EventoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RELCOMPParser#modalidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModalidade(RELCOMPParser.ModalidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RELCOMPParser#participantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParticipantes(RELCOMPParser.ParticipantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RELCOMPParser#medalha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedalha(RELCOMPParser.MedalhaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RELCOMPParser#recorde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecorde(RELCOMPParser.RecordeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RELCOMPParser#observacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservacoes(RELCOMPParser.ObservacoesContext ctx);
}