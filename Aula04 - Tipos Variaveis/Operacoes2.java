import java.util.Scanner;
public class Operacoes2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // EXERCICIO - REPLICAR PARA OUTROS TIPOS DE DADOS
        System.out.println("Informe dois valores");
        int a = in.nextInt();
        int b = in.nextInt();

        int soma = a + b;
        int subtracao = a - b;
        int divisao = a / b;
        int multiplicao = a * b;
        int resto = a % b;

        // System.out.printf("SOMA %d\nSUB %d\nMULT %d\nRESTO %d\nDIVISAO %d\n", soma, subtracao, multiplicao, resto, divisao);

        System.out.println("SOMA " + soma);
        System.out.println("SUBTRACAO " + subtracao);
        System.out.println("MULTIPLICACAO " + multiplicao);
        System.out.println("DIVISAO " + divisao);
        System.out.println("RESTO " + resto);


        boolean maior = a > b;
        boolean maiorOuIgual = a >= b;

        boolean menor = a < b;
        boolean menorOuIgual = a <= b;

        boolean iguais = a == b;    // dois iguais
        boolean diferentes = a != b;    // ponto de excl e um igual do lado

        System.out.printf("%d > %d ? %b\n", a, b, maior);
        System.out.printf("%d >= %d ? %b\n", a, b, maiorOuIgual);
        System.out.printf("%d < %d ? %b\n", a, b, menor);
        System.out.printf("%d <= %d ? %b\n", a, b, menorOuIgual);
        System.out.printf("%d == %d ? %b\n", a, b, iguais);
        System.out.printf("%d != %d ? %b\n", a, b, diferentes);


    }
}