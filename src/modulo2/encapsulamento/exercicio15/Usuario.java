package modulo2.encapsulamento.exercicio15;

public class Usuario {
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() >= 8) {
            this.senha = senha;
            System.out.println("Senha cadastrada");
        } else {
            System.out.println("Senha muito curta");
        }
    }
}
