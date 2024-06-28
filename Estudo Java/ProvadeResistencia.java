import java.util.Scanner;

public class ProvadeResistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas, minutos;
        System.out.println("Quantas horas o participante resistiu?");
        horas = sc.nextInt();
        minutos = horas * 60;
        System.out.println("O participante aguentou " + minutos + " minutos.");
        if (horas >= 25){
            System.out.println("A prova só vale por 24 horas. Responda de novo:");
            sc.close();
        }
    }
}
