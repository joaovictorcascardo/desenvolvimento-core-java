package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Última senha: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida. Esperado um número inteiro");
            return;
        }

        int senha = sc.nextInt();
        if (senha < 0 || senha > 100000) {
            System.out.println("Erro: A senha deve estar entre 0 e 100000");
            return;
        }

        senha++;

        System.out.printf("Nova senha: %d%n", senha);
    }
}
