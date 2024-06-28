package IFelse;

import java.util.Scanner;

class Promoção {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double maças, preço, total;
        System.out.println("Quantas maçãs você ira comprar?");
        maças = sc.nextDouble();
        if (maças >= 12){
            preço = 0.50;
            total = maças * preço;
            System.out.printf("%.2f", total);
        } else {
            preço = 0.80;
            total = maças * preço;
            System.out.printf("%.2f", total);
        }

        sc.close();
    }
}