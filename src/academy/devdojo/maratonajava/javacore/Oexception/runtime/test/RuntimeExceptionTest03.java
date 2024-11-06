package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.File;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        abreConexao2();
    }

    private static String abreConexao(){
        try {
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");
            return "conexão aberta";

        }catch (Exception exception){
            exception.printStackTrace();

        }finally {
            System.out.println("Fechando recurso liberado pelo Sistema Operacional...");
        }
        return null;
    }

    private static void abreConexao2(){
        try {
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");

        }finally {
            System.out.println("Fechando recurso liberado pelo Sistema Operacional...");
        }
    }

    /* O bloco finally sempre será executado, independentemente de ocorrer uma exceção ou não.
   Pode ser usado com try/finally sem catch, mas nesse caso, não permite o tratamento da exceção,
   apenas a liberação de recursos, como fechar conexões ou arquivos (não é a prática mais recomendada). */

}
