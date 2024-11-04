package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {

    public static void main(String[] args) {

        Produto produto1 = new Computador("MacBook", 8000);

        /* o objeto e uma SUBclasse da variavel de referencia que vem de uma SUPERclasse
           Widening cast: um tipo mis generico faz referencia a um tipo mais especifico. */

        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());

        System.out.println("------------------------");

        Produto produto2 = new Tomate("Tomate Siciliano", 11.99);

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
