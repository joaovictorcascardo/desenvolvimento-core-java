package capitulo_07.lacos.for_arrays;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de participantes: ");
        int quantidade = sc.nextInt();

        int maior = -1;
        int segunda = -1;
        int quantidadeMaior = 0;
        int campeao = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Pontuação do participante " + i + ": ");
            int pontuacao = sc.nextInt();

            if (pontuacao > maior) {
                segunda = maior;
                maior = pontuacao;
                quantidadeMaior = 1;
                campeao = i;
            } else if (pontuacao == maior) {
                quantidadeMaior++;
            } else if (pontuacao > segunda) {
                segunda = pontuacao;
            }
        }

        System.out.println("Maior pontuação: " + maior);
        System.out.println("Participantes com a maior pontuação: " + quantidadeMaior);
        System.out.println("Campeão: participante " + campeao);

        if (segunda == -1) {
            System.out.println("Não existe segunda pontuação distinta");
        } else {
            System.out.println("Segunda pontuação distinta: " + segunda);
        }
    }
}
