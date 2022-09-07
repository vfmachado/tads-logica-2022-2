import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int saque;
        System.out.println("Quanto vc quer sacar?");
        saque = in.nextInt();

        int n100, n50, n20, n10, n5, n2;
        int falta;
        
        n5 = 0;
        if (saque >= 5 && saque % 2 == 1) {
            n5 = 1;
            saque -= 5;
        }

        n100 = saque / 100;
        falta = saque % 100;

        n50 = falta / 50;   
        falta = falta % 50;

        n20 = falta / 20;   
        falta = falta % 20;

        n10 = falta / 10;   
        falta = falta % 10;

        // n5 = falta / 5;   
        // falta = falta % 5;

        n2 = falta / 2;   
        falta = falta % 2;

        System.out.println("NOTAS DE 100: " + n100);
        System.out.println("NOTAS DE 50: " + n50);
        System.out.println("NOTAS DE 20: " + n20);
        System.out.println("NOTAS DE 10: " + n10);
        System.out.println("NOTAS DE 5: " + n5);
        System.out.println("NOTAS DE 2: " + n2);
        
    }
}