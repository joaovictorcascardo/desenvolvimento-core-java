package simulado.SimuladoFinalModulo1;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] quantidadePorDias = new int[7];
        int somaSemanal = 0;

        for (int i = 0; i < quantidadePorDias.length; i++) {
            quantidadePorDias[i] = scanner.nextInt();
            somaSemanal += quantidadePorDias[i];
        }

        double media = (double) somaSemanal / quantidadePorDias.length;

        int qtdMaioresQueMedia = 0;
        int max = quantidadePorDias[0];

        for (int n : quantidadePorDias) {
            if (n > media) {
                qtdMaioresQueMedia++;
            }
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Total: " + somaSemanal);
        System.out.printf("Média diária: %.2f%n", media);
        System.out.println("Maior quantidade: " + max);
        System.out.println("Dias acima da média: " + qtdMaioresQueMedia);
    }
}