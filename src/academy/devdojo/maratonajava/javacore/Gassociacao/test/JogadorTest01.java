package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("C. Ronaldo");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Neymar Jr.");

        // arrays com objetos
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}
