package lanchonete.atendimento.cozinha;

public class Almoxarife {
    @SuppressWarnings("unused")
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    void entregarIngredientes() {
        controlarSaida();
        System.out.println("ENTREGANDO INGREDIENTES");
    }

    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
}