package capitulo_07.lacos.for_basico;

public class Exercicio10 {
    public static void main(String[] args) {
        int n = 5;
        long fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
    }
}
