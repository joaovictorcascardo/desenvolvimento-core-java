package modulo2.encapsulamento.exercicio20;

public class Curso {
    private int codigo = 501;
    private String nome;
    private double mensalidade;
    private int vagas;
    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public double getMensalidade() {
        return this.mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        if (mensalidade > 0) {
            this.mensalidade = mensalidade;
        }
    }

    public int getVagas() {
        return this.vagas;
    }

    public void setVagas(int vagas) {
        if (vagas >= 0) {
            this.vagas = vagas;
        }
    }
}
