package capitulo_07.lacos.for_arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double[] notas = new double[4];

        System.out.print("Nota 1: ");
        notas[0] = sc.nextDouble();
        System.out.print("Nota 2: ");
        notas[1] = sc.nextDouble();
        System.out.print("Nota 3: ");
        notas[2] = sc.nextDouble();
        System.out.print("Nota 4: ");
        notas[3] = sc.nextDouble();

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.printf("Notas: %.2f | %.2f | %.2f | %.2f%n", notas[0], notas[1], notas[2], notas[3]);
        System.out.printf("Média: %.2f%n", media);
    }
}
