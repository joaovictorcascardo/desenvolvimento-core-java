package capitulo_07.lacos.caderno;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numeroTab = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTab * i);
        }
    }
}
