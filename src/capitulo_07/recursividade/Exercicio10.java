package capitulo_07.recursividade;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println(inverter("java"));
    }

    public static String inverter(String texto) {
        String novoTexto = "";

        if (texto.isBlank()) {
            return "";
        }

        return novoTexto += inverter(texto.substring(1)) + texto.charAt(0);
    }
}


