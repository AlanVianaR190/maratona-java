package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Van Der Lind", 40);
        Aluno aluno2 = new Aluno("John", 27);
        Aluno aluno3 = new Aluno("Abgail", 24);
        Aluno aluno4 = new Aluno("Arthur", 34);

        Local local1 = new Local("Espaço SP+");
        Local local2 = new Local("Salão +RJ");

        Professor professor1 = new Professor("Hosea");
        Professor professor2 = new Professor("Strange","História");

        Seminario seminario1 = new Seminario("Intensivão de Java", local1,professor1);
        Seminario seminario2 = new Seminario("Masterclass de Python", local2, professor2);
        Seminario seminario3 = new Seminario("A História do continente Africano", local1);
        Seminario seminario4 = new Seminario("A História do continente Africano", local2);

        //Aluno[] alunos1 = new Aluno[] {aluno1,aluno2, aluno4};

        Seminario[] seminarios1 = new Seminario[] {seminario3,seminario4};

        //seminario1.setAlunos(alunos1);

        professor2.setSeminarios(seminarios1);

        //seminario1.imprime();
        //seminario2.imprime();

        //aluno3.imprime();

        //aluno3.setSeminario(seminario2);

        //aluno3.imprime();

        //seminario2.imprime();

        professor2.imprime();
    }
}
