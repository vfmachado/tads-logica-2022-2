import java.util.Scanner;

public class L02Ex22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numeroConta;
        float saldo, credito, debito, total;

        System.out.println("Informe o numero da conta, saldo, valores creditados e debitados");
        numeroConta = in.next();

        saldo = in.nextFloat();
        credito = in.nextFloat();
        debito = in.nextFloat();

        total = saldo - debito + credito;

        System.out.println("CLIENTE CONTA " + numeroConta);
        System.out.println("SALDO ATUAL: " + total);
        if (total < 0) {
            System.out.println("SALDO NEGATIVO... ");
        } else {
            System.out.println("SALDO POSITIVO");
        }
    }
}