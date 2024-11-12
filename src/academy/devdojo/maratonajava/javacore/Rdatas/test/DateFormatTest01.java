package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        DateFormat[] df = new DateFormat[7];

        /* A classe DateFormat é usada para formatar e exibir datas e horas como texto
           e também para interpretar strings de data e hora */

        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        /* O método getDateInstance() cria um objeto DateFormat que é
           configurado para formatar apenas a data (dia, mês e ano), ignorando o
           horário, esse método tem sobrecargas que permitem escolher diferentes
           estilos de formatação */

        for (DateFormat dateFormat: df){
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
