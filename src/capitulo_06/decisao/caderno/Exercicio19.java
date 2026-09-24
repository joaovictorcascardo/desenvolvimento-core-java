package capitulo_06.decisao.caderno;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero > 100) {
            System.out.println("Acima do limite");
        } else {
            System.out.println("Dentro do limite");
        }
    }
}