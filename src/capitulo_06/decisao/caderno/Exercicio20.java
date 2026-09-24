package capitulo_06.decisao.caderno;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("Número neutro");
        } else {
            System.out.println("Não é neutro");
        }
    }
}