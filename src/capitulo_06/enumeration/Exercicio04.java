package capitulo_06.enumeration;

import java.util.Scanner;

enum Prioridade {
    BAIXA,
    MEDIA,
    ALTA,

}
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a prioridade");
        String entrada = sc.nextLine();

        Prioridade prioridade = Prioridade.valueOf(entrada.toUpperCase());
        int tempo = 0;

        switch (prioridade) {
            case BAIXA:
                tempo = 72;
                break;

            case MEDIA:
                tempo = 24;
                break;

            case ALTA:
                tempo = 2;
                break;
        }
        System.out.printf("Prioridade selecionada: %s.%nPrazo: %d horas.%n", prioridade, tempo);    }
}
