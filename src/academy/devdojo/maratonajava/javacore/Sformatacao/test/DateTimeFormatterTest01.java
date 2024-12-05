package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        // DateTimeFormatter
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate p1 = LocalDate.parse("20241204", DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(p1);

        //
        LocalDateTime now = LocalDateTime.now();

        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(s4);

        LocalDateTime p2 = LocalDateTime.parse("2024-12-04T19:40:50.5213389", DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(p2);

        //
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String f1 = LocalDate.now().format(formatterBR);

        System.out.println(f1);

        //
        LocalDate pBR = LocalDate.parse("04/12/2024", formatterBR);

        System.out.println(pBR);

        //
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);

        String f2 = LocalDate.now().format(formatterGR);

        System.out.println(f2);

        //
        LocalDate pGR = LocalDate.parse("04.Dezember.2024", formatterGR);

        System.out.println(pGR);

        /* quando for (format) esta transformando um objeto em uma String
           quando for (parse) esta transformando uma String em um objeto */
    }
}
