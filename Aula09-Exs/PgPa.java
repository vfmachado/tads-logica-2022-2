import java.util.Scanner;
public class PgPa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // PROGRESSAO ARITMETICA
        // DADO UM VALOR INICIAL E A SUA RAZAO
        // O PROXIMO VALOR É ENCONTRADO SOMANDO O TERMO ANTERIOR + RAZAO
        // a1 = 5; q = 3;
        // a2 = 5 + 3 = a1 + q
        // a3 = a2 + q  =>  a = a + q   // ISSO É MUITO USUAL
        // a4 = a3 + q

        // PROGRESSAO GEOMETRICA, MESMA COISA, MAS COM MULTIPLICACAO

        // mostrar os 10 primeiros elementos da pa ou pg de acordo com a sequencia que o usuário escolher

        // USUARIO, INDIQUE QUAL SEQUENCIA VC DESEJA
        // pa
        // informe o primeiro elemento e razao
        // 5 3
        // 5    8   11  14  17  20  23  26  29  32

        // USUARIO, INDIQUE QUAL SEQUENCIA VC DESEJA
        // pg
        // informe o primeiro elemento e razao
        // 2    2
        //  2   4   8   16  32   64  128   256   512     1024
        
        // 2    q = 10
        // 2    20     200      2000    20000

        String tipo;
        int a1, q, contador = 0;

        System.out.println("Informe qual o tipo, pa ou pg");
        tipo = in.next();

        System.out.println("Informe a1 e a razao");
        a1 = in.nextInt();
        q = in.nextInt();
        int elemento = a1;

        while (contador < 10) {
            System.out.println("ELEMENTO " + contador + ": " + elemento);
            if (tipo.equals("pa")) {    // .equals para comparar String
                                        // String não é um tipo primitivo
                                        // apenas tipos primitivos aceitam o == 
                elemento = elemento + q;
            } else {
                elemento = elemento * q;
            }
            contador++;
        }
    }
}