package capitulo_07.lacos.for_basico;

public class Exercicio07 {
    public static void main(String[] args) {
        int[] numeros = {15, 8, 42, 4, 23, 108, 16};
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior valor encontrado é: " + maior);
    }
}
