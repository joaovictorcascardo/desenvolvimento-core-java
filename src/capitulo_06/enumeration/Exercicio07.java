package capitulo_06.enumeration;

import java.util.Scanner;

enum Classificacao {
    LIVRE, DOZE, QUATORZE, DEZOITO
}

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a classificação (LIVRE, DOZE, QUATORZE, DEZOITO):");
        String entrada = sc.next().toUpperCase();
        Classificacao classificacao = Classificacao.valueOf(entrada);

        System.out.println("Digite a idade do espectador:");
        int idade = sc.nextInt();

        int idadeMinima = 0;
        switch (classificacao) {
            case LIVRE:
                idadeMinima = 0;
                break;
            case DOZE:
                idadeMinima = 12;
                break;
            case QUATORZE:
                idadeMinima = 14;
                break;
            case DEZOITO:
                idadeMinima = 18;
                break;
        }

        if (idade >= idadeMinima) {
            System.out.println("Acesso permitido para " + classificacao + ".");
        } else {
            System.out.println("Acesso não permitido para " + classificacao + ".");
        }
    }
}