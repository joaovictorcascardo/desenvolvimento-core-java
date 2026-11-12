package capitulo_07.metodos;

public class Exercicio12 {
    public static void main(String[] args) {
        System.out.println(somarIntervalo(3, 6));
        System.out.println(somarIntervalo(6, 3));
    }

    static int somarIntervalo(int inicio, int fim) {
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }
        return soma;
    }
}