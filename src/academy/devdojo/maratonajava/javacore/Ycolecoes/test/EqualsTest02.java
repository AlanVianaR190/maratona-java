package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest02 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");

        System.out.println(s1.equals(s2));

        Smartphone s3 = new Smartphone("1ABC1", "Samsung");

        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));

        /*
        O método equals atual (sobrescrito) só considera o serialNumber, então
        objetos com o mesmo serialNumber serão considerados iguais, independentemente da marca.
        */

    }
}
