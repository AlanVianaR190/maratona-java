package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        // if, else if
        int idade = 13;
        String categoria;
        if (idade < 15){
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);

        /* variaveis locais precisam ser inicializadas para evitar falgas no codigo */

        // bonus
        int idade2 = 34;
        String categoria2 = idade2 < 15 ? "Infantil" : idade2 >=15 && idade2 < 18 ? "Juvenil" : "Categoria Adulto";
        System.out.println("Categoria: "+categoria2);

        /* não é indicado usar o operador ternario desta forma, apenas
           para mostrar que é possivel */
    }
}
