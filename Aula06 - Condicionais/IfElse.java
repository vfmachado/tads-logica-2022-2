import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        String bebida;
        // SE, DADO UM VALOR LOGICO (VERDADEIRO), EXECUTE
        // if (condicao ou valor logico) {
            // QLQR BLOCO DE CODIGO
        //}
            
        // E DEPOIS SEGUE A VIDA
        
        System.out.println("O que vc quer comprar? (refri ou cerveja");
        bebida = in.next();

        if (bebida.equals("cerveja")) {
            System.out.println("Informe a sua idade");
            idade = in.nextInt();

            if (idade >= 18) {
                System.out.println("CERVEJA SERVIDA");
            } else {    // eh o oposto do IF
                System.out.println("SINTO MUITO, NAO SERA POSSIVEL");
            }
        }

        if (bebida.equals("refri")) {
            System.out.println("Coca ou guarana?");
        }

        // !  => NAO / NEGACAO
        // && =>  E / CONJUNCAO
        // || => OU / DISJUNCAO
        if (!bebida.equals("refri") && !bebida.equals("cerveja")) {
            System.out.println("EU SOU UM COMPUTADOR, tu tens que digitar refri ou cerveja, em minusculo");
        }

    }
}