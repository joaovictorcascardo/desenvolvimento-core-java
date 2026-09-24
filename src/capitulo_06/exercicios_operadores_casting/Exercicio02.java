package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pontos: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida esperado um número inteiro");
            return;
        }
        int pontuacao = sc.nextInt();
        if (pontuacao < 0) {
            System.out.println("Erro: A pontuação não pode ser negativa");
            return;
        }

        System.out.print("Participantes: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida esperado um número inteiro");
            return;
        }
        int participantes = sc.nextInt();
        if (participantes <= 0) {
            System.out.println("Erro: A quantidade de participantes deve ser estritamente positiva");
            return;
        }
        int pontosPorPessoa = pontuacao / participantes;

        System.out.printf("Pontos por pessoa: %d%n", pontosPorPessoa);
    }
}