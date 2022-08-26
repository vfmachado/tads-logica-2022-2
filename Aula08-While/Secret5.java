import java.util.Scanner;
import java.util.Random;

public class Secret5 {

    public static void main(String[] args) {
        Random aleat = new Random();
        Scanner in = new Scanner(System.in);
        int secreto = aleat.nextInt(100);
        int numero = 0;
        int tentativas = 0;

        // ENQUANTO ( VALOR_LOGICO  ) {}
        while (numero != secreto && tentativas < 5) {
            
            System.out.print("Informe um numero: ");
            numero = in.nextInt();
            tentativas++;
            if (numero != secreto && tentativas < 5) {
                System.out.println("OOPSS>>> TENTE NOVAMENTE..");

                if (numero < secreto) {
                    System.out.println("TENTE MAIOR");
                } else {
                    System.out.println("TENTE MENOR");
                }
            }
        }

        if (numero == secreto) {
            System.out.println("VOCE PRECISOU DE " + tentativas + " PARA ACERTAR");
        } else {
            System.out.println("CARTAO BLOQUEADO ERA " + secreto );
        }
    }

}