package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class DurationTest01 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();

        LocalTime timeMinus7hours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);

        /* A classe Duration em Java é usada para representar um intervalo de tempo
           (ou duração) entre dois pontos na linha do tempo, medido em segundos e
           nanosegundos.

            O método between() da classe Duration é usado para calcular a duração entre

            dois objetos temporais */

        System.out.println(d1);

        Duration d2 = Duration.between(timeNow, timeMinus7hours);

        System.out.println(d2);

        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));

        /* o  metodo plusSeconds() adiciona segundos ao objeto*/

        System.out.println(d3);

        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);

        /* o metodo ofDays() cria uma duração com base em dias
           o metodo ofMinutes() cria uma duração com base em minutos */

        System.out.println(d4);
        System.out.println(d5);
    }
}
