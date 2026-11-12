package capitulo_07.metodos;

public class Exercicio08
{
    public static void main(String[] args) {
        System.out.println(ehPar(8));
        System.out.println(ehPar(7));
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

}