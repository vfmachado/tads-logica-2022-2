import java.util.Scanner;
public class L4Ex27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v, n;
        int dobro = 0, soma = 0;
        v = in.nextInt();
        n = in.nextInt();

        while (n > 0) {
            dobro = v * 2;
            soma = dobro + v;

            v = dobro;
            System.out.println("DOBRO " + dobro + "  SOMA " + soma);
            n--;
        }
    }
}