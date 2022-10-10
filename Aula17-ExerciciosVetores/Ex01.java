/*

    v1 = [1, 2, 3, 4]
    v2 = [1, 2, 4, 3]

    v1 == v2 ? false
    posicao 2
    posicao 3

    v1 = [1, 2, 3, 4]
    v2 = [1, 2, 3, 4]

    v1 == v2 ?  true
    os vetores sao iguais
*/

public class Ex01 {
    public static void main(String[] args) {
        
        // ISSO SERIA INPUT DO USUARIO..
        int [] v1 = {1, 2, 3, 4, 5};
        int [] v2 = {1, 2, 9, 2, 5};

        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + "  ");
        }
        System.out.println();

         for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + "  ");
        }
        System.out.println();

        // flag / controle /  salvaInformacao
        //  {1, 2, 3, 4, 5};
        //  {1, 2, 9, 2, 5};
        //            i
        // viguais = false;

        boolean vetoresIguais = true; 
        
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) {
               System.out.println("NA POSICAO " + i + " OS VALORES SAO DIFERENTES");
               vetoresIguais = false;
            }
        }

        if (vetoresIguais) {
            System.out.println("Os vetores sao iguais");
        }
    }
}
