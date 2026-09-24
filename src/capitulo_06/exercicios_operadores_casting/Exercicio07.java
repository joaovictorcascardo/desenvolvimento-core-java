package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pontuação atual: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida. Esperado um número inteiro.");
            return;
        }
        int pontuacao = sc.nextInt();
        if (pontuacao < 0 || pontuacao > 1000) {
            System.out.println("Erro: A pontuação deve estar entre 0 e 1000.");
            return;
        }

        System.out.print("Participou (1 = sim; 0 = não): ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida. Esperado um número inteiro.");
            return;
        }
        int participou = sc.nextInt();
        if (participou != 0 && participou != 1) {
            System.out.println("Erro: Indicador inválido. Use 1 para participou ou 0 para não participou.");
            return;
        }

        if (participou == 1) {
            pontuacao++;
        }

        System.out.printf("Pontuação final: %d%n", pontuacao);
    }
}