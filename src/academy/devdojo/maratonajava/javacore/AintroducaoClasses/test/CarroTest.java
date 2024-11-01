package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Ford";
        carro1.nome = "Mustang";
        carro1.ano = 2000;

        carro2.modelo = "Lamborghini";
        carro2.nome = "Huracan";
        carro2.ano = 2000;

        // objeto de referencia
        carro1 = carro2;

        System.out.println("Modelo: "+carro1.modelo+"; Nome: "+carro1.nome+"; Ano: "+carro1.ano);
        System.out.println("Modelo: "+carro2.modelo+"; Nome: "+carro2.nome+"; Ano: "+carro2.ano);

        /* o carro1 esta fazendo referencia ao carro2 por isso possui o mesmo atributo */

    }
}
