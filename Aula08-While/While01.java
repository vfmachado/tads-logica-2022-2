import java.util.Scanner;

public class While01 {

    public static void main(String[] args) {

        int numero = 0;

        // ENQUANTO ( VALOR_LOGICO  ) {}
        while (numero < 20) {
            System.out.println("Heyyy yooouuu " + numero);
            numero++;
        }

        // SEGUE EXECUTANDO O COD NORMALMENTE QUANDO ENCERRA O WHILE
        // QUANDO O VALOR LOGICO FOR FALSE
        System.out.println("FORA DO WHILE MEU NUMERO " + numero);

    }

}