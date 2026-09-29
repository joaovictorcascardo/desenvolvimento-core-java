package capitulo_06.enumeration;

import java.util.Scanner;

enum Entrega {
    RETIRADA, NORMAL, EXPRESSA
}

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valor = sc.nextDouble();

        System.out.println("Digite a modalidade (RETIRADA, NORMAL, EXPRESSA):");
        String entrada = sc.next().toUpperCase();
        Entrega entrega = Entrega.valueOf(entrada);

        double frete = 0;
        switch (entrega) {
            case RETIRADA:
                frete = 0.00;
                break;
            case NORMAL:
                frete = 12.00;
                break;
            case EXPRESSA:
                frete = 25.00;
                break;
        }

        double total = valor + frete;
        System.out.printf("%s: total R$ %.2f\n", entrega, total);
    }
}