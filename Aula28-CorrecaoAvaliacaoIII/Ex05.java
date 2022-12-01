public class Ex05 {
    public static void main(String[] args) {

        int[][] M = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 2, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };


        // VALIDA LINHAS E COLUNAS
        
        //linha repete
        boolean repete = false;
        for (int lin = 0; lin < 9; lin++) {
            for (int i = 0; i < 8; i++) {
                for (int j = i+1; j < 9; j++) {
                    // TESTA A LINHA
                    if (M[lin][i] != 0 && M[lin][i] == M[lin][j]) {
                        repete = true;
                    } 
                    // TESTA A COLUNA
                    if (M[i][lin] != 0 && M[i][lin] == M[j][lin]) {
                        repete = true;
                    } 
                }
            }
        }

        // blocos de 3
        for (int si = 0; si < 9; si = si + 3) {
            for (int sj = 0; sj < 9; sj = sj+3) {
                System.out.println("COMPARANDO O BLOCO PARA SI " + si + " E SJ " + sj);

                // dentro do bloco de 3, verifica se um elemento da matriz repete e eh diferente de zero
                // i e j sao as referencias para comparacao
                for (int i = si; i < si+3; i++) {
                    for (int j = sj; j < sj+3; j++) {

                        // ci e cj sao os valores que estao sendo comparados (sempre 1 a mais que i e j)
                        for (int ci = i+1; ci < si+3; ci++) {
                            for (int cj = j+1; cj < sj+3; cj++) {

                                // verifica os valores e ignora os zeros
                                if (M[i][j] != 0 && M[i][j] == M[ci][cj]) {
                                    System.out.println("REPETE NAS POSICOES");
                                    System.out.println("" + i + ", " + j + "  e " + ci +  ", " + cj);
                                    repete = true;
                                }
                            }
                        }
                        System.out.print(M[i][j]);
                    }
                    System.out.println();
                }

            }
        }

        if (repete) {
            System.out.println("O SUDOKU NAO EH VALIDO");
        } else {
            System.out.println("NAO REPETE, CONTINUE JOGANDO ASSIM");
        }
    }
}