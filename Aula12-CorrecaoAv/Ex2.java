import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lados = in.nextInt();
        int medida = in.nextInt();

        if (lados == 3) {
            System.out.println("TRIANGULO");
            int perimetro = 3 * medida;
            System.out.println("PERIMETRO " + perimetro);
        } else if (lados == 4) {
            System.out.println("QUADRADO");
            int area = medida * medida;
            System.out.println("AREA " + area);
        } else if (lados == 5) {
            System.out.println("PENTAGONO");
        } else {
            System.out.println("FIGURA DESCONHECIDA");
        }

    }
}