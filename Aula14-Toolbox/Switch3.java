import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mes = in.nextInt();
        switch (mes) {
            case 1: 
            case 2: 
            case 3:
                System.out.println("PRIMEIRO TRIMESTRE"); 
                break;
            case 7: 
            case 8: 
            case 9:
                System.out.println("TERCEIRO TRIMESTRE"); 
                break;
            case 4: 
            case 5: 
            case 6:
                System.out.println("SEGUNDO TRIMESTRE"); 
                break;
            case 10: 
            case 11: 
            case 12:
                System.out.println("QUARTO TRIMESTRE"); 
                break;
            
            default:    // padrao
                // por ser o ultimo nao precisa de break
                System.out.println("NAO EH UM MES VALIDO");
        }
    }
}