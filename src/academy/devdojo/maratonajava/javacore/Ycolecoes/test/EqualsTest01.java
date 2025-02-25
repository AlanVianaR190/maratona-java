package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");

        System.out.println(s1.equals(s2));

        Smartphone s3 = new Smartphone("2XYZ1", "Samsung");
        Smartphone s4 = s3;

        System.out.println(s3.equals(s4));

        /*
        s1.equals(s2): Retorna false, porque s1 e s2 são instâncias
        diferentes (espaços de memória diferentes).

        s3.equals(s4): Retorna true, porque s3 e s4 referenciam
        o mesmo objeto (mesmo espaço de memória).
        */

    }
}
