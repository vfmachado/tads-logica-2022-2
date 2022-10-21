import java.util.Scanner;

/*
Dados dois vetores de tamanho N, faça um programa que diga quantos
valores são iguais nos dois vetores na mesma posição.

v1 [1, 2, 3, 4]
v2 [1, 2, 4, 4]
    ^  ^     ^
Resposta => 3


*/

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Indique o tamanho do vetor");
        int tamanho = in.nextInt();

        int[] v1, v2;
        v1 = new int[tamanho];
        v2 = new int[tamanho];

        System.out.println("Informe os valores de v1");
        for (int i = 0; i < tamanho; i++) {
            v1[i] = in.nextInt();
        }
        
        System.out.println("Informe os valores de v2");
        for (int i = 0; i < tamanho; i++) {
            v2[i] = in.nextInt();
        }

        int iguais = 0;
        for (int i = 0; i < tamanho; i++) {
            if (v1[i] == v2[i])
                iguais++;
        }

        System.out.println(iguais + " valores iguais na mesma posicao");
    }
}