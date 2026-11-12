package modulo2.capitulo_01.exercicio07;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("ABC1D23", "Preto");
        Veiculo veiculo2 = new Veiculo("XYZ9A87", "Branco");

        System.out.println("Antes: " + veiculo1.placa + " - " + veiculo1.cor);
        System.out.println("Antes: " + veiculo2.placa + " - " + veiculo2.cor);

        veiculo1.cor = "Azul";

        System.out.println("Depois: " + veiculo1.placa + " - " + veiculo1.cor);
        System.out.println("Depois: " + veiculo2.placa + " - " + veiculo2.cor);
    }
}