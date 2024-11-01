package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // array
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        /* arrays são variaveis de referencia a objetos e podem ser inicalizada com valor null,
           ao declarar um objeto do tipo array e obrigatorio declarar o espaço de memoria,
           ao declarar um array de tipo numerico o valor de cada espaço será de 0 e se for
           String será nulo */
    }
}
