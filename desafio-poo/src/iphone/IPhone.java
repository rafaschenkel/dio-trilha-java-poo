package iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.println("Carregando pagina: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Recarregando pagina");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero);
    }

    public void atender() {
        System.out.println("Alô");
    }

    public void iniciarCorreioVoz(String numeroCorreioVoz) {
        System.out.println("Ligando para o correio de voz...");
        ligar(numeroCorreioVoz);
    }

    public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
        tocar();
    }

}
