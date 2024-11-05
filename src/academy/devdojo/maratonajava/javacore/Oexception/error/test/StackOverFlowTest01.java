package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();

        /* ErroR é ago que acontece na JVM a solução e arrumar ou melhorar o codigo, erro
           não é uma exceção, Error e filha da Throwable (lançavel) */

    }

    public static void recursividade(){
        recursividade();
    }

}
