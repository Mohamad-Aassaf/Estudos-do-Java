package FOR;

import java.util.Scanner;

class Questão7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 121; i <= 201; i = i + 3) { // ou i += 3
            System.out.println("Números de 121 até 201 de 3 em 3: " + i);
        }
        sc.close();
    }
}
