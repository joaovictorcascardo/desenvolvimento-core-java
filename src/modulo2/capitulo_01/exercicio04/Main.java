package modulo2.capitulo_01.exercicio04;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Hobbit", true);
        System.out.println("Disponibilidade Atual: " + livro.disponivel);
        livro.disponivel = false;
        System.out.println("Disponibilidade depois do empréstimo: " + livro.disponivel);
    }
}
