package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();

        /* Error representa um problema grave que ocorre na JVM, geralmente devido a limitações de recursos,
           e não é considerado uma exceção tratável. Errors são subclasses de Throwable, mas, diferente de Exception,
           não devem ser manipulados pelo programa, pois indicam problemas críticos que exigem ajustes no código
           ou uma abordagem diferente. No exemplo, a chamada recursiva infinita gera um StackOverflowError,
           pois a pilha de chamadas se esgota. */


    }

    public static void recursividade(){
        recursividade();
    }

}
