package capitulo_06.operadores_casting.extras;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tentativas restantes: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }

        int tentativas = sc.nextInt();
        if (tentativas < 1 || tentativas > 5) {
            System.out.println("Erro: A quantidade de tentativas deve estar entre 1 e 5");
            return;
        }

        int tentativasAntes = tentativas--;

        System.out.printf("Antes: %d%n", tentativasAntes);
        System.out.printf("Restantes: %d%n", tentativas);

        if (tentativas == 0) {
            System.out.println("Acesso bloqueado");
        } else {
            System.out.println("Pode tentar novamente");
        }

    }
}