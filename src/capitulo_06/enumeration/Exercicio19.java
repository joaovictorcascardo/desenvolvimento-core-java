package capitulo_06.enumeration;

import java.util.Scanner;

enum Quarto {
    STANDARD, LUXO, SUITE
}

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de quarto:");
        String entrada = sc.next().toUpperCase();
        Quarto quarto = Quarto.valueOf(entrada);

        System.out.println("Digite o número de diárias:");
        int diarias = sc.nextInt();

        double total = 0;
        switch (quarto) {
            case STANDARD:
                total = diarias * 180.00;
                break;
            case LUXO:
                total = diarias * 300.00;
                break;
            case SUITE:
                total = diarias * 450.00;
                break;
        }

        System.out.printf("%s: total R$ %.2f\n", quarto, total);
    }
}