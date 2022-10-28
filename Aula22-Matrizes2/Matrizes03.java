import java.util.Scanner;

public class Matrizes03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int[][] M1 = new int [4][3];
        int [][] M1 = {
            {0, 1, 2},
            {4, 2, 3},
            {1, 3, 2},
            {0, 0, 0},
        };
        //int[][] M2 = new int [3][2];
        int [][] M2 = {
            {1, 4},
            {5, 1},
            {6, 2}
        };
        int[][] R = new int [4][2];

        // FAZER A MULTIPLICACAO
        for (int lin = 0; lin < 4; lin++) {
            for (int col = 0; col < 2 ; col++) {
                int soma = 0;
                for (int pos = 0; pos < 3; pos++) {
                    soma = soma + M1[lin][pos] * M2[pos][col];
                }
                R[lin][col] = soma;
            }
        }




        // MOSTRAR A RESULTANTE
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                System.out.print(R[i][j] + "  ");
            }
            System.out.println();
        }
    }
}