package capitulo_07.lacos.extras;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        System.out.println("\nClassificação:");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.println(numeros[i] + ": positivo;");
                positivos++;
            } else if (numeros[i] < 0) {
                System.out.println(numeros[i] + ": negativo;");
                negativos++;
            } else {
                System.out.println(numeros[i] + ": zero;");
                zeros++;
            }
        }

        System.out.printf("Totais: %d positivos, %d negativos e %d zeros.\n", positivos, negativos, zeros);
    }
}