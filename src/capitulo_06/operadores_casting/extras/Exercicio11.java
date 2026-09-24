package capitulo_06.operadores_casting.extras;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vidas: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }

        int vidas = sc.nextInt();
        if (vidas < 1 || vidas > 10) {
            System.out.println("Erro: A quantidade de vidas deve estar entre 1 e 10");
            return;
        }

        vidas--;

        System.out.printf("Restantes: %d%n", vidas);
    }
}