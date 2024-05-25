package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Rafael");
        aluno1.setIdade(33);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getIdade());
    }
}
