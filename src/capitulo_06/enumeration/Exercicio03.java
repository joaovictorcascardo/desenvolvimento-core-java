package capitulo_06.enumeration;

import java.util.Scanner;

enum Turno {
    MANHA, TARDE, NOITE
}

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o turno MANHA, TARDE ou NOITE: ");
        Turno turno = Turno.valueOf(sc.next());
        String horario = "";

        switch (turno) {
            case MANHA:
                horario = "8h às 12h";
                break;
            case TARDE:
                horario = "13h às 17h";
                break;
            case NOITE:
                horario = "19h às 22h";
                break;
        }

        System.out.println("Turno " + turno + ": " + horario);
    }
}
