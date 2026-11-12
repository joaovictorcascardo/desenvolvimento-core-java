package desafio.truco;

import java.util.Random;

public class Baralho {
    public static void main(String[] args) {
        int qtdJogadores = 4;
        String[][] maoDosJogadores = baralho(qtdJogadores);

        for (int i = 0; i < qtdJogadores; i++) {
            System.out.println("Jogador " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print(maoDosJogadores[i][j] + " ");
            }
        }
    }

    public static String[][] baralho(int totalJogadores) {
        String[] copas = new String[13];
        String[] espada = new String[13];
        String[] paus = new String[13];
        String[] ouros = new String[13];

        String[][] baralho = new String[4][13];

        for (int i = 0; i < baralho.length; i++) {
            for (int j = 0; j < baralho[i].length; j++) {
                if (i == 0) {
                    baralho[i][j] = copas[j] = (j + 1) + "♥";
                } else if (i == 1) {
                    baralho[i][j] =  espada[j] = (j + 1) + "♠";
                } else if (i == 2) {
                    baralho[i][j] = paus[j] = (j + 1) + "♣";
                } else if (i == 3) {
                    baralho[i][j] =  ouros[j] = (j + 1) + "♦";
                }
            }
        }

        String[][] jogadores = new String[totalJogadores][3];

        String[] cartasPassadas = new String[totalJogadores * 3];
        int contadorCartasDadas = 0;

        for (int jogador = 0; jogador < totalJogadores; jogador++) {

            for (int i = 0; i < 3; i++) {
                int numero;
                int numeroNaipe;
                boolean repetida;

                do {
                    repetida = false;

                    numero = (int) (Math.random() * 13);
                    numeroNaipe = (int) (Math.random() * 4);

                    String cartaSorteada = baralho[numeroNaipe][numero];

                    for (int trevas = 0; trevas < contadorCartasDadas; trevas++) {
                        if (cartasPassadas[trevas].equals(cartaSorteada)) {
                            repetida = true;
                            break;
                        }
                    }
                } while (repetida);

                cartasPassadas[contadorCartasDadas] = baralho[numeroNaipe][numero];
                contadorCartasDadas++;

                jogadores[jogador][i] = baralho[numeroNaipe][numero];
            }
        }

        return jogadores;
    }
}