package capitulo_06.exercicios_extras;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total vendido: ");
        int totalVendido = scanner.nextInt();

        System.out.print("Digite a meta de vendas: ");
        int metaVenda = scanner.nextInt();

        if(totalVendido >= metaVenda){
            System.out.println("Meta atingida");
        }

        System.out.println("Total vendido: " + totalVendido);

        scanner.close();
    }
}