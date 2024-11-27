package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String pattern = "'São Paulo' dd 'de' MMMM 'de' yyyy";

        /* as aspas simples ira ser ignorada na hora da formatação */

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        /* O SimpleDateFormat é uma classe do Java usada para formatar e analisar
           datas. Com ele, você pode transformar uma data em texto (formatação) ou
           texto em uma data (parsing). É muito útil para personalizar o formato
           de exibição de datas */

        System.out.println(sdf.format(new Date()));

        /* ao utilizar o new Date() temos a data e hora atual */

        try {
            System.out.println(sdf.parse("São Paulo 15 de novembro de 2024"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /* O parse() é um método usado para interpretar dados em forma de texto e
           transformá-los em tipos mais estruturados ou utilizáveis no programa. Ele
           é essencial para trabalhar com informações recebidas como texto, como entrada
           de usuários, arquivos ou respostas de APIs. */
    }
}
