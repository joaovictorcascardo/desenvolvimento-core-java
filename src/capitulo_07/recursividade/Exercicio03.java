package capitulo_07.recursividade;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a frase");
        String frase = scanner.nextLine();
        System.out.println("Digite a quantidade de vezes");
        int qtd = scanner.nextInt();
        mensagemRepetida(qtd, frase);

    }

    public static void mensagemRepetida(int qtd, String frase) {
        if (qtd == 0) {
            return;
        }
        System.out.println(frase);
        mensagemRepetida(qtd - 1, frase);
    }
}
