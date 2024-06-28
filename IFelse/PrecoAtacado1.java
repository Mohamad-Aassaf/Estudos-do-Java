package IFelse;

import java.util.Scanner;

class PrecoAtacado1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Quantos volumes você pegou?");
        num = sc.nextInt();
        if (num >= 20) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}