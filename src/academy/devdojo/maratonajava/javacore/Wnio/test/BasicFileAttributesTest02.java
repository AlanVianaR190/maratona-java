package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("folder_renamed/new1.txt");

        // ler atributos
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        // obtendo atributos
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccesTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime "+creationTime);
        System.out.println("lastModifiedTime "+lastModifiedTime);
        System.out.println("lastAccesTime "+lastAccesTime);
        System.out.println("----------------------------");

        // alterando atributos atraves da View
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime ,creationTime);

        // leitura dos atributos atualizados
        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccesTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationTime "+creationTime);
        System.out.println("lastModifiedTime "+lastModifiedTime);
        System.out.println("lastAccesTime "+lastAccesTime);

        /* tudo que tem fileAttributeView e utilizado para fazer alteração de acordo com o metodo e o atributo
           necessario */

    }
}
