import java.util.Scanner;

public class L03Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe os 3 lados do possivel triangulo");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        /*
         if (a  < b + c) {
            if (b < a + c) {
                if (c < a + b) {
                    System.out.println("Ora oras, temos um triangulo");
                }
            }
        }
        */    
        if ((c < a + b) && 
            (a < b + c) && 
            (b < a + c) ) {
            System.out.println("Ora oras, temos um triangulo");
        } else {
            System.out.println("Nao e possivel formar um triangulo");
        }
    }
}