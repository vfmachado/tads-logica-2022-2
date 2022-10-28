import java.util.Scanner;

public class Matrizes01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[][] notas = new float[5][4];

        // preencher a matriz - vamos digitar apenas 3 notas, e a quarta será calculada;
        for (int quantAlunos = 0; quantAlunos < 5; quantAlunos++) {
            // perguntar as 3 notas;
            System.out.println("Informe as notas d@ alun@ " + (quantAlunos+1) + ":");

            float media = 0;
            for (int quantNotas = 0; quantNotas < 3; quantNotas++) {
                float valor = in.nextFloat();
                media = media + valor;
                notas[quantAlunos][quantNotas] = valor;
            }
            notas[quantAlunos][3] = media/3;
            System.out.println(notas[quantAlunos][3]);
        }


        // mostrar a matriz resultante
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(notas[i][j] + "  ");
            }
            System.out.println();
        }
    }
}