package capitulo_06.exercicios_extras;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(numero1 + numero2);
                break;
            case 2:
                System.out.println(numero1 - numero2);
                break;
            case 3:
                System.out.println(numero1 * numero2);
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    System.out.println(numero1 / numero2);
                }
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}