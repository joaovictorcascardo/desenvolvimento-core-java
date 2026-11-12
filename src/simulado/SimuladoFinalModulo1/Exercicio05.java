package simulado.SimuladoFinalModulo1;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] vendas = new double[3][4];
        double[] totalPorFilial = new double[3];
        double[] totalPorSemana = new double[4];
        double totalRede = 0.0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                vendas[i][j] = scanner.nextDouble();
                totalPorFilial[i] += vendas[i][j];
                totalPorSemana[j] += vendas[i][j];
                totalRede += vendas[i][j];
            }
        }

        int filialDestaque = 1;
        double maiorTotalFilial = totalPorFilial[0];
        for (int i = 1; i < 3; i++) {
            if (totalPorFilial[i] > maiorTotalFilial) {
                maiorTotalFilial = totalPorFilial[i];
                filialDestaque = i + 1;
            }
        }

        int semanaDestaque = 1;
        double maiorTotalSemana = totalPorSemana[0];
        for (int j = 1; j < 4; j++) {
            if (totalPorSemana[j] > maiorTotalSemana) {
                maiorTotalSemana = totalPorSemana[j];
                semanaDestaque = j + 1;
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("Filial %d: R$ %,.2f%n", (i + 1), totalPorFilial[i]);
        }

        for (int j = 0; j < 4; j++) {
            System.out.printf("Semana %d: R$ %,.2f%n", (j + 1), totalPorSemana[j]);
        }

        System.out.printf("Total da rede: R$ %,.2f%n", totalRede);
        System.out.printf("Filial destaque: %d — R$ %,.2f%n", filialDestaque, maiorTotalFilial);
        System.out.printf("Semana destaque: %d — R$ %,.2f%n", semanaDestaque, maiorTotalSemana);

    }
}