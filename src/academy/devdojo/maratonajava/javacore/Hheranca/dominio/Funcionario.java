package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    // metodo sobreescrito
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    /* um metodo sobreescrito é um metodo que redefine o comportamento de um metodo
       herdado,  ela possui o mesmo nome e os mesmos parametros

       O super. em um método sobrescrito chama a versão original do método na classe */

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /* a partir do momento que uma classe se torna uma extensão de outra, ela
       passa a herdar todos os seus atributos e metodos */
}
