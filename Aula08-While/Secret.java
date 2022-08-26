import java.util.Scanner;

public class Secret {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secreto = 8;
        int numero = 0;

        // ENQUANTO ( VALOR_LOGICO  ) {}
        while (numero != secreto) {
            
            System.out.print("Informe um numero: ");
            numero = in.nextInt();

            if (numero != secreto) {
                System.out.println("OOPSS>>> TENTE NOVAMENTE..");
            } else {
                System.out.println("SUCESSO!!!");
            }
        }
    }

}