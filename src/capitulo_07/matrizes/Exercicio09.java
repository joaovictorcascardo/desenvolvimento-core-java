package capitulo_07.matrizes;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] vendas = new int[3][4];

        for (int i = 0; i < vendas.length; i++) {
            System.out.print("Vendas da loja " + (i + 1) + " nos 4 dias: ");
            for (int j = 0; j < vendas[i].length; j++) {
                vendas[i][j] = sc.nextInt();
            }
        }

        System.out.print("Opção (1 = total por loja, 2 = total por dia, 3 = total geral): ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                for (int i = 0; i < vendas.length; i++) {
                    int totalLoja = 0;
                    for (int j = 0; j < vendas[i].length; j++) {
                        totalLoja += vendas[i][j];
                    }
                    System.out.println("Loja " + (i + 1) + ": " + totalLoja);
                }
                break;
            case 2:
                for (int j = 0; j < vendas[0].length; j++) {
                    int totalDia = 0;
                    for (int i = 0; i < vendas.length; i++) {
                        totalDia += vendas[i][j];
                    }
                    System.out.println("Dia " + (j + 1) + ": " + totalDia);
                }
                break;
            case 3:
                int totalGeral = 0;
                for (int i = 0; i < vendas.length; i++) {
                    for (int j = 0; j < vendas[i].length; j++) {
                        totalGeral += vendas[i][j];
                    }
                }
                System.out.println("Total geral: " + totalGeral);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
