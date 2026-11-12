package modulo2.encapsulamento.exercicio18;

public class Main {
    public static void main(String[] args) {
        Inscricao objeto = new Inscricao();
        objeto.setIdade(20);
        System.out.println(objeto.getIdade());
        objeto.setIdade(12);
        System.out.println(objeto.getIdade());
    }
}
