package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {

    public static void main(String[] args) {

        byte byterP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'A';
        boolean booleanP = false;

        // classes wrappers

        // autoboxing
        Byte byterA = 1;
        Short shortA = 1;
        Integer intA = 1;
        Long longA = 10L;
        Float floatA = 10F;
        Double doubleA = 100D;
        Character charA = 'A';
        Boolean booleanA = false;

        /* wrappers são objetos que encapsulam tipos primitivos
           transformando-os em objetos, os valores dos wrappers não
           estão mais relacionados ao tipo primitivo e sim a suas classes */

        // unboxing
        int i = intA;

        /* unboxing é a conversão de um objeto para um tipo primitivo */

        boolean verdadeiro = Boolean.parseBoolean("truE");

        System.out.println(verdadeiro);

        /* os métodos parse...() em Java são usados para converter strings em
         tipos de dados primitivos, no caso do parseBoolean tudo que não for true independente
         de maisusculas ou minusculas e considerado false */

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('b'));
        System.out.println(Character.isLowerCase('b'));
        System.out.println(Character.toUpperCase('z'));
        System.out.println(Character.toLowerCase('A'));
    }
}
