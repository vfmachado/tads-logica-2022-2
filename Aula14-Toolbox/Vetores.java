/*
    EH A PRIMEIRA ESTRUTURA DE DADOS UTILIZADA POR QUEM PROGRAMA;
    SÃO VARIAVEIS QUE PERMITEM AMARZENAR MULTIPLOS VALORES

    EM JAVA: SAO HOMOGENEOS, DO MESMO TIPO
     SEMPRE EXISTE ASSOCIADO AO VETOR UM TAMANHO
     E A PRIMEIRA POSICAO DE QLQR VETOR É 0 (ZERO)

     atencao: nao é possivel acessar todos elementos ao mesmo tempo, nem somar, multiplicar, mostrar, ou qlqr coisa... as operações acontecem sempre de valor em valor

*/
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o tamanho");
        int tamanho = in.nextInt();
        double notas[] = new double[tamanho];
        System.out.println("Informe as notas");
        for (int i = 0; i < tamanho; i++) {
            notas[i] = in.nextDouble();
        }
    
        for (int i = 0; i < tamanho; i++) {
            System.out.println(" NA posicao " + i + " tem o valor " + notas[i]);
        }
    }
}