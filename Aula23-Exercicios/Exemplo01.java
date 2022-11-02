import java.util.Random;    
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        Random r = new Random();
        // r.nextInt(100); // sorteia um valor de 0 a 99
        int[][] cartela = new int[5][5];

        // PREENCHIMENTO
        for (int n = 0; n < 25; ) { // omitimos propositalmente o ultimo parametro
            int aleatorio = r.nextInt(100);

            boolean temValor = false;
            for (int x = 0; x < n; x++) {
                if (cartela[x/5][x%5] == aleatorio) {
                    temValor = true;
                    break;
                }
            }

            if (temValor == false) {
                cartela[n/5][n%5] = aleatorio; 
                n++;
            } 
            // else {
            //     n--;
            // }
        }



        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(cartela[i][j] + "  ");
            }
            System.out.println();
        }

        
    }
}