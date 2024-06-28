package IFelse;

import java.util.Scanner;

class MeusQuinze7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, div;
        System.out.println("Digite a quantidade de convidados abaixo:");
        num1 = sc.nextInt();
        div = num1 % 11;
        if (div == 0){
            System.out.println("OK");
        } else {
            System.out.println("NÃO");
        }
        sc.close();
    }
}
