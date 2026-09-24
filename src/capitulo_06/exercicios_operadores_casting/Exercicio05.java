package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aviso: Use vírgula para casas decimais");

        System.out.print("Subtotal: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida esperado um número");
            return;
        }
        double subtotal = sc.nextDouble();
        if (subtotal <= 0) {
            System.out.println("Erro: O subtotal deve ser maior que zero");
            return;
        }

        System.out.print("Tipo de cliente (1 = comum; 2 = associado): ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int tipoCliente = sc.nextInt();
        if (tipoCliente != 1 && tipoCliente != 2) {
            System.out.println("Erro: Tipo de cliente inválido");
            return;
        }

        System.out.print("Crédito disponível: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida. Esperado um número");
            return;
        }
        double credito = sc.nextDouble();
        if (credito < 0) {
            System.out.println("Erro: O crédito disponível não pode ser negativo");
            return;
        }

        System.out.print("Quantidade de parcelas (1 a 6): ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida. Esperado um número inteiro");
            return;
        }
        int parcelas = sc.nextInt();
        if (parcelas < 1 || parcelas > 6) {
            System.out.println("Erro: A quantidade de parcelas deve estar entre 1 e 6");
            return;
        }

        double total = subtotal;
        double desconto = 0;

        if (tipoCliente == 2) {
            desconto = total * 0.10;
            total -= desconto;
        }

        double frete = 0;
        if (total < 200) {
            frete = 20.0;
            total += frete;
        }

        double creditoUtilizado = 0;
        if (credito >= total) {
            creditoUtilizado = total;
            total = 0;
            credito -= creditoUtilizado;
        } else {
            creditoUtilizado = credito;
            total -= creditoUtilizado;
            credito = 0;
        }

        double valorParcela = total / parcelas;

        System.out.printf("Desconto: %.2f%n", desconto);
        System.out.printf("Frete: %.2f%n", frete);
        System.out.printf("Crédito utilizado: %.2f%n", creditoUtilizado);
        System.out.printf("Crédito restante: %.2f%n", credito);
        System.out.printf("Total final: %.2f%n", total);
        System.out.printf("Valor da parcela: %.2f%n", valorParcela);

    }
}