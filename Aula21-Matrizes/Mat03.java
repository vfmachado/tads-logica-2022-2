import java.util.Scanner;

public class Mat03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean lugares[][] = new boolean[10][10];
        while (true) {
            System.out.println("\t\t*** TELA ***");

            for (int i = 0; i < lugares.length; i++) {
                for (int j = 0; j < lugares[i].length; j++) {
                    if (lugares[i][j]) {
                        System.out.print("XX  ");
                    } else {
                        System.out.print( (char) (65+i) + "" + (j+1) + "  ");
                    }
                }
                System.out.println();
            }

            System.out.println("\nQue lugar vc deseja?");
            String escolha = in.next().toUpperCase();
            char letra = escolha.charAt(0);
            int linha = letra - 65;
            // System.out.println(linha);
            
            int coluna = Integer.parseInt(escolha.substring(1)) - 1;
            if (linha < 0 || linha > lugares.length || coluna < 0 || coluna > lugares[0].length) {
                break;
            }
            lugares[linha][coluna] = true;
        }
    }
}