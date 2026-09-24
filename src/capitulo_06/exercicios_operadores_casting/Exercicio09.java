package capitulo_06.exercicios_operadores_casting;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Última posição ocupada: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int ultimaPosicao = sc.nextInt();
        if (ultimaPosicao < 0 || ultimaPosicao > 100000) {
            System.out.println("Erro: A posição deve estar entre 0 e 100000");
            return;
        }

        System.out.print("Opção (1 = incluir pessoa; 2 = consultar): ");
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
                int novaPosicao = ++ultimaPosicao;
                System.out.printf("Posição da nova pessoa: %d%n", novaPosicao);
                System.out.printf("Última posição: %d%n", ultimaPosicao);
                break;
            case 2:
                System.out.printf("Última posição: %d%n", ultimaPosicao);
                break;
        }
    }
}