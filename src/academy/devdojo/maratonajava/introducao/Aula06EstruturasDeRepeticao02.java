package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {

    /* imprima todos os numeros pares de 0 até 1000000 */

    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
