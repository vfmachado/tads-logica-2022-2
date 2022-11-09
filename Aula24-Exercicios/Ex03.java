/*
Escreva um algoritmo para ler a quantidade L de linhas (máximo 10) e a quantidade C de colunas (máximo 10) de uma matriz. A seguir ler uma matriz A com L linhas e C colunas. Gerar uma matriz T transposta de A. Imprimir a matriz T.
*/
public class Ex03 {
    public static void main(String[] args) {

        int [][] M = {
            {1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3}
        };

        // transpor a matriz M
        // toda linha vira uma coluna
        // quantidade atual de colunas => M[qlqr linha].length  => sao as linhas da matriz transposta
        // quantidade atual de linhas => M.length =>  sao as colunas da matriz transposta
        int [][] T = new int[M[0].length][M.length];

        // logica linha => coluna
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = M[j][i];
            }
        }



        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + "  ");
            }
            System.out.println();
        }
    }
}