package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "John Marshton";
        nome.concat(" Gang");
        nome.substring(0,2);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("John Marshton");
        sb.append(" North").append(" Gang");
        sb.substring(0,3);
        sb.reverse();
        sb.reverse();
        sb.delete(0,5);
        System.out.println(sb);

        /* Strings são imutaveis ao manipular uma string esta criando uma
           nova string na memoria.

           StringBuilder ao manipular uma atraves de seus metodos esta manipulando
           a mesma criada dentro do objeto de memoria

           E necessario saber se esta retornando uma String ou StringBuilder */
    }
}
