package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    /* enumeração é um tipo especial de classe onde todos os atributos são constantes
       a enumeração e indicada quando em um programa vamos ter varias constantes, ela é
       otima quando temos uma quantidade limitada  de escolha e precisamos forçar entre
       essas opções

       */

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()){
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    /* o método tipoClientePorNomeRelatorio busca um tipo de cliente (PESSOA_FISICA ou PESSOA_JURIDICA)
       com base no nome que recebe como parâmetro

       o método values() retorna todos os valores do enum (PESSOA_FISICA e PESSOA_JURIDICA)
       o foreach percorre esses valores um a um */

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
