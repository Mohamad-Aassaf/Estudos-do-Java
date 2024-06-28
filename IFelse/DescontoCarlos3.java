package IFelse;

import java.util.Scanner;

class DescontoCarlos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade abaixo:");
        idade = sc.nextInt();
        if (idade >= 10 && idade <= 20){
            System.out.println("10% de desconto!");
        } else if (idade >= 21 && idade <= 30){
            System.out.println("5% de desconto!");
        } else if (idade >= 90){
            System.out.println("20% de desconto!");
        } else {
            System.out.println("Erro!");
        }
        sc.close();
    }
}