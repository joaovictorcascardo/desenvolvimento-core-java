package capitulo_07.recursividade;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(potenciacao(2,5));

    }

    public static int potenciacao(int base, int expoente){
        if( expoente == 0){
            return 1;
        }
        return base *  potenciacao(base, expoente - 1);
    }
}
