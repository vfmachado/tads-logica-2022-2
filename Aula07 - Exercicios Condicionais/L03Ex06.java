import java.util.Scanner;

public class L03Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe os gols do time A e depois do time B");
        int golsA = in.nextInt();
        int golsB = in.nextInt();
        String resultado;

        if (golsA > golsB) {
            resultado = "A Ganhou";
        } else if (golsA < golsB) {
            resultado = "B Ganhou";
        } else {
            resultado = "Empate";
        }

        System.out.println(resultado);
    }
}