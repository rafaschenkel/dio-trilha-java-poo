package messenger;

import messenger.apps.AppMessagem;
import messenger.apps.FacebookMessenger;
import messenger.apps.MSNMessenger;
import messenger.apps.Telegram;

public class Computador {
    public static void main(String[] args) {
        AppMessagem app = null;

        String appEscolhido = "msn";

        switch (appEscolhido) {
            case "tlg":
                app = new Telegram();
                app.enviarMensagem();
                app.receberMensagem();
                break;

            case "msn":
                app = new MSNMessenger();
                app.enviarMensagem();
                app.receberMensagem();
                break;
            case "fcb":
                app = new FacebookMessenger();
                app.enviarMensagem();
                app.receberMensagem();
                break;
        }
    }
}
