/*
Escreva um algoritmo para ler uma matriz 4x4, calcular e escrever as seguintes somas dos elementos que estão
armazenados:
a) na segunda linha da matriz.
b) na primeira coluna da matriz.
c) na diagonal principal da matriz. 
d) na diagonal secundária
e) em toda matriz
*/

public class Ex01 {
    public static void main(String[] args) {

        int [][] M = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };

        // letra a - soma da segunda linha
        int somaL = 0;
        int somaC = 0;
        int somaDP = 0;
        int somaDS = 0;
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            somaL = somaL + M[1][i];
            somaC += M[i][0];
            somaDP += M[i][i];
            somaDS += M[i][3 - i];

            for (int j = 0; j < 4; j++) {
                soma += M[i][j];
            }
        }
        System.out.println("SOMA DA SEGUNDA LINHA" + somaL);
        System.out.println("SOMA DA PRIMEIRA COLUNA" + somaC);
        System.out.println("SOMA DA DIAGONAL PRINCIPAL" + somaDP);
        System.out.println("SOMA DA DIAGONAL SECUNDARIA" + somaDS);
        System.out.println("SOMA TOTAL DA MATRIZ" + soma);
    }
}

