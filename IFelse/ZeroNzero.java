package IFelse;

import java.util.Scanner;

class ZeroNzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("O valor digitado é ZERO");
        } else {
            System.out.println("O valor digitado não é ZERO");
        }
        sc.close();
    }
}
