package capitulo_07.metodos;

public class Exercicio14 {
    public static void main(String[] args) {
        double[] notas = {6.0, 8.0, 10.0};
        System.out.println("Média: " + calcularMedia(notas));
    }

    public static double calcularMedia(double[] notas) {
        if (notas.length == 0) {
            return 0.0;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}