import java.util.Scanner;
import java.util.Random;

public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random r = new Random();
        int[] lados = new int[6];   
        /*
            [0] => 1
            [1] => 0
            [2] => 1
            [3] => 3
            [4] => 0
            [5] => 0
        */

        int n = in.nextInt();

        while (n > 0) {
            int aleatorio = r.nextInt(6);   // sortear um valor de 0 a 5
            lados[aleatorio]++;
            n--;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("O LADO " + (i+1) + " FOI SORTEADO " + lados[i] + " VEZES");
        }
    }

}