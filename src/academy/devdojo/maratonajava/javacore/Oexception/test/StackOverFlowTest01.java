package academy.devdojo.maratonajava.javacore.Oexception.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();

        /* erro é ago que acontece na JVM a solução e arrumar ou melhorar o codigo */

    }

    public static void recursividade(){
        recursividade();
    }
}
