package academy.devdojo.maratonajava.javacore.JmodificadorFinal.test;

import academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);

        //System.out.println(carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("John");

        System.out.println(carro.COMPRADOR);

    }
}
