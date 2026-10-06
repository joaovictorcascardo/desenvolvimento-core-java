package capitulo_07.lacos.for_arrays;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] estoque = new int[3];

        System.out.print("Estoque do produto 1: ");
        estoque[0] = sc.nextInt();
        System.out.print("Estoque do produto 2: ");
        estoque[1] = sc.nextInt();
        System.out.print("Estoque do produto 3: ");
        estoque[2] = sc.nextInt();

        System.out.print("Produto: ");
        int produto = sc.nextInt();
        System.out.print("Operação (1 = entrada, 2 = saída): ");
        int operacao = sc.nextInt();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        if (produto < 1 || produto > 3 || quantidade <= 0) {
            System.out.println("Operação não realizada");
        } else if (operacao == 1) {
            estoque[produto - 1] += quantidade;
            System.out.println("Operação realizada");
        } else if (operacao == 2 && estoque[produto - 1] >= quantidade) {
            estoque[produto - 1] -= quantidade;
            System.out.println("Operação realizada");
        } else {
            System.out.println("Operação não realizada");
        }

        System.out.println("Produto 1: " + estoque[0]);
        System.out.println("Produto 2: " + estoque[1]);
        System.out.println("Produto 3: " + estoque[2]);
    }
}
