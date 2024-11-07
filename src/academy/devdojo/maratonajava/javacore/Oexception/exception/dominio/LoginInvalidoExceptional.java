package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

// criando uma exceção

public class LoginInvalidoExceptional extends Exception{

    public LoginInvalidoExceptional() {
        super("Login Invalido");
    }

    public LoginInvalidoExceptional(String message) {
        super(message);
    }

}
