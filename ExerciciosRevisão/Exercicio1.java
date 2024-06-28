package ExerciciosRevisão;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Quantos números inteiros você quer digitar?");
        int nums = sc.nextInt();
        for (int i = 1; i <= nums; i++ ){
            System.out.println("Digite um número: ");
            int numeros = sc.nextInt();
            soma += numeros;
        }
        System.out.println("A soma é: " + soma);
        sc.close();
    }
}
