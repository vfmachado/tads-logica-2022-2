import java.util.Scanner;

/*
Ler um vetor com 10 nomes de pessoas, após pedir que o usuário digite
um nome qualquer de pessoa. Escrever a mensagem “ACHEI”, se o nome estiver
armazenado no vetor C ou “NÃO ACHEI” caso contrário. Repita o comportamento
até que o usuário digite a palavra FIM.
*/

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 10;
        System.out.println("Indique o tamanho dos vetores");
        String[] nomes = new String[N];

        System.out.println("Informe os 10 nomes");
        for (int i = 0; i < N; i++) {
            nomes[i] = in.next();
        }
        
        while (true) {
            System.out.println("QUEM PROCURAR?");
            String procurado = in.next();

            if (procurado.equals("FIM")) break;

            boolean achei = false;
            for (int i = 0; i < N; i++) {
                if (nomes[i].equals(procurado)) {
                    System.out.println("ACHEI!!!");
                    achei = true;
                    break;
                }
            }   

            if (!achei) {
                System.out.println("NAO ACHEI...");
            }
        }
    }
}