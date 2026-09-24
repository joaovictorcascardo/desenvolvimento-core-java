package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco = scanner.nextDouble();
        int quantidade = scanner.nextInt();

        double subtotal = preco * quantidade;
        double desconto = 0;

        if (quantidade >= 10) {
            desconto = subtotal * 0.10;
        } else if (quantidade >= 5) {
            desconto = subtotal * 0.05;
        }

        double total = subtotal - desconto;

        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total: R$ " + total);
    }
}