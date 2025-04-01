package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Game;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Game> jogos = new PriorityQueue<>(new GamePrecoComparator().reversed());

        jogos.add(new Game(2L, "Red Dead Redemption", 59.90, 2));
        jogos.add(new Game(4L, "Metal Gear", 19.90, 8));
        jogos.add(new Game(1L, "The Legend of Zelda", 19.90, 16));
        jogos.add(new Game(5L, "Call of Duty", 9.90, 0));
        jogos.add(new Game(3L, "Resident Evil", 29.90, 12));

        while(!jogos.isEmpty()){
            System.out.println(jogos.poll());
        }

    }
}
