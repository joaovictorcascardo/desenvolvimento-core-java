package capitulo_06.decisao.extras;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite o total vendido: ");
        double totalVendido = scanner.nextDouble();

        System.out.print("Digite a meta de vendas: ");
        double metaVendas = scanner.nextDouble();

        System.out.print("Digite o percentual de bônus: ");
        double percentualBonus = scanner.nextDouble();

        System.out.print("Digite a quantidade de faltas: ");
        int faltas = scanner.nextInt();

        double bonusVendas = 0.0;
        double adicionalAssiduidade = 0.0;
        double descontoFaltas = 0.0;

        if (totalVendido >= metaVendas) {
            bonusVendas = salarioBase * (percentualBonus / 100);
        }

        if (faltas == 0) {
            adicionalAssiduidade = 150.0;
        }

        if (faltas > 0) {
            descontoFaltas = (salarioBase / 30.0) * faltas;
        }

        double salarioFinal = salarioBase + bonusVendas + adicionalAssiduidade - descontoFaltas;

        System.out.println("Bônus por vendas: R$ " + bonusVendas);
        System.out.println("Adicional de assiduidade: R$ " + adicionalAssiduidade);
        System.out.println("Desconto por faltas: R$ " + descontoFaltas);
        System.out.println("Salário final: R$ " + salarioFinal);

    }
}