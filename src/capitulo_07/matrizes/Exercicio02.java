package capitulo_07.matrizes;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] prateleiras = new int[2][3];
        int total = 0;

        System.out.println("Digite a quantidade de cada espaço: ");
        for (int i = 0; i < prateleiras.length; i++) {
            for (int j = 0; j < prateleiras[i].length; j++) {
                prateleiras[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < prateleiras.length; i++) {
            for (int j = 0; j < prateleiras[i].length; j++) {
                total += prateleiras[i][j];
            }
        }

        System.out.println("Total de produtos: " + total);
    }
}
