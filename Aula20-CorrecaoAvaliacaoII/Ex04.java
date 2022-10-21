import java.util.Scanner;

/*

*/

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] v1 = new int[15];
        int[] v2;
        
        System.out.println("Informe os valores de v1");
        for (int i = 0; i < 15; i++) {
            v1[i] = in.nextInt();
        }
  
        int tamanhoV2 = 0;

        // para cada um dos valores de v1, vamos verificar se é diferente de zero e somar no tamanho v2
        for (int i = 0; i < 15; i++) {
            if (v1[i] > 0) tamanhoV2++;
        }

        System.out.println("QUANTIDADE DE VALORES DIFERENTES DE ZERO " + tamanhoV2);
        v2 = new int[tamanhoV2];

        int pontoInsercaoV2 = 0;
        for (int i = 0; i < 15; i++) {
            if (v1[i] > 0) {
                v2[pontoInsercaoV2] = v1[i];
                pontoInsercaoV2++;
            }
        }

        System.out.println("V2: ");
        for (int i = 0; i < tamanhoV2; i++) {
            System.out.print(v2[i]  + "  ");
        }
        System.out.println();
    }
}