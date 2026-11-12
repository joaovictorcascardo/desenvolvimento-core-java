package modulo2.encapsulamento.exercicio02;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Caderno");
        System.out.println(produto.getDescricao());
        produto.setDescricao("Caderno universitário");
        System.out.println(produto.getDescricao());
    }
}
