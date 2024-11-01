package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /* a partir do momento que uma classe se torna uma extensão de outra, ela
       passa a herdar todos os seus atributos e metodos */
}
