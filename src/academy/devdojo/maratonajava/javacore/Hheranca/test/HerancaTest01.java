package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();

        endereco.setRua("Rua Três");
        endereco.setCep("09913-200");

        Pessoa pessoa = new Pessoa("John");

        pessoa.setCpf("333.111.666-20");

        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Milton");

        funcionario.setCpf("000.000.777-88");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3000);

        funcionario.imprime();

        /* em associação uma pessoa TEM algo e possui um nivel de acoplação baixo, em
           herança uma pessoa É algo e possui um nivel de acoplação alto

           Tomar sempre cuidado quando utilizar herança pois qualquer alteração feita
           pode alterar as classes que são extenções */
    }
}
