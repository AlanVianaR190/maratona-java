package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoExceptional;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.nio.file.FileAlreadyExistsException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {

        Pessoa pessoa =  new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoExceptional | FileAlreadyExistsException e) {
            e.printStackTrace();
        }
    }
}
