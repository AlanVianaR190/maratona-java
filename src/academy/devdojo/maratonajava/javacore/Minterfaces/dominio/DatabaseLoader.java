package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados...");
    }

    /* quando esta trabalhando com intefaces se utiliza o implements,
       e é possivel implementar varias intefaces */

    @Override
    public void checkPermission() {
        System.out.println("Checando opções no banco de dados.. ");
    }
}
