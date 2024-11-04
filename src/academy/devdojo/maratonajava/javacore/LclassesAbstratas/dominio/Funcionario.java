package academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    /* uma classe abstrata e uma classe criada para ser extendida para
       ser uma SUPERclasse, uma classe abstrata não pode ser final, e
       tambem não pode ser instanciada */
}
