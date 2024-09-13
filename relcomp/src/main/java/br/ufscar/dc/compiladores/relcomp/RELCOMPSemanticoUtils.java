package br.ufscar.dc.compiladores.relcomp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.Token;
import br.ufscar.dc.compiladores.relcomp.TabelaDeSimbolos;


public class RELCOMPSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    public static Map<String, String> medalhas = new HashMap<>();
    public static Map<Integer, String> posicoes = new HashMap<>();
    public static int ultimaPosicao = 0;

    // Adicionar erro semântico
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    // Verificar se o evento é repetido
    public static void verificarEvento(TabelaDeSimbolos tabela, RELCOMPParser.EventoContext ctx) {
        String nomeEvento = ctx.IDENT().getText();
        if (tabela.existe(nomeEvento)) {
            adicionarErroSemantico(ctx.start, "Evento '" + nomeEvento + "' já foi declarado");
            tabela.adicionar(nomeEvento, TabelaDeSimbolos.TipoRELCOMP.INVALIDO);
        } else {
            tabela.adicionar(nomeEvento, TabelaDeSimbolos.TipoRELCOMP.EVENTO);
        }
    }

    // Verifica as modalidades dentro de um evento
    public static void verificarModalidade(TabelaDeSimbolos tabela, RELCOMPParser.ModalidadeContext ctx) {
        String nomeModalidade = ctx.IDENT().getText();
        if (tabela.existe(nomeModalidade)) {
            adicionarErroSemantico(ctx.start, "Modalidade '" + nomeModalidade + "' já foi declarada");
            tabela.adicionar(nomeModalidade, TabelaDeSimbolos.TipoRELCOMP.INVALIDO);
        } else {
            tabela.adicionar(nomeModalidade, TabelaDeSimbolos.TipoRELCOMP.MODALIDADE);
        }
    }

    public static void verificarParticipantes(TabelaDeSimbolos tabela, RELCOMPParser.ParticipantesContext ctx) {
        String nomeParticipante = ctx.IDENT().getText();
        int posicao = Integer.parseInt(ctx.NUM_INT().getText());
    
        // Verifica se tem dois participantes que sejam iguais
        if (tabela.existe(nomeParticipante)) {
            adicionarErroSemantico(ctx.start, "Participante '" + nomeParticipante + "' já foi declarado");
            tabela.adicionar(nomeParticipante, TabelaDeSimbolos.TipoRELCOMP.INVALIDO);
        } else {
            tabela.adicionar(nomeParticipante, TabelaDeSimbolos.TipoRELCOMP.PARTICIPANTE);
        }
    
        // Verificaça se possui duas posições iguais, nessa linguagem isso não é permitido
        if (posicoes.containsKey(posicao)) {
            adicionarErroSemantico(ctx.start, "Posição '" + posicao + "' já foi atribuída a outro participante");
        } else {
            posicoes.put(posicao, nomeParticipante);
        }
    
        // Pega as medalhas quando presentes e faz a rerificação se apresenta uma medalha repetida
        // e também se as posições estão de acordo com as medalhas ditas
        if (ctx.medalha() != null) {
            String medalhaCompleta = ctx.medalha().getText();
            String medalha = medalhaCompleta.split(":")[1]; // Pega apenas o a medalha e não mais 'medalha:ouro'
        
            if (medalhas.containsKey(medalha)) {
                adicionarErroSemantico(ctx.start, "Medalha '" + medalha + "' já foi atribuída");
            } else {
                medalhas.put(medalha, nomeParticipante);
        
                // Medalha de ouro apenas para o primeiro lugar, de prata apenas para o segundo, etc
                if ((posicao == 1 && !medalha.equals("ouro")) ||
                    (posicao == 2 && !medalha.equals("prata")) ||
                    (posicao == 3 && !medalha.equals("bronze"))) {
                    adicionarErroSemantico(ctx.start, "Medalha '" + medalha + "' é incompatível com a posição '" + posicao + "'");
                }
            }
        }
    
        // A linguagem necessita que os participantes sejam colocados na ordem
        if (posicao <= ultimaPosicao) {
            adicionarErroSemantico(ctx.start, "Participante '" + nomeParticipante + "' está fora de ordem.");
        }
        ultimaPosicao = posicao;
    }
    

}