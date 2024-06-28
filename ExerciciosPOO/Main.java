package ExerciciosPOO;

public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        
        System.out.println("Cartas do baralho antes de embaralhar:");
        baralho.mostrarCartas();

        baralho.embaralhar();

        System.out.println("\nCartas do baralho após embaralhar:");
        baralho.mostrarCartas();
    }
}
