import java.util.Scanner;

public class L08Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de lancamentos");
        int lancamentos = in.nextInt();
        int v[] = new int[6];

        System.out.println("Informe os valores do lancamentos");
        for (int i = 0; i < lancamentos; i++) {
            int lado = in.nextInt();
            v[lado-1]++;
        }

        System.out.println("SEUS LANCAMENTOS FICARAM ASSIM");
        int posMaior = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("O LADO " + (i+1) + " SAIU " + v[i] + " VEZES");
            if (v[i] > v[posMaior]) {
                posMaior = i;
            }
        }

        System.out.println("O LADO QUE MAIS SAIU FOI " + (posMaior+1));
    }
}