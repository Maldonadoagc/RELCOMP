package br.ufscar.dc.compiladores.relcomp;

import br.ufscar.dc.compiladores.relcomp.RELCOMPBaseVisitor;
import br.ufscar.dc.compiladores.relcomp.RELCOMPParser;
import br.ufscar.dc.compiladores.relcomp.RELCOMPParser.RelatorioContext;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RELCOMPGerador extends RELCOMPBaseVisitor<Void> {
    
    public static void gerarRelatorioHTML(RelatorioContext arvore, String outputFilePath) {
        String htmlOutput = gerarHTML(arvore);
        salvarHTML(htmlOutput, outputFilePath);
    }

    private static String gerarHTML(RelatorioContext arvore) {
        StringBuilder html = new StringBuilder();
    
        html.append("<html>\n<head>\n<title>Relatório</title>\n</head>\n<body>\n");
        html.append("<h1>Relatório de Competição</h1>\n");
    
        for (int i = 0; i < arvore.getChildCount(); i++) {
            if (arvore.getChild(i) instanceof RELCOMPParser.EventoContext) {
                RELCOMPParser.EventoContext evento = (RELCOMPParser.EventoContext) arvore.getChild(i);
                String data = evento.DATA_FORMATO() != null ? evento.DATA_FORMATO().getText() : "Data não disponível";
                html.append("<h2>").append(evento.IDENT().getText()).append("</h2>\n");
                html.append("<p><strong>Data:</strong> ").append(data).append("</p>\n");
    
                for (RELCOMPParser.ModalidadeContext modalidade : evento.modalidade()) {
                    html.append("<p><strong>Modalidade:</strong> ").append(modalidade.IDENT().getText()).append("</p>\n");
    
                    html.append("<table border='1'>\n<tr><th>Participantes</th><th>Posição</th><th>Recorde</th>");
                    // Adiciona cabeçalho da medalha somente se houver medalhas
                    if (modalidade.participantes().stream().anyMatch(p -> p.medalha() != null)) {
                        html.append("<th>Medalha</th>");
                    }
                    html.append("</tr>\n");
    
                    for (RELCOMPParser.ParticipantesContext participantes : modalidade.participantes()) {
                        html.append("<tr>\n");
                        html.append("<td>").append(participantes.IDENT().getText()).append("</td>\n");
                        html.append("<td>").append(participantes.NUM_INT() != null ? participantes.NUM_INT().getText() : "N/A").append("</td>\n");
                        html.append("<td>").append(participantes.recorde() != null ? participantes.recorde().CADEIA().getText() : "N/A").append("</td>\n");
    
                        // Exibe a medalha apenas se existir
                        if (participantes.medalha() != null) {
                            // Obtém o tipo de medalha (ouro, prata, bronze)
                            String tipoMedalha = participantes.medalha().getText().split(":")[1].trim(); // Divide a string e pega o segundo elemento, cc ele escreverá medalha:ouro por exemplo
                            html.append("<td>").append(tipoMedalha).append("</td>\n"); // Adiciona apenas o valor da medalha
                        } else {
                            // html.append("<td>N/A</td>\n"); // Coluna vazia caso não tenha medalha, é possível comentá-la dependendo do desejo
                        }
    
                        html.append("</tr>\n");
                    }
                    html.append("</table>\n");
                }
            }
        }
    
        html.append("</body>\n</html>");
        return html.toString();
    }
    
    
    


    private static void salvarHTML(String html, String outputFilePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
