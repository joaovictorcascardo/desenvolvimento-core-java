package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Duração: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }

        double duracao = sc.nextDouble();
        if (duracao < 0 || duracao >= 1000) {
            System.out.println("Erro: A duração deve ser maior ou igual a zero e menor que 1000");
            return;
        }

        int horasCompletas = (int) duracao;

        System.out.println("original: " + duracao + "; horas completas: " + horasCompletas);

    }
}