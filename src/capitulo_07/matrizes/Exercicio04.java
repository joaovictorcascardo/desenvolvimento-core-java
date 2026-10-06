package capitulo_07.matrizes;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        System.out.println("Digite os números da matriz 3x4: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Número a procurar: ");
        int busca = sc.nextInt();
        int ocorrencias = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == busca) {
                    System.out.println("Linha " + i + ", coluna " + j);
                    ocorrencias++;
                }
            }
        }

        if (ocorrencias > 0) {
            System.out.println("Ocorrências: " + ocorrencias);
        } else {
            System.out.println("Número não encontrado");
        }
    }
}
