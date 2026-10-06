package capitulo_07.lacos.for_arrays;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];

        System.out.print("Nome 1: ");
        nomes[0] = sc.next();
        System.out.print("Nome 2: ");
        nomes[1] = sc.next();
        System.out.print("Nome 3: ");
        nomes[2] = sc.next();
        System.out.print("Nome 4: ");
        nomes[3] = sc.next();

        System.out.print("Primeira posição: ");
        int posicao1 = sc.nextInt();
        System.out.print("Segunda posição: ");
        int posicao2 = sc.nextInt();

        if (posicao1 < 1 || posicao1 > 4 || posicao2 < 1 || posicao2 > 4) {
            System.out.println("Posição inválida");
        } else if (posicao1 != posicao2) {
            String temp = nomes[posicao1 - 1];
            nomes[posicao1 - 1] = nomes[posicao2 - 1];
            nomes[posicao2 - 1] = temp;
        }

        System.out.println("1: " + nomes[0]);
        System.out.println("2: " + nomes[1]);
        System.out.println("3: " + nomes[2]);
        System.out.println("4: " + nomes[3]);
    }
}
