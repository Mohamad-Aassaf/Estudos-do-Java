package IFelse;

import java.util.Scanner;

class QuizCasal8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d, result1, result2;
        System.out.println("Digite os números abaixo:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println("-----------------");
        result1 = a + b;
        result2 = c + d;
        if (result1 == result2){
            System.out.println(a + " + " + b + " = " + result1);
            System.out.println(c + " + " + d + " = " + result2);
        } else if (result1 != result2) {
            System.out.println(result1);
            System.out.println(result2);
        }
        sc.close();
    }
}