public enum EstadosBrasileiros {
    Rio_Grande_do_Sul("RS", "Rio Grande do Sul", 11),
    Santa_Catarina("SC", "Santa Catarina", 12),
    Parana("PR", "Paraná", 13);

    private String sigla;
    private String nome;
    private int codigoIbge;

    private EstadosBrasileiros(String sigla, String nome, int codigoIbge) {
        this.sigla = sigla;
        this.nome = nome;
        this.codigoIbge = codigoIbge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

}
