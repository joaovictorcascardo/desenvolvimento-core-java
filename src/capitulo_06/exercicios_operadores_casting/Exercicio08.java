package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Próximo código disponível: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida. Esperado um número inteiro");
            return;
        }

        int proximoCodigo = sc.nextInt();
        if (proximoCodigo < 1 || proximoCodigo > 100000) {
            System.out.println("Erro: O código deve estar entre 1 e 100000");
            return;
        }

        int codigoPedido = proximoCodigo++;

        System.out.printf("Código do pedido: %d%n", codigoPedido);
        System.out.printf("Próximo disponível: %d%n", proximoCodigo);
    }
}