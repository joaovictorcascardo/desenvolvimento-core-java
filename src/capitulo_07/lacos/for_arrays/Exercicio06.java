package capitulo_07.lacos.for_arrays;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        System.out.print("Nome 1: ");
        nomes[0] = sc.nextLine();
        System.out.print("Nome 2: ");
        nomes[1] = sc.nextLine();
        System.out.print("Nome 3: ");
        nomes[2] = sc.nextLine();

        System.out.println("Ordem original: " + nomes[0] + ", " + nomes[1] + ", " + nomes[2]);
        System.out.println("Ordem inversa: " + nomes[2] + ", " + nomes[1] + ", " + nomes[0]);
    }
}
