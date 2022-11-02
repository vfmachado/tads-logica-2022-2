import java.util.Random;    
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Random r = new Random();
        // r.nextInt(100); // sorteia um valor de 0 a 99
        int[][] cartela = new int[5][5];

        // PREENCHIMENTO
        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                
                int aleatorio = r.nextInt(100);
                boolean temValor = false;
                for (int linpreenchida = 0; linpreenchida <= lin; linpreenchida++) {
                    int colunaLinhaAtual = 4;
                    if (linpreenchida == lin) {
                        colunaLinhaAtual = col;
                    }
                    for (int colpreenchida = 0; colpreenchida <= colunaLinhaAtual; colpreenchida++) {
                
                        if (cartela[linpreenchida][colpreenchida] == aleatorio) {
                            temValor = true;
                            break;
                        }
                    }
                }

                if (temValor == false) {
                    cartela[lin][col] = aleatorio; 
                } else {
                    col--;
                }
            }            

        }



        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(cartela[i][j] + "  ");
            }
            System.out.println();
        }

        
    }
}