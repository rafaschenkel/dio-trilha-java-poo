package messenger.apps;

public class Telegram extends AppMessagem {
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarMensagens();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarMensagens();
    }

    @Override
    protected void salvarMensagens() {
        System.out.println("Mensagem salva na Telegram Cloud");
    }
}