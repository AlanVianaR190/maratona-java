package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

        lerArquivo();
    }

    // try whith resources
    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e){

        }
    }

    /* O try with resources é uma estrutura de gerenciamento de recursos que
       permite abrir e fechar automaticamente recursos que implementam
       a interface AutoCloseable (ou Closeable).

       Evita esquecer de fechar o recurso manualmente e mantem o codigo limpo,

       Recurso muito útil para manipulação de arquivos, conexões de banco de dados e
       outros processos que demandam gerenciamento de recursos externos! */

    public static void lerArquiv2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
