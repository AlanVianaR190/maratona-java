package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio.Professsor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professsor professsor = new Professsor();

        professsor.nome = "Hosea";
        professsor.idade = 60;
        professsor.sexo = 'M';

        System.out.println("Nome: "+professsor.nome+", Idade: "+professsor.idade+", Sexo: "+professsor.sexo);

    }
}
