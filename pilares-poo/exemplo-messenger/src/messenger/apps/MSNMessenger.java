package messenger.apps;

public class MSNMessenger extends AppMessagem {
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Enviando mensagem pelo MSN Messenger");
        salvarMensagens();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
        salvarMensagens();
    }

    protected void salvarMensagens() {
        System.out.println("Mensagem salva na Azure");
    }

}