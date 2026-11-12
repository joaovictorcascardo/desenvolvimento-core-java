package modulo2.capitulo_01.exercicio05;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato("Carla", "11911112222", "carla@exemplo.com");

        System.out.println(contato.nome + " | " + contato.telefone + " | " + contato.email);

        contato.telefone = "11933334444";
        contato.email = "carla.nova@exemplo.com";

        System.out.println(contato.nome + " | " + contato.telefone + " | " + contato.email);
    }
}