package academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.test;

import academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(120);

        Carro carro1 = new Carro("BMW",280);
        Carro carro2 = new Carro("Mercedes-Benz",275);
        Carro carro3 = new Carro("Audi", 290);

        /* ao definir o atributo velocidadeLimite do objeto carro1, por ser um atributo estatico
           todos os outros objetos tambem são afetados

           ao acessar o atributo pelo nome da classe, qualquer  alteração ira afetar todos
           os objeto da classe */

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
