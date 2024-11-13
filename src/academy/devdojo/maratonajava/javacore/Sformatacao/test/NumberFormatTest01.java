package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {


        // internacionalização: numeros
        NumberFormat[] nfa = new NumberFormat[4];

        Locale localeALE = Locale.GERMAN;
        Locale localeJP = Locale.JAPAN;
        Locale localeCA = Locale.CANADA;

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeALE);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeCA);

        double valor = 3_359.80;

        for (NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(valor));
        }


    }
}
