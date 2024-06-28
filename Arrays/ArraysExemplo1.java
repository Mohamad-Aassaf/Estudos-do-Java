package Arrays;

import java.util.Scanner;

public class ArraysExemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        for (int i = 0; i <= 3; i++) {
            System.out.println("Digite um valor: ");
            x[i] = sc.nextInt();
        }
        System.out.println("O primeiro valor digitado é " + x[0] + " o terceiro é " + x[2]);
        sc.close();
    }
}