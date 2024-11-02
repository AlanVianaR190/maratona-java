package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    /* 0 - Bloco de inicialização estatico da SUPERclasse e executado quando a JVM carregar a classe
       1 - Bloco de inicialização estatico da SUBclasse e executado quando a JVM carregar a classe filha
       2 - Alocando esaço em memoria para objeto da SUPERclasse
       3 - Cada atributo de SUPERclasse e criado e inicializado com valores default ou que for passado
       4 - Bloco de inicialização da SUPERclasse é executadona na ordem em que aparece
       5 - Construtor e executado da SUPERclasse
       6 - Alocando esaço em memoria para objeto da SUBclasse
       7 - Cada atributo de SUBclasse e criado e inicializado com valores default ou que for passado
       8 - Bloco de inicialização da SUBclasse é executadona na ordem em que aparece
       9 - Construtor e executado da SUBclasse*/

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("John");
    }
}
