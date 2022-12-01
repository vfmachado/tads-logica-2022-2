/*

Crie um programa que instancie uma matriz 10 x 10 de letras (-). Sorteie 10 posições
para, 3 para a letra A, 3 para a letra B, 2 para a letra C e 2 para a letra D, você não
precisa considerar a colisão entre os sorteios. Após isso, o usuário deve informar 10
posições (0-99). Caso os valores nas posições tenham a letra A, B, C ou D, devem ser
somados 1, 2, 6 e 8 pontos respectivamente ao usuário. No final mostrar a
pontuação total do usuário e a matriz....

*/
// https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html
import java.util.*;// java.util.* => importa tudo que tem dentro uti
import java.util.Random;

public class Ex03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char M[][] = new char[10][10];

        for(int i = 0; i < 100; i++){
            M[i/10][i%10] = '-';     
            // lin  (0 - 9) => 0
            //      10 - 19 => 1

            //      col (% de 10) dara um numero de 0 a 9
            //      col % de 10 entre 10 e 19 => dara sempre um numero de 0 a 9
        }

        Random r = new Random();

        char letra = 'A';
        for (int i = 0; i < 10; i++) {

            int linha = r.nextInt(10); 
            int coluna = r.nextInt(10); 

            if (i > 2) letra = 'B';
            if (i > 5) letra = 'C';
            if (i > 7) letra = 'D';
            
            M[linha][coluna] = letra;
            
        }
       
        // O USUARIO INPUTAR 10 POSICOES E SOMARMOS A QUANTIDADE DE PONTOS DE ACORDO COM A LETRA NO LOCAL
         
        int pontuacao = 0;
        
        for(int i = 0; i < 10; i++) {

            System.out.println("Informe um número de 0 a 99:");
            int posicao = in.nextInt(); 
              
            // REFERENCIA PARA LINHA E COLUNA DA MATRIZ?
            int linha = posicao / 10;
            int coluna = posicao % 10;            
           
            // VERIFICAR O QUE TEM LA NA MATRIZ? 
            char letraNaMatriz = M[linha][coluna];
            
            // DIFERENCA PURAMENTE ESTETICA
            // if (letraNaMatriz == 'A') {
            // } else if (letraNaMatriz == 'B') {
            // }
            
            // SOMA ALGUMA PONTUACAO?
            switch (letraNaMatriz) {
                
                case 'A':
                    pontuacao++;
                    break;
                 case 'B':
                    pontuacao+=2;
                    break;
                 case 'C':
                    pontuacao+=6;
                    break;
                 case 'D':
                    pontuacao+=8;
                    break;
                default:
                    System.out.println("OLLLEEEEE");
            }
        }
        
        System.out.println("PONTUACAO FINAL " + pontuacao);
        System.out.println("O CARTAO ERA: ");
        
        // separar a parte final de mostrar matriz
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[i].length;j++){
                System.out.print(M[i][j] + "  ");
            }
            System.out.println();
        }
        
    }
}