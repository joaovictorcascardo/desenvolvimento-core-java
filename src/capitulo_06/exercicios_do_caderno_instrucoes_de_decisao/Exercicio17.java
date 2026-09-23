package capitulo_06.exercicios_do_caderno_instrucoes_de_decisao;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número não negativo");
        }
    }
}