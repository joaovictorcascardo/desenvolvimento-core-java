package capitulo_07.recursividade;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 100");
        int numero = scanner.nextInt();

        System.out.println(somaAteN(numero));
    }

    public static int somaAteN(int numero){
        if(numero == 0){
            return 0;
        }
        return numero += somaAteN(numero - 1);

    }
}
