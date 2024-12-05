package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjurstersTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 29);

        /* O método with ajusta um campo temporal específico e retorna uma nova instância,
           Ele é imutável, ou seja, o objeto original não é alterado. */

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // usando o TemporalAdjusters
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));

        /* O metodo .previous pega o ultimo dia da semana anterior à data atual. */

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        /* O metodo .next pega o próximo dia da semana após a data atual. */

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());

        /* O metodo .firstDayOfMonth pega o primeiro dia do mês atual. */

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());

        /* O metodo .lastDayOfMonth pega o ultimo dia do mês atual. */

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());

        /* O metodo .firstDayOfNextYear pega o primeiro dia do próximo ano. */

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());

        /* O metodo .firstDayOfNextMonth pega o primeiro dia do próximo mês. */

        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
