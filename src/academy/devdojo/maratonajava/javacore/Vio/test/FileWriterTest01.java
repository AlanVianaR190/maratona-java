package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        // escrevendo em um arquivo
        try(FileWriter fileWriter = new FileWriter(file);) {

            /* para adicionar conteudo toda vez que for executado, basta passsar como parametro
               true, sempre na criação do objeto */

            fileWriter.write("Hello World");

            fileWriter.flush();

            /* sempre que abrir um arquivo no final e necessario fecha-lo,
               e possivel utilizar o try com recursos como visto acima ou utilizar
               o metodo .close() */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
