package capitulo_06.enumeration;

import java.util.Scanner;

enum Dificuldade {
    FACIL, MEDIO, DIFICIL
}

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a dificuldade:");
        String entrada = sc.next().toUpperCase();
        Dificuldade dificuldade = Dificuldade.valueOf(entrada);

        System.out.println("Digite o número de acertos:");
        int acertos = sc.nextInt();

        int pontos = 0;
        switch (dificuldade) {
            case FACIL:
                pontos = acertos * 10;
                break;
            case MEDIO:
                pontos = acertos * 20;
                break;
            case DIFICIL:
                pontos = acertos * 30;
                break;
        }

        System.out.println(dificuldade + ": " + pontos + " pontos.");
    }
}