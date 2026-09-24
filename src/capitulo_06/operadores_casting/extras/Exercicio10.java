package capitulo_06.operadores_casting.extras;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inscritos atuais: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int inscritos = sc.nextInt();
        if (inscritos < 0 || inscritos > 100000) {
            System.out.println("Erro: A quantidade de inscritos deve estar entre 0 e 100000");
            return;
        }

        System.out.print("Capacidade máxima: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int capacidade = sc.nextInt();
        if (capacidade < 0 || capacidade > 100000) {
            System.out.println("Erro: A capacidade deve estar entre 0 e 100000");
            return;
        }

        if (inscritos > capacidade) {
            System.out.println("Erro: A quantidade de inscritos não pode superar a capacidade máxima");
            return;
        }

        System.out.print("Pessoa A deseja se inscrever? (1 = sim; 0 = não): ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int pessoaA = sc.nextInt();
        if (pessoaA != 0 && pessoaA != 1) {
            System.out.println("Erro: Opção inválida");
            return;
        }

        System.out.print("Pessoa B deseja se inscrever? (1 = sim; 0 = não): ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int pessoaB = sc.nextInt();
        if (pessoaB != 0 && pessoaB != 1) {
            System.out.println("Erro: Opção inválida");
            return;
        }

        System.out.print("Resultado A: ");
        if (pessoaA == 1) {
            if (inscritos < capacidade) {
                inscritos++;
                System.out.printf("Confirmada na posição %d%n", inscritos);
            } else {
                System.out.println("Sem vaga");
            }
        } else {
            System.out.println("Não solicitada");
        }

        System.out.print("Resultado B: ");
        if (pessoaB == 1) {
            if (inscritos < capacidade) {
                inscritos++;
                System.out.printf("Confirmada na posição %d%n", inscritos);
            } else {
                System.out.println("Sem vaga");
            }
        } else {
            System.out.println("Não solicitada");
        }

        int vagasRestantes = capacidade - inscritos;

        System.out.printf("Total final: %d%n", inscritos);
        System.out.printf("Vagas restantes: %d%n", vagasRestantes);
    }
}