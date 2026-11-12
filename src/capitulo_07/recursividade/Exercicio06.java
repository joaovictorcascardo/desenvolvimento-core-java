package capitulo_07.recursividade;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fatorial(5));
    }

    public static int fatorial (int numero){
        //caso base
        if(numero == 0){
            return 1;
        }

        return numero * fatorial(numero - 1);
    }
}
