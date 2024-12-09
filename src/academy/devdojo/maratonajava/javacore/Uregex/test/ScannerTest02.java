package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {

        String texto = "John,Arthur,Dutch,true,200";

        Scanner scanner = new Scanner(texto);

        scanner.useDelimiter(",");

        while (scanner.hasNext()){

            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("int: "+i);

            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("boolean: "+b);

            } else {
                System.out.println(scanner.next());
            }
        }

        /* o metodo .hasNext() verifica se há outro token ou palavra disponivel

           o metodo .hasNextInt() verifica se o token pode ser interpretado como inteiro, o
           metodo .nextInt() le o token como inteiro */

    }
}
