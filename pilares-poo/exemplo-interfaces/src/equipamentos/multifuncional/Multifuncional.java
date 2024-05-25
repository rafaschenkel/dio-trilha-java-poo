package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {

    public void imprimir() {
        System.out.println("MULTIFUNCIONAL IMPRIMINDO");
    }

    public void digitalizar() {
        System.out.println("MULTIFUNCIONAL DIGITALIZANDO");
    }

    public void copiar() {
        System.out.println("MULTIFUNCIONAL COPIANDO");
    }

}
