package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double metros = sc.nextDouble();
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println((metros * 100) + " cm");
                break;
            case 2:
                System.out.println((metros * 1000) + " mm");
                break;
            case 3:
                System.out.println((metros / 1000) + " km");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}