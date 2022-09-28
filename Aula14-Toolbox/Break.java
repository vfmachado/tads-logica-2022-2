import java.util.Scanner;
public class Break {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i < 100; i++) {
            System.out.print("i: " + i);
            if (i % 3 == 0 && i % 7 == 0) {
                break;
            }
            System.out.println(" ... ");
        }

        String nome;
        do {    
            System.out.print("Nome: ");
            nome = in.next();

            if (nome.equals("@")) break;    // para todo o laço de repetição

            System.out.print("Idade: ");
            int idade = in.nextInt();

            if (idade < 18) continue;   // o laco de repeticao, mas nao o que está abaixo
        
            System.out.println("FORMULARIO PARA MAIORES");
            System.out.println("Doses de vacina: ");
            int doses = in.nextInt();

            System.out.println("Comorbidades (s/n)");
            String comorbidades = in.next();

            if (comorbidades.equals("s")) {
                System.out.println("Liste: ");
                comorbidades = in.next();
            }

            //menor nao precisa preencher;
        } while (true);

        System.out.println("SEGUE EXECUTANDO O BAILE");
    }
}