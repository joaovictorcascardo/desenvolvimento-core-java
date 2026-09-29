package capitulo_06.enumeration;

import java.util.Scanner;

enum FormaPagamento {
    PIX, DEBITO, CREDITO
}

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valor = sc.nextDouble();

        System.out.println("Digite a forma de pagamento (PIX, DEBITO, CREDITO):");
        String entrada = sc.next().toUpperCase();

        FormaPagamento forma = FormaPagamento.valueOf(entrada);
        double valorFinal = valor;

        switch (forma) {
            case PIX:
                valorFinal = valor - (valor * 0.10);
                break;
            case DEBITO:
                valorFinal = valor - (valor * 0.05);
                break;
            case CREDITO:
                valorFinal = valor;
                break;
        }

        System.out.printf("%s: total R$ %.2f\n", forma, valorFinal);
    }
}