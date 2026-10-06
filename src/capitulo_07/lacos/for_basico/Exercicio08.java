package capitulo_07.lacos.for_basico;

public class Exercicio08 {
    public static void main(String[] args) {
        String texto = "Aprender Java e muito legal!".toLowerCase();
        int vogais = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vogais++;
            }
        }

        System.out.println("A frase possui " + vogais + " vogais");
    }
}
