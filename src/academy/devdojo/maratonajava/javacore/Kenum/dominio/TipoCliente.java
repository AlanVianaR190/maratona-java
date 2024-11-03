package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {

    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    /* enumeração é um tipo especial de classe onde todos os atributos são constantes
       a enumeração e indicada quando em um programa vamos ter varias constantes, ela é
       otima quando temos uma quantidade limitada  de escolha e precisamos forçar entre
       essas opções

       */

    public final int VALOR;

    TipoCliente(int valor){
        this.VALOR = valor;
    }

}
