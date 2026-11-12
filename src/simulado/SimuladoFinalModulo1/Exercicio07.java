package simulado.SimuladoFinalModulo1;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        caminhoMaldito(valor, valor, 0);
    }

    public static int caminhoMaldito(int total, int sobra, int apontador) {
        if (sobra % 3 == 0) {
            System.out.println("Apontadores " + apontador);
            System.out.println("Borrachas " + (sobra / 3));
            return 0;
        } else if (sobra % 5 == 0) {
            System.out.println("Apontadores " + (sobra / 5));
            return 0;
        }

        return caminhoMaldito(total, sobra - 5, apontador++);
    }
}