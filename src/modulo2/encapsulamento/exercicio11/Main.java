package modulo2.encapsulamento.exercicio11;

public class Main {
    public static void main(String[] args) {
        AparelhoSom objeto = new AparelhoSom();
        objeto.setVolume(50);
        System.out.println(objeto.getVolume());
        objeto.setVolume(100);
        System.out.println(objeto.getVolume());
        objeto.setVolume(101);
        System.out.println(objeto.getVolume());
        objeto.setVolume(-5);
        System.out.println(objeto.getVolume());
    }

}
