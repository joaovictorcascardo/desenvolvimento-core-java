package capitulo_07.recursividade;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        contagemCrescente(scanner.nextInt());

    }

    public static void contagemCrescente(int n) {
        if(n == 0){
            return;
        }
        contagemCrescente(n - 1);
        System.out.println(n);
    }
}
