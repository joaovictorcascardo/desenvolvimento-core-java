package simulado.SimuladoFinalModulo1;

import java.util.Scanner;

public class Exercicio07ForcaBruta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int borrachas = 0;
        int sobra = valor;
        int apontadores = 0;

        while (sobra != 0) {
            if (sobra % 3 == 0 || sobra % 5 == 0 ) {
                sobra -= 3;
                borrachas++;
            }
            if (sobra % 5 == 0) {
                apontadores++;
                sobra -= 5;
            }
        }

        System.out.println("Apontadores " + apontadores + " Borrachas " + borrachas);
    }
}