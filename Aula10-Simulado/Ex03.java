import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int div3, div5, div3e5, valor;
        div3 = 0;
        div5 = 0;
        div3e5 = 0;

        int contador = 0;
        while (contador < 100) {

            valor = in.nextInt();
            
            if (valor % 3 == 0 && valor % 5 == 0) {
                div3e5++;
            } 

            if (valor % 3 == 0) {
                div3++;
            }

            if (valor % 5 == 0) {
                div5++;
            }
            
            contador++;
        }     

        System.out.println("DIVISIVEIS POR 3: " + div3);
        System.out.println("DIVISIVEIS POR 5: " + div5);
        System.out.println("DIVISIVEIS POR 3 e 5: " + div3e5);
    }
}