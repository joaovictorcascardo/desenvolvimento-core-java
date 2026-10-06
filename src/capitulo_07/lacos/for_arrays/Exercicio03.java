package capitulo_07.lacos.for_arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantidade de vendas: ");
        int quantidade = sc.nextInt();

        double total = 0;
        int vendasAcimaDeCem = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Valor da venda " + i + ": ");
            double valor = sc.nextDouble();
            total += valor;
            if (valor >= 100) {
                vendasAcimaDeCem++;
            }
        }

        double media = total / quantidade;
        System.out.printf("Total vendido: R$ %.2f%n", total);
        System.out.printf("Média das vendas: R$ %.2f%n", media);
        System.out.println("Vendas de pelo menos R$ 100,00: " + vendasAcimaDeCem);
    }
}
