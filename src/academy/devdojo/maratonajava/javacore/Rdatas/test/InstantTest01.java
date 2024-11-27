package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();

        /* A classe Instant em Java faz parte do pacote java.time
           e representa um instante específico na linha do tempo */

        System.out.println(now);
        System.out.println(LocalDateTime.now());

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());

        /* Retorna o número de segundos desde o Epoch (1º de janeiro de 1970).

           Retorna a parte de nanosegundos do instante atual.

           Esta classe não é muito usada */
    }
}
