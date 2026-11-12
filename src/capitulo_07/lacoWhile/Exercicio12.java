package capitulo_07.lacoWhile;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        String numeroTexto = String.valueOf(numero);

        String[] numeros = numeroTexto.split("");

        int valorTotal = 0;

        int i = 0;

        while (i < numeros.length) {
            valorTotal += Integer.parseInt(numeros[i]);
            i++;
        }

        System.out.println(valorTotal);

    }
}