/*
    JOGO DA VELHA EM UMA VERSÃO COM VETORES
*/
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] tabuleiro = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char jog = 'O';
        while (true) {
            for (int i = 0; i < tabuleiro.length; i++) {
                if (i % 3 == 0) System.out.println();      
                System.out.print(tabuleiro[i] + "  ");
            }
            System.out.println();

            System.out.println("ONDE VC (" + jog + ") QUER JOGAR? ");
            int posicao = in.nextInt();
            posicao = posicao -1;
            tabuleiro[posicao] = jog;
            boolean venceu = false;
            // TESTA AS LINHAS
            for (int i = 0; i <= 6; i = i + 3) {
                if (tabuleiro[i] == tabuleiro[i+1] && tabuleiro[i] == tabuleiro[i+2]) {
                    System.out.println(tabuleiro[i] + " venceu");
                    venceu = true;
                }
            }

            // TESTA AS COLUNAS
            for (int i = 0; i <= 2; i++) {
                if (tabuleiro[i] == tabuleiro[i+3] && tabuleiro[i] == tabuleiro[i+6]) {
                    System.out.println(tabuleiro[i] + " venceu");
                    venceu = true;
                }
            }

            // DIAGONAIS
            if (tabuleiro[0] == tabuleiro[4] && tabuleiro[0] == tabuleiro[8]) {
                System.out.println(tabuleiro[0] + " venceu");
                venceu = true;
            }

            if (tabuleiro[2] == tabuleiro[4] && tabuleiro[2] == tabuleiro[6]) {
                System.out.println(tabuleiro[2] + " venceu");
                venceu = true;
            }

            if (venceu) break;

            if (jog == 'O') {
                jog = 'X';
            } else {
                jog = 'O';
            }
        }
    }
}