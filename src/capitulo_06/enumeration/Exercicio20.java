package capitulo_06.enumeration;

import java.util.Scanner;

enum ResultadoRevisao {
    APROVADO, AJUSTES, REPROVADO
}

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o resultado da revisão:");
        String entrada = sc.next().toUpperCase();
        ResultadoRevisao resultado = ResultadoRevisao.valueOf(entrada);

        sc.nextLine();

        System.out.println("Digite o nome do projeto:");
        String projeto = sc.nextLine();

        String acao = "";
        switch (resultado) {
            case APROVADO:
                acao = "publicar";
                break;
            case AJUSTES:
                acao = "corrigir e reenviar";
                break;
            case REPROVADO:
                acao = "refazer a proposta";
                break;
        }

        System.out.println(projeto + " — " + resultado.name() + ": " + acao + ".");
    }
}