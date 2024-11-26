package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        // LocalDate date = LocalDate.of(2024, Month.DECEMBER, 24);
        // LocalTime time = LocalTime.of(23, 59, 55);

        LocalDate date = LocalDate.parse("2024-12-24");
        LocalTime time = LocalTime.parse("23:59:55");

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime lcd1 = date.atTime(time);
        LocalDateTime lcd2 = time.atDate(date);

        System.out.println(lcd1);
        System.out.println(lcd2);
    }
}
