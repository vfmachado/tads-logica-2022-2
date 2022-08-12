import java.util.Scanner;
public class Tipos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // TODA VARIAVEL  EM JAVA É DECLARADA INFORMANDO O TIPO E DEPOIS O NOME
        // int => minusculo
        // nome => varia de acordo com o contexto
        // e nós escolhemos da maneira que acharmos melhor
        int meuNumeroInteiro;
        int idade;
        int numeroComNomeErrado;

        System.out.println("Informe sua idade");
        idade = in.nextInt();   // nextInt() => é um método do Scanner

        //  STRING => TIPO NAO PRIMITIVO
        String cpf;    // nao utiliza int
        String rg;
        System.out.println("Informe seu cpf");
        cpf = in.next();    // next() => le uma palavra

        // flaot double
        float numeroReal;       // in.nextFloat()
        double altaPrecisao;    // in.nextDouble()

        float fDeclarado = 0.2f;       // declarar e instanciar um valor float, eu preciso forcar o float com o f no final do numero

        double meuDouble = 0.2;

        boolean v_ou_f = true;  // false    .nextBoolean()

        char letra = 'A';
        String text = "Um texto qlqr que pode ter qlqr tamanho com qlqr quantidade de linhas.";

    }
}