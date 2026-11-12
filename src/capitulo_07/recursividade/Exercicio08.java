package capitulo_07.recursividade;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println(somaAlgarismo(2034));
    }

    public static int somaAlgarismo(int numero) {
        if (numero <= 0) {
            return 0;
        }
        int ultimoValor = numero % 10;
        System.out.println(ultimoValor);
        return ultimoValor += somaAlgarismo(numero / 10);
    }
}
