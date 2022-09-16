import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int repeticoes = in.nextInt();

        double numerador = 1;
        double denominador = 1; 

        double soma = 0;

        while (repeticoes > 0) {
            System.out.println("NUMERADOR " + numerador);
            System.out.println("DENOMINADOR " + denominador);

            soma = soma + numerador / denominador;

            numerador = numerador * -1;
            denominador += 2;

            repeticoes--;   
        }

        double aprox = 4 * soma;
        System.out.println(aprox);
    }

}