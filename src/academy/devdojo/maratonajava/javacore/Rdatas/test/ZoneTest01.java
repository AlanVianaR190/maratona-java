package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {

        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);

        System.out.println(ZoneId.systemDefault());

        /* o  metodo systemDefault identifica a zona do sistema opearacional se
           encontra */

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);

        /* a classe ZonedDateTime é usado quando você precisa trabalhar
           com fusos horários específicos, que podem incluir ajustes como
           horário de verão */

        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");

        /* a classe ZoneOffset é usado quando você precisa trabalhar com um
           deslocamento simples em vez de uma zona completa */

        OffsetDateTime offsetDateTime = now.atOffset(offSetManaus);

        /* a classe OffsetDateTime é útil para armazenar ou transmitir data
           e hora com um deslocamento específico

            o metodo .atOffset() combina a data/hora com o deslocamento
            indicado (exemplo: -04:00) para criar um OffsetDateTime */

        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, offSetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(offSetManaus);
        System.out.println(offsetDateTime2);
    }
}
