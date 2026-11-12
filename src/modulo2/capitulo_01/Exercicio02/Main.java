package modulo2.capitulo_01.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Bruno", 17);
        System.out.println("Idade: " + aluno.idade);
        aluno.idade = 18;
        System.out.println("Idade: " + aluno.idade);

    }
}
