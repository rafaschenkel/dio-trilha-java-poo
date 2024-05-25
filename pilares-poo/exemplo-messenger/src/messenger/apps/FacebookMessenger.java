package messenger.apps;

public class FacebookMessenger extends AppMessagem {
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvarMensagens();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
        salvarMensagens();
    }

    protected void salvarMensagens() {
        System.out.println("Mensagem salva na Meta Cloud");
    }
}