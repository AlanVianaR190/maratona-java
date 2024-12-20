package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {

    // modificador de acesso: protected
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    /* atributos de acesso protected da acesso direto a atribitos/variaveis da classe
       que foi extendida independente da onde elas sejam importadas, ou pelo menos
       que estejam dentro do mesmo pacote */

    static {
        System.out.println("Dentro do bloco de inicialização estatico de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização NÃO estatico de Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização NÃO estatico de Pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    /* dica: toda vez que adicionar um construtor na classe mae com parametros
       obrigatoriamente e obrigado a alterar nas classes filhas */

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
