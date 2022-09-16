import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float comprimento, largura, altura;
        System.out.println("Informe as dimensoes, comprimento, largura e altura");
        comprimento = in.nextFloat();
        largura = in.nextFloat();
        altura = in.nextFloat();

        float area = 2 * (comprimento + largura) * altura;
        float caixas = area / 1.5f;

        System.out.println("O TOTAL DE CAIXAS NECESSARIAS EH " + caixas);
    }
}