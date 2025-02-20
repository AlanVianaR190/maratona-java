package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(1L, "John", "aluno1234");

        /*

        */

        //serializar(aluno);

        deserializar();
    }

    /*
    A serialização é o processo de converter um objeto Java em uma sequência de
    bytes. Essa sequência de bytes pode ser armazenada em um arquivo, enviada
    por uma rede ou usada de outras formas.

    A interface Serializable é uma interface marcadora (não possui métodos), que
    simplesmente indica que o objeto pode ser serializado.

    O processo de serialização é realizado usando a classe ObjectOutputStream.
    */

    private static void serializar(Aluno aluno){

        Path path = Paths.get("folder/aluno.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /*
    A deserialização é o processo inverso da serialização. Consiste
    em reconstruir um objeto a partir de uma sequência de bytes.

    O objeto é reconstruído usando a classe ObjectInputStream.

    O objeto deve ter sido serializado anteriormente.
    */

    private static void deserializar(){

        Path path = Paths.get("folder/aluno.ser");

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
