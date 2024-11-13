package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        // locale
        Locale localeGermany = new Locale("de", "DE");
        Locale localeDenmark = new Locale("da", "DK");
        Locale localeChina = new Locale("zh", "CN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeUcraine = new Locale("uk", "UA");

        /* A classe Locale no Java é utilizada para representar uma região geográfica
           ou um idioma específico, e é amplamente usada em aplicações que precisam
           oferecer suporte a múltiplos idiomas e configurações regionais. */

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeGermany);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeDenmark);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeChina);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeUcraine);

        System.out.println("Alemanha: "+df1.format(calendar.getTime()));
        System.out.println("Dinamarca: "+df2.format(calendar.getTime()));
        System.out.println("China: "+df3.format(calendar.getTime()));
        System.out.println("Japão: "+df4.format(calendar.getTime()));
        System.out.println("Ucrania: "+df5.format(calendar.getTime()));

        System.out.println(localeGermany.getDisplayCountry());
        System.out.println(localeChina.getDisplayCountry());
        System.out.println(localeJapan.getDisplayCountry());

        /* o metodo .getDisplyCountry mostra o nome do pais instanciado */


    }
}
