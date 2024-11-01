package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Hosea");
        Professor professor2 = new Professor("Dutch");

        /* uma dica e começar a criar os objetos das classes que
           não tem associação com objetos de outra classe  */

        Professor[] professores = new Professor[]{professor1, professor2};

        Escola escola1 = new Escola("Vander Lind Gang", professores);

        escola1.imprime();

        /* associação unidirecional, 1 - N */
    }
}
