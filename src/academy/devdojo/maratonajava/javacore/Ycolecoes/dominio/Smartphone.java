package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {

    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //metodo equals sobrescrito
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; // verifica se o objeto e nulo
        if (this == obj) return true; // verifica se o objeto e o proprio this
        if (this.getClass() != obj.getClass()) return false; // verifica se as classes são iguais
        Smartphone smartphone = (Smartphone) obj; // faz o cast para smartphone
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber); // compara os serialNumber
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
