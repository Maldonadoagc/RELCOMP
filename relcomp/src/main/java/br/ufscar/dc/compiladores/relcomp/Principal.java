package br.ufscar.dc.compiladores.relcomp;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.relcomp.RELCOMPLexer;
import br.ufscar.dc.compiladores.relcomp.RELCOMPParser.RelatorioContext;

public class Principal {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Argumentos precisam ser colocador corretamente");
            System.exit(1);
        }

        Boolean erroLexico = false; 

        try {
            // Leitura do arquivo de entrada
            CharStream cs = CharStreams.fromFileName(args[0]);
            RELCOMPLexer lex = new RELCOMPLexer(cs);

            Token t;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String tnome = RELCOMPLexer.VOCABULARY.getDisplayName(t.getType());

                switch (tnome) {
                    case "ERRO":
                        System.out.println("Linha " + t.getLine() + ": " + t.getText() + " - símbolo não identificado");
                        erroLexico = true;
                        break;
                    case "ERRO_CADEIA":
                        System.out.println("Linha " + t.getLine() + ": cadeia de caracteres não fechada");
                        erroLexico = true;
                        break;
                    default:
                        // System.out.println("<'" + t.getText() + "'," + tnome + ">");
                }

                if (tnome.equals("ERRO") || tnome.equals("ERRO_CADEIA")) {
                    break;
                }
            }

            if (!erroLexico) {
                lex.reset(); 
                CommonTokenStream tokens = new CommonTokenStream(lex);
                RELCOMPParser parser = new RELCOMPParser(tokens);

                RelatorioContext arvore = parser.relatorio();

                // Análise semântica
                RELCOMPSemantico semantico = new RELCOMPSemantico();
                semantico.visitRelatorio(arvore);

                // Se não contém erros ele gera o arquivo html com a tabela
                if (!RELCOMPSemanticoUtils.errosSemanticos.isEmpty()) {
                    RELCOMPSemanticoUtils.errosSemanticos.forEach(System.out::println);
                } else {
                    RELCOMPGerador.gerarRelatorioHTML(arvore, args[1]);
                    System.out.println("Relatório HTML gerado com sucesso: " + args[1]);
                }
            }

            System.out.println("Fim da compilação");
        } catch (IOException ex) {
            System.out.println("Erro ao ler o arquivo: " + ex.getMessage());
        }
    }
}
