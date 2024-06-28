package IFelse;

import java.util.Scanner;

class DDDs17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ddd;
        System.out.println("Digite o DDD abaixo:");
        ddd = sc.nextInt();
        if (ddd == 1) {
            System.out.println("USA");
        } else if (ddd == 55) {
            System.out.println("Brasil");
        } else if (ddd == 49) {
            System.out.println("Alemanha");
        } else {
            System.out.println("ERRO");
        }
        sc.close();
    }
}
