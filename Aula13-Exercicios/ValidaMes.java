import java.util.Scanner;
public class ValidaMes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mes = 0;

        // valores validos para mes
        // 1 - 12
        while (mes < 1 || mes > 12) {
            System.out.println("INFORME UM MES VALIDO");
            mes = in.nextInt();
        }

        System.out.println("SEGUE O BAILE");
    }
}