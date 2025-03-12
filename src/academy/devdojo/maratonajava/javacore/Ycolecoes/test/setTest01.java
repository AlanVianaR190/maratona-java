package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Game;

import java.util.*;

public class setTest01 {
    public static void main(String[] args) {

        Set<Game> jogos = new HashSet<>();

        jogos.add(new Game(2L, "Red Dead Redemption", 59.90, 2));
        jogos.add(new Game(4L, "Metal Gear", 19.90, 8));
        jogos.add(new Game(1L, "The Legend of Zelda", 19.90, 16));
        jogos.add(new Game(5L, "Call of Duty", 9.90, 0));
        jogos.add(new Game(3L, "Resident Evil", 29.90, 12));

        for (Game jogo: jogos){
            System.out.println(jogo);
        }

        /*
        A interface Set é uma coleção que não permite elementos duplicados, ela modela a
        ideia matemática de um conjunto. Herda da interface Collection e define métodos
        para adicionar, remover e verificar a presença de elementos.

        HashSet é uma das implementações mais comuns da interface Set, ela armazena os
        elementos em uma tabela hash, o que permite operações de adição, remoção e busca
        em tempo constante (O(1)) na maioria dos casos.
        */

    }
}
