package modulo2.encapsulamento.exercicio03;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", "Assistente");
        funcionario.setCargo("Analista");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
    }
}
