package veiculos;

public class Autodromo {
    public static void main(String[] args) {
        Carro uno = new Carro("IKB-1212");
        System.out.println(uno.getPlaca());
        uno.ligar();

        Moto cbTwister = new Moto("IYX-2340");
        System.out.println(cbTwister.getPlaca());
        cbTwister.ligar();
    }
}
