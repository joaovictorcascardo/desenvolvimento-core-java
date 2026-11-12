package capitulo_07.metodos;

public class Exercicio17 {
    public static void main(String[] args) {
        int[] numeros = {-1, 0, 1, 2, 3, 4, 7, 7};
        System.out.println("7 é primo: " + ehPrimo(7));
        System.out.println("Quantidade de primos: " + contarPrimos(numeros));
    }

    static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    static int contarPrimos(int[] numeros) {

        int quantidade = 0;
        for (int numero : numeros) {
            if (ehPrimo(numero)) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
