package capitulo_07.lacos.for_arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double[] saldos = new double[3];

        System.out.print("Saldo da conta 1: ");
        saldos[0] = sc.nextDouble();
        System.out.print("Saldo da conta 2: ");
        saldos[1] = sc.nextDouble();
        System.out.print("Saldo da conta 3: ");
        saldos[2] = sc.nextDouble();

        System.out.print("Conta de origem: ");
        int origem = sc.nextInt();
        System.out.print("Conta de destino: ");
        int destino = sc.nextInt();
        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        double tarifa = 0;
        if (valor > 100) {
            tarifa = 2.0;
        }

        if (origem < 1 || origem > 3 || destino < 1 || destino > 3 || origem == destino || valor <= 0) {
            System.out.println("Transferência não realizada");
        } else if (saldos[origem - 1] < valor + tarifa) {
            System.out.println("Transferência não realizada");
        } else {
            saldos[origem - 1] -= valor + tarifa;
            saldos[destino - 1] += valor;
            System.out.println("Transferência realizada");
            System.out.printf("Tarifa: R$ %.2f%n", tarifa);
        }

        double total = saldos[0] + saldos[1] + saldos[2];

        System.out.printf("Conta 1: R$ %.2f%n", saldos[0]);
        System.out.printf("Conta 2: R$ %.2f%n", saldos[1]);
        System.out.printf("Conta 3: R$ %.2f%n", saldos[2]);
        System.out.printf("Total nas contas: R$ %.2f%n", total);
    }
}
