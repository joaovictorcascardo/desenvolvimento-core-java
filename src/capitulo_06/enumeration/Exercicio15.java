package capitulo_06.enumeration;

import java.util.Scanner;

enum Setor {
    LITERATURA, TECNOLOGIA, HISTORIA
}

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o setor:");
        String entrada = sc.next().toUpperCase();
        Setor setor = Setor.valueOf(entrada);

        String corredor = "";
        switch (setor) {
            case LITERATURA:
                corredor = "corredor A";
                break;
            case TECNOLOGIA:
                corredor = "corredor B";
                break;
            case HISTORIA:
                corredor = "corredor C";
                break;
        }

        System.out.println(setor + ": " + corredor + ".");
    }
}