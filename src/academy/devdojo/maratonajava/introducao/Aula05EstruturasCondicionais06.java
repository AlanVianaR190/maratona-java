package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {

    public static void main(String[] args) {

        byte dia = 4;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS não é dia util!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("De segunda há sexta é dia util!");
                break;
            default:
                System.out.println("Dia não identificado!");
                break;

        }

        /* fazer uma estrutura codicional <switch> desta forma torna o codigo mais limpo, apesar
           que pode depender da equipe do projeto aceitar desta forma */
    }
}
