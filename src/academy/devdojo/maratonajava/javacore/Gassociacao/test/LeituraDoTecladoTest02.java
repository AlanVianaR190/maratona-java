package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {

        System.out.println("O grande software de previsão do futuro!");
        System.out.println("Digite sua pergunta e eu responderei SIM ou Não.");

        Scanner entrada = new Scanner(System.in);

        String pergunta = entrada.nextLine();

        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

    }
}
