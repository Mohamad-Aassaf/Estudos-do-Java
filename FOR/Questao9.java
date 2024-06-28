package FOR;

import java.util.Scanner;

class Questão9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorfim, interval, valorini;
        System.out.println("Digite com qual número comeÇa a sequencia:");
        valorini = sc.nextInt();
        System.out.println("Digite até onde o número vai ir.");
        valorfim = sc.nextInt();
        System.out.println("Agora digite o intervalo entre os números");
        interval = sc.nextInt();
        for (int i = valorini; i <= valorfim; i = i + interval) {
            System.out.println("Valores " + i);
        }
        sc.close();
    }
}