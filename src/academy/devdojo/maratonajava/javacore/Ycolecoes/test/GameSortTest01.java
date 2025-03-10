package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class GameByIdComparator implements Comparator<Game> {

    /*
    A interface Comparator é usada para definir ordens personalizadas para uma classe, diferente
    de Comparable ela permite criar múltiplos critérios de ordenação sem modificar a classe original.

    Use Comparator quando a classe não tem uma ordem natural.
    Quando precisa de múltiplos critérios de ordenação.
    Quando não pode modificar a classe original.
    */

    @Override
    public int compare(Game game1, Game game2) {
        return game1.getId().compareTo(game2.getId());
    }
}

/*
A classe GameByIdComparator implementa a interface Comparator<Game>, que é
usada para comparar dois objetos do tipo Game com base em um critério específico.
*/

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

        // Collections.sort(jogos, new GameByIdComparator());
        jogos.sort(new GameByIdComparator());

        for (Game jogo: jogos){
            System.out.println(jogo);
        }
        System.out.println("------------------");
    }
}

/*
Diferenças Entre Comparable e Comparator:

Característica:         Comparable                                  Comparator
Definição:	            Define a ordem natural da classe.	        Define ordens personalizadas.
Método:	                compareTo(T outro)	                        compare(T obj1, T obj2)
Uso:	                Dentro da classe (modifica a classe).	    Fora da classe (não modifica a classe).
Número de Critérios:	Apenas um (ordem natural).	                Múltiplos (diferentes comparadores).
Exemplo de Uso:	        Collections.sort(lista)	                    Collections.sort(lista, comparador)
*/
