import java.util.Scanner;
import java.util.Locale;

public class EXEMPLO9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //Como foi a OMS que pediu, e tem Fahrenheit no meio, os textos estão em inglês.
        Double F, C; //F = Fahrenheit e C = Celsius
        System.out.println("Please, enter the degrees Celsius below and it will be converted to Fahrenheit");
        C = sc.nextDouble();
        F = (9*C+160)/5;
        System.out.println(C + " Celsius Is " + F + " in Fahrenheit.");
        System.out.println("Be careful! Coronavirus still around the world!");
        System.out.println("World Health Organization");

        sc.close();
    }
}