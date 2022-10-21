import java.util.Scanner;

/*
Faça um programa que recebe dois vetores de tamanho que o usuário
escolha. Execute a soma destes, elemento a elemento e coloque em um outro vetor.
*/

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Indique o tamanho dos vetores");
        int tamanho = in.nextInt();

        int[] v1, v2, v3;
        v1 = new int[tamanho];
        v2 = new int[tamanho];
        v3 = new int[tamanho];

        System.out.println("Informe os valores de v1");
        for (int i = 0; i < tamanho; i++) {
            v1[i] = in.nextInt();
        }
        
        System.out.println("Informe os valores de v2");
        for (int i = 0; i < tamanho; i++) {
            v2[i] = in.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            v3[i] = v1[i] + v2[i];
        }

        System.out.println("V3: ")
        for (int i = 0; i < tamanho; i++) {
            System.out.print(v3[i]  + "  ");
        }
        System.out.println();
    }
}