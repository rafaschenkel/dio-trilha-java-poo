package veiculos;

public class Moto extends Veiculo {

    public Moto(String placa) {
        super(placa);
    }

    public void ligar() {
        conferePezinho();
        System.out.println("Moto ligada");
    }

    private void conferePezinho() {
        System.out.println("Pezinho conferido");
    }
}
