import java.util.Scanner;

/*

*/

public class Ex05b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // pv1                    v
        int[] v1 = { 1, 2, 3, 4, 5};
        int[] v2 = { 6, 7, 8, 9, 10};
        // pv2                        ^
        int[] v3 = new int[10];

        int pv1 = 0;
        int pv2 = 0;
        int posicaoV3 = 0;
        
        while (pv1 < v1.length && pv2 < v2.length) {
            if (v1[pv1] < v2[pv2]) {
                v3[posicaoV3] = v1[pv1];
                pv1++;
            } else {
                v3[posicaoV3] = v2[pv2];
                pv2++;
            }

            posicaoV3++;
        }

        while (pv1 < v1.length) {
            v3[posicaoV3] = v1[pv1];
            posicaoV3++;
            pv1++;
        }
        
        while (pv2 < v2.length) {
            v3[posicaoV3] = v2[pv2];
            posicaoV3++;
            pv2++;
        }

        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i]  + "  ");
        }
        System.out.println();
       
    }
}