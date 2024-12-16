package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {

        // criando pastas
        Path folderPath = Paths.get("folder");

        if (Files.notExists(folderPath)){
            Path folderDirectory = Files.createDirectory(folderPath);
        }

        /* diferente da classe File ao executar ele não retorna um boolean, e ao executra novamente
           e retornado uma exceção por que o diretorio ou arquivo já existe, para contornar este problema
           podemos usar este metodo estatico da classe Files */

        // criando sub pastas
        Path subFolderPath = Paths.get("folder/sub_folder/sub_sub_folder");
        Path subFolderDirectory = Files.createDirectories(subFolderPath);

        /**/

        // criando arquivos
        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");

        if (Files.notExists(filePath)){
            Path filePathCreated = Files.createFile(filePath);
        }

        /**/

        // copiando um arquivo
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);

        /**/
    }
}
