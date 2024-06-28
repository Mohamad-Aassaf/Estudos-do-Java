package ExerciciosRevisão;

import java.util.Scanner;

public class Exercicio4v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ae: ");
        String palavra = sc.nextLine();

        // Inverter a palavra diretamente no main
        String reverso = new StringBuilder(palavra).reverse().toString();

        // Verificar se a palavra é um palíndromo
        if(palavra.equalsIgnoreCase(reverso)) {
            System.out.println(palavra + " é um palindromo, olha que bacana");
        } else {
            System.out.println(palavra + " não é palindromo kkkkkkk");
        }

        sc.close();
    }
}

