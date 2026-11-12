package modulo2.encapsulamento.exercicio07;

public class Pessoa {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }
}
