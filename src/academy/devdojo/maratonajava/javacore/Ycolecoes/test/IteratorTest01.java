package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {

        List<Game> jogos = new ArrayList<>();

        jogos.add(new Game(2L, "Red Dead Redemption", 59.90, 2));
        jogos.add(new Game(4L, "Metal Gear", 19.90, 8));
        jogos.add(new Game(1L, "The Legend of Zelda", 19.90, 16));
        jogos.add(new Game(5L, "Call of Duty", 9.90, 0));
        jogos.add(new Game(3L, "Resident Evil", 29.90, 12));

        /* forma errada de remover um item

        for (Game jogo: jogos){
            if (jogo.getQuantidade() == 0){
                jogos.remove(jogo);
            }
        }*/

        // metodo iterativo
        Iterator<Game> jogoIterator = jogos.iterator();
        while (jogoIterator.hasNext()){
            if (jogoIterator.next().getQuantidade() == 0){
                jogoIterator.remove();
            }
        }
        System.out.println(jogos);

        /*
        Um Iterator é criado para percorrer a lista jogos.

        O método hasNext() verifica se há mais elementos na lista.
        O método next() avança para o próximo elemento e o retorna.

         O método remove() do Iterator é chamado para remover o elemento atual da lista.
        */

        // metodo funcional
        jogos.removeIf(jogo -> jogo.getQuantidade() == 0);
        System.out.println(jogos);

        /*
        O método removeIf() recebe uma expressão lambda que define a condição
        para remoção.
        O método removeIf percorre a lista internamente e remove todos os
        elementos que atendem à condição.
        */
    }
}
