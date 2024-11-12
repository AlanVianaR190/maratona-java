package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {

        Date date = new Date();

        /* A classe Date representa uma data e hora em milissegundos desde
           1º de janeiro de 1970, mas é limitada e obsoleta. Já a classe Calendar
           permite manipular cada parte da data (ano, mês, dia, hora, etc.) e ajustar
           o fuso horário, oferecendo mais controle. */

        System.out.println(date);

        /* a classe date trabalha com milisegundos por isso ela utiliza long */

        System.out.println(date.getTime());

        /* ao utilizar o metodo .getTime() temos os milisegundos */

    }
}
