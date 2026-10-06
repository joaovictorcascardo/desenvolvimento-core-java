package capitulo_07.matrizes;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho da matriz (2 a 6): ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        System.out.println("Digite os números da matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            diagonalPrincipal += matriz[i][i];
            diagonalSecundaria += matriz[i][n - 1 - i];
        }

        System.out.println("Diagonal principal: " + diagonalPrincipal);
        System.out.println("Diagonal secundária: " + diagonalSecundaria);
    }
}
