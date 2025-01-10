package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)  {

        if (file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }
}

/* A classe ListAllFiles no código é uma extensão da classe abstrata
   SimpleFileVisitor<Path>, ela é utilizada para percorrer a estrutura
   de diretórios e executar ações específicas durante a visita a cada arquivo ou diretório. */

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {

        Path root = Paths.get(".");

        Files.walkFileTree(root, new ListJavaFiles());
    }
}
