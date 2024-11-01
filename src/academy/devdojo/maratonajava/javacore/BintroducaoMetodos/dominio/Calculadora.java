package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Calculadora {

    // metodos sem retorno
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    // metodo com parametro
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 *  num2);
    }

    /* e comum e faz parte das boas praticas um metodo possuir 2 ou 3 parametros apenas */

    // metodo com retorno
    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    /* O return é uma instrução que finaliza a execução do método e devolve um valor */

    public double divideDoisNumeros2(double num1, double num2){
        if (num2 == 0){
            return 0;
        } else {
            return  num1 / num2;
        }
    }

    // metodo void com return(retorno)
    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("Não é possivel dividir por zero!");
            return;
        }
        System.out.println(num1 / num2);
    }

    /* neste o return funciona como se fosse um break ou else, forçando o encerramento
       do metodo */

    // metodo com parametro inicializado (apenas demonstração da aula CalculadoraTest04)
    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do metodo alteraDoisNumeros:");
        System.out.println("num1: "+numero1);
        System.out.println("num2: "+numero2);
    }

    // metodo com array como parametro
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //varargs
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    /* em um metodo varArgs pode ser passado varios valores de um tipo como parametro, caso
       o metodo tenha dois parametros a parte de varios valores fica por ultimo exemplo:
       varArgs(double numero, int...)*/

}
