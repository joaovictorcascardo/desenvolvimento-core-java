package simulado.SimuladoFinalModulo1;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        double[] itens = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            itens[i] = scanner.nextDouble();
        }

        double total = calcularTotal(itens, 0);

        System.out.println("Itens: " + quantidade);
        System.out.printf("Total do pedido: R$ %.2f\n", total);
    }

    public static double calcularTotal(double[] valores, int indice) {
        if (indice == valores.length) {
            return 0;
        }

        return valores[indice] + calcularTotal(valores, indice + 1);
    }
}

