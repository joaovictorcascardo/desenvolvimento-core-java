package modulo2.encapsulamento.exercicio13;

public class Main {
    public static void main(String[] args) {
        Veiculo objeto = new Veiculo();
        objeto.setAnoFabricacao(2018);
        System.out.println(objeto.getAnoFabricacao());
        objeto.setAnoFabricacao(1970);
        System.out.println(objeto.getAnoFabricacao());
        objeto.setAnoFabricacao(2030);
        System.out.println(objeto.getAnoFabricacao());
    }
}
