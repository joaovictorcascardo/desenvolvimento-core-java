package modulo2.encapsulamento.exercicio12;

public class Main {
    public static void main(String[] args) {
        Oferta objeto = new Oferta();
        objeto.setPercentualDesconto(20);
        System.out.println(objeto.getPercentualDesconto());
        objeto.setPercentualDesconto(60);
        System.out.println(objeto.getPercentualDesconto());
        objeto.setPercentualDesconto(-5);
        System.out.println(objeto.getPercentualDesconto());
    }
}
