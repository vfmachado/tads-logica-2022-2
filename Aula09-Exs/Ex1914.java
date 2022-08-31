import java.util.Scanner;

public class Ex1914 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String nome1, escolha1, nome2, escolha2;
        int numero1, numero2;
        
        while (n > 0) {
            nome1 = in.next();
            escolha1 = in.next();
            nome2 = in.next();
            escolha2 = in.next();

            numero1 = in.nextInt();
            numero2 = in.nextInt();

            int soma = numero1 + numero2;            
            boolean ehPar = soma % 2 == 0;  // se for par sera true 

            if (ehPar) {
                if (escolha1.equals("PAR")) {
                    System.out.println(nome1);
                } else {
                    System.out.println(nome2);
                }
            } else {
                if (escolha1.equals("IMPAR")) {
                    System.out.println(nome1);
                } else {
                    System.out.println(nome2);
                }
            }

            System.out.println("REPETINDO... " + n);
            n--;
        }

    }
}