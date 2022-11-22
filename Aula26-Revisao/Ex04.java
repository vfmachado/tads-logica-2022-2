/*

Faça um programa que descriptografe uma string
considerando o encriptador de Caesar, dado uma String s e um valor inteiro x, o
programa deve avançar x posições em letras minúsculas para chegar no texto,
espaços devem ser desconsiderados. Por exemplo, o texto “ykm hyty” com a chave
2 se torna “amo java”

*/

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String texto = "xjl gxsx";
        // String texto = "zz"; // bb
        int chave = 3;  // numero > 0 e < 26

        char[] v = texto.toCharArray();

        // DADO UM VETOR DE CHAR, SOMAR CHAVE EM CADA ELEMENTO E RECONSTRUIR A STRING COM O TEXTO CORRETO
        String convertido = "";

        // percorre o vetor
        for (int i = 0; i < v.length; i++) {

            if (v[i] == ' ') {
                convertido += " ";
                continue;   // pula o restante do codigo dentro do laço, mas segue executando o laço
            }

            // transforma a letra no numero int ascii
            int nro = v[i];

            int indiceLetra = nro+chave;

            if(indiceLetra > 122)
                indiceLetra=indiceLetra - 26; // indiceLetra /= 122
            
            // calcula a nova letra
            char novaLetra = (char) (indiceLetra);

            // concatena no resultado
            convertido += novaLetra; // falta dar a volta 

        }

        int a = 'a';    // ascii 97     primeiro faz um if, se for igual a z, diminui 25
        int z = 'z';    // ascii 122    ultimo
        char letra = (char) a;
        System.out.println(++letra);
        System.out.println(z);
        // y + 2 => a        avançamos duas letras, dando a volta no alfabeto
        // k + 2 => m        avançou duas letras
        // m + 2 => o

        


        System.out.println("Convertido: " + convertido);

    }
}