package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo da viagem: ");
        double tempoMinutos = scanner.nextDouble();

        if (tempoMinutos > 0) {
            double tempoHoras = tempoMinutos / 60.0;
            double velocidadeMedia = distancia / tempoHoras;

            System.out.println("Tempo em horas: " + tempoHoras);
            System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        } else {
            System.out.println("Tempo inválido");
        }
    }
}