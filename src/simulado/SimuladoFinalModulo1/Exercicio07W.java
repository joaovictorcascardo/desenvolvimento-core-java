package simulado.SimuladoFinalModulo1;
import java.util.Scanner;

public class Exercicio07W{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int borrachas = 0;
        int sobra = valor;

        while (sobra % 5 != 0) {
            sobra -= 3;
            borrachas++;
        }

        int apontadores = sobra / 5;

        System.out.println("Apontadores " + apontadores + " Borrachas " + borrachas);
    }
}