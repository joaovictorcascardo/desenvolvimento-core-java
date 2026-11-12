package modulo2.capitulo_01.exercicio09;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lia", 100);
        Jogador jogador2 = new Jogador("Rui", 40);

        System.out.println(jogador1.nome + ": " + jogador1.pontos);
        System.out.println(jogador2.nome + ": " + jogador2.pontos);
        System.out.println("Total inicial: " + (jogador1.pontos + jogador2.pontos));

        jogador1.pontos -= 25;
        jogador2.pontos += 25;

        System.out.println(jogador1.nome + ": " + jogador1.pontos);
        System.out.println(jogador2.nome + ": " + jogador2.pontos);
        System.out.println("Total final: " + (jogador1.pontos + jogador2.pontos));
    }
}