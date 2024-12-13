package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        // lendo um arquivo
        try (FileReader fileReader = new FileReader(file)) {

            /* char[] in = new char[1];
             fileReader.read(in);
            for (char c: in){
                System.out.println(c);
            } */

            int i;
            while ((i = fileReader.read()) != -1){
                System.out.print(i);
            }

            /* o metodo .read() le um caracter por vez, utilizando o valor do espaço
               alocado em memoria, por isso aqui ele esta sendo usado em um laço */

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
