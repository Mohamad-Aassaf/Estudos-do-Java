package IFelse;

import java.util.Scanner;

class Intercambio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C, F; //F = Fahrenheit, C = Celsius
        System.out.println("Digite a temperatura abaixo em FAHRENHEIT:");
        F = sc.nextDouble();
        C = (F-32)/1.8;
        if (C >= 1){
            System.out.println("Tempo agradável");
        } else {
            System.out.println("Está ficando frio!");
        }
        sc.close();
    }
}
