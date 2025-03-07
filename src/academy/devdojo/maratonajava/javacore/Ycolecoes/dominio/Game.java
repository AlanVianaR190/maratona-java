package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Collections;
import java.util.Objects;

public class Game {

    private Long id;
    private String nome;
    private double preco;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Double.compare(preco, game.preco) == 0 && Objects.equals(id, game.id) && Objects.equals(nome, game.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
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
}
