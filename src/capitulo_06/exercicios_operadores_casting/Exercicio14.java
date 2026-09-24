package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Andar atual: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int andar = sc.nextInt();
        if (andar < 0 || andar > 20) {
            System.out.println("Erro: O andar deve estar entre 0 e 20");
            return;
        }

        System.out.print("Opção (1 = descer um andar; 2 = consultar): ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int opcao = sc.nextInt();
        if (opcao != 1 && opcao != 2) {
            System.out.println("Erro: Opção inválida");
            return;
        }

        switch (opcao) {
            case 1:
                if (andar == 0) {
                    System.out.println("Já está no térreo");
                } else {
                    int destino = --andar;
                    System.out.printf("Destino: %d%n", destino);
                    System.out.printf("Atual: %d%n", andar);
                }
                break;
            case 2:
                System.out.printf("Atual: %d%n", andar);
                break;
        }

    }
}