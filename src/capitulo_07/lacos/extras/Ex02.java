package capitulo_07.lacos.extras;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vendas = new double[6];
        double totalVendido = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o dia " + (i + 1));
            vendas[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Dia: " + i + " Valor " + vendas[i]);
            totalVendido += vendas[i];

        }
        double media = totalVendido / vendas.length;
        System.out.println("Total vendido: " + totalVendido + " Média diária: " + media);
    }
}
