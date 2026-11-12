package capitulo_07.lacoWhile;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("O fatorial de " + numero + " é: zno");
        } else {
            long fatorial = 1;
            int contador = numero;

            while (contador > 1) {
                fatorial *= contador;
                contador--;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}