package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {

        File file = new File("arquivo\\teste.txt");

        try{
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado: "+criado);

        } catch (IOException e){
            e.printStackTrace();
            throw e;

        }
    }

    /* O uso de try/catch permite capturar e tratar exceções diretamente,
       o que é útil especialmente em métodos onde queremos manipular os erros.
       Em métodos públicos, throws é útil para indicar que o chamador precisa
       estar preparado para lidar com a exceção.

       Quando um metodo lança uma exceção o metodo principal tambem deve declara-la */

}
