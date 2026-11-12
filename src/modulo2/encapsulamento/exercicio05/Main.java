package modulo2.encapsulamento.exercicio05;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("O Pequeno Príncipe");
        livro.setAutor("Antoine de Saint-Exupéry");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
    }
}
