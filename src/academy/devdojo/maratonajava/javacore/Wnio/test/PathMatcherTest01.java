package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.*;

public class PathMatcherTest01 {

    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }

    public static void main(String[] args) {

        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**/*.bkp");
        matches(path1, "glob:**/*.{bkp,txt,java}");
        matches(path2, "glob:**/*.{bkp,txt,java}");
        matches(path3, "glob:**/*.{bkp,txt,java}");

        /* O * é usado para corresponder a qualquer caractere no nome do arquivo.

           O ** é usado para corresponder a qualquer diretório ou subdiretório.

           O {} é usado para listar múltiplas opções de extensões ou padrões. */

        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");

        /* As interrogações (?) no glob são curingas que correspondem a exatamente um caractere.

        No seu caso, ??? busca extensões com três caracteres exatos. */

    }
}
