package capitulo_07.lacos.extras;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i < 5; i++, contador++) {
            System.out.println("i: " + i + " | contador: " + contador);
        }
        System.out.println("contador: " + contador);
    }
}
