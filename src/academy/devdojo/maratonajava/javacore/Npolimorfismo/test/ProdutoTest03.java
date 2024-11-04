package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {

        Produto produto1 = new Computador("MacBook", 8000);

        Tomate produto2 = new Tomate("Tomate Siciliano", 11.99);
        produto2.setDataValidade("04/11/2024");

        CalculadoraImposto.calcularImposto(produto1);

        System.out.println("----------------------");

        CalculadoraImposto.calcularImposto(produto2);


    }
}
