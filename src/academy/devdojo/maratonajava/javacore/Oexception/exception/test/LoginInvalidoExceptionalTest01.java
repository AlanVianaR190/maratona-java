package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoExceptional;
import java.util.Scanner;

public class LoginInvalidoExceptionalTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoExceptional e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoExceptional {

        Scanner scanner = new Scanner(System.in);

        String userNameDB = "John";
        String senhaDB = "abc123";

        System.out.println("Usuario: ");
        String userNameDigitado = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaDigitado = scanner.nextLine();

        if (!userNameDigitado.equals(userNameDB) || !senhaDigitado.equals(senhaDB)){
            throw new LoginInvalidoExceptional("Usuario ou Senha Invalido");
        }

        System.out.println("Usuario Logado com Sucesso");

    }

}
