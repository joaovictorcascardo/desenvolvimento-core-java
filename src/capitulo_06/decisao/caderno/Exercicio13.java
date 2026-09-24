package capitulo_06.decisao.caderno;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
    }
}