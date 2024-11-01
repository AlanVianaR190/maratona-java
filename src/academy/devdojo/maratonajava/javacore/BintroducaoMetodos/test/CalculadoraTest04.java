package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        Calculadora calculadora = new Calculadora();

        calculadora.alteraDoisNumeros(a, b);

        System.out.println("Dentro do CalculadoraTeste04: ");
        System.out.println("num1: "+a);
        System.out.println("num2: "+b);

        /* quando e passado uma variavel de tipo primitivo para um metodo, sempre e
           feito uma copia destas variaveis */
    }
}
