package academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio;

public class Carro {

    private String nome;

    // constante
    public static final double VELOCIDADE_LIMITE = 250;

    /* uma constante em Java e definida pela palavra final, geralmente
       são definidas em letras maiusculas e nos espaços utiliza-se _(uderline),
       e são definidas com o acesso estatico

       uma constante deve ter um valor definido para ser inicializada
       e não pode ser alterado

       uma forma de definir o valor de uma constante e atraves de um bloco
       de inicialização, porem se a constante não for estatica o bloco de inicialização
       tambem não deve ser estatico

       por ultimo ela tambem pode ser definida em um construtor, o IMPORTANTE e
       que ela precisa ser inicializada/definida */

    public final Comprador COMPRADOR = new Comprador();

    /* o COMPRADOR é uma constante que guarda um objeto da classe Comprador, isso
     significa que você não pode trocar esse objeto por outro depois que ele é criado.
     Mas você pode modificar as informações dentro desse objeto. */

    public final void imprime(){
        System.out.println(this.nome);
    }

    /* o modificado final em metodos proibe que este mesmo metodo seja
       sobrescrito, e o modificdor final em classes proibe que este
       seja herdado por outra classe */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
