package academy.devdojo.maratonajava.javacore.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("mensagem", new Locale("pt", "BR"));

        /* A classe ResourceBundle em Java é usada para facilitar a internacionalização, ela permite
           que você armazene mensagens, textos e outros recursos (como formatos de data ou números) em
           arquivos separados, organizados por idioma e região */

        /* ao instanciar o objeto diretamente dentro do método, estamos economizando uma linha
           de código e limitando o escopo da instância, já que o Locale não será usado em outro lugar. */

        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));

        System.out.println(bundle.getString("hi"));

        //
        bundle = ResourceBundle.getBundle("mensagem", new Locale("en","US"));

        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));

        System.out.println(bundle.getString("hi"));

        /* Os arquivos .properties servem para armazenar pares chave-valor que podem ser usados
           pelo programa Java para configurar, localizar ou gerenciar informações dinâmicas, facilitando
           a internacionalização permitindo que mensagens e configurações sejam adaptadas a
           diferentes idiomas e regiões sem a necessidade de alterar o código

           ordem em que o java busca para internacionalizar

           nome_pt_BR.properties
           nome_pt.properties
           nome_en_US.properties
           nome_en.properties
           nome.properties*/

    }
}
