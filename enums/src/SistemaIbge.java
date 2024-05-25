public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadosBrasileiros e : EstadosBrasileiros.values()) {
            System.out.println("Sigla: " + e.getSigla() + " - Nome do estado: " + e.getNome() + " - Cod. Ibge: "
                    + e.getCodigoIbge());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.Rio_Grande_do_Sul;

        System.out.println(eb);
        System.out.println("Nome do estado: " + eb.getNome());
        System.out.println("Sigla: " + eb.getSigla());
        System.out.println("Nome maiusculo " + eb.getNomeMaiusculo());
        System.out.println("Codigo Ibge: " + eb.getCodigoIbge());
    }
}
