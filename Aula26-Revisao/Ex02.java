/*
Dada uma matriz de tamanho 5 x 5 e um vetor V de tamanho também igual a 5,
verificar quais linhas e colunas têm os mesmos valores que o vetor V de maneira
independente da ordem dos elementos.

m = [                     
    1, 2, 3, 4, 5 
    2, 3, 5, 4, 1
    2, 4, 5, 1, 6
    7, 3, 4, 2, 1
    5, 6, 7, 8, 9   
]

v = [5, 4, 3, 2, 1]

m[0][0] = 1
    percorre o vetor procurando
    achei = true;

m[0][1] = 2
    percorre o vetor procurando
    achei = true;

... 

REPETIREMOS PARA TODOS OS ELEMENTOS DESTA LINHA E, CASO ENCONTRE TODOS, SIGNIFICA QUE A LINHA POSSUI TODOS ELEMENTOS DO MEU VETOR.




EM QUAIS LINHAS E COLUNAS EU ENCONTROS OS MESMOS ELEMENTOS QUE O VETOR v

RESPOSTA
LINHA 0
LINHA 1

*/

import java.util.Scanner;
    
public class Ex02 {
    public static void main(String[] args) {
        // instancia scanner
        Scanner in = new Scanner(System.in);

        // matriz 5 x 5
        int m[][] = new int[5][5];

        // vetor de tamanho
        int [] v = new int [5];

        // MATRIZ
        for(int linha = 0; linha < 5; linha++) {
            for(int coluna = 0; coluna < 5; coluna++) {
                m[linha][coluna] = in.nextInt();
            }
        }

        // VETOR
        for(int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
        }      
        

        // CADA LINHA DE UMA MATRIZ TBM PODE SER VISTO COMO UM VETOR? sim
        // COMO VERIFICAR SE OS ELEMENTOS DE UM VETOR ESTAO PRESENTES EM UMA LINHA DA MATRIZ?

        // verificar se o elemento v[0] esta na linha 0 da matriz
                            //     valor            vetor
        // verificar se um valor esta num vetor

        // int x = 4;
        // int[] vetor = [1, 2, 4, 3, 5];

        // // x pertece ao vetor?

        // boolean achei = false;
        // for (int i = 0; i < vetor.length; i++){

        //     if (vetor[i] == x) {
        //         achei = true;
        //     }
        // } 
        
        // percorrer a minha matriz...
        for ( int linha = 0; linha < 5; linha++) {
            // PARA CADA UMA DAS LINHAS ...
            int totalAchei = 0;
            boolean temTodos = true;

            for (int coluna = 0; coluna < 5; coluna++) {

                // dois fors servem para percorrer a matriz
                // comparar cada elemento da matriz com os elementos do vetor, isso, i, to loco
                // precisamos de outro for ... para o vetor =)
                boolean achei = false;
                for(int i = 0; i < 5; i++){

                    // SIGNIFICA QUE UM DOS ELEMENTOS DA MATRIZ NA LINHA linha É IGUAL A UM DOS ELEMENTOS DO VETOR (elemento na posicao i)
                    // [1, 2, 3, 4, 5]      v = [5, 4, 3, 2, 1] 
                    if (m[linha][coluna] == v[i]) {
                        achei = true; 
                        break; 
                    }

                }

                // se eu achei o elemento da matriz no vetor ...
                if (achei) totalAchei++;

                if (!achei) temTodos = false;
                // caso nao tenha encontrado, já pode pular essa linha... nao vai ter como ser igual pq um elemento da linha nao esta presente no vetor    
            }
            if (totalAchei == 5) {
                System.out.println("todos elementos foram encontrados na linha " + linha);
            }
            if (temTodos) {
                System.out.println("todos elementos foram encontrados na linha " + linha);
            }

            /* ⭐ PERGUNTAS E RESPOSTAS ⭐
                ... Sim, cai algo parecido =) 

            */

            // TODO TERMINAR PARA COLUNAS TAMBÉM =) 
        }
    }
}