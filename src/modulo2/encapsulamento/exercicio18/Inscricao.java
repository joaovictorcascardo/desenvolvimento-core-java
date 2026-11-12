package modulo2.encapsulamento.exercicio18;

public class Inscricao {
    private int idade;

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade >= 16) {
            this.idade = idade;
        }
    }
}
