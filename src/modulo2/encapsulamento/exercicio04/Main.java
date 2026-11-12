package modulo2.encapsulamento.exercicio04;

public class Main {
    public static void main(String[] args) {
        Aluno primeiro = new Aluno();
        Aluno segundo = new Aluno();
        primeiro.setNome("Ana");
        segundo.setNome("Bruno");
        primeiro.setNome("Amanda");
        System.out.println("Primeiro aluno: " + primeiro.getNome());
        System.out.println("Segundo aluno: " + segundo.getNome());
    }
}
