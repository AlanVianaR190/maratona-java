package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest01 {
    public static void main(String[] args) {

        String regex = "aba";

        String texto1 = "abaaba";

        String texto2 = "abababa";

        // classe Pattern (padrão)
        Pattern pattern = Pattern.compile(regex);

        /* representa o padrão da expressão regular, é imutável e pode ser reutilizado */

        // classe Matcher (encontra)
        Matcher matcher = pattern.matcher(texto2);

        /* representa o resultado da aplicação de um Pattern em um texto, é usado
           para encontrar e processar as correspondências no texto */

        System.out.println("texto:     "+texto2);
        System.out.println("indice:    0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start()+ " ");
        }

        /* o metodo .find() procura pela próxima correspondência do padrão definido no texto,
           retorna true se encontrar uma correspondência e false se não houver mais

           o metodo .start() retorna o índice inicial (posição) da correspondência encontrada
           no texto, só pode ser chamado após uma correspondência ser encontrada com o método find() */

        /* Expressões regulares (ou regex)
        são padrões usados para buscar, combinar ou manipular texto.
        Elas permitem identificar e processar padrões específicos em strings,
        como números, palavras, formatos de data, e-mails, entre outros. */
    }
}
