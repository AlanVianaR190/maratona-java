package academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    /* uma classe abstrata e uma classe criada para ser extendida para
       ser uma SUPERclasse, uma classe abstrata não pode ser final, e
       tambem não pode ser instanciada */

    public abstract void calcularBonus();

    /* um metodo abstrato e um metodo que obrigatoriamente precisa ser implementado
       e todas as SUBclasses, eles não possuem corpo(codigo) */

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    /* em uma classe abstrata pode ter metodos abstartos e metodos não abstratos,
       metodos abstratos so pode ter em classes abstratas */
}
