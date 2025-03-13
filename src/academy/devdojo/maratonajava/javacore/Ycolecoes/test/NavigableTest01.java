package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Game;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());

        Smartphone smartphone = new Smartphone("123", "Samsung");

        set.add(smartphone);

        System.out.println(set);

        NavigableSet<Game> jogos = new TreeSet<>();

        jogos.add(new Game(2L, "Red Dead Redemption", 59.90, 2));
        jogos.add(new Game(4L, "Metal Gear", 19.90, 8));
        jogos.add(new Game(1L, "The Legend of Zelda", 19.90, 16));
        jogos.add(new Game(5L, "Call of Duty", 9.90, 0));
        jogos.add(new Game(3L, "Resident Evil", 29.90, 12));

        for (Game jogo: jogos){
            System.out.println(jogo);
        }

        /*
        NavigableSet é uma interface que fornece métodos para navegar em uma coleção ordenada.

        TreeSet é uma implementação de NavigableSet que armazena elementos em uma árvore
        balanceada, garantindo ordenação e operações eficientes.
        */
    }
}
