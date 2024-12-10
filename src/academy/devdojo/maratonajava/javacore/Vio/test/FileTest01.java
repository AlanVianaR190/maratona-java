package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {

        // classe arquivo
        File file = new File("file.txt");

        try {
            // criando arquivo
            boolean isCreated = file.createNewFile();
            System.out.println("Criado: "+isCreated);

            // ver caminho
            System.out.println(file.getPath());

            // ver caminho inteiro
            System.out.println(file.getAbsoluteFile());

            // verificar se é um diretorio
            System.out.println("Diretorio: "+file.isDirectory());

            // verificar se é um arquivo
            System.out.println("Arquivo: "+file.isFile());

            // verificar se esta oculto
            System.out.println("Oculto: "+file.isHidden());

            // verificar modificação


            // verificando se existe
            boolean exists = file.exists();

            if (exists){

                // deletando arquivo
                System.out.println("Deletado: "+file.delete());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
