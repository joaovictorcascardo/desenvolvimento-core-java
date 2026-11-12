package capitulo_07.metodos;

public class Exercicio16 {
    public static void main(String[] args) {
        double media = calcularMedia(6.0, 8.0);
        String situacao = classificar(media);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }

    static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    static String classificar(double media) {
        if (media >= 7) {
            return "Aprovado";
        }
        if (media >= 5) {
            return "Recuperação";
        }
        return "Reprovado";
    }
}