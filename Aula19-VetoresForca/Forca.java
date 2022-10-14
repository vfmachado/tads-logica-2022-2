import java.util.Scanner;
import java.io.File;
import java.util.Random;

public class Forca {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        File meuArquivo = new File("palavras.txt");
        Scanner leitorArquivo = new Scanner(meuArquivo);

        String[] todasPalavras = new String[150];
        for (int i = 0; i < todasPalavras.length; i++) {
            todasPalavras[i] = leitorArquivo.nextLine().toUpperCase();
            // System.out.println(todasPalavras[i]);
        }    
    
        int vidas = 5;
        Random aleat = new Random();
        int posAleatoria = aleat.nextInt(150);
        String palavra = todasPalavras[posAleatoria];

        String letrasUtilizadas = "";
        // criar um vetor do tamanho da palavra, incializado com false
        boolean[] mostraLetra = new boolean[palavra.length()];

        for (int i = 0; i < mostraLetra.length; i++) {
            mostraLetra[i] = false;
        }
        
        while (vidas > 0) {
            System.out.print("\n QUE LETRA VC QUER TENTAR? ");
            char letraDigitada = in.next().toUpperCase().charAt(0);
            letrasUtilizadas += "  " + letraDigitada;

            boolean temLetra = false;
            for (int i = 0; i < mostraLetra.length; i++) {
                if (palavra.charAt(i) == letraDigitada) {
                    mostraLetra[i] = true;
                    temLetra = true;
                }
            }

            if (!temLetra) vidas--;

            System.out.println("\nVIDAS: " + vidas); 
            for (int i = 0; i < mostraLetra.length; i++) {
                if (mostraLetra[i]) {
                    System.out.print(" " + palavra.charAt(i));
                } else {
                    System.out.print(" _");
                }
            }
            System.out.println();
            System.out.println("Letras utilizadas: " + letrasUtilizadas);

            boolean ganhou = true;
            for (int i = 0; i < mostraLetra.length; i++) {
                if (mostraLetra[i] == false) {
                    ganhou = false;
                    break;
                }
            }
            if (ganhou) break;
        }

        if (vidas > 0)
            System.out.println("FINALMENTE, VC TEM UMA MENTE BRILHANTE");
        else {
            System.out.println("NAO DEU PRA TI!!!");
            System.out.println("SORTEEI A POSICAO " + posAleatoria);
            System.out.println("COM A PALAVRA " + palavra);
        }
    }
}