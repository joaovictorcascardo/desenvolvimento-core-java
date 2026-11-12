package capitulo_07.metodos;

public class Exercicio18 {
    public static void main(String[] args) {
        int[][] matriz = {{-8, -2}, {-3, -4}, {-9, -6}};
        System.out.println("Soma da primeira linha: " + somarLinha(matriz[0]));
        System.out.println("Maior soma: " + maiorSomaLinha(matriz));
    }

    static int somarLinha(int[] linha) {
        int soma = 0;
        for (int numero : linha) {
            soma += numero;
        }
        return soma;
    }

    static int maiorSomaLinha(int[][] matriz) {
        int maior = somarLinha(matriz[0]);
        for (int i = 1; i < matriz.length; i++) {
            int soma = somarLinha(matriz[i]);
            if (soma > maior) {
                maior = soma;
            }
        }
        return maior;
    }
}