package br.ufscar.dc.compiladores.relcomp;

import java.util.HashMap;

public class TabelaDeSimbolos {
    public enum TipoRELCOMP {
        EVENTO,
        MODALIDADE,
        PARTICIPANTE,
        MEDALHA,
        RECORD,
        OBSERVACAO,
        INVALIDO
    }

    class EntradaTabelaDeSimbolos {
        String nome;
        TipoRELCOMP tipo;

        private EntradaTabelaDeSimbolos(String nome, TipoRELCOMP tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }

    private final HashMap<String, EntradaTabelaDeSimbolos> tabela;

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    public void adicionar(String nome, TipoRELCOMP tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }

    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }

    public TipoRELCOMP verificar(String nome) {
        EntradaTabelaDeSimbolos entrada = tabela.get(nome);
        return entrada != null ? entrada.tipo : TipoRELCOMP.INVALIDO;
    }
}

