import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quantAlunos;
        float n1, n2, media;
        float menor, maior, mediaMedia;

        menor = -1;
        maior = -1;

        int n;
        System.out.println("Informe a quantidade de alunos");
        quantAlunos = in.nextInt();
        n = 0;

        while (n < quantAlunos) {

            n1 = in.nextFloat();
            n2 = in.nextFloat();
            media = (n1 + n2)/2;

            mediaMedia = mediaMedia + media;

            if (media > maior || maior == -1) {
                maior = media;
            }

            if (media  < menor || menor == -1) {
                menor = media;
            }

            n++;
        }

        mediaMedia = mediaMedia/quantAlunos;

        System.out.println("MEDIA DAS MEDIAS " + mediaMedia );
        System.out.println("MAIOR NOTA " + maior);
        System.out.println("MENOR NOTA " + menor);
    }
}