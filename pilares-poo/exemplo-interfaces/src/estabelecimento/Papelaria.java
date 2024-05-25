package estabelecimento;

import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.Multifuncional;

public class Papelaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        scanner.digitalizar();

        Xerox xerox = new Xerox();
        xerox.copiar();

        Impressora deskjet = new Deskjet();
        deskjet.imprimir();

        Multifuncional multifuncional = new Multifuncional();
        multifuncional.digitalizar();
        multifuncional.copiar();
        multifuncional.imprimir();
    }
}
