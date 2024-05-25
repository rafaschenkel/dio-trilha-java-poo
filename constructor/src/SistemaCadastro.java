public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Rafael", "12343");
        pessoa1.setEndereco("Rua 1, 123");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getCpf());
        System.out.println(pessoa1.getEndereco());
    }
}
