package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        /* O método Calendar.getInstance() é um método de fábrica
           que cria e retorna uma instância de Calendar configurada
           automaticamente com a data e hora atuais */

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("A semana começa no DOMINGO!");
        }

        /* Calendar.SUNDAY é uma constante estatica da classe Calendar.
           não é possivel acessar pelo objeto instanciado */

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_MONTH, 3);
        c.roll(Calendar.HOUR, 10);

        /* o metodo .add() adiciona e tem como parametro hora, dia, ano... & a quantidade

           O método roll() permite somar ou subtrair uma quantidade de unidades (dias, horas, etc.)
           sem modificar outros campos do calendário. Por exemplo, roll não altera o dia ao modificar
           a hora */

        Date date = c.getTime();

        System.out.println(date);

        /* diferente da classe Date que o metodo .getTime() retorna o valor
           em milisegundos, na classe Calendar temos como retorno a data e hora atuais */

    }
}
