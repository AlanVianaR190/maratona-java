package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest04 {
    public static void main(String[] args) {

        /* metacaracter

           \d = todos os digitos
           \D = tudo que não for digito
           \s = espaços em branco ; podem ser tambem (\t \n \f \r)
           \S = todo os caracteres excluindo os brancos
           \w = a-z, A-Z, digitos, _
           \W = tudo o que não for incluso no \w */

        /* [] = usados para criar classes de caracteres, ou especificar um conjunto de caracteres
           ? = zero ou uma
           * = zero ou mais
           + = uma ou mais
           {n,m} = de n até m
           () = agrupamento

           | = para OU: um exemlo seria o(v|c) aqui é usado o pipe dentro do agrupamento para
           definir ovo OU oco

           $ = fim do texto
        */

        String regex1 = "0[xX]([0-9a-fA-F])+(\\s|$)";

        /* A regex 0[xX]([0-9a-fA-F])+(\\s|$) encontra números hexadecimais que:

           Começam com 0x ou 0X
           São seguidos por um ou mais caracteres válidos em hexadecimal (0-9, a-f, A-F)
           Terminam com um espaço ou no final do texto.
        */

        String texto1 = "12 0X 0X 0XFFABC 0X10G 0X1";

        Pattern pattern = Pattern.compile(regex1);

        Matcher matcher = pattern.matcher(texto1);

        System.out.println("texto:     "+texto1);
        System.out.println("indice:    0123456789");
        System.out.println("regex "+regex1);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+"\n");
        }
    }
}
