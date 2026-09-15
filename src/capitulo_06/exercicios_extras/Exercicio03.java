package capitulo_06.exercicios_extras;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Qual o valor minimo para desconto: ");
        double valorMinimoDesconto = scanner.nextDouble();

        System.out.println("Qual o percentual de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        double valorFinal = valorCompra;

        if (valorCompra >= valorMinimoDesconto) {
            valorFinal = valorCompra - (valorCompra * (percentualDesconto / 100));

        }

        System.out.println("Você deve pagar: " + valorFinal);
    }
}
