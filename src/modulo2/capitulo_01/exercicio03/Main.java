package modulo2.capitulo_01.exercicio03;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Caderno", 15.0);
        System.out.println("Preco: " + produto.preco);
        produto.preco = 18.5;
        System.out.println("Preco: " + produto.preco);
    }

}
