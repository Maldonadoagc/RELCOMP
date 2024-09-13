grammar RELCOMP;

// Léxicos
PALAVRA_CHAVE : 'relatorio' | 'fim_relatorio' | 'evento' | 'data' | 'modalidade' | 'participantes' | 
                'posicao' | 'medalha' | 'ouro' | 'prata' | 'bronze' | 'recorde' | 'observacoes';

IDENT : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

NUM_INT : ('0'..'9')+;

CADEIA : '"' (ESC_SEQ | ~('"' | '\\' | '\n'))* '"';

fragment ESC_SEQ : '\\"';

DATA_FORMATO : NUM_INT '/' NUM_INT '/' NUM_INT; // formato de data dd/mm/aaaa ou aaaa/mm/dd

DELIM : ':' | ',' | '.' ;

WS : (' '|'\t'|'\r'|'\n') -> skip; // Ignorar espaços em branco e quebras de linha

// Sintáticos
relatorio : 'relatorio' evento+ 'fim_relatorio' ;

evento : 'evento' DELIM IDENT 'data' DELIM DATA_FORMATO modalidade+ observacoes? ;

modalidade : 'modalidade' DELIM IDENT '{' participantes+ '}' ;

participantes : 'posicao' DELIM NUM_INT 'participantes' DELIM IDENT recorde? medalha? ;

medalha : 'medalha' DELIM ('ouro' | 'prata' | 'bronze');

recorde : 'recorde' DELIM CADEIA ;

observacoes : 'observacoes' DELIM CADEIA ;

ERRO : . ;
