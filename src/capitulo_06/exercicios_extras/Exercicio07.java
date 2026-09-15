package capitulo_06.exercicios_extras;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da pessoa: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a altura mínima: ");
        double alturaMinima = scanner.nextDouble();

        if (altura >= alturaMinima) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada não permitida");
        }
    }
}