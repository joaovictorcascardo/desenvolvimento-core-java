package capitulo_07.metodos;

public class Exercicio19 {
    public static void main(String[] args) {
        double[] precos = {10.0, 25.0};
        int[] quantidades = {2, 2};
        double subtotal = calcularSubtotal(precos, quantidades);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Com desconto: " + aplicarDesconto(subtotal, 10.0));
        System.out.println("Total: " + calcularTotal(precos, quantidades, 10.0, 5.0));
    }

    static double calcularSubtotal(double[] precos, int[] quantidades) {
        double subtotal = 0;
        for (int i = 0; i < precos.length; i++) {
            subtotal += precos[i] * quantidades[i];
        }
        return subtotal;
    }

    static double aplicarDesconto(double subtotal, double percentual) {
        return subtotal - subtotal * percentual / 100;
    }

    static double calcularTotal(double[] precos, int[] quantidades,
                                double percentual, double frete) {
        double subtotal = calcularSubtotal(precos, quantidades);
        double comDesconto = aplicarDesconto(subtotal, percentual);
        return comDesconto + frete;
    }

}