package modulo2.encapsulamento.exercicio08;

public class Mercadoria {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

}
