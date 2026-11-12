package capitulo_07.metodos;

public class Exercicio11 {
    public static void main(String[] args) {
        exibirTabuada(4, 3);
    }

    public static void exibirTabuada(int numero, int limite) {
        for (int i = 1; i <= limite; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}