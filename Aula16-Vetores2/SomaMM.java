/*
SOMA MAIOR E MENOR COM VETORES
*/
import java.util.Scanner;
public class SomaMM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vetor[];
        int tamanho;
        int posicao;
        int valor;

        System.out.print("Informe quantos valores terá o seu vetor: ");
        tamanho = in.nextInt();

        vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            // i => posicao
            // vetor[i] => vetor na posicao i
            System.out.println("Inserindo na posicao " + i);
            vetor[i] = in.nextInt();
        }

        while (true) {
            System.out.println("Agora informe uma posicao e um valor");
            posicao = in.nextInt();
            if (posicao < 0 || posicao >= tamanho) {
                break;
            }
            vetor[posicao] = in.nextInt();

            for (int i = 0; i < tamanho; i++) {
                System.out.print(vetor[i] + "  ");
            }
            System.out.println();

            // MAIOR VALOR DO VETOR?
            int maior = vetor[0];
            int menor = vetor[0];
            int posMaior = 0;
            int soma = 0;
            for (int i = 0; i < tamanho; i++) {
                soma += vetor[i];

                if (vetor[i] > maior) {
                    maior = vetor[i];
                    posMaior = i;
                }

                if (vetor[i] < menor) {
                    menor = vetor[i];
                }
            }
            System.out.println("O MAIOR VALOR esta na posicao "+ posMaior + " e eh igual a " + maior);

            System.out.println("MENOR VALOR: " + menor);
            // MENOR VALOR DO VETOR?

            // SOMA DOS VALORES DO VETOR?
            System.out.println("SOMA " + soma);

        }
        System.out.println("BYE");
    }
}