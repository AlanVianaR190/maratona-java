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

        /* Ao tratar uma exceção, busque sempre tratá-la de forma específica, evitando tratamentos genéricos.
           No stack trace, a lista de exceções é exibida de baixo para cima, especificando a linha onde ocorreu o erro.
           Nunca deixe o bloco catch em branco, pois isso dificulta a identificação e resolução de problemas. */

        /* Ao usar o método File(), o Java assume que o caminho passado é relativo ao diretório raiz do projeto,
           a menos que seja fornecido um caminho absoluto. */


        /* para abrir a documentação com o cursor em cima apertar Ctrl + B */
}
