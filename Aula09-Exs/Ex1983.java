import java.util.Scanner;

public class Ex1983 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int matricula;
        float nota;

        int matriculaMelhor = 0;
        float maiorNota = 0;

        while (n > 0) {
            System.out.println("Informe a matricula e a nota:");
            matricula = in.nextInt();
            nota = in.nextFloat();
            System.out.println("COMPARANDO COM  " + maiorNota);

            if (nota > maiorNota) {
                System.out.println("ENTREI NO IF.. ATUALIZANDO ESTUDANTE");
                maiorNota = nota;
                matriculaMelhor = matricula;
            }

            n--;
        }

        if (maiorNota < 8) {
            System.out.println("MINIMUM NOTE NOT REACHED");
        } else {
            System.out.println("A MAIOR NOTA " + maiorNota);
            System.out.println("DA PESSOA " + matriculaMelhor);
        }
    }
}