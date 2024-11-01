package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {

        // entrada de dados pelo usuario

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite M (masculino) / F (feminino) para seu sexo: ");
        char sexo = entrada.next().charAt(0);

        /* o método charAt() retorna o caractere especificado a partir de uma string */

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);

        /* ao instanciar um objeto da classe Scanner devemos armazenar a entrada de
           dos dados em uma variavel, e utilizar o metodo de leitura correspondente ao
           tipo primitivo ou referencia em questão */

    }
}
