package capitulo_06.enumeration;

import java.util.Scanner;

enum Veiculo {
    MOTO, CARRO, CAMINHAO
}

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de veículo:");
        String entrada = sc.next().toUpperCase();
        Veiculo veiculo = Veiculo.valueOf(entrada);

        System.out.println("Digite a quantidade de horas:");
        int horas = sc.nextInt();

        double total = 0;
        switch (veiculo) {
            case MOTO:
                total = horas * 5.00;
                break;
            case CARRO:
                total = horas * 10.00;
                break;
            case CAMINHAO:
                total = horas * 20.00;
                break;
        }

        System.out.printf("%s: R$ %.2f\n", veiculo, total);
    }
}