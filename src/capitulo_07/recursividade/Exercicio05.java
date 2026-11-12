package capitulo_07.recursividade;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um inteiro de 0 a 30");
        int numero = scanner.nextInt();
        paresAteOLimite(numero);
    }

    public static void paresAteOLimite(int numero) {
        if (numero < 0) {
            return;
        }
        if (numero % 2 != 0) {
            paresAteOLimite(numero - 1);
        } else {
            paresAteOLimite(numero - 2);
            System.out.println(numero);
        }
    }
}
