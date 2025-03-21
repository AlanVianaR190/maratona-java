package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest03 {
    public static void main(String[] args) {

        /* metacaracter

           \d = todos os digitos
           \D = tudo que não for digito
           \s = espaços em branco ; podem ser tambem (\t \n \f \r)
           \S = todo os caracteres excluindo os brancos
           \w = a-z, A-Z, digitos, _
           \W = tudo o que não for incluso no \w */

        /* [] = usados para criar classes de caracteres, ou especificar um conjunto de caracteres


         */

        String regex = "[a-zA-C]";

        String regex1 = "0[xX][0-9a-fA-F]";

        String texto1 = "abaaba";

        String texto2 = "12 0X 0X 0XFFABC 0X109 0X1";

        Pattern pattern = Pattern.compile(regex1);

        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:     "+texto2);
        System.out.println("indice:    0123456789");
        System.out.println("regex "+regex1);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+"\n");
        }

        // numero hexadecimal
        //int numeroHex = 0X59F86A;
    }
}
