import java.util.Scanner;
public class L4Ex23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double massa = in.nextDouble();
        int tempo = 0;
        while (massa > 0.1) {
            double perdeu = massa * 0.25;
            massa = massa - perdeu;
            // massa = massa * 0.75;
            tempo = tempo + 30;
            System.out.println("MASSA: " + massa);
            System.out.println("TEMPO: " + tempo);
        }

        System.out.println("FORAM NECESSARIOS " + tempo + " SEGUNDOS PARA QUE A MASSA SE TORNASSE MENOR QUE 0.1");
    }
}