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
}
