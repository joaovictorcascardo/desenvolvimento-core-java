package modulo2.encapsulamento.exercicio20;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setNome("Java básico");
        curso.setMensalidade(250.0);
        curso.setVagas(20);
        curso.setNome("");
        curso.setMensalidade(-50);
        curso.setVagas(-1);
        System.out.println("Código: " + curso.getCodigo());
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Mensalidade: " + curso.getMensalidade());
        System.out.println("Vagas: " + curso.getVagas());
    }
}
