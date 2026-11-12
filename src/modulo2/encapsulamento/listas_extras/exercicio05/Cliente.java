package modulo2.encapsulamento.listas_extras.exercicio05;

public class Cliente {
    private final int codigo;
    private String nome;
    private String email;
    private boolean ativo;
    private double credito;
    private static int geradorId = 0;

    public Cliente(String nome, String email) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome não pode ser vazio");
        }
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Erro: E-mail não pode ser vazio");
        }

        geradorId++;
        this.codigo = geradorId;
        this.nome = nome;
        this.email = email;
        this.ativo = true;
        this.credito = 0.0;
    }

    public void exibirFicha() {
        System.out.printf("%nCliente: %d - %s (%s) | Status: %s | Crédito: R$ %.2f%n",
                codigo, nome, email, (ativo ? "Ativo" : "Inativo"), credito);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome não pode ser vazio");
            return;
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Erro: E-mail não pode ser vazio");
            return;
        }
        this.email = email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        if (credito < 0) {
            System.out.println("Erro: Crédito não pode ser negativo");
            return;
        }
        this.credito = credito;
    }
}