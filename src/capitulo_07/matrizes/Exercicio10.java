package capitulo_07.matrizes;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] sala = new int[3][4];

        System.out.println("Digite a ocupação da sala (0 = livre, 1 = ocupado): ");
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = sc.nextInt();
            }
        }

        for (int t = 1; t <= 4; t++) {
            System.out.print("Tentativa " + t + " - fileira e assento: ");
            int fileira = sc.nextInt();
            int assento = sc.nextInt();

            if (fileira < 1 || fileira > 3 || assento < 1 || assento > 4) {
                System.out.println("Posição inválida");
            } else if (sala[fileira - 1][assento - 1] == 1) {
                System.out.println("Assento ocupado");
            } else {
                sala[fileira - 1][assento - 1] = 1;
                System.out.println("Reserva aceita");
            }
        }

        int livres = 0;
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print(sala[i][j] + " ");
                if (sala[i][j] == 0) {
                    livres++;
                }
            }
            System.out.println();
        }

        System.out.println("Assentos livres: " + livres);
    }
}
