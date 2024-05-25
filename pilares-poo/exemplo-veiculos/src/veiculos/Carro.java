package veiculos;

public class Carro extends Veiculo {

    public Carro(String placa) {
        super(placa);
    }

    private void confereCambio() {
        System.out.println("Câmbio conferido");
    }

    private void confereOleo() {
        System.out.println("Óleo conferido");
    }

    public void ligar() {
        confereOleo();
        confereCambio();
        System.out.println("Carro ligado");
    }
}
