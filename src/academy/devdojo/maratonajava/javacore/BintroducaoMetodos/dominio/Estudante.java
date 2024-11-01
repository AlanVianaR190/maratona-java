package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){

        System.out.println("--------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

    /* a palavra reservada this. faz referencia aos atributos da classe */
}
