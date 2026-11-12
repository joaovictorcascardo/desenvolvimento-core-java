package modulo2.encapsulamento.exercicio12;

public class Oferta {
    private double percentualDesconto;

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        if (percentualDesconto >= 0 && percentualDesconto <= 50) {
            this.percentualDesconto = percentualDesconto;
        } else {
            System.out.println("Desconto inválido");
        }
    }


}
