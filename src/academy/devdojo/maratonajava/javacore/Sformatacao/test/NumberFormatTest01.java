package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {


        // internacionalização: numeros
        NumberFormat[] nfa = new NumberFormat[4];

        /* A classe NumberFormat em Java é usada para formatar e exibir
           números (como valores monetários, porcentagens, etc.) de acordo
           com a localização (idioma e país) do usuário. */

        Locale localeALE = Locale.GERMAN;
        Locale localeJP = Locale.JAPAN;
        Locale localeCA = Locale.CANADA;

        /* constantes da classe Locale, cada uma representa um pais */

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeALE);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeCA);

        double valor = 3_359.8301;

        for (NumberFormat numberFormat: nfa){
            numberFormat.setMaximumFractionDigits(1);
            System.out.println(numberFormat.format(valor));
        }

        /* o metodo setMaximumFractionDigts() defini quantos numeros da casa pos ponto
           serão exebidos */

        String valorString = "3_359.8301";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
