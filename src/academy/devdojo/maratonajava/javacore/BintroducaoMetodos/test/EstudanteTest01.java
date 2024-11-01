package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "John";
        estudante1.idade = 27;
        estudante1.sexo = 'M';

        estudante2.nome = "Abgail";
        estudante2.idade = 24;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        /* quando passa objetos como parametro esta passando a referencia */

        System.out.println("--------");

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        /* aqui o objeto foi alterado, como e passado a referência do objeto ao método
           qualquer mudança feita dentro do método afeta o objeto original */

    }
}
