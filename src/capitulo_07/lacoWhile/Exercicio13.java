package capitulo_07.lacoWhile;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite ai ");
        int numero = scanner.nextInt();
        String tamanho = String.valueOf(numero);
        long[] resto = new long[tamanho.length()];
        int i = 0;

        while (numero > 0) {
            resto[i] = numero % 10;
            numero = numero / 10;
            i++;
        }

        for (int j = 0; j < resto.length; j++) {
            System.out.print(resto[j]);
        }

    }
}