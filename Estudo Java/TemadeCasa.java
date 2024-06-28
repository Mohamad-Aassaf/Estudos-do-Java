import java.util.Scanner;

public class TemadeCasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double horas, minutos;
        System.out.println("Informe abaixo quantas hora já se passaram:");
        horas = sc.nextDouble();
        minutos = horas * 60;

        System.out.println("Em minutos, já se passaram: " + minutos + " Minutos.");

        sc.close();
    }
}