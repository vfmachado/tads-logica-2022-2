import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int divisor = 1;
        int soma = 0;
        int numero = 1;

        while (numero < 1000) {
            soma = 0;
            divisor = 1;
            while (divisor < numero) {
                if (numero % divisor == 0) {
                    soma = soma + divisor;
                }
                divisor++;
            }

            if (soma == numero) {
                System.out.println(numero + " eh perfeito!!!");
            }
            numero++;
        }
    }
}