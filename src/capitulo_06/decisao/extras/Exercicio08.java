package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: ");
        double valorPago = scanner.nextDouble();

        if (valorPago >= valorCompra) {
            double troco = valorPago - valorCompra;
            System.out.println("Pagamento aprovado");
            System.out.println("Troco de R$ " + troco);
        } else {
            double valorFaltante = valorCompra - valorPago;
            System.out.println("Pagamento insuficiente");
            System.out.println("Faltam R$ " + valorFaltante);
        }
    }
}