package modulo2.encapsulamento.exercicio14;

public class Main {
    public static void main(String[] args) {
        Categoria objeto = new Categoria();
        objeto.setNome("Eletrônicos");
        System.out.println(objeto.getNome());
        objeto.setNome("");
        System.out.println(objeto.getNome());
    }
}
