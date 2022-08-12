import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        operações aritméticas
        O TIPO DE DADO QUE ESTÁ SENDO UTILIZADO É MUITO IMPORTANTE
            +   
            -
            *
            /       => ao dividir inteiros, o resultado é inteiro
            %

        */

        int a = 5;
        int b = 3;
        int c = a / b;
        System.out.println("c = " + c);

        // forçar a conversao de tipos durante uma operacao
        float d = (float) a / b;    // diferente de (float) (a/b)
        System.out.println("d = " + d);

        // NA SAIDA FORMATADA, NO LUGAR DAS VARIAVEIS COLOCAMOS UM %f, %d, %s
        // f => numeros reais (float, double)
        // d => numeros inteiros
        // s => textos (string)
        System.out.printf("Saida com formato d = %.2f\n", d);
        
        System.out.printf("Dado 1: %d\nDado 2: %f\nDado 3: %s\n", 1, 1.5f, "Meu texto");
    }
}