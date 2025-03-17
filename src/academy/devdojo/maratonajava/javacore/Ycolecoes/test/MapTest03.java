package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Arthur");
        Consumidor consumidor2 = new Consumidor("John");

        Game jogo1 = new Game(2L, "Red Dead Redemption", 59.90);
        Game jogo2 = new Game(4L, "Metal Gear", 19.90);
        Game jogo3 = new Game(1L, "The Legend of Zelda", 19.90);
        Game jogo4 = new Game(5L, "Call of Duty", 9.90);
        Game jogo5 = new Game(3L, "Resident Evil", 29.90);

        List<Game> comprasJogador1 = List.of(jogo3, jogo1, jogo5);
        List<Game> comprasJogador2 = List.of(jogo5, jogo4, jogo1);

        Map<Consumidor, List<Game>> consumidores = new HashMap<>();

        consumidores.put(consumidor1, comprasJogador1);
        consumidores.put(consumidor2, comprasJogador2);

        for (Map.Entry<Consumidor, List<Game>> entry: consumidores.entrySet()){
            System.out.println(entry.getKey().getNome() + ": ");
            for (Game jogosComprados: entry.getValue()){
                System.out.println("---" + jogosComprados.getNome());
            }
        }
        System.out.println("--------------------------------------");

        /*
        Esse código está iterando sobre um Map onde:
        A chave é um objeto do tipo Consumidor.
        O valor é uma lista de objetos do tipo Game.

        Loop externo: Itera sobre cada consumidor e sua lista de jogos.
        entry.getKey().getNome(): Obtém e imprime o nome do consumidor.
        Loop interno: Itera sobre a lista de jogos do consumidor.
        jogosComprados.getNome(): Obtém e imprime o nome de cada jogo.
        */

        // metodo foreach, melhor metodo visto
        consumidores.forEach((consumidor, jogos) -> {
            System.out.println(consumidor.getNome() + ": ");
            jogos.forEach(jogo -> System.out.println("---" + jogo.getNome()));
        });
    }
}
