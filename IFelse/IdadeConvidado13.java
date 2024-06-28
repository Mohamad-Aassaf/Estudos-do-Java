package IFelse;

import java.util.Scanner;

class IdadeConvidado13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade abaixo:");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("+18");
        } else {
            System.out.println("-18");
        }
        sc.close();
    }
}
