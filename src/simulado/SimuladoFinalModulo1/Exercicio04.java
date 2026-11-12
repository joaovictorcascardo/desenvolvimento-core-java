package simulado.SimuladoFinalModulo1;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0.0;
        int qtdAgua = 0;
        int qtdSuco = 0;
        double totalGasto = 0.0;

        boolean executando = true;

        while (executando) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double credito = scanner.nextDouble();
                    saldo += credito;
                    System.out.printf("Saldo: R$ %.2f%n", saldo);
                    break;

                case 2:
                    if (saldo >= 3.00) {
                        saldo -= 3.00;
                        totalGasto += 3.00;
                        qtdAgua++;
                        System.out.printf("Água comprada. Saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    if (saldo >= 5.00) {
                        saldo -= 5.00;
                        totalGasto += 5.00;
                        qtdSuco++;
                        System.out.printf("Suco comprado. Saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 4:
                    System.out.println("Águas: " + qtdAgua);
                    System.out.println("Sucos: " + qtdSuco);
                    System.out.printf("Total gasto: R$ %.2f%n", totalGasto);
                    System.out.printf("Saldo a devolver: R$ %.2f%n", saldo);
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}