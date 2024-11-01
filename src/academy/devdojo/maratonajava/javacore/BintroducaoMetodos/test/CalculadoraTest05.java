package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {

        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(6,7,8,9);

        /* a vantagem dos varArgs e que ele transforma os parametro passado em um array,
           tambem pode ser passado um array */
    }
}
