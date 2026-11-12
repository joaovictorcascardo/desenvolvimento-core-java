package modulo2.encapsulamento.exercicio11;

public class AparelhoSom {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }
}
