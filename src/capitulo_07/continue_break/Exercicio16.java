package capitulo_07.continue_break;

public class Exercicio16 {
    public static void main(String[] args) {

        int[][] vendas = {
                {20, 0, 15, -1, 99},
                {-5, 10, 30, 0, -1},
                {-1, 50, 60, 70, 80}
        };

        int valorGeral = 0;

        for (int i = 0; i < vendas.length; i++) {
            int valorCaixa = 0;
            for (int j = 0; j < vendas[i].length; j++) {
                if (vendas[i][j] == -1) {
                    break;
                }

                if (vendas[i][j] <= 0) {
                    continue;
                }

                valorCaixa += vendas[i][j];
                valorGeral += vendas[i][j];
            }

            System.out.println("Caixa " + (i + 1) + ": " + valorCaixa);
        }

        System.out.println("Total geral: " + valorGeral);
    }
}