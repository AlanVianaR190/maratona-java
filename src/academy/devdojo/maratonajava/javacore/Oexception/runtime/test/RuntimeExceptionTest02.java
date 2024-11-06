package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        divisao(1, 0);

    }

    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */

    private static int divisao(int a, int b) throws IllegalArgumentException{
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, o divisor não pode ser 0");
        }
        return a / b;
    }

    /* throws indica que exceções podem ser lançadas, isso indica aos desenvolvedores para
       estar preparados para essas exceções caso ocorram, o throw new e usado para instanciar
       uma nova exceção */

}
