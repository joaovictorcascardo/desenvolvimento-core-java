package modulo2.encapsulamento.exercicio14;

public class Categoria {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }
}
