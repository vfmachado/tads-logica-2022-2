public class Ex03 {
    public static void main(String[] args) {

        String[][] jogos = {
            {"bra", "ita"},
            {"ita", "jap"},
            {"ale", "jap"},
            {"bra", "ale"},
        };

        int[] resultados = { 1, 1, 2, 1 };

        String[] times = {"bra", "ita", "jap", "ale"};
        int[] pontos = new int[times.length];

        // para cada jogo, verifica o resultado e busca a posicao no vetor de times
        for (int jogo = 0; jogo < jogos.length; jogo++) {
            int resultado = resultados[jogo];
            switch (resultado) {
                case 0:
                    for (int i = 0; i < times.length; i++) {
                        if (times[i] == jogos[jogo][0] || times[i] == jogos[jogo][1]) {
                            pontos[i]++;
                        }
                    }
                    break;

                case 1: 
                    for (int i = 0; i < times.length; i++) {
                        if (times[i] == jogos[jogo][0]) {
                            pontos[i] += 3;
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < times.length; i++) {
                        if (times[i] == jogos[jogo][1]) {
                            pontos[i] += 3;
                        }
                    }
                    break;
            }
        }

        // times e pontos   
        int maiorPos = 0;
        for (int i = 0; i < times.length; i++) {
            System.out.println(times[i] + " - " + pontos[i]);
            if (pontos[i] > pontos[maiorPos]) {
                maiorPos = i;
            }
        }

        // maior pontuacao
        System.out.println("PARABENS PARA O TIME CAMPEAO " + times[maiorPos]);
    }
}