// NAO ESQUECER, É TIPO "COLOCAR NA CAIXA DE FERRAMENTAS PARA UTILIZAR MAIS TARDE"
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        // incluir o scanner como uma variavel de nome in
        // escaneia a entrada padrão do sistema (System.in)
        // entrada padrao = teclado
        Scanner in = new Scanner(System.in);
        int idade;

        System.out.println("Qual a sua idade?");

        // le o valor do proximo inteiro da entrada
        // e atribui na variavel idade
        idade = in.nextInt();

        int idadeDaqui10Anos = idade + 10;
        System.out.println("Daqui a 10 anos vc tera " + idadeDaqui10Anos);

        System.out.println("Qual a idade da sua mae?");
        int idadeMae = in.nextInt();

        int idadeMaeQdNasci = idadeMae - idade;
        System.out.println("Sua mae tinha " + idadeMaeQdNasci + " quando vc nasceu");
    }
}