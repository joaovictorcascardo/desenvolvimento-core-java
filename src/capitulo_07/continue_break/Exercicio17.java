package capitulo_07.continue_break;


public class Exercicio17 {
    public static void main(String[] args) {
        int[] codigos = {101, 202, 101, 303, 101};
        int[] estoques = {0, 5, -2, 4, 7};
        int procurado = 101;

        boolean encontrou = false;

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] != procurado) {
                continue;
            }

            if (estoques[i] <= 0) {
                continue;
            }

            System.out.println("Índice: " + i);
            System.out.println("Estoque: " + estoques[i]);
            encontrou = true;

            break;
        }

        if (!encontrou) {
            System.out.println("Produto indisponível");
        }
    }
}
