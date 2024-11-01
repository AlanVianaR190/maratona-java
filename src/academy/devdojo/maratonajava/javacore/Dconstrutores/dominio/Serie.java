package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Serie {

    private String nome;
    private String genero;
    private int episodios;
    private String streaming;
    private int ano;


    // metodo contrutor
    public Serie(String nome, String genero, int episodios, String streaming){
        this();
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.streaming = streaming;
    }

    public Serie(){
        System.out.println("Objeto Construido");
    }

    public Serie(String nome, String genero, int episodios, String streaming, int ano){
        this(nome, genero, episodios, streaming);
        this.ano = ano;
    }

    /* construtores dão origem ao objeto, se sua classe não possui um o java internamente
       faz um, e eles possuem o mesmo nome da classe.

       Construtores tambem podem ter sobrecarga, para fazer a sobrecarga e necessario por um this() com
       os parametro se necessario e tambem precisa ser na primeira linha do construtor que ira fazer a sobrecarga */

    public void imprime(){
        System.out.println("------------");
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.streaming);
        System.out.println(this.ano);
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
