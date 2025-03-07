package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameSortTest01 {

    public static void main(String[] args) {

        List<Game> jogos = new ArrayList<>();

        /* criando um objeto diretamente no metodo .add */

        jogos.add(new Game(2L, "Red Dead Redemption", 59.90));
        jogos.add(new Game(4L, "Metal Gear", 19.90));
        jogos.add(new Game(1L, "The Legend of Zelda", 19.90));
        jogos.add(new Game(5L, "Call of Duty", 9.90));
        jogos.add(new Game(3L, "Resident Evil", 29.90));

        for (Game jogo: jogos){
            System.out.println(jogo);
        }
        System.out.println("------------------");

        Collections.sort(jogos);
        for (Game jogo: jogos){
            System.out.println(jogo);
        }
        System.out.println("------------------");

    }
}
