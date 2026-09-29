package capitulo_06.enumeration;

import java.util.Scanner;

enum TipoChamado {
    DUVIDA, ERRO, ACESSO
}

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de chamado:");
        String entrada = sc.next().toUpperCase();
        TipoChamado chamado = TipoChamado.valueOf(entrada);

        String equipe = "";
        switch (chamado) {
            case DUVIDA:
                equipe = "encaminhar para atendimento";
                break;
            case ERRO:
                equipe = "encaminhar para desenvolvimento";
                break;
            case ACESSO:
                equipe = "encaminhar para suporte de contas";
                break;
        }

        System.out.println(chamado + ": " + equipe + ".");
    }
}