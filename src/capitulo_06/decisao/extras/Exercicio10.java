package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço unitário: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o percentual de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        System.out.print("Digite o valor mínimo para frete grátis: ");
        double minimoFrete = scanner.nextDouble();

        System.out.print("Digite a taxa de entrega: ");
        double taxaEntrega = scanner.nextDouble();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida");
        } else {

            double subtotal = preco * quantidade;
            double valorDesconto = 0.0;

            if (quantidade >= 5) {
                valorDesconto = subtotal * (percentualDesconto / 100);
            }

            double valorComDesconto = subtotal - valorDesconto;
            double frete;

            if (valorComDesconto >= minimoFrete) {
                frete = 0.0;
            } else {
                frete = taxaEntrega;
            }

            double totalFinal = valorComDesconto + frete;

            System.out.println("Subtotal: R$ " + subtotal);
            System.out.println("Valor do desconto: R$ " + valorDesconto);
            System.out.println("Frete: R$ " + frete);
            System.out.println("Total final: R$ " + totalFinal);
        }
    }
}