package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        /* O método Calendar.getInstance() é um método de fábrica
           que cria e retorna uma instância de Calendar configurada
           automaticamente com a data e hora atuais */

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("A semana começa no DOMINGO!");
        }

        /* Calendar.SUNDAY é uma constante estatica da classe Calendar.
           não é possivel acessar pelo objeto instanciado */

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        calendar.add(Calendar.DAY_OF_MONTH, 3);
        calendar.roll(Calendar.HOUR, 10);

        /* o metodo .add() adiciona e tem como parametro hora, dia, ano... & a quantidade

           O método roll() permite somar ou subtrair uma quantidade de unidades (dias, horas, etc.)
           sem modificar outros campos do calendário. Por exemplo, roll não altera o dia ao modificar
           a hora */

        Date date = calendar.getTime();

        System.out.println(date);

        /* Na classe Calendar, o método getTime() retorna um objeto Date que representa
           a data e hora completas do calendário atual. Isso é diferente do método getTime()
           da classe Date, que retorna o tempo em milissegundos desde 1º de janeiro de 1970. */


    }
}
