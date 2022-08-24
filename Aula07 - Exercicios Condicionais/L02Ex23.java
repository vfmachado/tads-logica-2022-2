import java.util.Scanner;

public class L02Ex23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minima, maxima, atual, media;
        System.out.println("Informe a quantidade atual, minima e máxima");

        atual = in.nextInt();
        minima = in.nextInt();
        maxima = in.nextInt();

        media = (minima + maxima)/2;
        System.out.println("MEDIA " + media);

        if (atual >= media) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Devem ser compradas novas unidades do produto em questao");
        }
    } 
}