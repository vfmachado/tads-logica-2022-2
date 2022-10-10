public class Ex05 {
    public static void main(String[] args) {
        float [] v = {7, 2, 7.5f, 6, 9};
        /*
            raiz (
                ( 1 / (n - 1) )
                *
                somatorio (
                    (v[i] - m) * (v[i] - m) 
                    // (4 - 5)ˆ2 = 1
                    // (6 - 5)ˆ2 = 1
                )
            )
        */

        float media = 0;
        for (int i = 0; i < v.length; i++) {
            media += v[i];
        }
        media /= v.length;

        float somatorio = 0;
        for (int i = 0; i < v.length; i++) {
            float diferenca = v[i] - media;
            somatorio +=  diferenca * diferenca;
            // somatorio += Math.pow(diferenca, 2);
        }

        System.out.println("MEDIA " + media);
        System.out.println("SOMATORIO " + somatorio);

        // Math.sqrt => raiz quadrada
        // Math.sqrt(NUMERO); => RETORNA A RAIZ QUADRADA DE UM NUMERO
        // Math.pow(numero, 2); => CALCULA A POTENCIA DE UM NUMERO
        double desvio = Math.sqrt(1.0/(v.length-1) * somatorio);
        System.out.println("DESVIO PADRAO DE " + desvio);   
    }
}