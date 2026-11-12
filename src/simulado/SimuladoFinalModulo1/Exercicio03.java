package simulado.SimuladoFinalModulo1;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor == 0) {
            System.out.println("Nenhuma doação registrada.");
            scanner.close();
            return;
        }

        double totalArrecadado = 0;
        int quantidadeDoacoes = 0;
        double maiorDoacao = valor;

        while (valor != 0) {
            totalArrecadado += valor;
            quantidadeDoacoes++;

            if (valor > maiorDoacao) {
                maiorDoacao = valor;
            }

            valor = scanner.nextDouble();
        }

        double media = totalArrecadado / quantidadeDoacoes;

        System.out.printf("Total arrecadado: R$ %.2f%n", totalArrecadado);
        System.out.println("Doações: " + quantidadeDoacoes);
        System.out.printf("Média: R$ %.2f%n", media);
        System.out.printf("Maior doação: R$ %.2f%n", maiorDoacao);

    }
}