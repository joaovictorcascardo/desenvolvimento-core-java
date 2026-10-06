package capitulo_07.lacos.extras;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] registroNumeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o numero " + (i + 1));
            registroNumeros[i] = sc.nextInt();
        }

        for (int i = 0; i < registroNumeros.length; i++) {
            System.out.println("índice " + i + ": " + registroNumeros[i]);
        }
    }
}