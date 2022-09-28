import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letra = in.next().toUpperCase().charAt(0);

        switch (letra) {
            case 'A': 
                System.out.println("A...");
            case 'E':
                System.out.println("A ou E"); 
            case 'I': 
            case 'O': 
            case 'U': 
                // BLOCO DE CODIGO
                System.out.println("VOGAL");
                break;
            default:    // padrao
                // por ser o ultimo nao precisa de break
                System.out.println("NAO EH VOGAL");
        }
    }
}