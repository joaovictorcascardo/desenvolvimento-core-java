package modulo2.capitulo_01.exercicio06;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Caneta", 20);

        System.out.println(estoque.produto + " - inicial: " + estoque.quantidade);

        estoque.quantidade += 8;
        System.out.println("Após entrada: " + estoque.quantidade);

        estoque.quantidade -= 5;
        System.out.println("Após venda: " + estoque.quantidade);
    }
}