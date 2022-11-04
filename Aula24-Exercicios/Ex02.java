/*
Escreva um algoritmo para ler a quantidade L de linhas (máximo 10) e a quantidade C de colunas (máximo 10) de uma matriz. A seguir ler uma matriz L x C (considere que serão informados apenas valores positivos). A seguir ler uma quantidade indeterminada de valores. Para cada valor escrever uma mensagem indicando se ele está ou não armazenado na matriz. Para cada valor informado, a mensagem deve ser impressa apenas uma vez. O programa termina ao ser informado um valor negativo.
*/
public class Ex02 {
    public static void main(String[] args) {

        int [][] M = {
            {1,  5,   9, 12},
            {7,  5,  11, 22},
            {33, 13, 10, 63},
            {2,  3,   8, 4}
        }; 

        int procurado = 5;
        boolean achou = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (M[i][j] == procurado) {
                    achou = true;
                    break;
                }
            }
            if (achou) break;

        }

        if (achou) {
            System.out.println("ACHOU");
        } else {
            System.out.println("NAO ACHOU");
        }

    }
}