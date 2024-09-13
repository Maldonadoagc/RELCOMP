# Relatórios de Competições Esportivas

Este projeto consiste em um compilador completo para uma linguagem específica que gera relatórios de competições esportivas em formato HTML. O compilador é implementado utilizando Java e ANTLR4. E serviu como trabalho para a matéria de Construção de Compiladores ministrada pelo Professor Daniel Lucrédio.

#### Nome: Antonio Maldonado RA: 790038  

## Sumário

- [Visão Geral](#visão-geral)
- [Funcionalidades](#funcionalidades)
- [Compilação](#compilação)
- [Execução](#execução)
- [Exemplo](#exemplo)
- [Video](#vídeo-explicação)
  

## Visão Geral

A linguagem permite descrever eventos esportivos, incluindo informações sobre participantes, modalidades e observações. O compilador realiza a análise léxica, sintática e semântica, gerando um relatório HTML formatado a partir da entrada da linguagem.

## Funcionalidades

- **Análise Léxica e Sintática**: O compilador utiliza uma gramática definida para processar entradas e verificar sua conformidade.
- **Análise Semântica**: Realiza verificações como:
  - Validação de posições de participantes;
  - Verificação de medalhas atribuídas, tanto quanto a repetição quando a posição correta;
  - Confirmação da presença de recordes;
  - Entradas duplicadas em participantes e modalidades.
- **Geração de Código**: Gera um arquivo HTML que apresenta as informações em forma de tabela.

## Compilação

Para compilar o projeto é necessário ter instalado:
- Java (utilizada versão 11.0.22)
- Apacha Maven (utilizada versão 3.6.3)
- Antlr4 (utilizada versão 4.11)

1 PASSO: Entrar na pasta relcomp  
2 PASSO: Utilizar o comando "mvn package" no terminal

## Execução

Para execução é necessário utilizar o comando "java -jar" acompanhado de 3 argumentos

ARG 1: Arquivo .jar com dependencias criada no processo de compilação        
       EX: /home/usuario/.../relcomp/target/relcomp-1.0-SNAPSHOT-jar-with-dependencies.jar

ARG 2: Arquivo texto de entrada com o caso de teste
       EX: /home/usuario/.../entrada_teste.txt

ARG 3: Arquivo a ser salvo a saída do programa
       EX: /home/usuario/.../saida_teste.txt

Por fim, a execução a ser feita no terminal deve ser do tipo:

    java -jar /home/usuario/.../relcomp/target/relcomp-1.0-SNAPSHOT-jar-with-dependencies.jar /home/usuario/.../entrada_teste.txt /home/usuario/.../saida_teste.txt

Lembre-se de trocar "..." pelo caminho correto e desejado.

Após isso, só verificar o arquivo de saída no caminho que foi informado, ou caso a presença de erro, será indicado no terminal de execução.

## Exemplo

Exemplo correto de entrada:

relatorio  
evento : Olimpiadas  
data : 16/08/2009  
modalidade : Podio_100m_Masculino {  
    posicao : 1  
    participantes : Usain_Bolt  
    recorde : "9.58 segundos"  
    medalha : ouro  
    posicao : 2  
    participantes : Tyson_Gay  
    medalha : prata  
    posicao : 3  
    participantes : Asafa_Powell  
    medalha : bronze  
}  
observacoes : "Recorde mundial."  
fim_relatorio  

## Vídeo explicação

O vídeo pode ser encontrado no link: 
