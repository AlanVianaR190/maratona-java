package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "John";
        estudante1.idade = 27;
        estudante1.sexo = 'M';

        estudante2.nome = "Abgail";
        estudante2.idade = 24;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
