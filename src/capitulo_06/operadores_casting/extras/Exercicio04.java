package capitulo_06.operadores_casting.extras;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peças: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida  esperado um número inteiro");
            return;
        }
        int pecas = sc.nextInt();
        if (pecas < 0) {
            System.out.println("Erro: A quantidade de peças não pode ser negativa");
            return;
        }

        System.out.print("Capacidade da caixa: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida esperado um número inteiro");
            return;
        }
        int capacidade = sc.nextInt();
        if (capacidade <= 0) {
            System.out.println("Erro: Capacidade inválida, a capacidade da caixa deve ser estritamente positiva");
            return;
        }

        int caixasCompletas = pecas / capacidade;
        int pecasRestantes = pecas % capacidade;

        System.out.printf("%d caixas completas e %d peças restantes%n", caixasCompletas, pecasRestantes);
    }
}