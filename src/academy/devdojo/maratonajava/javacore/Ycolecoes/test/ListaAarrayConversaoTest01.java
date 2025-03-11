package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAarrayConversaoTest01 {
    public static void main(String[] args) {

        // converção de lista para array
        List<Integer> numerosLista = new ArrayList<>();

        numerosLista.add(1);
        numerosLista.add(2);
        numerosLista.add(3);

        Integer[] listToArray = numerosLista.toArray(new Integer[0]);
        /* O uso de new Integer[0] é uma prática comum e eficiente em Java. */

        System.out.println(Arrays.toString(listToArray));
        System.out.println("------");

        // conversão de array para lista
        Integer[] numerosArray = new Integer[3];

        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        /* O método Arrays.asList() converte um array em uma lista de tamanho fixo. */

        System.out.println(arrayToList);
        System.out.println("------");

        // modificando ou adicionando um valor a lista (forma errada)
        arrayToList.set(0, 12);
        // arrayToList.add(19);

        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        System.out.println("------");

        // modificando ou adicionando um valor a lista (forma certa)
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));

        numerosList.add(19);

        System.out.println(numerosList);
        System.out.println("------");

        // criando uma lista baseado em uma array, em uma unica linha
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<String> list1 = Arrays.asList("Arthur", "John", "Jack");

        /* mudamos o nivel de linguagem de 8 para 11 */

    }
}
