package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aviso: Use vírgula para casas decimais");

        System.out.print("Preço: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida  esperado um número");
            return;
        }
        double preco = sc.nextDouble();
        if (preco <= 0) {
            System.out.println("Erro: O preço deve ser maior que zero");
            return;
        }

        System.out.print("Reajuste: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida. Esperado um número");
            return;
        }
        double reajuste = sc.nextDouble();
        if (reajuste < 0 || reajuste > 100) {
            System.out.println("Erro: O reajuste deve estar entre 0 e 100");
            return;
        }

        System.out.print("Pagamento (1 = à vista, 2 = parcelado): ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida esperado um número inteiro");
            return;
        }
        int opcao = sc.nextInt();
        if (opcao != 1 && opcao != 2) {
            System.out.println("Erro: Forma de pagamento inválida. Aceito apenas 1 ou 2");
            return;
        }

        preco += preco * (reajuste / 100.0);
        System.out.printf("Preço reajustado: %.2f%n", preco);

        double total = preco;
        if (opcao == 1) {
            total -= total * 0.10;
        }

        System.out.printf("Total a pagar: %.2f%n", total);
    }
}