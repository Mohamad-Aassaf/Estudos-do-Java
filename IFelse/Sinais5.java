package IFelse;

import java.util.Scanner;

class Sinais5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite o número abaixo:");
        num = sc.nextInt();
        if (num >= 0){
            System.out.println("POS");
        }
        else {
            System.out.println("NEG");
        }
        sc.close();
    }
}