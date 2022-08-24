import java.util.Scanner;

public class L03Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char tipoComb;  // String tipoComb;
        // char => 1 letra
        // String => texto... (pode ser bem grande)

        float quantidade;
        final float PRECO_GASOLINA = 4.3f;
        final float PRECO_ALCOOL = 3.9f;
        float precoCombustivel;
        float desconto;
        float precoTotal;
        System.out.println("Informe o tipo de combustivel e a quantidade desejada");
        tipoComb = in.next().charAt(0);

        if (tipoComb == 'A') {
            precoCombustivel = PRECO_ALCOOL;
        } else {
            precoCombustivel = PRECO_GASOLINA;
        }

        System.out.print("Quantos litros de combustivel? ");
        quantidade = in.nextFloat();

        if (tipoComb == 'A' && quantidade <= 20) {
            desconto = 0.97f;
        } else if (tipoComb == 'A') {
            desconto = 0.95f;
        } else if (tipoComb == 'G' && quantidade <= 20) {
            desconto = 0.96f;
            System.out.println("DESCONTO DE 4% aplicado");
        } else {
            desconto = 0.94f;
        }


        precoTotal = quantidade * precoCombustivel * desconto;
        System.out.printf("TOTAL R$ %.2f\n", precoTotal);
    }
}