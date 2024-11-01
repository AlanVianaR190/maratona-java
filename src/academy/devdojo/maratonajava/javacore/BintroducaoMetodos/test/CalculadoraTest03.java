package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros2(30,0));

        calculadora.imprimeDivisaoDoisNumeros(40,0);

        /* quando e trata de um metodo com retorno e preciso armazenar este retorno */
    }
}
