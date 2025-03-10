package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        GameByIdComparator gameByIdComparator = new GameByIdComparator();

        List<Game> jogos = new ArrayList<>();

        jogos.add(new Game(2L, "Red Dead Redemption", 59.90));
        jogos.add(new Game(4L, "Metal Gear", 19.90));
        jogos.add(new Game(1L, "The Legend of Zelda", 19.90));
        jogos.add(new Game(5L, "Call of Duty", 9.90));
        jogos.add(new Game(3L, "Resident Evil", 29.90));

        // Collections.sort(jogos)
        jogos.sort(gameByIdComparator);

        for (Game jogo: jogos){
            System.out.println(jogo);
        }

        Game gameToSearch = new Game(5L, "Call of Duty", 9.90);

        System.out.println(Collections.binarySearch(jogos, gameToSearch, gameByIdComparator));

        /*
        O método binarySearch() da classe Collections é usado para encontrar a posição de um elemento em uma lista ordenada.

        Parâmetros:
        list: A lista onde a busca será realizada.
        key: O elemento que você está procurando.
        c: Um comparador que define a ordem dos elementos na lista.

        Se o elemento for encontrado, retorna o índice do elemento na lista. Se o elemento não for encontrado, retorna um
        valor negativo que indica a posição onde o elemento deveria estar (útil para inserção ordenada).
        */

    }
}
