package modulo2.encapsulamento.listas_extras.exercicio05;

import java.util.LinkedList;

public class ListaClientes {
    private final LinkedList<Cliente> clientes = new LinkedList<>();

    public Cliente buscarPorCodigo(int codigo) {
        for (Cliente c : clientes) {
            if (c.getCodigo() == codigo) {
                return c;
            }
        }
        return null;
    }

    public boolean cadastrarCliente(String nome, String email) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Recusado: Nome não pode ser vazio");
            return false;
        }
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Recusado: E-mail não pode ser vazio");
            return false;
        }

        Cliente novo = new Cliente(nome, email);
        clientes.add(novo);
        System.out.println("Sucesso: Cliente " + nome + " cadastrado");
        return true;
    }

    public void consultarCliente(int codigo) {
        Cliente cliente = buscarPorCodigo(codigo);
        if (cliente == null) {
            System.out.println("Consulta: Cliente não encontrado");
        } else {
            cliente.exibirFicha();
        }
    }

    public void exibirTodos() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado");
            return;
        }
        for (Cliente c : clientes) {
            c.exibirFicha();
        }
    }
}