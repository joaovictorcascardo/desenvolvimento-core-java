package capitulo_06.operadores_casting.extras;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int codigo = sc.nextInt();

        if (codigo >= -128 && codigo <= 127) {
            byte codigoByte = (byte) codigo;
            System.out.printf("convertido: %d%n", codigoByte);
        } else {
            System.out.println("Valor fora do intervalo de byte");
        }
    }
}