package desafio;

import java.util.Random;
import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] temas = {"NOME", "CARRO", "COMIDA", "CIDADE", "CEP"};
        int totalJogadores = 2;

        char letra = (char) ('A' + random.nextInt(26));
        System.out.println("Letra: " + letra);
        System.out.println("Temas: " + String.join(", ", temas));

        String[][] respostas = new String[totalJogadores][temas.length];

        for (int i = 0; i < totalJogadores; i++) {
            System.out.println("\nJogador " + (i + 1) + " respostas separadas por virgula:");
            String entrada = scanner.nextLine().toUpperCase();
            String[] palavras = entrada.split(",");

            for (int t = 0; t < temas.length; t++) {
                if (t < palavras.length) {
                    respostas[i][t] = palavras[t].trim();
                } else {
                    respostas[i][t] = "";
                }
            }
        }

        int[] pontos = new int[totalJogadores];

        System.out.println("\nResultado:");

        for (int t = 0; t < temas.length; t++) {
            System.out.println("\nTema: " + temas[t]);

            for (int i = 0; i < totalJogadores; i++) {
                String palavra = respostas[i][t];

                if (palavra.isEmpty() || palavra.charAt(0) != letra) {
                    System.out.println("Jogador " + (i + 1) + ": " + palavra + " -> 0 pts");
                    continue;
                }

                boolean repetida = false;
                for (int outro = 0; outro < totalJogadores; outro++) {
                    if (i != outro && palavra.equals(respostas[outro][t])) {
                        repetida = true;
                        break;
                    }
                }

                if (repetida) {
                    pontos[i] += 1;
                    System.out.println("Jogador " + (i + 1) + ": " + palavra + " -> 1 pt");
                } else {
                    pontos[i] += 3;
                    System.out.println("Jogador " + (i + 1) + ": " + palavra + " -> 3 pts");
                }
            }
        }

        System.out.println("\nTotal:");
        for (int i = 0; i < totalJogadores; i++) {
            System.out.println("Jogador " + (i + 1) + ": " + pontos[i] + " pontos");
        }
    }
}