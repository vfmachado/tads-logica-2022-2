import java.util.Scanner;
public class ConversaoGraus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float celsius, fahrenheit;

        System.out.print("Informe os graus em fahrenheit: ");
        
        fahrenheit = in.nextFloat();
        celsius = (fahrenheit -32)/9 * 5;
        
        System.out.printf("O resultado em celsius e : %.1f\n", celsius);

    }
}