package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {

    private String nome;
    private int idade;

    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("-------------------------------------------");
        System.out.println("Nome Aluno: "+this.nome);
        System.out.println("Idade Aluno: "+this.idade);
        if (seminario != null){
            System.out.println("Esta cadastrada no seminario de: "+seminario.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
