package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Sanduíche");
                System.out.println("Total R$ " + (18 * quantidade));
                break;
            case 2:
                System.out.println("Suco");
                System.out.println("Total R$ " + (7 * quantidade));
                break;
            case 3:
                System.out.println("Salgado");
                System.out.println("Total R$ " + (8 * quantidade));
                break;
            default:
                System.out.println("Produto inválido");
        }
    }
}