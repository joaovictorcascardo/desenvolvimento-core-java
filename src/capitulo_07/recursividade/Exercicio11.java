package Recursividade;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        BigInteger maximo = new BigInteger("80000");

        System.out.println(fatorial(5));
        for (BigInteger i = new BigInteger("11000");i.compareTo(maximo) <= 0; i = i.add(BigInteger.ONE)) {
            try {
                teste(i);
                System.out.printf("funcionou: %d%n", i);

            } catch (Error e) {
                System.out.printf("%n -- estourou a stack no numero: %d -- %n ", i);
                System.out.printf("maior numero suportado: %s%n", i.subtract(BigInteger.ONE));
                break;
            }
        }
    }
    static BigInteger teste(BigInteger n) {
        if  (n.compareTo(BigInteger.ZERO) == 0) {
            return BigInteger.ONE;
        }
        return n.multiply(teste(n.subtract(BigInteger.ONE)));
    }
    static int fatorial(int n){
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}