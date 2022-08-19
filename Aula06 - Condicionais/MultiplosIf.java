import java.util.Scanner;

public class MultiplosIf {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int idade, valor;
        // CLASSIFICAR UMA PESSOA PARA UM PLANO DE SAUDE DE ACORDO COM A SUA IDADE
        /*
            < 6 ANOS        200
            < 18  ANOS      100
            < 40 ANOS       150
            < 60            250
            >=  60          400
        */

        System.out.print("INSIRA SUA IDADE: ");
        idade = in.nextInt();
        
        if (idade < 6) {
            valor = 200;
        } else if (idade < 18) {
            valor = 100;
        } else if (idade < 40) {
            valor = 150;
        } else if (idade < 60) {
            valor = 250;
        } else {
            valor = 400;
        }
        
        System.out.println("VC VAI PAGAR " + valor);
    }
}