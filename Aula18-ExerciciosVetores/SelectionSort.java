public class SelectionSort {
    public static void main(String[] args) {

        int v[] = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        System.out.println("SEU VETOR FICOU ASSIM");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "  ");
        }
        System.out.println();
        
        int pontoInsercao;
        int comparador;
        int posMenor;

        for (pontoInsercao = 0; pontoInsercao < v.length; pontoInsercao++) {
            posMenor = pontoInsercao;
            for (comparador = pontoInsercao+1; comparador < v.length; comparador++) {
                if (v[comparador] < v[posMenor]) {
                    posMenor = comparador;
                }
            }

            System.out.println("Trocando as posicoes " + pontoInsercao + " com " + posMenor);
            int aux = v[pontoInsercao];
            v[pontoInsercao] = v[posMenor];
            v[posMenor] = aux;
            
            System.out.println("SEU VETOR FICOU ASSIM");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "  ");
            }
            System.out.println();
        }

    }
}