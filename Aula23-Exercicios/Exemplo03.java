public class Exemplo03 {
    public static void main(String[] args) {

        int [][] M = {
            {1, 2, 3, 4, 5, 6, 7},
            {2, 3, 4, 1, 2, 4, 7},
            {5, 6, 7, 9, 1, 0, 7},
            {1, 2, 3, 4, 5, 6, 7} 
        };

        // FAÇA UM PROGRAMA QUE MOSTRA OS NUMEROS DAS LINHAS E COLUNAS EM QUE A SOMA DOS SEUS ELEMENTOS RESULTAM EM UM VALOR DECIDIDO PELO USUARIO

        int procurado = 28;

        for (int lin = 0; lin < M.length; lin++) {
            int soma = 0;
            for (int col = 0; col < M[lin].length; col++) {
                soma = soma + M[lin][col];
            }
            if (procurado == soma)
                System.out.println("NA LINHA " + lin + " TEM A SOMA " + soma );
        }

        for (int col = 0; col < M[0].length; col++) {
            int soma = 0;
            for (int lin = 0; lin < M.length; lin++) {
                soma += M[lin][col];
            }
            if (procurado == soma)
                System.out.println("NA COLUNA " + col + " TEM A SOMA " + soma );
        }

    }
}