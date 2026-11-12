package capitulo_07.metodos;

public class Exercicio15 {
    public static void main(String[] args) {
        int[] numeros = {7, 4, 2, 4};
        System.out.println(buscarIndice(numeros, 4));
        System.out.println(buscarIndice(numeros, 9));
    }

    public static int buscarIndice(int[] numeros, int procurado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == procurado) {
                return i;            }
        }
        return -1;
    }
}