public class Exemplo04 {
    public static void main(String[] args) {

        int [][] M = {
            {1, 2, 3, 4, 5, 6, 7},
            {2, 3, 4, 1, 2, 4, 7},
            {2, 3, 4, 1, 2, 4, 7},
            {5, 6, 7, 9, 1, 0, 7},
            {1, 2, 3, 4, 5, 6, 7} 
        };

        // FAÇA UM PROGRAMA QUE MOSTRA OS NUMEROS DAS LINHAS E COLUNAS EM QUE A SOMA DOS SEUS ELEMENTOS RESULTAM EM UM VALOR DECIDIDO PELO USUARIO
        int[] somaDasLinhas = new int[5];

        for (int lin = 0; lin < M.length; lin++) {
            int soma = 0;
            for (int col = 0; col < M[lin].length; col++) {
                soma = soma + M[lin][col];
            }
            somaDasLinhas[lin] = soma;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                if (somaDasLinhas[i] == somaDasLinhas[j]) {
                    System.out.println("Na posicao " + i  + " e na posicao " + j + " temos as mesmas somas");
                }
            }
        }

    }
}