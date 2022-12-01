/*
A menor diferença absoluta entre os valores de dois vetores. Faça um programa que
dados dois vetores de qualquer tamanho imputados pelo usuário, processe e retorne
os valores, um de cada vetor, que possuem a menor diferença absoluta.

v1 = [-1, 5, 10, 20, 28, 3]
v2 = [26, 134, 135, 15, 17]

Resultado [28, 26]      
Diferença 2
*/


import java.util.Scanner;
    
public class Ex05 {
    public static void main(String[] args) {
        // instancia scanner
        Scanner in = new Scanner(System.in);
    System.out.println("Informe o tamanho dos vetores 1 e 2 respectivamente");
        // Declarar os vetores
        int tamanhoVet1 = in.nextInt();
        int tamanhoVet2 = in.nextInt();
        
        int[] v1 = new int[tamanhoVet1];
        int[] v2 = new int[tamanhoVet2];
        
        // LER OS VETORES
        System.out.println("Informe os valores do primeiro vetor");
        for (int i = 0; i < tamanhoVet1; i++) {
            v1[i] = in.nextInt();
        }

        System.out.println("Informe os valores do segundo vetor"); 
         for (int i = 0; i < tamanhoVet2; i++) {
            v2[i] = in.nextInt();
        }
        
        
        // COMPARACAO ENTRE CADA UM DOS VALORES DOS VETORES?
        // MOSTRAR TODOS OS PARES DE VALORES POSSIVEIS....
        /*
            [1, 2, 3]
            [4, 5]

            PARES?

            
        */
        int diferenca = 0;
        int menorDiferenca = 0;
        String valores = "";
        for( int i = 0; i < tamanhoVet1; i++){
            for( int j = 0; j < tamanhoVet2; j++){
                // -1 .   -5
                // -1   -   -5  => 4  => . 4 
                // -5   -  - 1  => -4   =>  4 
                diferenca = v1[i] - v2[j];
                if(diferenca < 0) {
                    diferenca *= -1; 
                }

                if(diferenca < menorDiferenca || ( i == 0  && j == 0 )){

                    menorDiferenca = diferenca;
                    valores = " " + v1[i] + ", " +  v2[j];

                }

                // System.out.println(v1[i] + ", " + v2[j] + " => " + diferenca);
                
            }
        }
        System.out.println("A menor diferença entre os elementos dos vetores é: " + menorDiferenca);
        System.out.println("O PAR DE VALORES " + valores);
        // MOSTRAR OS DOIS VALORES E A DIFERENÇA ENTRE ELES
    }
}