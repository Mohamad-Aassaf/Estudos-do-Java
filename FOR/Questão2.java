package FOR;

import java.util.Scanner;

class Questão2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 100; i >= 1; i--){
            System.out.println("Números de 100 até 1: " + i);
        }
        sc.close();
    }
}