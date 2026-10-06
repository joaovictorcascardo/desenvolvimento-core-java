package capitulo_07.lacos.for_basico;

public class Exercicio06 {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.5, 6.0, 10.0};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Total das notas: " + soma);
        System.out.println("Média da turma: " + media);
    }
}
