package capitulo_07.recursividade;

public class Exercicio09 {
    public static void main(String[] args) {
        System.out.println(quantidadeAlgarismo(1000)
        );
    }

    public static int quantidadeAlgarismo(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + quantidadeAlgarismo(n / 10);
    }
}
