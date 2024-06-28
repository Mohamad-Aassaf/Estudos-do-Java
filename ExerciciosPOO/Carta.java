package ExerciciosPOO;

public class Carta {
    private final String naipe;
    private final String valor;

    public Carta(String valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public String toString() {
        return valor + " de " + naipe;
    }
}
