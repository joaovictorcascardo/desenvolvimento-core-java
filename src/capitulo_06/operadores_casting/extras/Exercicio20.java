package capitulo_06.operadores_casting.extras;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        if (!sc.hasNextLong()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        long numero = sc.nextLong();

        System.out.print("Opção (1 = int; 2 = short; 3 = byte): ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                if (numero >= Integer.MIN_VALUE && numero <= Integer.MAX_VALUE) {
                    int valorInt = (int) numero;
                    System.out.printf("original: %d; int: %d%n", numero, valorInt);
                } else {
                    System.out.println("conversão recusada");
                }
                break;
            case 2:
                if (numero >= Short.MIN_VALUE && numero <= Short.MAX_VALUE) {
                    short valorShort = (short) numero;
                    System.out.printf("original: %d; short: %d%n", numero, valorShort);
                } else {
                    System.out.println("conversão recusada");
                }
                break;
            case 3:
                if (numero >= Byte.MIN_VALUE && numero <= Byte.MAX_VALUE) {
                    byte valorByte = (byte) numero;
                    System.out.printf("original: %d; byte: %d%n", numero, valorByte);
                } else {
                    System.out.println("conversão recusada");
                }
                break;
            default:
                System.out.println("Erro: Opção inexistente");
        }
    }
}