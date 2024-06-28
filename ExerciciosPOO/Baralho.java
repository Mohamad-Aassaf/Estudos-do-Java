package ExerciciosPOO;

import java.util.Random;

public class Baralho {
    private Carta[] cartas;
    private static final int NUM_CARTAS = 52;

    public Baralho() {
        String[] naipes = {"Copas", "Espadas", "Ouros", "Paus"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei", "Ás"};
        cartas = new Carta[NUM_CARTAS];
        int contador = 0;

        for (String naipe : naipes) {
            for (String valor : valores) {
                cartas[contador++] = new Carta(valor, naipe);
            }
        }
    }

    public void embaralhar() {
        Random rnd = new Random();
        for (int i = cartas.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Carta temp = cartas[index];
            cartas[index] = cartas[i];
            cartas[i] = temp;
        }
    }

    public void mostrarCartas() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
