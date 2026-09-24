package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vagas A: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int vagasA = sc.nextInt();
        if (vagasA < 0 || vagasA > 100) {
            System.out.println("Erro: As vagas da sessão A devem estar entre 0 e 100");
            return;
        }

        System.out.print("Vagas B: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int vagasB = sc.nextInt();
        if (vagasB < 0 || vagasB > 100) {
            System.out.println("Erro: As vagas da sessão B devem estar entre 0 e 100");
            return;
        }

        System.out.print("Escolha cliente 1 (1 = A; 2 = B; 0 = não reservar): ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int escolha1 = sc.nextInt();

        System.out.print("Escolha cliente 2 (1 = A; 2 = B; 0 = não reservar): ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int escolha2 = sc.nextInt();

        System.out.print("Cliente 1: ");
        if (escolha1 == 1) {
            if (vagasA > 0) {
                vagasA--;
                System.out.println("confirmado");
            } else {
                System.out.println("sem vaga");
            }
        } else if (escolha1 == 2) {
            if (vagasB > 0) {
                vagasB--;
                System.out.println("confirmado");
            } else {
                System.out.println("sem vaga");
            }
        } else if (escolha1 == 0) {
            System.out.println("não reservou");
        } else {
            System.out.println("escolha inválida");
        }

        System.out.print("Cliente 2: ");
        if (escolha2 == 1) {
            if (vagasA > 0) {
                vagasA--;
                System.out.println("confirmado");
            } else {
                System.out.println("sem vaga");
            }
        } else if (escolha2 == 2) {
            if (vagasB > 0) {
                vagasB--;
                System.out.println("confirmado");
            } else {
                System.out.println("sem vaga");
            }
        } else if (escolha2 == 0) {
            System.out.println("não reservou");
        } else {
            System.out.println("escolha inválida");
        }

        System.out.printf("finais A: %d, B: %d%n", vagasA, vagasB);
    }
}