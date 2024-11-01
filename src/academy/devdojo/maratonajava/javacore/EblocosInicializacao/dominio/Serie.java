package academy.devdojo.maratonajava.javacore.EblocosInicializacao.dominio;

public class Serie {
    private String nome;
    private int[] episodios;

    // bloco de inicialização
    {
        System.out.println("Dentro do bloco de inicialização");

        this.episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    /* o bloco de inicialização e executado toda vez que um objeto e criado antes do
       construtor, pode ser criado em qualquer lugar da classe mas geralmente fica no começo */

    public Serie(String nome) {
        this.nome = nome;
    }

    public Serie() {

        for (int numero: this.episodios){
            System.out.print(numero+" ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    /* 1 - Alocando esaço em memoria para objeto
       2 - Cada atributo de classe e criado e inicializado com valores default ou que for passado
       3 - Bloco de inicialização e executado
       4 - Construtor e executado */
}
