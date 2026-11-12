package capitulo_07.metodos;

public class Exercicio13 {
    public static void main(String[] args) {
        int[] numeros = {-2, 0, 5, 8, -1, 3};
        System.out.println("Positivos: " + contarPositivos(numeros));
    }

    public static int contarPositivos(int[] numeros) {
        int quantidade = 0;
        for (int numero : numeros) {
            if (numero > 0) {
                quantidade++;
            }
        }
        return quantidade;
    }
}