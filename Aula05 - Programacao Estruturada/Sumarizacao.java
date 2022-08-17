import java.util.Scanner;

public class Sumarizacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total, validos, brancos, nulos;
        float pValidos, pBrancos, pNulos;

        System.out.println("Informe a quantidade de votos validos, brancos e nulos");
        validos = in.nextInt();
        brancos = in.nextInt();
        nulos = in.nextInt();
        
        total = validos + brancos + nulos;

        pValidos = (float) validos / total * 100;
        pBrancos = (float) brancos / total * 100;
        pNulos = (float) nulos / total * 100;

        System.out.println("O TOTAL DE VOTOS NESTA ELEICAO FOI " + total);

        System.out.println("VOTOS VALIDOS " + pValidos + "%");
        System.out.println("VOTOS BRANCOS " + pBrancos + "%");
        System.out.println("VOTOS NULOS " + pNulos + "%");
    }
}