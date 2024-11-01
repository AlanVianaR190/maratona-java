package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        /* Valores padrões de inicialização:

           byte, short, int, long, float & double: 0
           char: '\u0000' ' '
           boolean: false
           String: null */

        String[] nomes = new String[4];
        nomes[0] = "John";
        nomes[1] = "Arthur";
        nomes[2] = "Jack";
        nomes[3] = "Dutch";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        /* .lenght e um atributo que representa o tamanho do array */

        nomes = new String[4];

        /* não e possivel alterar o tamanho de um array dinamicamente,
           ao criar um novo objeto com o mesmo nome do anterior este é excluido automaticamente pelo java */

    }
}
