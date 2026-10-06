package capitulo_07.lacos.extras;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[7];
        double soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / 7;
        double maior = temperaturas[0];
        double menor = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        String diasMaior = "";
        String diasMenor = "";
        int diasAcimaDaMedia = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            int diaAtual = i + 1;

            if (temperaturas[i] == maior) {
                if (diasMaior.isEmpty()) {
                    diasMaior = String.valueOf(diaAtual);
                } else {
                    diasMaior += " e " + diaAtual;
                }
            }

            if (temperaturas[i] == menor) {
                if (diasMenor.isEmpty()) {
                    diasMenor = String.valueOf(diaAtual);
                } else {
                    diasMenor += " e " + diaAtual;
                }
            }

            if (temperaturas[i] > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.printf("média %.2f °C; maior %.0f °C, dias %s; menor %.0f °C, dias %s; dias acima da média: %d.",
                media, maior, diasMaior, menor, diasMenor, diasAcimaDaMedia);
    }
}