
/*
Faça um programa que leia uma Matriz 5x5 e, após a leitura (em um laço separado),
calcule e mostre o número da linha com a menor soma e a coluna com a maior
soma.

[                       menorSoma = ??? 
    1, 2, 3, 4, 5 
    2, 3, 1, 4, 1
    2, 4, 5, 1, 2
    2, 3, 4, 2, 1
    1, 1, 1, 1, 1    => soma 5, linha 4

          v
          col 2
]
*/

// adiciona scanner
import java.util.Scanner;
    
public class Ex01 {
    public static void main(String[] args) {
        // instancia scanner
        Scanner in = new Scanner(System.in);
        
        // declara uma matriz
        int[][] matriz = new int[5][5];
        
        // lendo os valores da matriz
        System.out.println("Informe os valores da matriz:");
        // i = linhas
        for (int i = 0; i < matriz.length; i++) {
            // j = colunas e i = linhas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = in.nextInt();    //quantas vezes essa linha será executada? 25 (5 x 5)
            }
        } 
        int menorSomaLinha=0;
        int somaColuna = 0;
        int linha=0;
        
        for (int i = 0; i < matriz.length; i++) {    
            
            int somaLinha = 0;   // pq o soma linha está aqui e nao fora? pra esse somalinha ser att toda vez que o laço girar (i incrementar)
            // não é chato, é preciso
            for(int j = 0; j < matriz[i].length; j++){
                
                somaLinha += matriz[i][j];
                // 1 => ela vai mudando toda vez que altera a coluna... 
            }

            // 2 => AQUI TEMOS A TOTALIDADE DA LINHA COM TODAS AS COLUNAS SOMADAS;
            // COMO SABER SE A somaLinha tem a menor soma?
            // como guardar o número da linha
            // se usar o 9999 ta errado? blziiiinha kkkkk
            if ((somaLinha < menorSomaLinha) || i == 0) {
                menorSomaLinha=somaLinha;
                linha = i;
            }
        }   
        // 3 => aqui a variavel somaLinha nao existe mais


        System.out.println("A Linha " + linha + " tem a menor soma total: " + menorSomaLinha);
        
        // TODO - FAZER A MAIOR COLUNA
    }
}