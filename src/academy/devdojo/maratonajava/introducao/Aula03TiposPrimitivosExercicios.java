package academy.devdojo.maratonajava.introducao;

/* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na
data <data>. */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args){
        String nome = "Alan";
        String endereco = "Rua Marechal nº81";
        double salario = 2100;
        String dataRecebimento = "06/12/2024";
        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo " +
                "que recebi o salário de R$"+salario+", na data "+dataRecebimento+".");
    }
}
