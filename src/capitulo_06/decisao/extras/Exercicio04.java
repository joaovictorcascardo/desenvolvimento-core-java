package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a potência: ");
        double potencia = scanner.nextDouble();

        System.out.print("Digite o tempo de uso: ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a meta de consumo: ");
        double metaConsumo = scanner.nextDouble();

        double consumo = (potencia * tempo) / 1000;

        if (consumo > metaConsumo) {
            double excesso = consumo - metaConsumo;
            System.out.println("Alerta: O consumo ultrapassou a meta");
            System.out.println("Excesso: " + excesso + " kWh");
        }

        System.out.println("Consumo calculado: " + consumo + " kWh");
    }
}