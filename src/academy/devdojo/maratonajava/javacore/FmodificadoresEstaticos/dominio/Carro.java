package academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

    // modificador static no atributo
    private static double velocidadeLimite = 250;

    /* um atributo estatico significa que pertence a classe e não aos objetos criados,
       ou seja todos irão compartilhar do mesmo valor */

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-----------------------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade limite: "+Carro.velocidadeLimite);
    }

    /* a unica forma de acessar um atributo estatico e pela propria classe, aqui no
       caso a Carro. */

    // metodo estatico
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    /* em metodos estaticos não e possivel acessar atributos ou variaveis que não são estaticas

       segundo as boas praticas do Java só e viavel usar metodos estaticos quando os metodos não acessam uma
       variavel ou atributo do objeto instanciado */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
