import java.util.Scanner;

public class L02Ex15b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int horaInicial, horaFinal, minutoInicial, minutoFinal, horaTotal, minutoTotal;
        final int HORAS_DIA = 24;
        final int MINUTOS_HORA = 60;
        System.out.print("Informe o horario inicial: ");
        horaInicial = in.nextInt();
        minutoInicial = in.nextInt();

        System.out.print("Informe o horario final: ");
        horaFinal = in.nextInt();
        minutoFinal = in.nextInt();

        int inicio = horaInicial * 60 + minutoInicial;
        int mfinal = horaFinal * 60 + minutoFinal;
        int diferenca = mfinal - inicio;

        if (diferenca < 0) {
            diferenca = diferenca + HORAS_DIA * MINUTOS_HORA;
        }

        horaTotal = diferenca/60;
        minutoTotal = diferenca % 60;
        // minutoTotal = diferenca - diferenca/60

        System.out.println("DIFERENCA EM MINUTOS: " + diferenca);
        System.out.printf("%d : %d\n", horaTotal, minutoTotal);
    }
}