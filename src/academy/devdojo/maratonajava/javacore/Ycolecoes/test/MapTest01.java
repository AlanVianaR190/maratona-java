package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("voc", "você");

        /*
        A interface Map faz parte do Java Collections Framework e é usada para armazenar
        pares de chave-valor. Cada chave é única e mapeia para um valor específico.

        HashMap:
        Armazenamento: Usa uma tabela hash para armazenar os pares chave-valor.
        Ordem: Não garante a ordem de inserção das chaves. A ordem pode mudar conforme elementos são adicionados ou removidos.

        LinkedHashMap:
        Armazenamento: Estende HashMap e mantém uma lista duplamente vinculada para preservar a ordem de inserção.
        Ordem: Garante a ordem de inserção das chaves. Os elementos são iterados na ordem em que foram adicionados.

        O método .put() é usado para adicionar ou atualizar um par chave-valor no Map.
        */

        System.out.println(map);

        //
        for (String key: map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("----------------------------");

        //
        for (String value: map.values()){
            System.out.println(value);
        }
        System.out.println("----------------------------");

        /*
        O método keySet() retorna um Set contendo todas as chaves do Map. Como um Set, ele
        não permite elementos duplicados, o que faz sentido, já que as chaves em um Map são únicas.

        O método get() retorna o valor associado a uma chave específica. Se a chave não existir no Map, ele retorna null.

        O método values() retorna uma Collection contendo todos os valores do Map. Diferente das
        chaves, os valores podem ser duplicados.
        */

        //
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
