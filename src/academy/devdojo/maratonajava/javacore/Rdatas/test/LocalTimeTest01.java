package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(23,59,55);
        LocalTime timeNow = LocalTime.now();

        /* A classe LocalTime é usada em Java para representar um
           horário do dia, sem levar em conta a data ou o fuso horário. */

        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        System.out.println(time.get(ChronoField.AMPM_OF_DAY));

        /* ChronoField.AMPM_OF_DAY e uma constanete ela indica se o horário
           está no período da manhã (AM = 0) ou da tarde (PM = 1). */

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

        /* MIN & MAX são constantes da classe LocalTime */

        System.out.println(timeNow);
    }
}
