package modulo2.encapsulamento.exercicio08;

public class Main {
    public static void main(String[] args) {
        Mercadoria objeto = new Mercadoria();
        objeto.setPreco(49.9);
        System.out.println(objeto.getPreco());
        objeto.setPreco(0);
        System.out.println(objeto.getPreco());
        objeto.setPreco(-10);
        System.out.println(objeto.getPreco());
    }
}
