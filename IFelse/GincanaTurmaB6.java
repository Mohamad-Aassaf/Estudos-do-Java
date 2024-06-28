package IFelse;

import java.util.Scanner;

class GincanaTurmaB6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, mult;
        System.out.println("Digite um numero");
        num1 = sc.nextInt();
        System.out.println("Digite outro número");
        num2 = sc.nextInt();
        mult = num1 * num2;
        System.out.println(num1 + " " + num2);
        if (num1 * num2 >= 75) {
            System.out.println(mult);
        } else {
            System.out.println(num1 + num2);
        }
        sc.close();
    }
}