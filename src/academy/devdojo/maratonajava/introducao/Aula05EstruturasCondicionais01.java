package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args){
        // estrutura condicional: if, else
        int idade = 15;
        boolean isAutorizadoComprar = idade >= 18;
        if (isAutorizadoComprar != false){
            System.out.println("Autorizado comprar bebida!");
        } else {
            System.out.println("Não Autorizado comprar bebida!");
        }

        // ! (negação)
        if (!isAutorizadoComprar){
            System.out.println("Não Autorizado comprar bebida!");
        }

        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");

        /* o if só será executado se sua condição for verdadeira (true), ou
           falsa se assim for determinado, o que esta fora do if sempre sera executado */
    }
}
