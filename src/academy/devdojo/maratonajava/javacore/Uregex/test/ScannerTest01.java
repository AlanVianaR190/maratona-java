package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {

        String texto = "John, Arthur, Dutch, true, 200";

        String[] nomes = texto.split(",");

        /* o metodo split() dividi uma String de acordo com o parametro do tipo regex passado,
           e possivel utilizar metacaracters */

        for (String nome: nomes){
            System.out.println(nome.trim());
        }

        /* o metodo trim() retira os espaços vazios */
    }
}
