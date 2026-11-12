package modulo2.encapsulamento.exercicio07;

public class Main {
    public static void main(String[] args) {
        Pessoa objeto = new Pessoa();
        objeto.setIdade(25);
        System.out.println(objeto.getIdade());
        objeto.setIdade(-3);
        System.out.println(objeto.getIdade());
    }
}
