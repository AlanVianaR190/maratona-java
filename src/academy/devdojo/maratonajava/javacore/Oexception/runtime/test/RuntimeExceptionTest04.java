package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        /* Blocos catch mais específicos devem ser listados antes dos mais gerais, pois
           o compilador ignora qualquer bloco catch após encontrar o primeiro compatível.
           Isso é uma boa prática e evita o problema de exceções específicas nunca serem
           alcançadas devido a capturas genéricas antes delas. */

        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        /* estrutura (catch com múltiplas exceções) permite combinar várias exceções específicas
           em um único bloco, mas, quando uma exceção genérica (RuntimeException) é colocada em
           um bloco separado, ela sempre captura exceções que não correspondam a exceções específicas
           mencionadas antes. */
    }

    private static void talvezLanceException() throws SQLException, IOException {

    }

}
