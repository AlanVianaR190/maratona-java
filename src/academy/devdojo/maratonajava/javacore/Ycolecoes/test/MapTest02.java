package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Game;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Arthur");
        Consumidor consumidor2 = new Consumidor("John");

        Game jogo1 = new Game(2L, "Red Dead Redemption", 59.90);
        Game jogo2 = new Game(4L, "Metal Gear", 19.90);
        Game jogo3 = new Game(1L, "The Legend of Zelda", 19.90);
        Game jogo4 = new Game(5L, "Call of Duty", 9.90);
        Game jogo5 = new Game(3L, "Resident Evil", 29.90);

        Map<Consumidor, Game> consumidorDoJogo = new HashMap<>();

        consumidorDoJogo.put(consumidor1, jogo5);
        consumidorDoJogo.put(consumidor2, jogo3);

        for (Map.Entry<Consumidor, Game> entry: consumidorDoJogo.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
