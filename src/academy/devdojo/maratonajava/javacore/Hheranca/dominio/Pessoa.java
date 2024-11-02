package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {

    // modificador de acesso: protected
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    /* atributos de acesso protected da acesso direto a atribitos/variaveis da classe
       que foi extendida independente da onde elas sejam importadas, ou pelo menos
       que estejam dentro do mesmo pacote */

    public void imprime(){
        System.out.println("------------------------------------------------");
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+", "+this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
