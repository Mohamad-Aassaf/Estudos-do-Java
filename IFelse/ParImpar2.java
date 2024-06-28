package IFelse;

import java.util.Scanner;

class ParImpar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;
        System.out.println("Digite 2 números inteiros abaixo:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        soma = num1 + num2;
        if (soma % 2 == 0) {
            System.out.println("Esse número é PAR");
        } else {
            System.out.println("Esse número é IMPAR");
        }
        sc.close();
    }
}
