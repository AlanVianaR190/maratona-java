package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {

        // string constant poll
        String nome1 = "John";
        String nome2 = "John";

        System.out.println(nome1 == nome2);

        /* para comparar a referencia de um objeto e usado ==, isso
           significa que o espaço de memoria alocado para armazenar "John"
           e o mesmo para as duas variaveis */

        nome1 = nome1.concat(" Marshton");

        System.out.println(nome1);
        System.out.println(nome1 == nome2);

        /* string são imutaveis, por isso o que acontece aqui e que é armazenado
           no pool de strigs "Marshton" para ser concatenado atraves de uma variavel
           para so assim haver uma troca de referencia */

        String nome3 = new String("John");

        System.out.println(nome2 == nome3);

        /* ao criar uma String desta forma resumidamente estamos alocando outro espaço
           de memoria porem fora do pool de strings */

        System.out.println(nome2 == nome3.intern());

        /* o método .intern() retorna uma referência para uma versão única da string no
           pool de strings, que é uma área de memória gerenciada pela JVM para armazenar
           versões únicas de strings

           o método verifica se já existe uma string com o mesmo conteúdo no pool de strings */

    }
}
