import java.util.Scanner;

public class Matrizes02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 7 x 7
        // vamos colocar o valor 5 no meio da matriz
        // WASD para movimentar o numero dentro da matriz

        int M[][] = new int[7][7];
        M[3][3] = 5;
        int posL = 3;
        int posC = 3;


        while (true) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(M[i][j] + "  ");
                }
            System.out.println();
            }

            System.out.print("\nMOVIMENTO: ");
            String movimento = in.next().toUpperCase();

            switch (movimento) {
                case "W":
                    System.out.println("O USUARIO DIGITOU W");
                   
                    M[posL][posC] = 0;
                    posL = posL -1;
                    if (posL == -1) {
                        posL = 6;
                    }
                    M[posL][posC] = 5;
                    
                    break;
            }
        }

    }
}