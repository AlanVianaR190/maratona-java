package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        /* Programação Orientado a Inteface: a variavel de referencia se torna o tipo mais generico
           e os objetos tem acesso a todas as classes especificas, basta trocar de implementação */

    }
}
