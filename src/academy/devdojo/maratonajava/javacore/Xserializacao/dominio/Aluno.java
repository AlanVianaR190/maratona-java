package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {

    private Long id;
    private String aluno;
    private transient String password;

    public Aluno(Long id, String aluno, String password) {
        System.out.println("Dentro do construtor.");

        /*
        É recomendável definir um serialVersionUID (id) na classe
        para garantir compatibilidade durante a deserialização.
        */

        this.id = id;
        this.aluno = aluno;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", aluno='" + aluno + '\'' +
                ", passworld='" + password + '\'' +
                '}';
    }
}
