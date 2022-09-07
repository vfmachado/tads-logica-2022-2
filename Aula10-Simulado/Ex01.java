import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;

        System.out.print("Informe sua idade: ");
        idade = in.nextInt();

        if (idade < 4 || idade > 60) {
            System.out.println("IMPOSSIVEL CLASSIFICAR");
        } else if (idade < 9) {
            System.out.println("MIRIM");
        } else if (idade < 14) {
            System.out.println("INFANTIL");
        } else if (idade < 18) {
            System.out.println("JUVENIL");
        } else {
            System.out.println("ADULTO");
        }
    }

}