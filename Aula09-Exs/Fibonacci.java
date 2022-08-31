import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe ate quanto vc quer ver a sequencia > 3");
        int n = in.nextInt();
        // 1 1  (1+1)
        // 1    1   2   3   5   8   13  21  34  55  89   ...
        /*
            1   1
            a   b   c
            1 + 1   2   => c = a + b
                a   b   c
                1 + 2   3   => c = a + b
                    a   b   c
                    2 + 3   5   => c = a + b
                        a   b   c
                        3 + 5   8
        */

        int a = 1;
        int b = 1;
        int c = 2;
        System.out.print("1  1  ");
        //  println => mostra uma msg e quebra linha
        //  print   => sem ln, nao quebra a linha
        //  printf  => saida formatada
        while (c <= n) {
            System.out.print(c + "  ");
            a = b;  // 1
            b = c;  // 2
            c = a + b;  // 3
        }
        System.out.println();

    }
}