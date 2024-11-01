package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args){

        double salarioAnul = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaaFaixa = 37.35 / 100;
        double terceiraaFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnul <= 34712){
            valorImposto = salarioAnul * primeiraFaixa;
        } else if (salarioAnul >= 34713 && salarioAnul <= 68507) {
            valorImposto = salarioAnul * segundaaFaixa;
        }else {
            valorImposto = salarioAnul * terceiraaFaixa;
        }

        System.out.println(valorImposto);
    }
}
