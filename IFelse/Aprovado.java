package IFelse;

import java.util.Scanner;
import java.util.Locale;

class Aprovado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as 5 notas abaixo:");
        double a, b, c, d, e, total;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        total = (a + b + c + d + e) / 5;
        if (total > 6){
            System.out.println("APPROVED!");
            System.out.printf("%.2f", total);
        } else {
            System.out.println("RETAKE");
            System.out.printf("%.2f", total);
        }
        sc.close();
    }
}