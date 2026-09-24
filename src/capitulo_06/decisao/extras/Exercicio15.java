package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distancia = scanner.nextDouble();

        if (distancia < 0) {
            System.out.println("Distância inválida");
        } else if (distancia <= 5) {
            System.out.println("Faixa: 0 a 5 km");
            System.out.println("Valor total: R$ 5.00");
        } else if (distancia <= 10) {
            double total = 5 + ((distancia - 5) * 2);
            System.out.println("Faixa: 5 a 10 km");
            System.out.println("Valor total: R$ " + total);
        } else if (distancia <= 20) {
            double total = 15 + ((distancia - 10) * 3);
            System.out.println("Faixa: 10 a 20 km");
            System.out.println("Valor total: R$ " + total);
        } else {
            System.out.println("Entrega indisponível");
        }
    }
}