package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Estoque: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }

        int estoque = sc.nextInt();
        if (estoque < 0) {
            System.out.println("Erro: O estoque não pode ser negativo");
            return;
        }

        if (estoque > 0) {
            System.out.println("Venda realizada");
            estoque--;
        } else {
            System.out.println("Produto esgotado");
        }

        System.out.printf("Estoque final: %d%n", estoque);
    }
}