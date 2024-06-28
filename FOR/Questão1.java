package FOR;

import java.util.Scanner;

class Questão1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 100; i++){
            System.out.println("Números até 100: " + i);
        }
        sc.close();
    }
}