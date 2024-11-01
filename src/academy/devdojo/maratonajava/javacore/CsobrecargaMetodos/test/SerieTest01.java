package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {

        Serie serie = new Serie();

        serie.init("Breaking Bad", "Policial", 63, "Netflix");

        serie.imprime();
    }
}
