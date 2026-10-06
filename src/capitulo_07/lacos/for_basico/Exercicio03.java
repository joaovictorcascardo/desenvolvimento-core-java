package capitulo_07.lacos.for_basico;

public class Exercicio03 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 a 100 é: " + soma);
    }
}
