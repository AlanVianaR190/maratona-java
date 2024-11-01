package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Ronaldinho");
        Jogador jogador2 = new Jogador("Deco");

        Time time1 = new Time("Barcelona");

        jogador1.setTime(time1);
        jogador2.setTime(time1);

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2};

        time1.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador1.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");

        time1.imprime();

        /* a associação multidirecional ocorre porque ambas as classes
           tem referencia uma da outra */
    }
}
