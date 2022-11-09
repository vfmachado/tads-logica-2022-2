import java.util.Scanner;
import java.util.Random;

public class Ex01B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random r = new Random();
        int[] lados = new int[6];   
       

        int n = in.nextInt();

        while (n > 0) {
            int digitado =  in.nextInt();   // de 1 a 6
            
            switch (digitado) {
                case 1: lados[0]++; break;
                case 2: lados[1]++; break;
                case 3: lados[2]++; break;
                case 4: lados[3]++; break;
                case 5: lados[4]++; break;
                case 6: lados[5]++; break;
            }
            n--;
        }



        for (int i = 0; i < 6; i++) {
            System.out.println("O LADO " + (i+1) + " FOI SORTEADO " + lados[i] + " VEZES");
        }
    }

}