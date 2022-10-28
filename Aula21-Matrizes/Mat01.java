public class Mat01 {
    public static void main(String[] args) {
        String[][] m = new String[4][6];
        // String[][] nomeNaSala = new String[4][6];
        String[][] nomeNaSala = m;

        System.out.println(nomeNaSala);
        nomeNaSala[0][0] = "Leticia";
        nomeNaSala[0][1] = "Maryene";
        nomeNaSala[0][2] = "Felipe";
        nomeNaSala[0][3] = "Fred";
        nomeNaSala[0][4] = "Vini";
        nomeNaSala[0][5] = "Manu";

        // nomeNaSala[2][0] = "";
        nomeNaSala[2][1] = "Alex";
        nomeNaSala[2][2] = "Afonso";
        nomeNaSala[2][3] = "John";
        nomeNaSala[2][4] = "Jaime";
        nomeNaSala[2][5] = "Jefferson";

        for (int lin = 0; lin < nomeNaSala.length; lin++) {
            for (int col = 0; col < nomeNaSala[lin].length; col++) {
                String resultado = 
                    nomeNaSala[lin][col] == null
                    ? "VAZIO  " // teste for true
                    : nomeNaSala[lin][col] + "  "; // teste for false
                System.out.print(resultado);
            }
            System.out.println();
        }
       
    }
}