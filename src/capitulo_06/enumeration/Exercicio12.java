package capitulo_06.enumeration;

import java.util.Scanner;

enum NivelBateria {
    CRITICO, BAIXO, NORMAL, CHEIO
}

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível da bateria:");
        String entrada = sc.next().toUpperCase();
        NivelBateria nivel = NivelBateria.valueOf(entrada);

        String orientacao = "";
        switch (nivel) {
            case CRITICO:
                orientacao = "carregar imediatamente";
                break;
            case BAIXO:
                orientacao = "carregar em breve";
                break;
            case NORMAL:
                orientacao = "continuar usando";
                break;
            case CHEIO:
                orientacao = "retirar da tomada";
                break;
        }

        System.out.println(nivel + ": " + orientacao + ".");
    }
}