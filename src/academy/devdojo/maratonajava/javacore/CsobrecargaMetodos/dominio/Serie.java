package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio;

public class Serie {

    private String nome;
    private String genero;
    private int episodios;
    private String streaming;

    /* construtores dão origem ao objeto, se sua classe não possui um o java internamente
       faz um, e eles possuem o mesmo nome da classe */

    public void init(String nome, String genero, int episodios){
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
    }

    // sobrecarga de metodos
    public void init(String nome, String genero, int episodios, String streaming){
        this.init(nome, genero, episodios);
        this.streaming = streaming;
    }

    /* sobrecarga de metodo e ter um metodo com o mesmo nome porém com o numero ou tipo de
       parametros diferentes, neste metodo usamos o this. para referenciar um metodo já existente
       e adicionamos o necessario */

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.streaming);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getStreaming() {
        return streaming;
    }

    public void setStreaming(String streaming) {
        this.streaming = streaming;
    }

    /* em termos de importancia os metodos getters e setters tem menos por isso
       costuma ficar no final do codigo */
}
