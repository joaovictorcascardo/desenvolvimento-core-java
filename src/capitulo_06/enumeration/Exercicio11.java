package capitulo_06.enumeration;

import java.util.Scanner;

enum EstadoTarefa {
    PENDENTE, EM_ANDAMENTO, CONCLUIDA
}

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o estado atual:");
        String entrada = sc.next().toUpperCase();
        EstadoTarefa estado = EstadoTarefa.valueOf(entrada);

        String acao = "";
        switch (estado) {
            case PENDENTE:
                acao = "iniciar a tarefa";
                break;
            case EM_ANDAMENTO:
                acao = "continuar";
                break;
            case CONCLUIDA:
                acao = "arquivar a tarefa";
                break;
        }

        System.out.println(estado + ": " + acao + ".");
    }
}