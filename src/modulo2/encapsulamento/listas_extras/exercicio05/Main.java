package modulo2.encapsulamento.listas_extras.exercicio05;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Produto teclado = new Produto(101, "teclado", 120.00, 22);
        Produto mouse = new Produto(102, "rato", 80.00, 13);

       catalogo.adicionar(teclado);

//        catalogo.adicionar(mouse);
//
//        System.out.printf("%nexibir fichas%n");
//        catalogo.exibirTodos();
//
//        teclado.setPreco(150.00);
//
//        System.out.printf("%ndepois de mudar o teclado%n");
//        catalogo.exibirTodos();
//
//        Cliente cliente1 = new Cliente("Ana", "ana@exemplo.com");
//        Cliente cliente2 = new Cliente("Bruno", "bruno@exemplo.com");
//        cliente1.exibirFicha();
//        cliente2.exibirFicha();
//
//        catalogo.cadastrarProduto(101, "Teclado Mecânico", 350.00, 10);
//
//        catalogo.exibirTodos();
    }
}