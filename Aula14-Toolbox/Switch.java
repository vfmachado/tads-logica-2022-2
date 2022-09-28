import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letra = in.next().toUpperCase().charAt(0);

        if (
            letra == 'A' ||
            letra == 'E' ||
            letra == 'I' ||
            letra == 'O' ||
            letra == 'U'
        ) {
            System.out.println("Eh uma vogal");
        }

        if (letra == 'A') {

        } else if (letra == 'E') {

        } else if (letra == 'I') {

        } else if (letra == 'O') {

        } else if (letra == 'U') {

        } else {
            System.out.println("NAO EH VOGAL");
        }


        switch (letra) {
            case 'A': 
                // BLOCO DE CODIGO
                break;
            case 'E': 
                // BLOCO DE CODIGO
                break;
            case 'I': 
                // BLOCO DE CODIGO
                break;
            case 'O': 
                // BLOCO DE CODIGO
                break;
            case 'U': 
                // BLOCO DE CODIGO
                break;
        }
    }
}