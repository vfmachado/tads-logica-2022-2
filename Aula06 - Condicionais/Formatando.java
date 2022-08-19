import java.text.DecimalFormat;
import java.math.RoundingMode;

//https://github.com/eduardo-mior/URI-Online-Judge-Solutions/blob/master/Iniciante/URI%202758.java


public class Formatando {
    public static void main(String[] args) {
        double numero = 1234.567890;
        System.out.printf("%.3f\n", numero);

        // EXISTE EM JAVA UMA CLASSE RESPONSAVEL POR FORMATACAO NUMERICA
        // O NOME DESSA CLASSE É DecimalFormat (1.7)
        DecimalFormat df = new DecimalFormat("0.000");
                                    // STRING REPRESENTAR O NOSSO FORMATO
        df.setRoundingMode(RoundingMode.HALF_EVEN);  // FORÇA O ARREDONDAMENTO PARA BAIXO    1.4567 => 1.456
        System.out.println("NUMERO: " + df.format(numero));
    }
}