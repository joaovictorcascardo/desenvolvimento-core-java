package modulo2.encapsulamento.exercicio17;

public class Main {
    public static void main(String[] args) {
        ItemLoja item = new ItemLoja();
        item.setNome("Caneta");
        item.setPreco(5.5);
        item.setQuantidade(10);
        item.setPreco(-2);
        item.setQuantidade(-3);
        System.out.println("Nome: " + item.getNome());
        System.out.println("Preço: " + item.getPreco());
        System.out.println("Quantidade: " + item.getQuantidade());
    }
}
