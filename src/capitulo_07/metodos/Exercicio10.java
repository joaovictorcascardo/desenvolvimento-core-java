package capitulo_07.metodos;

public class Exercicio10 {
    public static void main(String[] args) {
        String mensagem = montarMensagem("Caderno", 3);
        System.out.println(mensagem);
    }

    public static String montarMensagem(String produto, int quantidade) {
        return "Produto: " + produto + " | Quantidade: " + quantidade;
    }
}