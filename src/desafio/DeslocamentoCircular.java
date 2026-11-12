package desafio;

import java.util.Scanner;

public class DeslocamentoCircular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int opcao = scanner.nextInt();

        int[] valoresPosicionados = new int[6];

        String valores = "";

        switch (opcao) {

            case 1:
                valoresPosicionados[0] = numeros[5];
                for (int i = 0; i < numeros.length - 1; i++) {
                    valoresPosicionados[i + 1] = numeros[i];
                }
                for (int i = 0; i < valoresPosicionados.length; i++) {
                    if (!valores.isEmpty()) {
                        valores += " " + valoresPosicionados[i];
                    } else {
                        valores += valoresPosicionados[i];
                    }

                }
                System.out.println(valores);
                break;

            case 2:
                valoresPosicionados[5] = numeros[0];
                for (int i = 0; i < numeros.length - 1; i++) {
                    valoresPosicionados[i] = numeros[i + 1];
                }
                for (int i = 0; i < valoresPosicionados.length; i++) {
                    if (!valores.isEmpty()) {
                        valores += " " + valoresPosicionados[i];
                    } else {
                        valores += valoresPosicionados[i];
                    }

                }
                System.out.println(valores);

                break;
            default:
                System.out.println("Opção inválida");
                for (int i = 0; i < numeros.length; i++) {
                    if (!valores.isEmpty()) {
                        valores += " " + numeros[i];
                    } else {
                        valores += numeros[i];
                    }
                }
                System.out.println(valores);
                break;
        }
    }
}