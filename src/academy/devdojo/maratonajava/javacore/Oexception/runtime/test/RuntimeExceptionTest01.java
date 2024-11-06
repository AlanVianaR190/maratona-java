package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {

        //Object object = null;

        //System.out.println(object.toString());    NullPointerExceptional

        //int[] array = new int[] {1,2};

        //System.out.println(array[2]);     ArrayIndexOutOfBoundsException

        /* RuntimeException é uma exceção do tipo Unchecked, ou seja, não precisa ser tratada
           ou declarada no código. Ela representa erros de lógica no programa que podem ser
           evitados com boas práticas, como NullPointerException e ArrayIndexOutOfBoundsException.
           A classe RuntimeException é filha de Exception, que por sua vez é filha de Throwable. */

        /* Checked: Exceções que o compilador exige que você trate ou declare,
           como IOException e SQLException. São verificadas em tempo de compilação.

           Unchecked: Exceções que o compilador não exige tratamento ou declaração,
           como NullPointerException e ArrayIndexOutOfBoundsException.
           São verificadas apenas em tempo de execução. */

    }
}
