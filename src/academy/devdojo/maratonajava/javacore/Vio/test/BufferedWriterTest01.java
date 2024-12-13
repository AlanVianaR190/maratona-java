package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try(FileWriter fileWriter = new FileWriter(file,true);) {

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            /* a classe BufferedWriter é indicada quando estiver trabalhando com um arquivo muito grande, é
               usada em Java para escrever texto em arquivos de forma eficiente, utilizando um buffer
               para agrupar múltiplas operações de escrita */

            bufferedWriter.write("A vingança nunca e plena, mata a alma e envenena.");

            bufferedWriter.newLine();

            /* o metodo .newLine() é usado para adicionar uma nova linha no arquivo, garantindo que o
               caractere de quebra de linha seja apropriado ao sistema operacional */

            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
