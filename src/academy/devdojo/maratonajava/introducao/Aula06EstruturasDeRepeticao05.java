package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {

    /* Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
       a condição e que o valor da parcela tem de ser maior ou igual a mil*/

    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1 ; parcela--) {
            double valorDaParcela = valorCarro / parcela;
            if (valorDaParcela < 1000){
                continue;
            }
            System.out.println("Parcelas: "+parcela+" Valor da parcela: "+valorDaParcela);
        }
    }
}
