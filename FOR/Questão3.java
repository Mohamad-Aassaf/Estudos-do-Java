package FOR;

import java.util.Scanner;

class Questão3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 23; i <= 55; i++){
            System.out.println("Números de 23 até 55: " + i);
            soma = soma + i;
        }
        System.out.println("Soma = " + soma);
        sc.close();
    }
}