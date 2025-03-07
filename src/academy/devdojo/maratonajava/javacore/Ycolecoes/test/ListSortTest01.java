package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {

    public static void main(String[] args) {

        List<String> jogos = new ArrayList<>(6);

        jogos.add("Red Dead Redemption");
        jogos.add("The Legend of Zelda");
        jogos.add("Resident Evil");
        jogos.add("Metal Gear");
        jogos.add("Call of Duty");

        for(String jogo: jogos){
            System.out.println(jogo);
        }
        System.out.println("------------");

        Collections.sort(jogos);

        /*

        */

        for(String jogo: jogos){
            System.out.println(jogo);
        }
        System.out.println("------------");

        List<Double> dinheiros = new ArrayList<>();

        dinheiros.add(99.10);
        dinheiros.add(9.50);
        dinheiros.add(18.90);
        dinheiros.add(49.90);
        dinheiros.add(1.99);
        dinheiros.add(4.89);

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

    }
}
