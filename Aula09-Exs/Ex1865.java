import java.util.Scanner;

public class Ex1865 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String nome;
        int forca;
        // CRIAR UMA VARIAVEL COMEÇANDO EM 0 E IR ATÉ < N
        int contador = 0;
        // REGREDIR O VALOR DE N EM 1 ENQUANTO FOR > 0, CUIDADO, DESTA FORMA O VALOR N SERÁ ALTERADO
        while (contador < n) {
            nome = in.next();
            forca = in.nextInt();
            
            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {    // caso contrário   (nunca tem condicao/valor logico)
                System.out.println("N");
            }

            contador++;
        }

    }
}