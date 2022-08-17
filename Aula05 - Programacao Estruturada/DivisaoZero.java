import java.util.Scanner;
public class DivisaoZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerador, divisor, divisao;

        System.out.println("Informe dois valores");
        numerador = in.nextInt();
        divisor = in.nextInt();

        boolean divZero = divisor == 0;
        System.out.println("DivZERO " + divZero);

        System.out.println("--> ANTES DO PRIMEIRO IF");
        // SE O DIVISOR FOR DIFERENTE DE ZERO
        if (divisor != 0) {
      //if (!divZero) {
            System.out.println("--> DENTRO DO PRIMEIRO IF");
            divisao = numerador / divisor;
            System.out.println("RESULTADO: " + divisao);
        }
        // SE O DIVISOR FOR IGUAL A ZERO
        System.out.println("--> ANTES DO SEGUNDO IF");
        if (divisor == 0) {
    //  if (divZero) {
            System.out.println("--> DENTRO DO SEGUNDO IF");
            System.out.println("OOPS, NAO SEI O QUE VC QUER FAZER COM ESS DIVISAO POR ZERO");
        }

        System.out.println("--> DEPOIS DOS DOIS IFS");
    }
}