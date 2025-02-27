package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {

    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // metodo equals sobrescrito
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; // verifica se o objeto e nulo
        if (this == obj) return true; // verifica se o objeto e o proprio this
        if (this.getClass() != obj.getClass()) return false; // verifica se as classes são iguais
        Smartphone smartphone = (Smartphone) obj; // faz o cast para smartphone
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber); // compara os serialNumber
    }

    // metodo hash sobrescrito
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    /*
    O equals é um método usado para comparar dois objetos e verificar se eles são iguais. Por padrão
    o equals compara as referências de memória dos objetos (ou seja, se são o mesmo objeto na memória). Mas
    você pode sobrescrever o equals para comparar os atributos dos objetos.

    O hashCode é um método que retorna um número inteiro que representa o objeto. Por padrão
    o hashCode retorna um número baseado no endereço de memória do objeto. Também
    pode sobrescrever o hashCode para gerar um número baseado nos atributos do objeto.

    Regra do equals e hashCode:
    Se dois objetos são iguais (equals retorna true), eles devem ter o mesmo hashCode.
    Se dois objetos têm o mesmo hashCode, eles não precisam ser iguais (pode haver colisões).

    Resumo:
    equals: Compara dois objetos para ver se são iguais.
    hashCode: Gera um número que representa o objeto, usado em coleções.
    Regra: Se equals retorna true, o hashCode deve ser o mesmo.
    */

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
