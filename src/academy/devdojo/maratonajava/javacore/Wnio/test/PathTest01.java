package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {

        // criando pastas
        Path path1 = Paths.get("C:\\Users\\Maria\\Documents\\MeusProjetos\\maratona-java\\file.txt");
        Path path2 = Paths.get("C:\\Users\\Maria\\Documents\\MeusProjetos\\maratona-java","file.txt");
        Path path3 = Paths.get("C:","\\Users\\Maria\\Documents\\MeusProjetos\\maratona-java\\file.txt");
        Path path4 = Paths.get("C:","Users\\Maria\\Documents\\MeusProjetos\\maratona-java\\file.txt");

        /* a classe Path (do pacote java.nio.file) representa um caminho de arquivo ou diretório no sistema de arquivos,
           ela é usada para manipular, resolver e realizar operações com caminhos de arquivos de forma mais flexível e
           moderna que a classe antiga File */

        System.out.println(path1.getFileName());
        System.out.println(path2.getFileName());
        System.out.println(path3.getFileName());
        System.out.println(path4.getFileName());

    }
}
