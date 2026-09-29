package capitulo_06.enumeration;

import java.util.Scanner;

enum StatusPedido {
    RECEBIDO, PREPARANDO, ENVIADO, ENTREGUE
}

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o status do pedido (RECEBIDO, PREPARANDO, ENVIADO, ENTREGUE):");
        String entrada = sc.next().toUpperCase();
        StatusPedido status = StatusPedido.valueOf(entrada);

        String mensagem = "";
        switch (status) {
            case RECEBIDO:
                mensagem = "aguardando a confirmação da loja.";
                break;
            case PREPARANDO:
                mensagem = "seu pedido está sendo embalado.";
                break;
            case ENVIADO:
                mensagem = "a caminho do cliente.";
                break;
            case ENTREGUE:
                mensagem = "entregue com sucesso.";
                break;
        }

        System.out.println("Pedido " + status + ": " + mensagem);
    }
}