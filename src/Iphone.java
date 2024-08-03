
public class Iphone extends Dispositivo implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {}

    public Iphone(String marca, String modelo, String serialNumber) {
        super(marca, modelo, serialNumber);
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada.");
    }

    @Override
    public void finalizarChamada() {
        System.out.println("Chamada finalizada.");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página.");
    }
}
