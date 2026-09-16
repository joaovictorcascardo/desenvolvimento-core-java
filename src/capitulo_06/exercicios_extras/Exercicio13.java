package capitulo_06.exercicios_extras;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2.0;
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}