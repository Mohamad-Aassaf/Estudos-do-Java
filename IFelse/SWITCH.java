package IFelse;

import java.util.Scanner;

class SWITCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carne;
        System.out.println("Escolha uma das carnes abaixo: ");
        System.out.println("1 = Filé");
        System.out.println("2 = Contra Filé");
        System.out.println("3 = Picanha");
        System.out.println("4 = Maminha");
        carne = sc.nextInt();
        switch (carne) {
            case 1: {
                System.out.println("Você escolheu Filé!");
                break;
            }
            case 2: {
                System.out.println("Você escolheu Contra Filé!");
                break;
            }
            case 3: {
                System.out.println("Você escolheu Picanha!");
                break;
            }
            case 4: {
                System.out.println("Você escolheu Maminha!");
                break;
            }
            default: {
                System.out.println("Não temos essa carne seu cabaço.");
            }
        }
        sc.close();
    }
}