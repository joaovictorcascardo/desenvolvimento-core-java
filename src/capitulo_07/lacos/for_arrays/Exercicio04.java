package capitulo_07.lacos.for_arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantidade de alunos: ");
        int quantidade = sc.nextInt();

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Nota do aluno " + i + ": ");
            double nota = sc.nextDouble();

            if (nota >= 7) {
                System.out.println("Aluno " + i + ": aprovado");
                aprovados++;
            } else if (nota >= 5) {
                System.out.println("Aluno " + i + ": recuperação");
                recuperacao++;
            } else {
                System.out.println("Aluno " + i + ": reprovado");
                reprovados++;
            }
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Em recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
    }
}
