package capitulo_06.exercicios_operadores_casting;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Atendimentos: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int atendimentos = sc.nextInt();
        if (atendimentos < 0 || atendimentos > 100000) {
            System.out.println("Erro: O total de atendimentos deve estar entre 0 e 100000");
            return;
        }

        System.out.print("Dias: ");
        if (!sc.hasNextInt()) {
            System.out.println("Erro: Entrada inválida");
            return;
        }
        int dias = sc.nextInt();
        if (dias <= 0) {
            System.out.println("Erro: Quantidade de dias inválida");
            return;
        }

        double mediaPreservada = (double) atendimentos / dias;

        double quocienteInteiro = (double) (atendimentos / dias);

        System.out.printf("casting antes: %.1f; casting depois: %.1f%n", mediaPreservada, quocienteInteiro);

        if (mediaPreservada != quocienteInteiro) {
            System.out.println("Explicação: Na divisão entre inteiros (casting depois), o Java descarta a parte decimal antes de converter para double. Com o casting antes, a operação vira uma divisão de ponto flutuante, mantendo a precisão matemática");
        }

    }
}