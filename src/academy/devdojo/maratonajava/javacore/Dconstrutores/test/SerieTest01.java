package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {

        Serie serie1 = new Serie("Breaking Bad", "Policial", 63, "Netflix", 2016);

        serie1.imprime();
    }
}
