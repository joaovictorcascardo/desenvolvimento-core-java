package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Encaminhando para Financeiro");
                break;
            case 2:
                System.out.println("Encaminhando para Suporte técnico");
                break;
            case 3:
                System.out.println("Encaminhando para Comercial");
                break;
            case 4:
                System.out.println("Encaminhando para Cancelamento");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}