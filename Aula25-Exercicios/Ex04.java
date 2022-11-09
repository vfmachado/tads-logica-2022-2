import java.util.Scanner;

public class Ex04 {

    static void mostraMatriz(int[][] matrix) {
        for (int linha = 0; linha < matrix.length; linha++) {
            for (int coluna = 0; coluna < matrix[linha].length; coluna++) {
                System.out.print(matrix[linha][coluna] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] M = {
            {1, 2, 3, 4, 5},    // 15
            {1, 2, 3, 4, 5},    // 15
            {1, 2, 3, 4, 6},    // 16
            {1, 2, 3, 4, 6},    // 16
            {1, 2, 3, 4, 7},    // 17
        };

        int[][] T = {
            {1, 2, 3},
            {1, 2, 3, 4},
            {1},
            {1, 2}
        };

        mostraMatriz(M);
        System.out.println("\n\n\n");
        mostraMatriz(T);

    }   
}