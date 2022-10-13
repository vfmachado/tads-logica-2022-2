import java.util.Scanner;

public class L08Ex05 {

    static void mostraVetor(int a[]) {
        System.out.println("SEU VETOR FICOU ASSIM");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor");
        int tamanho = in.nextInt();
        int v[] = new int[tamanho];

        System.out.println("Informe os valores do vetor");
        for (int i = 0; i < tamanho; i++) {
            v[i] = in.nextInt();
        }

        System.out.println("Trocando os valores do vetor");
        int posMaior = 0;
        for (int i = 0; i < tamanho/2; i++) {
            int pos1 = i;
            int pos2 = i + tamanho/2;

            int aux = v[pos1];
            v[pos1] = v[pos2];
            v[pos2] = aux;
        }

        mostraVetor(v);

        int[] outroVetor = {1, 2, 3, 4};
        mostraVetor(outroVetor);


    }
}