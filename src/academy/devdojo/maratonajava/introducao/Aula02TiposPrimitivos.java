package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){

        // tipos primitivos: int, double, float, char, byte, short, long, boolean
        int idade = 10;

        // cast
        int valorInteiro = (int) 10000000000L;

        /* Um cast é uma conversão forçada de um tipo de dado para outro,
           podendo causar perda de dados já que o tipo int tem uma
           capacidade menor que o tipo long. */

        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;

        char caractere = 65;

        boolean verdadeiro = true;
        boolean falso = false;

        /* com excessão do boolean todos são de tipo numerico,
           experimente por um numero no char, fazendo isso o caracter e traduzido
           para uma letra (tabela Unicode ou ASC) */

        // string é uma classe
        String nome = "Alan";

        System.out.println(idade);
        System.out.println("idade");
        System.out.println("A idade de crianças geralmente é de "+idade+" anos!");
        System.out.println(falso);

        System.out.println("char = "+caractere);

        System.out.println(valorInteiro);

        System.out.println("Meu nome é "+nome);
    }
}
