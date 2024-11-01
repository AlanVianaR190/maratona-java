package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // estrutura de repetição: while
        int count = 0;
        while (count < 10){
            System.out.println(++count);
        }

        /* no laço de repetição <while> o loop e executado até que a condição para o loop
           seja verdadeira, na condição vai o numero de vezes a ser executado */

        // estrutura de repetição: do/while
        count = 0;
        do {
            ++count;
            System.out.println("Dentro do do/while: "+ count);
        }while (count < 10);

        /* no laço de repetição <do/while> o loop e execuatdo pelo meons uma vez
           independente de sua condição for verdadeira ou falsa */

        // estrutura de repetição: for
        for (int i = 0; i < 10; i++){
            System.out.println("Dentro do for: "+i);
        }

        /* no laço <for> é possível definir a inicialização, condição e incremento em uma
           única linha, útil quando o número de iterações é conhecido antes do loop começar */
    }
}
