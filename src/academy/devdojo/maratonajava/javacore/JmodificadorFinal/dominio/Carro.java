package academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio;

public class Carro {

    private String nome;

    // constante
    public static final double VELOCIDADE_LIMITE = 250;

    /* uma constante em Java e definida pela palavra final, e geralmente
       são definidas em letras maiusculas e nos espaços utiliza-se _(uderline),
       e são definidas com o acesso estatico

       uma constante já tem um valor definido e não pode ser alterado */



    /* {
        VELOCIDADE_LIMITE = 250;
    } */



    /* esta e uma formar de definir o valor de uma constante, atraves de um bloco
       de inicialização, porem se a constante não for estatica o bloco de inicialização
       tambem não deve ser estatico */



    /* public Carro() {
        VELOCIDADE_LIMITE = 250;
    } */



    /* e por ultimo ela tambem pode ser definida em um construtor, o IMPORTANTE e
       que ela precisa ser definida */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
