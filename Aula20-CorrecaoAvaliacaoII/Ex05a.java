import java.util.Scanner;

/*

*/

public class Ex05a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Indique quantas linhas voce deseja mostrar");
        int linhas = in.nextInt();
        int [] v1 = {1};


        for (int linha = 0; linha < linhas; linha++) {

            for (int i = 0; i < v1.length; i++) {
                System.out.print(v1[i]  + "  ");
            }
            System.out.println();

            int [] v2 = new int[v1.length + 1];
            v2[0] = 1;
            v2[v1.length] = 1;  

            for (int i = 1; i < v1.length; i++) {
                v2[i] = v1[i] + v1[i-1];
            }

            v1 = v2;
        }

        
    }
}