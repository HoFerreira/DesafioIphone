package Iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    public void tocar() {
        System.out.println("Reproduzindo música");
    }
    public void pausar() {
        System.out.println("Música pausada");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }
    public void atender() {
        System.out.println("Atendendo chamada");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
