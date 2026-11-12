package capitulo_07.metodos;

public class Exercicio09 {
    public static void main(String[] args) {
        System.out.println(maior(9, 4));
        System.out.println(maior(6, 6));
    }

    static int maior(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}