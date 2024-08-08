// File: src/Iphone/Main.java
package Iphone;

public class Main {
    public static void main(String[] args) {
        // Criação de uma instância da classe Iphone
        Iphone iphone = new Iphone();

        // Testando os métodos do ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Bad Romance");

        // Testando os métodos do AparelhoTelefonico
        iphone.ligar("1234-5789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando os métodos do NavegadorInternet
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
