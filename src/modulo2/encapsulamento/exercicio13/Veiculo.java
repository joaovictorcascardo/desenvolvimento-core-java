package modulo2.encapsulamento.exercicio13;

public class Veiculo {
    private int anoFabricacao;

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao >= 1980 && anoFabricacao <= 2026) {
            this.anoFabricacao = anoFabricacao;
        }
    }
}
