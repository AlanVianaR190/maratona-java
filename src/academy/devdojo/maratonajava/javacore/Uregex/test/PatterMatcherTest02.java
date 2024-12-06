package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {

        /* metacaracter

           \d = todos os digitos
           \D = tudo que não for digito
           \s = espaços em branco ; podem ser tambem (\t \n \f \r)
           \S = todo os caracteres excluindo os brancos
           \w = a-z, A-Z, digitos, _
           \W = tudo o que não for incluso no \w */

        String regex = "\\W";

        String texto1 = "abaaba";

        String texto2 = "@#hh_j2 12gvh21";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:     "+texto2);
        System.out.println("indice:    0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+"\n");
        }
    }
}
