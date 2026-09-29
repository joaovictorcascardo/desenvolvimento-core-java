package capitulo_06.enumeration;

import java.util.Scanner;

enum TamanhoCamiseta {
    P, M, G, GG
}

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho P, M, G ou GG: ");
        String entrada = sc.next().toUpperCase();

        if (entrada.equals("P") || entrada.equals("M") || entrada.equals("G") || entrada.equals("GG")) {

            TamanhoCamiseta tamanho = TamanhoCamiseta.valueOf(entrada);
            String descricao = "";

            switch (tamanho) {
                case P:
                    descricao = "pequeno";
                    break;
                case M:
                    descricao = "médio";
                    break;
                case G:
                    descricao = "grande";
                    break;
                case GG:
                    descricao = "extragrande";
                    break;
            }

            System.out.println("Tamanho " + tamanho + ": " + descricao + ".");

        } else {
            System.out.println("Erro: Tamanho inválido.");
        }

    }
}
