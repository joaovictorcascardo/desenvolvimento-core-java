package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }

        double temperatura = sc.nextDouble();
        if (temperatura < -100 || temperatura > 100) {
            System.out.println("Erro: A temperatura deve estar entre -100 e 100");
            return;
        }

        int temperaturaConvertida = (int) temperatura;

        System.out.println("original: " + temperatura + "; inteiro: " + temperaturaConvertida);

    }
}