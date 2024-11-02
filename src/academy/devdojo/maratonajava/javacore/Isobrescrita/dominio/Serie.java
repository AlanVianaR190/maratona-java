package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Serie {

    private String nome;

    public Serie(String nome) {
        this.nome = nome;
    }

    // sobrescrita do metodo toString()
    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                '}';
    }

    /* o método toString() em Java é um método herdado da classe Object e é
       usado para retornar uma representação em formato string de um objeto, aqui ele
       esta sendo sobrescrito para fornecer uma melhor descrição

       para verificar se esta usando coretamente a sobrescrita neste metodo usar
       o @Override e prestar atenção no nome */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
