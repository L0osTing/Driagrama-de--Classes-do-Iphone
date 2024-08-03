public abstract class Dispositivo {
    public static void main(String[] args) {}
    private String marca;
    private String modelo;
    private String serialNumber;
    
    public Dispositivo(String marca, String modelo, String serialNumber) {
        this.marca = marca;
        this.modelo = modelo;
        this.serialNumber = serialNumber;
    }

    public void ligar() {
        System.out.println("Dispositivo ligado.");
    }

    public void desligar() {
        System.out.println("Dispositivo desligado.");
    }

    // Getters e Setters omitidos para brevidade
}
