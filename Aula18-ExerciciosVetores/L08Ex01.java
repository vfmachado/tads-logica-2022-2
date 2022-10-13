import java.util.Scanner;

public class L08Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor");
        int tamanho = in.nextInt();
        int v[] = new int[tamanho];

        System.out.println("Preencha o vetor");
        for (int i = 0; i < tamanho; i++) {
            v[i] = in.nextInt();
        }

        System.out.println("SEU VETOR FICOU ASSIM");
        for (int i = v.length-1; i >= 0; i--) {
            System.out.print(v[i] + "  ");
        }
        System.out.println();
    }
}