package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    void load();

    /* interfaces não podem ser final, metodos em interface já são
       publicos e abstratos por natureza */

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões...");
    }

    /* a partir da versão 8 do Java existe a possibilidade de colocar metodos concretos
       na interface */

    int MAX_DATA_SIZE = 10;

    /* atributos em inteface são publicos e final(constantes por natureza) */

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface!");
    }

    /* a partir da versão 8 do Java e permitido criar metodos estaticos*/
}
