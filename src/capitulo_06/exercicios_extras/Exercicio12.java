package capitulo_06.exercicios_extras;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("Primeiro maior");
        } else if (numero1 < numero2) {
            System.out.println("Primeiro menor");
        } else {
            System.out.println("Valores iguais");
        }
    }
}