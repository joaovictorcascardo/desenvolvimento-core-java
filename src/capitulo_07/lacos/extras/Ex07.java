package capitulo_07.lacos.extras;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = sc.nextDouble();
        }
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] >= 7){
                System.out.println("Aluno " + i + " aprovado");
            } else if (notas[i] >= 5) {
                System.out.println("Aluno " + i + " em recuperação");
            }else{
                System.out.println("Aluno " + i + " reprovado");
            }
        }
    }
}
