package capitulo_07.matrizes;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] estoque = new int[3][2];
        int alteradas = 0;

        System.out.println("Digite as quantidades da matriz 3x2: ");
        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                estoque[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                if (estoque[i][j] < 0) {
                    estoque[i][j] = 0;
                    alteradas++;
                }
            }
        }

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print(estoque[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Posições alteradas: " + alteradas);
    }
}
