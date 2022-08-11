public class ExemploVar {

                            // S maiusculo
    public static void main(String[] args) {
        
        System.out.println("Isto funciona!!");
        
        // declarando uma variavel
        // TIPO NOME;
        // TIPO => int, float, double, String, char, boolean, short, byte, long, ...
        // NOME => O/A DONO(A) DO COD QUE ESCOLHE
        int numero;

        // atribuicao, colocar um valor no espaço de memória. NOTEM QUE: o nome da variavel é sempre o mesmo, o endereco neste caso também, o conteúdo é que muda
        numero = 123;

        // System => sistema
        // out => saida
        // print => escreva / imprima
        // ln => uma nova linha no final
        System.out.println("O valor da variavel numero eh ");
        System.out.println(numero);

        // A letra `+` fora das aspas JUNTA / CONCATENA o texto.
        System.out.println("este eh meu texto, e \n\t " + numero + " este é meu numero");

        // declarar e atribuir um unico comando
        int numero2 = 10;

    }
}