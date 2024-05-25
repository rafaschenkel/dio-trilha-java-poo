package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    // pode ser default
    public void adicionarLancheNoBalcao() {
        prepararLanche();
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
    }

    // pode ser default
    public void adicionarSucoNoBalcao() {
        prepararVitamina();
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    // pode ser default
    public void adicionarComboNoBalcao() {
        prepararCombo();
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        selecionarIngredientesLanche();
        Almoxarife almoxarife = new Almoxarife();
        pedirIngredientes(almoxarife);
        lavarIngredientes();
        fritarIngredientesLanche();
        System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
    }

    private void prepararVitamina() {
        selecionarIngredientesVitamina();
        Almoxarife almoxarife = new Almoxarife();
        pedirIngredientes(almoxarife);
        lavarIngredientes();
        baterVitaminaLiquidificador();
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
    }

    void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
