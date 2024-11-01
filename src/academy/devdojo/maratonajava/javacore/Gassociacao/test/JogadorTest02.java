package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Ronaldo");

        Time time1 = new Time("Corinthians");

        jogador1.setTime(time1);

        jogador1.imprime();

        /* a associação unidirecional ocorre porque apenas uma das classe, no caso Jogador
           tem referencia ha classe times

           1 - 1 */

    }
}
