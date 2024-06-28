package FOR;

import java.util.Scanner;

class Questão8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NÚMEROS DE 200 ATÉ 100 DE 5 EM 5");
        for (int i = 200; i >= 100; i = i - 5) {
            System.out.println("Números: " + i);
        }
        sc.close();
    }
}
