package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {

    private Long id;
    private String aluno;
    private String passworld;

    public Aluno(Long id, String aluno, String passworld) {
        System.out.println("Dentro do construtor.");

        /*
        É recomendável definir um serialVersionUID (id) na classe
        para garantir compatibilidade durante a deserialização.
        */

        this.id = id;
        this.aluno = aluno;
        this.passworld = passworld;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", aluno='" + aluno + '\'' +
                ", passworld='" + passworld + '\'' +
                '}';
    }
}
