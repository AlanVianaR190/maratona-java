package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        // como era feito uma lista até a versão 1.4
        List nomes = new ArrayList();

        nomes.add("John");
        nomes.add("Arthur");
        nomes.add(141);

        /*
        add(E e): Adiciona um elemento ao final da lista.
        add(int index, E e): Adiciona um elemento em uma posição específica.
        */

        for (Object nome: nomes){
            System.out.println(nome);
        }
        System.out.println("------");

        /*
        A classe List no Java é uma interfaces importante e bastante utilizada
        no Java Collections Framework, ela representa uma coleção ordenada de elementos, onde
        é possível armazenar, acessar e manipular dados de forma eficiente.

        As principais características de uma List são:
        Ordenação: Os elementos são armazenados em uma sequência específica (por índice).
        Acesso por índice: Você pode acessar elementos diretamente pelo seu índice (posição).
        Elementos duplicados: Permite a inclusão de elementos duplicados.
        Elementos nulos: Permite a inclusão de elementos null.
        */

        // versão 1.5 & atualmente
        List<String> nomes2 = new ArrayList<>(16);

        nomes2.add("John");
        nomes2.add("Arthur");

        for (String nome: nomes2){
            System.out.println(nome);
        }
        System.out.println("------");

        nomes2.add("Jack");

        for (int i = 0; i < nomes2.size(); i += 1){
            System.out.println(nomes.get(i));
        }

        /*
        O método .size() é usado para obter o número de elementos em uma coleção do
        Java, como uma List, Set, Map.

        .size(): Usado para obter o número de elementos em uma coleção (List, Set, Map, etc.).
        .length: Usado para obter o tamanho de um array.
        .length(): Usado para obter o número de caracteres em uma String.

        get(int index): Retorna o elemento na posição especificada.
        */

    }
}
