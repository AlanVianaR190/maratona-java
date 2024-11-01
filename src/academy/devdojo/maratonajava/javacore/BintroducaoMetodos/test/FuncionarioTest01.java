package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("John");
        funcionario.setIdade(34);
        funcionario.setSalarios(new double[]{1400.5, 2000.9, 3000.1});

        funcionario.imprimirDados();


    }
}
