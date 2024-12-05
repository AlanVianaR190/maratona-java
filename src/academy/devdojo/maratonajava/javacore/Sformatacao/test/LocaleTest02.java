package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        /* usando o Locale.getDefault() é possivel verificar o idioma
           o sistema metrico, sistema monetario configurado no computador */

        String[] isoPaises = Locale.getISOCountries();
        String[] isoIdiomas = Locale.getISOLanguages();

        /* o método .getISOCountries retorna um array de strings contendo os códigos de
           países que seguem o padrão ISO 3166-1 alpha-2.

           o metodo .getISOLanguages retorna um array de strings contendo os códigos de
           idiomas que seguem o padrão ISO 639-1. */

        for (String pais: isoPaises){
            System.out.print(pais+" ");
        }

        System.out.println(" ");

        for (String idioma: isoIdiomas){
            System.out.print(idioma+" ");
        }
    }
}
