package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {

        Path dir = Paths.get("home/alan");

        Path arquivo = Paths.get("dev/arquivo.txt");

        Path resolve = dir.resolve(arquivo);

        System.out.println(resolve);

        /* um caminho relativo é aquele que não especifica a localização completa
           de um arquivo ou diretório no sistema de arquivos. Em vez disso, ele é
           interpretado em relação a um diretório base ou diretório atual
           (também chamado de diretório de trabalho) */

        Path absoluto = Paths.get("/home/alan");

        Path relativo = Paths.get("dev");

        Path file = Paths.get("file.txt");

        System.out.println("1 "+absoluto.resolve(relativo));
        System.out.println("2 "+absoluto.resolve(file));

        System.out.println("3 "+relativo.resolve(absoluto));
        System.out.println("4 "+relativo.resolve(file));

        System.out.println("5 "+file.resolve(absoluto));
        System.out.println("6 "+file.resolve(relativo));

        /* O código explora o método resolve() da classe Path, que é usado para combinar
           dois caminhos, criando um novo caminho resultante. A maneira como o resolve()
           funciona depende de os caminhos serem absolutos ou relativos.  */

    }
}
