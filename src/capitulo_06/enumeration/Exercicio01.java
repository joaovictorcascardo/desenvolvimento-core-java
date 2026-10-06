package capitulo_06.enumeration;

import java.util.Scanner;

enum CorSemaforo {
    VERMELHO, AMARELO, VERDE
}

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cor VERMELHO, AMARELO ou VERDE: ");
        CorSemaforo cor = CorSemaforo.valueOf(sc.next());
        String acao = "";

        switch (cor) {
            case VERMELHO:
                acao = "parar";
                break;
            case AMARELO:
                acao = "atenção";
                break;
            case VERDE:
                acao = "seguir";
                break;
        }

        System.out.println(cor.name() + ": " + acao);
    }
}
