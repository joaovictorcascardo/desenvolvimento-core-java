package capitulo_06.exercicios_do_caderno;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positivo");
        } else if (n < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }
}