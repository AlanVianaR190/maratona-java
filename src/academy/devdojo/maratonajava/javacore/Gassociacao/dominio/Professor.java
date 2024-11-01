package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {

    private String nome;

    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    //
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    //
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        if (especialidade != null){
            System.out.println("Especialidade: "+this.especialidade);
        }
        if (seminarios == null){
            System.out.println("Esta sem seminarios para ministrar!");
            return;
        }
        System.out.println("Com seminarios para ministrar de: ");
        for (Seminario seminario: seminarios){
            System.out.println(seminario.getTitulo()+", na(o) "+seminario.getLocal().getEndereco());

            /* É possível acessar um método de um objeto associado a outro objeto, como no caso acima.
               O método getLocal() retorna um objeto Local, permitindo acessar seu método getEndereco()
               diretamente a partir do objeto seminario. */

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //
    public String getEspecialidade() {
        return especialidade;
    }

    //
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //
    public Seminario[] getSeminarios() {
        return seminarios;
    }

    //
    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
