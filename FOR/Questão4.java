package FOR;

import java.util.Scanner;

class Questão4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++){
            System.out.println("Números de 1 até 10: " + i);
        }
        for (int y = 10; y >= 1; y--){
            System.out.println("Números de 10 até 1: " + y);
        }
        sc.close();
    }
}
