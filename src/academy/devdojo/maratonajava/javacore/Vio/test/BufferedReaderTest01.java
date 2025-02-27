package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileReader fileReader = new FileReader(file)) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }

            /* o metodo .readLine() le uma linha por vez, sendo assim utilizando
               do formato String, tambem esta sendo utilizado um laço para passar por todas
               as linhas */

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
