package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Collections;
import java.util.Objects;

public class Game implements Comparable<Game> {

    /*
    A interface Comparable é usada para definir a ordem natural de uma classe, ela permite
    que objetos de uma classe sejam comparados entre si com base em um critério específico.

    Use Comparable quando a classe tiver uma ordem natural clara e única, se você tem uma
    classe e quer que sejam ordenados por ID ou nome por padrão.
    */

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Game(Long id, String nome, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;

        /*
        Objects.requireNonNull(), o método é usado para:
        Validar parâmetros: Garantir que um objeto passado como argumento para um método não seja nulo.
        Melhorar a legibilidade: Substituir verificações manuais de null por uma chamada simples e clara.
        Lançar exceções personalizadas: Permitir que você forneça uma mensagem de erro personalizada ao lançar a exceção.
        */
    }

    public Game(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id) && Objects.equals(nome, game.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    /*
    Metodo .equls() & .hashCode() criados a partir do alt + insert,
    */

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Game outroGame) {

        // negativo se o this. < outroGame
        // se this == outroGame return 0
        // positivo se this > outroGame

        /* if (this.id < outroGame.getId()){
            return -1;
        } else if (this.id.equals(outroGame.getId())){
            return 0;
        } else {
            return 1;
        } */

        /* todo este codigo pode ser redusido para este, isto por que os wrapper
            contem o metodo compareTo */

        return this.id.compareTo(outroGame.getId());

        // return this.nome.compareTo(outroGame.getNome());
        // return Double.compare(preco, outroGame.getPreco());
        // return Double.valueOf(preco).compareTo(outroGame.getPreco());
    }
}
