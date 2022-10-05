/*
    NOME DO PRODUTO E PRECO EM DOIS VETORES,
    FAZER COMPRA
    ADD CARRINHO
    FINALIZAR
    LISTAR EXTRATO
*/
import java.util.Scanner;
public class Loja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = {
            "camiseta",
            "calca",
            "bermuda",
            "casaco",
            "jaqueta",
            "meia",
            "chinelo",
            "sandalias",
            "coletes",
            "sapatos"
        };

        float[] precos = {
            59.9f,
            119.9f,
            89.9f,
            169.9f,
            314.9f,
            9.9f,
            19.9f,
            39.9f,
            99.9f,
            199.9f
        };

        System.out.println("BEM VINDO A SUA ROUPA S.A.");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("COD " + i + " - " + nomes[i] + " R$ " + precos[i] );
        }
        float totalCarrinho = 0;
        String extrato = "=============  EXTRATO ============ \n";
        while (true) {
            System.out.print("Digite o cod do produto que deseja adicionar no carrinho: ");
            int cod = in.nextInt();
            if (cod < 0 || cod >= nomes.length) {
                System.out.println("Produto nao identificado");
                System.out.println("Deseja sair? (s/n)");
                String sair = in.next();
                if (sair.equals("s")) break;
                else System.out.println("entao coloque um codigo valido...");
            } else {
                System.out.println(nomes[cod]  + " adicionado com sucesso");
                extrato += nomes[cod] + " R$ " + precos[cod] + "\n";
                totalCarrinho += precos[cod];
                System.out.println("TOTAL R$" + totalCarrinho);
            }
        }

        System.out.println("COMPRA FINALIZADA COM SUCESSO");
        System.out.println(extrato);
        System.out.println("VALOR FINAL R$ " + totalCarrinho);
        System.out.println("===========================================");
    }
}