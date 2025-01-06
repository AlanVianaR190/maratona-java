package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {

        // BasicFileAttributes, DosFileAttributes, PosixFileAttributes

        // forma antiga de alterar data
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(10);
        File file = new File("folder_renamed/new.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());

        // forma nova de alterar data
        Path path = Paths.get("folder_renamed/new_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(localDateTime.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);

        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));

        /* A classe BasicFileAttributes é usada para acessar os atributos básicos
           de um arquivo ou diretório no sistema de arquivos */
    }
}
