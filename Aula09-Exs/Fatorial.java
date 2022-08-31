/*
    Fatorial de um número é igual a o numero vezes o fatorial do seu antecessor. Dado que fatorial de 0 é 1;

    5! = 5 * 4!
             4 * 3!
       = 5 * 4 * 3 * 2 * 1
       = 120; 

    9 = 9 * 8 * 7 ... 1
        1 * 2 * 3 ... 9
*/

// DADO UM VALOR QUALQUER, CALCULAR SEU FATORIAL!
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero");
        int n = in.nextInt();
        int fat = 1;    // 0! = 1

        while (n > 0) { // enquanto a condição/valor lógico é verdadeiro
            System.out.println(n);
            // 'fat ='  significa atribuição   
            fat = fat * n;  // fat = fat * n;   fat = 5; n = 4;
                                                // fat = 5 * 4
            n--;    // n = n - 1;
        }

        System.out.println("Encerrei o laco");
        System.out.println("FATORIAL " + fat);
    }
}
