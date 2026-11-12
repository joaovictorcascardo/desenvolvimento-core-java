package modulo2.encapsulamento.exercicio09;

public class Main {
    public static void main(String[] args) {
        Estoque objeto = new Estoque();
        objeto.setQuantidade(15);
        System.out.println(objeto.getQuantidade());
        objeto.setQuantidade(0);
        System.out.println(objeto.getQuantidade());
        objeto.setQuantidade(-2);
        System.out.println(objeto.getQuantidade());
    }
}
