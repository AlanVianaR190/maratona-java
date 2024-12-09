package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest05 {
    public static void main(String[] args) {

        /* Metacaracteres

           \d  = qualquer dígito (equivale a [0-9])
           \D  = qualquer caractere que NÃO seja dígito
           \s  = espaços em branco (inclui \t, \n, \f, \r e o próprio espaço)
           \S  = qualquer caractere que NÃO seja espaço em branco
           \w  = qualquer caractere alfanumérico (a-z, A-Z, dígitos e _)
           \W  = qualquer caractere que NÃO seja alfanumérico (tudo fora do \w)
        */

        /*
           Outros símbolos importantes:

           []    = define classes de caracteres, ou seja, especifica um conjunto permitido de caracteres
           ?     = zero ou uma ocorrência
           *     = zero ou mais ocorrências
           +     = uma ou mais ocorrências
           {n,m} = de 'n' até 'm' ocorrências
           ()    = agrupamento de subexpressões
           |     = operador OU. Exemplo: o(v|c) encontra "ovo" ou "oco"
           $     = indica o fim do texto ou linha (dependendo do modo)

        */

        String regex1 = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

        /* A regex ([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+ valida endereços de e-mail simples que:

           Parte local (antes do @):
           Contém letras (a-z, A-Z), números (0-9), ponto (.), sublinhado (_) ou hífen (-).
           Deve ter pelo menos um caractere.

           Domínio inicial (após o @):
           Contém apenas letras (a-z, A-Z).
           Deve ter pelo menos uma letra.

           Domínios de nível inferior (após o ponto):
           Começam com um ponto (.).
           Contêm apenas letras (a-z, A-Z).
           Podem se repetir (ex.: .com.br). */

        String texto1 = "john@hotmail.com, 123arthur@gmail.com, #@!dutch@mail.br, teste@gmail.com.br, abgail@mail ";

        Pattern pattern = Pattern.compile(regex1);

        Matcher matcher = pattern.matcher(texto1);

        System.out.println("texto:     "+texto1);
        System.out.println("indice:    0123456789");
        System.out.println("regex "+regex1);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+"\n");
        }

        //
        System.out.println("Email valido: ");
        System.out.println("#@!dutch@mail.br".matches(regex1));

        //
        System.out.println(Arrays.toString(texto1.split(",")));
        System.out.println(texto1.split(",")[1].trim());
    }
}
