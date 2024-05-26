import iphone.IPhone;

public class Celular {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.atender();
        iphone.ligar("(51)99900-0099");
        iphone.iniciarCorreioVoz("*555");

        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://github.com/rafaschenkel");
        iphone.atualizarPagina();

        iphone.selecionarMusica("Corpo & Alma: Perigosa e linda");
        iphone.pausar();
        iphone.tocar();
    }
}
