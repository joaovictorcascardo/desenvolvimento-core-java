package capitulo_07.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double[][] notas = new double[4][3];
        double[] medias = new double[4];
        double somaTurma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Notas do aluno " + (i + 1) + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            double somaAluno = 0;
            for (int j = 0; j < notas[i].length; j++) {
                somaAluno += notas[i][j];
            }
            somaTurma += somaAluno;
            medias[i] = somaAluno / notas[i].length;

            String situacao;
            if (medias[i] >= 7) {
                situacao = "Aprovado";
            } else if (medias[i] >= 5) {
                situacao = "Recuperação";
            } else {
                situacao = "Reprovado";
            }

            System.out.printf(Locale.US, "Aluno %d: %.2f - %s%n", i + 1, medias[i], situacao);
        }

        double maiorMedia = medias[0];
        for (int i = 1; i < medias.length; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
            }
        }

        System.out.printf(Locale.US, "Média da turma: %.2f%n", somaTurma / 12);
        System.out.printf(Locale.US, "Maior média: %.2f%n", maiorMedia);

        System.out.print("Alunos com maior média:");
        for (int i = 0; i < medias.length; i++) {
            if (medias[i] == maiorMedia) {
                System.out.print(" " + (i + 1));
            }
        }
        System.out.println();
    }
}
