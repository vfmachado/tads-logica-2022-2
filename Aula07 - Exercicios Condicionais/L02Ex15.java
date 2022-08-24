import java.util.Scanner;

public class L02Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int horaInicial, horaFinal, minutoInicial, minutoFinal, horaTotal, minutoTotal;

        System.out.print("Informe o horario inicial: ");
        horaInicial = in.nextInt();
        minutoInicial = in.nextInt();

        System.out.print("Informe o horario final: ");
        horaFinal = in.nextInt();
        minutoFinal = in.nextInt();

        horaTotal = horaFinal - horaInicial;
        minutoTotal = minutoFinal - minutoInicial;

        if (horaTotal <  0) {
            horaTotal = horaTotal + 24;
        }

        if (minutoTotal < 0) {
            minutoTotal += 60;  // minutoTotal = minutoTotal + 60;
            horaTotal--;    // horaTotal = horaTotal -1;
        }

        System.out.printf("%d : %d\n", horaTotal, minutoTotal);
    }
}