import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int[][] M = {
            {1, 2, 3, 4, 5},    // 15
            {1, 2, 3, 4, 5},    // 15
            {1, 2, 3, 4, 6},    // 16
            {1, 2, 3, 4, 6},    // 16
            {1, 2, 3, 4, 7},    // 17
        };

        // DADO UM VALOR X, VERIFICAR QUAIS LINHAS TEM A SOMA RESULTANDO NESTE VALOR X
        // x = 15
            // linhas 0 e 1
        // x = 16
            // linhas 2 e 3
        // x = 17
            // linha 4
        // qualquer outro x
            // linha nao encontrada

        do { 
            int X = in.nextInt();
            if (X < 0) break;

            boolean achou = false;
            for (int i = 0; i < 5; i++) {   // NORMALMENTE UTILIZAMOS I PARA LINHAS
                // soma de uma linha
                int soma = 0;
                for (int j = 0; j < 5; j++) {   // J PARA AS COLUNAS
                    soma += M[i][j];
                }

                // System.out.println("SOMA " + soma);
                if (X == soma) {
                    achou = true;
                    System.out.println("NA LINHA " + i + " TEM A SOMA " + X);
                }
            }   

            if (!achou) {
                System.out.println("NAO TEM A SOMA PROCURADA");
            }
        } while (true);
    }
}