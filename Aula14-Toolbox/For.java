/*
    TAMBÉM É UMA ESTRUTURA DE REPETIÇÃO

    é muito utilizado em repetições determinadas
        pq ele junta todas as coisas que fazemos no while
        em uma unica linha
        * inicializacao
        * teste
        * incremento/decremento/passo

        for ( inicializacao ; teste ; passo ) {

        }

    obs: os parametros do for sao opcionais
*/
import java.util.Scanner;


public class For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // mostrar numeros de 1 a 10
        int n = 1;  // inicializacao
        while (n <= 10) {   // teste
            System.out.println(n);
            n++; // passo
        }

        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        for ( n = 0 ; n < 10 ; ) {
            System.out.println("rsrsrsrsrs");
            n = in.nextInt();
        }

        for (int x = 100; x >= 0; x = x - 10) {
            System.out.println("VALOR DE X " + x);
        }

        int c;
        for ( c = 0; c < 3; c++) {
            // vazio
        }
        System.out.println("VALOR DE C " + c);

        for ( ; c < 10; c+=2) {
            System.out.println("TESTE");
        }
        System.out.println("VALOR DE C " + c);

    }
}