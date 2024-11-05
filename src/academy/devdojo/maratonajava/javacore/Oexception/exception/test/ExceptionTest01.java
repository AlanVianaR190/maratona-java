package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo(){

        File file = new File("arquivo\\teste.txt");

        try{
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado: "+criado);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    /* ao tratar uma exceção busque tartar de forma expecifica e não generica,
       nunca deixar o bloco catch em branco */

    /* trabalhando com o Java na hora da compilação ele vai
       assumir que o caminho passado no arquivo começa no root
       do projeto */

    /* para abrir a documentação com o cursor em cima apertar Ctrl + B */
}
