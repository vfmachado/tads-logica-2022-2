import java.util.Scanner;

public class MediaN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de valores e depois os valores..");
        int quantidade  = in.nextInt();
        float valor;
        float soma = 0;
        float media;

        int contador = 0;
        while (contador < quantidade) {
            System.out.println("PASSEI POR AQUI " + contador);
            contador++;
            valor = in.nextFloat();
            soma = soma + valor;
        }

        media = soma/quantidade;
        System.out.println("A media dos valores informados eh " + media);

    }
}