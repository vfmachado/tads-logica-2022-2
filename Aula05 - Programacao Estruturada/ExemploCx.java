import java.util.Scanner;
public class ExemploCx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int comprimentoCx, larguraCx, alturaCx;
        
        int quantComprimento;
        int quantLargura;
        int quantAltura;

        int totalCxs;

        System.out.println("Como vc quer que eu te chame?");
        String usuario = in.next();

        System.out.println(usuario + " bem vindo ao AllInBox");
        System.out.println("Nosso caminhao possui medidas 600 x 200 x 300");
        System.out.println("Qual o tamanho médio das suas caixas, em centimetros?");
        System.out.print("Comprimento: ");
        comprimentoCx = in.nextInt();
        System.out.print("Largura: ");
        larguraCx = in.nextInt();
        System.out.print("Altura: ");
        alturaCx = in.nextInt();

        System.out.println(usuario + " recebemos e estamos processando suas medidas");

        quantComprimento = 600/comprimentoCx;
        quantLargura = 200/larguraCx;
        quantAltura = 300/alturaCx;

        System.out.println("Consigo ver que podemmos colocar " + quantComprimento + " caixas no comprimento caminhao"); 

        totalCxs = quantComprimento * quantAltura * quantLargura;
        System.out.println("Podemos alocar " + totalCxs + " em nosso caminhao, vc deseja fazer marcar o frete?");

        

    }
}