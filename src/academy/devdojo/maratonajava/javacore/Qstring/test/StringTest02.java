package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {

        String nome1 = "Arthur";

        System.out.println(nome1.charAt(0));

        /* */

        System.out.println(nome1.length());

        /* */

        System.out.println(nome1.replace("u", "a"));

        /* */

        System.out.println(nome1.toLowerCase());
        System.out.println(nome1.toUpperCase());

        String nome2 = "012345";

        System.out.println(nome2.substring(0,2));

        /* este metodo .substing() retorna uma string de acordo com os indices passados
           como parametros, o segundo paramatro que se refere ao indice final e exclusico,
           ou seja ele não e retornado */

        String nome3 = "     Joel  ";

        System.out.println(nome3);
        System.out.println(nome3.trim());

        /* o metodo .trim() remove os espaços em branco de uma string */
    }
}
