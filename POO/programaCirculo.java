package POO;

import java.util.Locale;
import java.util.Scanner;

public class programaCirculo {
    public static final double PI = 3.14159; // final = constante, ou seja o metodo NÃO PODE MUDAR. 
    // static, não precisa instanciar.
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre o raio: ");
        double raio = sc.nextDouble();

        double c = circumferencia(raio);

        double v = volume(raio);

        System.out.printf("Circumferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", PI);

        sc.close();
    }

    public static double circumferencia(double raio){
        return 2.0 * PI * raio;
    }
    public static double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
