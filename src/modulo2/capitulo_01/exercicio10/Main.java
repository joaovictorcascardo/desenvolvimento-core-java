package modulo2.capitulo_01.exercicio10;

public class Main {
    public static void main(String[] args) {
        ItemPedido item = new ItemPedido("Suco", 2, 6.0);

        System.out.println(item.produto + " | " + item.quantidade + " | " + item.valorUnitario + " | " + item.total);

        item.quantidade = 3;
        item.valorUnitario = 5.0;
        item.total = item.quantidade * item.valorUnitario;

        System.out.println(item.produto + " | " + item.quantidade + " | " + item.valorUnitario + " | " + item.total);

        ItemPedido item2 = new ItemPedido("Sucsso", 2, 6.0);

    }
}