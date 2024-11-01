package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args){
        // operador ternario: (condição) ? verdadeiro : falso
        double salario = 6000;
        String msgmDoar = "Doar $500!";
        String msgmNaoDoar = "Não doar, sem condições!";
        String resultado = salario > 5000 ? msgmDoar : msgmNaoDoar;
        System.out.println(resultado);

        double salario2 = 3000;
        String resultado2 = salario2 > 2800 ? "Doar $50!" : "Não doar, sem condições!";
        System.out.println(resultado2);

        /* o operador ternario faz a mesma coisa que essa estrutura condicional:
        if (salario > 5000){
            resultado = msgmDoar;
        } else {
            resultado = msgmNaoDoar;
        } */

    }
}
