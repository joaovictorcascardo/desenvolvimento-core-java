package modulo2.encapsulamento.listas_extras.exercicio05;

import java.util.LinkedList;

public class GerenciadorPedidos {
    private final LinkedList<Pedido> pedidos = new LinkedList<>();

    public Pedido buscarPorId(int id) {
        for (Pedido p : pedidos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean abrirPedido(int codigoCliente, ListaClientes listaClientes) {
        Cliente cliente = listaClientes.buscarPorCodigo(codigoCliente);

        if (cliente == null) {
            System.out.println("Recusado: Cliente não encontrado");
            return false;
        }

        if (!cliente.isAtivo()) {
            System.out.println("Recusado: Cliente inativo");
            return false;
        }

        Pedido novo = new Pedido(cliente);
        pedidos.add(novo);
        System.out.println("Sucesso: Pedido " + novo.getId() + " aberto para " + cliente.getNome());
        return true;
    }

    public void exibirTodos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado");
            return;
        }
        for (Pedido p : pedidos) {
            p.exibirFicha();
        }
    }
}