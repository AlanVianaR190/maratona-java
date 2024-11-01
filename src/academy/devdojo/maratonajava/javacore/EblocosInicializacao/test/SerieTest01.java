package academy.devdojo.maratonajava.javacore.EblocosInicializacao.test;

import academy.devdojo.maratonajava.javacore.EblocosInicializacao.dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {

        Serie serie = new Serie();

        for (int episodio: serie.getEpisodios()){
            System.out.print(episodio+" ");
        }
    }
}
