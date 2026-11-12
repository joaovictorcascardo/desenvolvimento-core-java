package simulado.arrays_matrizes_csv;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] quantidades = {8, 3, 12};
        int somaDosExtremos = quantidades[0] + quantidades[2];
        System.out.printf("Primeiro produto: %d\nUltimo produto: %d\nSoma: %d\n", quantidades[1], quantidades[2],
                somaDosExtremos);
    }
}