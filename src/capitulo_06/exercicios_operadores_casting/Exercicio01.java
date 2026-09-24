package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aviso: Use vírgula para casas decimais");

        System.out.print("Saldo inicial: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida esperado um número");
            return;
        }
        double saldo = sc.nextDouble();
        if (saldo < 0) {
            System.out.println("Erro: Saldo não pode ser negativo");
            return;
        }

        System.out.print("Depósito: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida esperado um número");
            return;
        }
        double deposito = sc.nextDouble();
        if (deposito < 0) {
            System.out.println("Erro: Depósito não pode ser negativo");
            return;
        }

        saldo += deposito;
        System.out.printf("Após depósito: %.2f%n", saldo);

        System.out.print("Compra: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida esperado um número");
            return;
        }
        double compra = sc.nextDouble();
        if (compra < 0) {
            System.out.println("Erro: Compra não pode ser negativa");
            return;
        }

        if (compra > saldo) {
            System.out.println("Erro: Compra recusada por saldo insuficiente");
            System.out.printf("Saldo final: %.2f%n", saldo);
        } else {
            saldo -= compra;
            System.out.printf("Saldo final: %.2f%n", saldo);
        }
    }
}