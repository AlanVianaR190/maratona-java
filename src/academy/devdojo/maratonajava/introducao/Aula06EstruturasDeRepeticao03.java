package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {

    /* imprima os primeiros 25 numeros de um dado valor, no caso 50 */

    public static void main(String[] args) {
        // break
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }

        /* o <break> precisa estar dentro de um qualquer um dos loop para funcionar ou
           dentro de um <switch> */
    }
}
