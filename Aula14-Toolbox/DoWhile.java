/*
    OUTRA ESTRUTURA DE REPETIÇÃO
    É GARANTIDA A PRIMEIRA EXECUCAO
        pq o teste vem no final
*/

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // RECEBA UM VALOR QUE SEJA >= 1 E <= 10
        // CASO O VALOR LIDO SEJA FORA DO INTERVALO, DEVE VALIDAR (REPETIR) 
        // int valor = 0;
        // while (valor < 1 || valor > 10) {
        //     System.out.println("Informe um valor");
        //     valor = in.nextInt();
        // }
        
        int valor;
        do {
            System.out.println("Informe um valor");
            valor = in.nextInt();
        } while (valor < 1 || valor > 10);

    }
}



