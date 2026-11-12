package modulo2.encapsulamento.exercicio01;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana");

        cliente1.getNome();
        cliente1.setNome("Beatriz");
        cliente1.getNome();
    }
}
