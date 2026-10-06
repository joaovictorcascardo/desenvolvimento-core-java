package capitulo_07.lacos.for_arrays;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de senhas: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Senha " + i);
        }
    }
}
