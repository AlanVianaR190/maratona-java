package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.nio.file.FileAlreadyExistsException;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoExceptional, FileAlreadyExistsException {
        System.out.println("Salvando Funcionario...");
    }

    /* O método sobrescrito pode lançar menos ou nenhuma exceção, mas nunca mais do que o método
       da superclasse no caso de exceções checked. Se necessário, o método sobrescrito pode lançar
       exceções checked que sejam subclasses das exceções declaradas no método original da superclasse.

       Um método sobrescrito não pode lançar novas exceções checked que não
       são lançadas pelo método da classe-pai. O método sobrescrito pode lançar
       novas exceções unchecked (RuntimeException e suas subclasses),
       independentemente de estarem no método da classe-pai */
}
