package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {

        String diretorioProjeto = "home/alan/dev";  // copia do content root (3ª opção)

        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);

        System.out.println(path1);

        System.out.println(path1.normalize());

        //
        Path path2 = Paths.get("/home/./alan/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

        /* No contexto da classe Path em Java, normalização refere-se ao processo
           de remover elementos redundantes de um caminho de arquivo, a normalização
           transforma um caminho em sua forma mais direta e simplificada, sem alterar o destino
           do caminho. */

    }
}
