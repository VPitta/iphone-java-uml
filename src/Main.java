public class Main {
    public static void main(String[] args) {
        MeuIphone meuIphone = new MeuIphone();

        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine Dragons - Believer");
        meuIphone.pausar();

        meuIphone.ligar("11987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
