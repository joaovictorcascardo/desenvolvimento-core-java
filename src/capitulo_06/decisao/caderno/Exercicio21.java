package capitulo_06.decisao.caderno;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        String resultado = numero % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(resultado);
    }
}