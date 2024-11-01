package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {

    /* Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
       a condição e que o valor da parcela tem de ser maior ou igual a mil*/

    public static void main(String[] args) {
        double valorCarro = 60000;
        for (int parcela = 1; parcela < valorCarro ; parcela++) {
            double valorDaParcela = valorCarro / parcela;
            if (valorDaParcela < 1000){
                break;
            }
            System.out.println("Parcelas: "+parcela+" Valor da parcela: "+valorDaParcela);
        }
    }
}
