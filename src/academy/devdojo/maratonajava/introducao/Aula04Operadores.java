package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){

        // operadores matematicos basicos: +, -, *, /
        int numero1 = 10;
        int numero2 = 20;
        int resultadoMulti = numero2 * numero1;
        int resultDiv = numero1 / numero2;
        double resultDiv2 = numero1 / numero2;
        System.out.println(numero2 - numero1);
        System.out.println(numero2 + numero1);

        System.out.println("Valor "+ numero2 + numero1);
        System.out.println(numero2 + numero1+" Valor "+ numero2 + numero1);

        /* a partir do momento que existe uma string seguido de um sinal de mais
           o java entende como concatenação por isso afeta a soma das variaveis */

        System.out.println(resultadoMulti);
        System.out.println(resultDiv);
        System.out.println(resultDiv2);

        // % é o operador matematico que representa resto
        int resto = 21 % 8;
        System.out.println(resto);

        // operadores relacionais: <, >, <=, >=, ==, !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10.0;
        boolean isDezDiferenteDeDez = 10 != 10.0;
        System.out.println("10 é MAIOR que 20: "+isDezMaiorQueVinte);
        System.out.println("10 é MENOR que 20: "+isDezMenorQueVinte);
        System.out.println("10 é IGUAL a 20: "+isDezIgualAVinte);
        System.out.println("10 é IGUAL a 10.0: "+isDezIgualADez);
        System.out.println("10 é DIFERENTE de 10.0: "+isDezDiferenteDeDez);

        // operadores logicos: && (and), || (or), ! (not)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaior = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenor = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaior: "+isDentroDaLeiMaior);
        System.out.println("isDentroDaLeiMenor: "+isDentroDaLeiMenor);

        double valorTotalCc = 200;
        double valorTotalCp = 10000;
        float valorPs5 = 5000F;
        boolean isPs5Compravel = valorTotalCc > valorPs5 || valorTotalCp > valorPs5;
        System.out.println("isPs5Compravel: "+isPs5Compravel);

        // operadores de atribuição: =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000;          // 2800.0
        bonus -= 600;           // 2200.0
        bonus *= 3;             // 6600.0
        bonus /= 2;             // 3300.0
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador = contador + 1;
        contador += 1;
        contador ++;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(++contador2);

    }
}
