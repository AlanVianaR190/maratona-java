package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {


        // internacionalização: numeros
        NumberFormat[] nfa = new NumberFormat[4];

        Locale localeALE = Locale.GERMAN;
        Locale localeJP = Locale.JAPAN;
        Locale localeCA = Locale.CANADA;

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeALE);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeCA);

        double valor = 3_359.830;

        for (NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        /* */

    }
}
