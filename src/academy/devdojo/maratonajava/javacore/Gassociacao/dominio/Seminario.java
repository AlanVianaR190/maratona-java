package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {

    private String titulo;

    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Professor professor) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
    }

    public void imprime(){
        System.out.println("--------------------------");
        System.out.println("Seminario de: "+this.titulo);
        System.out.println("Com o professor: "+professor.getNome());
        System.out.println("No local: "+local.getEndereco());
        if (alunos == null){
            System.out.println("Esta sem alunos!");
            return;
        }
        System.out.println("Com os alunos presentes: ");
        for (Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
