/*
    B é subconjunto de A

    * premissas
        nao existem valores repetidos
        a ordem nao tem relevancia


    A = [1, 2, 3, 4, 5];
    B = [1, 2, 3]

        B é subconjunto de A, todos os valores estão contidos.
    
    B = [1, 2, 6]
        B NÃO É SUBCONJUNTO DE A, POIS 6 NAO PERTENCE AO CONJUNTO A

*/

public class Ex02 {
    public static void main(String[] args) {
        int [] A = {5, 4, 3, 10, 2, 1};
        int [] B = {10, 1, 2};

        boolean subconjunto = true;

        for (int ib = 0; ib < B.length; ib++) {
            boolean encontreiBnoA = false;
            
            for (int ia = 0; ia < A.length; ia++) {
                // System.out.println("ESTOU COMPARANDO " + B[ib] + " COM " + A[ia]);
                if (B[ib] == A[ia]) {
                    // System.out.println("ACHOU!!!");
                    encontreiBnoA = true;
                    break;
                }
            }

            if (!encontreiBnoA) {
                subconjunto = false;
                break;
            }
        }

        if (subconjunto) {
            System.out.println("B eh subconjunto de A");
        } else {
            System.out.println("B NAAAAOOOO eh subconjunto de A");
        }
    }
}