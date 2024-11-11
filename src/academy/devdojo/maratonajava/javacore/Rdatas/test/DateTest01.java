package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        /* a classe date trabalha com milisegundos por isso ela utiliza long */

        System.out.println(date.getTime());

        /* ao utilizar o metodo .getTime() temos os milisegundos */

    }
}
