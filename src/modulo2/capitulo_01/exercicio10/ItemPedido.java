    package modulo2.capitulo_01.exercicio10;

    public class ItemPedido {
        public String produto;
        public int quantidade;
        public double valorUnitario;
        public double total;

        public ItemPedido(String produto, int quantidade, double valorUnitario) {
            System.out.println("this: " + this);
            produto = produto;
            this.quantidade = quantidade;
            this.valorUnitario = valorUnitario;
            this.total = quantidade * valorUnitario;
        }
    }