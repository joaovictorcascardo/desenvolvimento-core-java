package capitulo_06.enumeration;

import java.util.Scanner;

enum TipoConta {
    BASICA, PLUS, PREMIUM
}

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de conta (BASICA, PLUS, PREMIUM):");
        String entrada = sc.next().toUpperCase();
        TipoConta conta = TipoConta.valueOf(entrada);

        double mensalidade = 0;
        switch (conta) {
            case BASICA:
                mensalidade = 0.00;
                break;
            case PLUS:
                mensalidade = 19.90;
                break;
            case PREMIUM:
                mensalidade = 39.90;
                break;
        }

        System.out.printf("Plano %s: R$ %.2f por mês.\n", conta, mensalidade);
    }
}