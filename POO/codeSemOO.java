package POO;
import java.util.Locale;
import java.util.Scanner;

// Ler triangulo x e y

public class codeSemOO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        System.out.println("Entre as medidas do triangulo X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre as medidas do triangulo Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Area do Triangulo X: %.4f%n ", areaX); // Print f pois é formatado: %.4f%n mostra 4 casas decimais e pula uma linha
        System.out.printf("Area do Triangulo Y: %.4f%n ", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área é : X");
        } else {
            System.out.println("Maior área é : Y");
        }
        sc.close();
    }
}
