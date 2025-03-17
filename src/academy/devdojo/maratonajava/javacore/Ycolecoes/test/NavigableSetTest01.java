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

class GamePrecoComparator implements Comparator<Game> {

    @Override
    public int compare(Game o1, Game o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());

        Smartphone smartphone = new Smartphone("123", "Samsung");

        set.add(smartphone);

        System.out.println(set);

        NavigableSet<Game> jogos = new TreeSet<>(new GamePrecoComparator());

        jogos.add(new Game(2L, "Red Dead Redemption", 59.90, 2));
        jogos.add(new Game(4L, "Metal Gear", 19.90, 8));
        jogos.add(new Game(1L, "The Legend of Zelda", 19.90, 16));
        jogos.add(new Game(5L, "Call of Duty", 9.90, 0));
        jogos.add(new Game(3L, "Resident Evil", 29.90, 12));

        for (Game jogo: jogos){
            System.out.println(jogo);
        }
        System.out.println("------------");

        /*
        NavigableSet é uma interface que fornece métodos para navegar em uma coleção ordenada.

        TreeSet é uma implementação de NavigableSet que armazena elementos em uma árvore
        balanceada, garantindo ordenação e operações eficientes.
        */

        /*
        for (Game jogo: jogos.descendingSet()){
            System.out.println(jogo);
        }
        System.out.println("------------");

        O método descendingSet() retorna uma visão reversa de um conjunto ordenado, permitindo
        que você acesse os elementos em ordem decrescente.

        */

        Game mario = new Game(7L, "Super Mario", 59.90, 30);

        System.out.println(jogos.lower(mario));
        System.out.println(jogos.floor(mario));
        System.out.println(jogos.higher(mario));
        System.out.println(jogos.ceiling(mario));

        System.out.println(jogos.size());
        System.out.println(jogos.pollLast());
        System.out.println(jogos.size());

        /*
        .lower() - Retorna o maior elemento no conjunto que é estritamente menor que o elemento especificado
        .floor() - Retorna o maior elemento no conjunto que é menor ou igual ao elemento especificado
        .higher() - Retorna o menor elemento no conjunto que é estritamente maior que o elemento especificado
        .ceiling() - Retorna o menor elemento no conjunto que é maior ou igual ao elemento especificado
        .size() - Retorna o número de elementos no conjunto.
        .pollLast() - Remove e retorna o último elemento do conjunto (o maior elemento).
        .size() & .pollLast() - Retorna o novo número de elementos no conjunto após a remoção do último elemento.
        */

    }
}
