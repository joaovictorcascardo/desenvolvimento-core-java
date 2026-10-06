package capitulo_07.lacos.extras;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero[] = new int[6];

        for (int i = 0; i < numero.length ; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numero[i] = sc.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            if(numero[i] % 2 == 0){
                System.out.println("O numero " + numero[i] + " é par");
            }else {
                System.out.println("O numero " + numero[i] + " é ímpar");
            }
        }
    }
}
