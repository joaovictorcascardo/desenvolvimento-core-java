package capitulo_06.enumeration;

import java.util.Scanner;

enum EtapaInscricao {
    CADASTRO, DOCUMENTOS, PAGAMENTO, FINALIZADA
}

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a etapa atual:");
        String entrada = sc.next().toUpperCase();
        EtapaInscricao etapa = EtapaInscricao.valueOf(entrada);

        String passo = "";
        switch (etapa) {
            case CADASTRO:
                passo = "próximo passo é documentos";
                break;
            case DOCUMENTOS:
                passo = "próximo passo é pagamento";
                break;
            case PAGAMENTO:
                passo = "próximo passo é finalizada";
                break;
            case FINALIZADA:
                passo = "inscrição está completa";
                break;
        }

        System.out.println(etapa + ": " + passo + ".");
    }
}