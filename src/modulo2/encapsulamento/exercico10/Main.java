package modulo2.encapsulamento.exercico10;

public class Main {
    public static void main(String[] args) {
        Avaliacao objeto = new Avaliacao();
        objeto.setNota(8.5);
        System.out.println(objeto.getNota());
        objeto.setNota(11);
        System.out.println(objeto.getNota());
        objeto.setNota(-1);
        System.out.println(objeto.getNota());
    }
}
