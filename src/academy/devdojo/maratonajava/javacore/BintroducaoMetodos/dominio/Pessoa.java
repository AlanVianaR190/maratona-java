package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Pessoa {

    // modificador de acesso: private
    private String nome;
    private int idade;

    /* atributos de acesso privado so podem ser acessados dentro de sua propria classe */

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // metodos set
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade Invalida!");
            return;
        }
        this.idade = idade;
    }

    /* metodos set() são usados para definir os atributos privados de uma classe */

    // metodos get
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    /* metodos get() são usados para acessar o valor de atributos privados de uma classe */

}
