package academy.devdojo.maratonajava.javacore.LclassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Hosea", 5000);
        System.out.println(gerente);

        Desenvolvedor dev = new Desenvolvedor("John", 2500);
        System.out.println(dev);

        gerente.imprime();
        dev.imprime();
    }

}
