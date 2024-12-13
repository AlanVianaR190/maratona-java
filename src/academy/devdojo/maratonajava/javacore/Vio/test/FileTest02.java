package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        // criando diretorio
        File diretorio = new File("folder");

        boolean isFolderCreated = diretorio.mkdir();
        System.out.println(isFolderCreated);

        // criando arquivo no diretorio
        File ArquivoDiretorio = new File(diretorio,"file.txt");

        boolean isFileCreated = ArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        // renomeando arquivo
        File arquivoRenomeado = new File(diretorio,"file_renamed.txt");

        boolean isFileRenamed = ArquivoDiretorio.renameTo(arquivoRenomeado);
        System.out.println(isFileRenamed);

        // renomeando diretorio
        File diretorioRenameado = new File("folder_renamed");

        boolean isFolderRenamed = diretorio.renameTo(diretorioRenameado);
        System.out.println(isFolderRenamed);

    }
}
