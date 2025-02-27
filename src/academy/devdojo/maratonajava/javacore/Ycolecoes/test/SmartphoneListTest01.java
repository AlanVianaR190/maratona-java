package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1111", "Samsung");
        Smartphone s2 = new Smartphone("1222", "Iphone");
        Smartphone s3 = new Smartphone("4311", "Motorola");

        List<Smartphone> smartphones = new ArrayList<>();

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(1, s3);

        // smartphones.clear();

        for(Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("1222", "Iphone");
        smartphones.add(s4);

        System.out.println(smartphones.contains(s4));

        int indexSmartphone = smartphones.indexOf(s4);
        System.out.println(indexSmartphone);
        System.out.println(smartphones.get(indexSmartphone));

        /*
        O índice de s4 é 2 porque o método indexOf() retorna a primeira ocorrência de um objeto
        que é considerado igual (pelo método equals()). Nesse caso, s2 e s4 têm o mesmo
        serial ("1222"), então indexOf(s4) retorna o índice de s2, que é 2.
        */

        /*
        O método .contains() é usado para verificar se um elemento específico está presente na lista.

        O método .indexOf() é usado para encontrar o índice (posição) da primeira ocorrência de um
        elemento na lista. -1 Se o elemento não estiver na lista.

        Tanto o .contains() quanto o .indexOf() dependem do método equals() para comparar os objetos. Se a
        classe Smartphone não sobrescrever o método equals(), o comportamento padrão é comparar as referências
        de memória dos objetos (ou seja, verificar se são o mesmo objeto). Para que o .contains() e
        o .indexOf() funcionem corretamente, é importante sobrescrever o método equals() na classe.

        O método .contains() e o .indexOf() percorrem a lista sequencialmente (complexidade O(n)), então
        podem ser lentos para listas muito grandes.
        */

    }
}
