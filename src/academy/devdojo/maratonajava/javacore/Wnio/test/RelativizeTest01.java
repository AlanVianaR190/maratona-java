package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;


public class RelativizeTest01 {
    public static void main(String[] args) {

        Path diretorio = Paths.get("/home/alan");

        Path classe = Paths.get("/home/alan/test/OlaMundo.java");

        Path pathToClasse = diretorio.relativize(classe);

        System.out.println(pathToClasse);

        //
        Path absoluto1 = Paths.get("/home/alan");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/alan/test/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.20250106");

        System.out.println("1 "+absoluto1.relativize(absoluto3));
        System.out.println("2 "+absoluto3.relativize(absoluto1));
        System.out.println("3 "+absoluto1.relativize(absoluto2));
        System.out.println("4 "+relativo1.relativize(relativo2));

        /* não e possivel trabalhar com relativo e absoluto, sendo assim e lançado uma exceção */
    }
}
