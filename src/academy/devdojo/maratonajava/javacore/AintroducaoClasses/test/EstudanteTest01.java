package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        // objeto (Estudante()) do mesmo tipo da variavel de referencia (Estudante estudante)
        Estudante estudante = new Estudante();

        // acessando os atributos do objeto
        estudante.nome = "Jhon";
        estudante.idade = 30;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
