package br.ufscar.dc.compiladores.relcomp;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class RELCOMPErrorListener implements ANTLRErrorListener {
    
    PrintStream ps;
    Boolean erroSintatico = false;

    public RELCOMPErrorListener(FileOutputStream fos) {
        this.ps = new PrintStream(fos);
        System.setOut(this.ps);
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
    }

    // Método que lida com erros sintáticos
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Verifica se já foi detectado um erro sintático
        if (!erroSintatico) {
            Token t = (Token) offendingSymbol;

            String tText = t.getText();
            if (tText.equals("<EOF>")) {
                tText = "EOF";
            }

            // Imprime a mensagem de erro sintático
            System.out.println("Linha " + line + ": erro sintatico proximo a " + tText);
            
            // Marca que um erro sintático já foi detectado
            erroSintatico = true;
        }
    }
}
