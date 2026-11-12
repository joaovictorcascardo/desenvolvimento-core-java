package modulo2.encapsulamento.listas_extras.exercicio05;

import java.util.LinkedList;

public class Catalogo {
    private final LinkedList<Produto> produtos = new LinkedList<>();

    public Produto buscarPorCodigo(int codigo) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    public void adicionar(Produto produto) {
        if (produto != null) {
            produtos.add(produto);
        }
    }

    public void exibirTodos() {
        if (produtos.isEmpty()) {
            System.out.println("Catálogo vazio");
            return;
        }
        for (Produto p : produtos) {
            p.exibirFicha();
        }
    }

    public boolean cadastrarProduto(int codigo, String nome, double preco, int estoque) {
        if (codigo <= 0) {
            System.out.println("Recusado: Código deve ser positivo");
            return false;
        }
        if (buscarPorCodigo(codigo) != null) {
            System.out.println("Recusado: Código de produto já existe no catálogo");
            return false;
        }
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Recusado: Nome não pode ser vazio");
            return false;
        }
        if (preco <= 0) {
            System.out.println("Recusado: Preço deve ser maior que zero");
            return false;
        }
        if (estoque < 0) {
            System.out.println("Recusado: Estoque deve ser maior ou igual a zero");
            return false;
        }

        Produto novo = new Produto(codigo, nome, preco, estoque);
        produtos.add(novo);
        System.out.println("Sucesso: Produto " + nome + " cadastrado");
        return true;
    }

    public void reporEstoque(int codigo, int quantidade) {
        Produto produtoARepor = buscarPorCodigo(codigo);

        produtoARepor.reporEstoque(quantidade);
        produtoARepor.exibirFicha();
    }

    public void atualizarPreco(int codigo, double valor) {
        Produto produtoAtualizar = buscarPorCodigo(codigo);

        if (produtoAtualizar == null) {
            System.out.println("Recusado: Produto não encontrado");
            return;
        }

        if (valor <= 0) {
            System.out.println("Recusado: Preço deve ser maior que zero");
            return;
        }

        produtoAtualizar.setPreco(valor);
        System.out.println("Sucesso: Preço atualizado");
    }

    public void consultarProduto(int codigo) {
        Produto produto = buscarPorCodigo(codigo);

        if (produto == null) {
            System.out.println("Consulta: Produto não encontrado");
            return;
        }
        produto.exibirFicha();
    }

}