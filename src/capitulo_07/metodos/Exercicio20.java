package capitulo_07.metodos;

public class Exercicio20 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 12, 3, 20};
        System.out.println("Quantidade: " + contarNoIntervalo(numeros, 7, 12));
        int[] filtrados = filtrarIntervalo(numeros, 7, 12);
        for (int numero : filtrados) {
            System.out.println(numero);
        }
    }

    static int contarNoIntervalo(int[] numeros, int minimo, int maximo) {
        int quantidade = 0;
        for (int numero : numeros) {
            if (numero >= minimo && numero <= maximo) {
                quantidade++;
            }
        }
        return quantidade;
    }

    static int[] filtrarIntervalo(int[] numeros, int minimo, int maximo) {
        int tamanho = contarNoIntervalo(numeros, minimo, maximo);
        int[] filtrados = new int[tamanho];
        int destino = 0;
        for (int numero : numeros) {
            if (numero >= minimo && numero <= maximo) {
                filtrados[destino] = numero;
                destino++;
            }
        }
        return filtrados;
    }
}