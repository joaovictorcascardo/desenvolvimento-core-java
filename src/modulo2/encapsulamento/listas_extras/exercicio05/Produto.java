package modulo2.encapsulamento.listas_extras.exercicio05;

public class Produto {
    private final int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        if (codigo <= 0) {
            System.out.println("Erro: Código deve ser positivo");
        }
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome não pode ser vazio");
        }
        if (preco <= 0) {
            System.out.println("Erro: Preço deve ser maior que zero");
        }
        if (estoque < 0) {
            System.out.println("Erro: Estoque deve ser maior ou igual a zero");
        }

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirFicha() {
        System.out.printf("Ficha do Produto: %d - %s | Preço: R$ %.2f | Estoque: %d un.%n",
                codigo, nome, preco, estoque);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome não pode ser vazio");
            return;
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Erro: Preço deve ser maior que zero");
            return;
        }
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        if (estoque < 0) {
            System.out.println("Erro: Estoque deve ser maior ou igual a zero");
            return;
        }
        this.estoque = estoque;
    }

    public void reporEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: Quantidade de reposição deve ser maior que zero");
            return;
        }
        this.estoque += quantidade;
    }
}