package messenger.apps;

public abstract class AppMessagem {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void verificarConexao() {
        System.out.println("Conectado");
    }

    protected abstract void salvarMensagens();

}
