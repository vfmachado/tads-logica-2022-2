import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // VALORES LÓGICOS true OU false
        boolean logicoA = in.nextBoolean();
        boolean logicoB = in.nextBoolean();

        if (logicoA) {
            System.out.println("A é true!");
        } else {    // if (!logicoA) {
            System.out.println("A é false!");
        }

        // && => retorna verdadeiro apenas quando ambos os valores são verdadeiros
        if (logicoA && logicoB) {
            System.out.println("Ambos são verdadeiros");
        }
        if (logicoA) {
            if (logicoB) {
                System.out.println("Ambos são verdadeiros");
            }
        }

        // || => ou => retorna verdadeiro quando pelo menos 1 valor é verdadeiro
        if (logicoA || logicoB) {
            System.out.println("Algum ou ambos valores são verdadeiros");
        } else {
            System.out.println("AMBOS SAO FALSOS");
        }
    }
}