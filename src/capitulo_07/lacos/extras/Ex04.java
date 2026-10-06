package capitulo_07.lacos.extras;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o número que deseja procurar: ");
        int busca = sc.nextInt();

        int ocorrencias = 0;
        String indices = "";

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == busca) {
                ocorrencias++;
                indices += (indices.isEmpty() ? "" : ", ") + i;
            }
        }

        if (ocorrencias > 0) {
                int ultimaVirgula = indices.lastIndexOf(",");
                indices = indices.substring(0, ultimaVirgula) + " e" + indices.substring(ultimaVirgula + 1);
            System.out.println("Índices: " + indices + ". Ocorrências: " + ocorrencias);
        } else {
            System.out.println("Número não encontrado");
        }
    }
}