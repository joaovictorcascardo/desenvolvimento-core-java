package capitulo_07.metodos;

public class Exercicio07 {
    public static void main(String[] args) {
        double area = calcularArea(5.0, 3.5);
        System.out.println("Área: " + area);
    }
    static double calcularArea(double base, double altura) {
        return base * altura;
    }
}
