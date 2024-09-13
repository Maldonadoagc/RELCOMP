package br.ufscar.dc.compiladores.relcomp;

import org.antlr.v4.runtime.Token;

public class RELCOMPSemantico extends RELCOMPBaseVisitor<Void> {
    private Escopos escopo;
    private TabelaDeSimbolos tabelaEventos;

    public RELCOMPSemantico() {
        escopo = new Escopos();
        escopo.criarNovoEscopo();
        tabelaEventos = escopo.obterEscopoAtual();
    }

    @Override
    public Void visitRelatorio(RELCOMPParser.RelatorioContext ctx) {
        // Validação do nome do evento
        for (RELCOMPParser.EventoContext eventoCtx : ctx.evento()) {
            RELCOMPSemanticoUtils.verificarEvento(tabelaEventos, eventoCtx);
        }
        return super.visitRelatorio(ctx);
    }

    @Override
    public Void visitEvento(RELCOMPParser.EventoContext ctx) {
        // Verificar modalidades dentro do evento
        for (RELCOMPParser.ModalidadeContext modalidadeCtx : ctx.modalidade()) {
            escopo.criarNovoEscopo();
            TabelaDeSimbolos tabelaModalidade = escopo.obterEscopoAtual();
            RELCOMPSemanticoUtils.verificarModalidade(tabelaModalidade, modalidadeCtx);
        }
        return super.visitEvento(ctx);
    }

    @Override
    public Void visitParticipantes(RELCOMPParser.ParticipantesContext ctx) {
        // Verificação dos participantes, posições e medalhas
        RELCOMPSemanticoUtils.verificarParticipantes(escopo.obterEscopoAtual(), ctx);
        return super.visitParticipantes(ctx);
    }
}
