package capitulo_06.enumeration;

import java.util.Scanner;

enum ModoAr {
    FRIO, VENTILAR, DESLIGADO
}

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o modo do ar-condicionado:");
        String entrada = sc.next().toUpperCase();
        ModoAr modo = ModoAr.valueOf(entrada);

        System.out.println("Digite a temperatura desejada:");
        int temperatura = sc.nextInt();

        if (modo == ModoAr.FRIO) {
            System.out.println(modo + ": temperatura de " + temperatura + " °C aplicada.");
        } else {
            System.out.println(modo + ": temperatura de " + temperatura + " °C não será aplicada.");
        }
    }
}