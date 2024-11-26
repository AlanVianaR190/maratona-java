package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        System.out.println(new Date());

        System.out.println(Calendar.getInstance());

        System.out.println(Month.DECEMBER.getValue());

        /* aqui estamos pegando o valor de uma constante da classe Mounth */

        LocalDate date = LocalDate.of(2024, Month.DECEMBER, 24);

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());

        /* o metodo .isLeapYear verifica se o ano e bissexto */

        System.out.println(date);

        LocalDate agora = LocalDate.now();

        /* não e possivel usar new com LocalDate porque ela e uma classe imutavel

           A classe LocalDate faz parte da API de datas do Java 8 (java.time) e é
           usada para representar uma data sem hora (somente ano, mês e dia). Ela
           é mais moderna e robusta que as antigas classes como Date e Calendar */

        System.out.println(agora);

    }
}
