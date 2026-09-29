package capitulo_06.enumeration;

import java.util.Scanner;

enum Ingresso {
    INTEIRA, MEIA, CORTESIA
}

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de ingresso");
        String entrada = sc.nextLine();

        Ingresso ingresso = Ingresso.valueOf(entrada.toUpperCase());
        double preco = 0;
        switch (ingresso) {
            case INTEIRA:
                preco = 80.00;
                break;
            case MEIA:
                preco = 40.00;
                break;
            case CORTESIA:
                preco = 80.00;
                break;
        }
        System.out.printf("Ingresso selecionado: %s%nPreco: %.2f%n", ingresso, preco);

}
}
