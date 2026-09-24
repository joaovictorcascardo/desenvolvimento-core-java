package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade atual em estoque: ");
        int quantidadeAtual = scanner.nextInt();

        System.out.print("Digite a quantidade mínima desejada: ");
        int quantidadeMinima = scanner.nextInt();

        if (quantidadeAtual < quantidadeMinima) {
            System.out.println("É necessário repor o estoque");
        }

        System.out.println("Consulta finalizada");

        scanner.close();
    }
}