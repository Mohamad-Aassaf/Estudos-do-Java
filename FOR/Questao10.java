package FOR;

import java.util.Scanner;

public class Questao10 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorfim, interval, valorini, soma = 0;
        System.out.println("Digite com qual número comeÇa a sequencia:");
        valorini = sc.nextInt();
        System.out.println("Digite até onde o número vai ir.");
        valorfim = sc.nextInt();
        System.out.println("Agora digite o intervalo entre os números");
        interval = sc.nextInt();
        for (int i = valorini; i <= valorfim; i = i + interval) {
            System.out.println("Valores " + i);
            soma = soma + i;
        }
        System.out.println("Soma de todos é " + soma);
        sc.close();
    }
    
}
