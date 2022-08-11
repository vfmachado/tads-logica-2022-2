// importacao
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        // declaracao e instanciacao
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nick = in.next();
        System.out.println("Bem vind@: " + nick);

        // TIPO float => NUMERO REAL (8 CASAS DECIMAIS DE PRECISAO)
        float av1, av2, av3, trab;
        float media;

        System.out.println(nick + " informe as notas das tres avaliacoes");        
        // le um valor real e atribui a variavel av1
        av1 = in.nextFloat();
        av2 = in.nextFloat();
        av3 = in.nextFloat();

        media = (av1 + av2 + av3)/3;
        System.out.println("Sua media das 3 AVS ficou em " + media);

        System.out.println("Informe a nota do trabalho");
        trab = in.nextFloat();
        media = (av1 + av2 + av3 + trab)/4;

        System.out.println("Sua nota com o trabalho ficou em " + media);
    }
}