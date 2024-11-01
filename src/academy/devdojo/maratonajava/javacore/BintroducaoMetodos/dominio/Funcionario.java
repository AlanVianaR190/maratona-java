package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimirDados(){

        System.out.println("----------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.print("Salarios: ");

        if (this.salarios == null){
            return;
        }

        for (double valor: salarios){
            System.out.print(" $"+valor);
        }
        imprimirMediaSalario();
    }

    public void imprimirMediaSalario(){

        if (this.salarios == null){
            return;
        }

        for (double valor: salarios){
            media += valor;
        }

        media /= this.salarios.length;
        System.out.println("\nMedia de salarios: $"+media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    /* public void setMedia(double media) {
        this.media = media;
    } */

    /* como a media só pode ser alterada por um metodo na classe funcionario
       o correto e remover o acesso (excluir) */

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
