import java.util.Scanner;
public class Vetores02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declaracao
        String[] presentes;
        // inicializacao
        presentes = new String[8];

        for (int pos = 0; pos < presentes.length; pos++) {
            System.out.println("QUAL PRESENTE DESEJA ADD NA LISTA");
            presentes[pos] = in.nextLine();    
        }
        
        System.out.println("LISTAGEM COM WHILE");
        int i = 0;
        while (i < presentes.length) {
            if (presentes[i] != null) {
                System.out.println(presentes[i]);
            }
            i++;    
        }
       
       //segue o cod aqui
        System.out.println("\nAGORA COM O FOR");
        for ( i = 0; i < presentes.length; i++) {
            if (presentes[i] != null) {
                System.out.println(presentes[i]);
            }
        }


        System.out.println("QUER VERIFICAR QUAL ITEM?");
        String procurado = in.nextLine();

        boolean achei = false;
        for ( i = 0; i < presentes.length; i++) {
            if (presentes[i].equals(procurado)) {
                System.out.println("TEM NA LISTA NA POSICAO " + i);
                achei = true;
            }
        }

        if (!achei) {
            System.out.println("NAO ACHEI NA LISTA");
        }
    }
}