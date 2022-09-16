import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        int cont = 0;

        int pares = 0;
        int impares = 0;

        int multiplos3 = 0;

        int maior = 0;
        int menor = 99999;

        while (cont < 20) {
            System.out.println("Informe o valor");
            valor = in.nextInt();

            if (valor >= 0) {
                if ( valor % 2 == 0 ) {
                    pares++;
                } else {
                    impares++;
                }

                if ( valor % 3 == 0) {
                    multiplos3++;
                }

                if (valor < menor) {
                    menor = valor;
                }

                if (valor > maior) {
                    maior = valor;
                }
                cont++;
            }
        }

        System.out.println("MAIOR VALOR " + maior);
        System.out.println("MENOR VALOR " + menor);
        System.out.println("PARES " + pares);
        System.out.println("IMPARES " + impares);
        System.out.println("MULT 3 " + multiplos3);

    }
}